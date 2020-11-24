package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 订单结构, 由GetOrder函数返回
  */
@js.native
trait Order extends js.Object {
  
  /**
    * 下单数量
    */
  var Amount: Double = js.native
  
  /**
    * 成交数量
    */
  var DealAmount: Double = js.native
  
  /**
    * 交易单唯一标识
    */
  var Id: String = js.native
  
  /**
    * 下单价格
    */
  var Price: Double = js.native
  
  /**
    * 订单状态, 参考常量里的订单状态
    */
  var Status: VOrderState = js.native
  
  var Time: Double = js.native
  
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType = js.native
}
object Order {
  
  @scala.inline
  def apply(
    Amount: Double,
    DealAmount: Double,
    Id: String,
    Price: Double,
    Status: VOrderState,
    Time: Double,
    Type: VOrderType
  ): Order = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], DealAmount = DealAmount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealAmount(value: Double): Self = this.set("DealAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: VOrderState): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VOrderType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
