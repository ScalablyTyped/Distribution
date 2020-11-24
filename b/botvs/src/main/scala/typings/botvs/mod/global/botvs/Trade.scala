package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 获取所有交易历史(非自己),由GetTrades函数返回
  */
@js.native
trait Trade extends js.Object {
  
  /**
    * 数量
    */
  var Amount: Double = js.native
  
  /**
    * Id(交易所返回的此Trade的唯一Id)
    */
  var Id: String = js.native
  
  /**
    * 价格
    */
  var Price: Double = js.native
  
  /**
    * 时间(Unix timestamp 毫秒)
    */
  var Time: Double = js.native
  
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType = js.native
}
object Trade {
  
  @scala.inline
  def apply(Amount: Double, Id: String, Price: Double, Time: Double, Type: VOrderType): Trade = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trade]
  }
  
  @scala.inline
  implicit class TradeOps[Self <: Trade] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VOrderType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
