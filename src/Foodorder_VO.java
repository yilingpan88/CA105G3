import java.sql.Date;

public class Foodorder_VO {
	private String orderno, memno, deliverAddr, chefno, orderStatus;
	private Date ordTime;
	
	public Foodorder_VO() {
		
	}
	
	public Foodorder_VO(String orderno, String memno, String deliverAddr, String chefno, String orderStatus, Date ordTime) {
		this.orderno = orderno;
		this.memno = memno;
		this.deliverAddr = deliverAddr;
		this.chefno = chefno;
		this.orderStatus = orderStatus;
		this.ordTime = ordTime;
	}
	
	public String getOrderno() {
		return orderno;
	}
	
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	
	public String getMemno() {
		return memno;
	}
	
	public void setMemno(String memno) {
		this.memno = memno;
	}
	
	public String getDeliverAddr() {
		return deliverAddr;
	}
	
	public void setDeliverAddr(String deliverAddr) {
		this.deliverAddr = deliverAddr;
	}
	
	public String getChefno() {
		return chefno;
	}
	
	public void setChefno(String chefno) {
		this.chefno = chefno;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public Date getOrdTime() {
		return ordTime;
	}
	
	public void setOrdTime(Date ordTime) {
		this.ordTime = ordTime;
	}
}
