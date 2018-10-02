package vo;

public class SuccessfulBidVO {
	
	private int auct_id;
	private int bid_id;
	private String review;
	private String delivery_code;
	private String delivery_status;
	private String payment_status;
	
	public SuccessfulBidVO() {
		super();
	}

	public SuccessfulBidVO(int auct_id, int bid_id, String review, String delivery_code, String delivery_status,
			String payment_status) {
		super();
		this.auct_id = auct_id;
		this.bid_id = bid_id;
		this.review = review;
		this.delivery_code = delivery_code;
		this.delivery_status = delivery_status;
		this.payment_status = payment_status;
	}

	public int getAuct_id() {
		return auct_id;
	}

	public void setAuct_id(int auct_id) {
		this.auct_id = auct_id;
	}

	public int getBid_id() {
		return bid_id;
	}

	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getDelivery_code() {
		return delivery_code;
	}

	public void setDelivery_code(String delivery_code) {
		this.delivery_code = delivery_code;
	}

	public String getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	@Override
	public String toString() {
		return "SuccessfulBidVO [auct_id=" + auct_id + ", bid_id=" + bid_id + ", review=" + review + ", delivery_code="
				+ delivery_code + ", delivery_status=" + delivery_status + ", payment_status=" + payment_status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + auct_id;
		result = prime * result + bid_id;
		result = prime * result + ((delivery_code == null) ? 0 : delivery_code.hashCode());
		result = prime * result + ((delivery_status == null) ? 0 : delivery_status.hashCode());
		result = prime * result + ((payment_status == null) ? 0 : payment_status.hashCode());
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuccessfulBidVO other = (SuccessfulBidVO) obj;
		if (auct_id != other.auct_id)
			return false;
		if (bid_id != other.bid_id)
			return false;
		if (delivery_code == null) {
			if (other.delivery_code != null)
				return false;
		} else if (!delivery_code.equals(other.delivery_code))
			return false;
		if (delivery_status == null) {
			if (other.delivery_status != null)
				return false;
		} else if (!delivery_status.equals(other.delivery_status))
			return false;
		if (payment_status == null) {
			if (other.payment_status != null)
				return false;
		} else if (!payment_status.equals(other.payment_status))
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		return true;
	}
		
}
