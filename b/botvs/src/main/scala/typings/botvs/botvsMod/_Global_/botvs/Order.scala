package typings.botvs.botvsMod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 订单结构, 由GetOrder函数返回
  */
trait Order extends js.Object {
  /**
    * 下单数量
    */
  var Amount: Double
  /**
    * 成交数量
    */
  var DealAmount: Double
  /**
    * 交易单唯一标识
    */
  var Id: String
  /**
    * 下单价格
    */
  var Price: Double
  /**
    * 订单状态, 参考常量里的订单状态
    */
  var Status: VOrderState
  var Time: Double
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType
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
}

