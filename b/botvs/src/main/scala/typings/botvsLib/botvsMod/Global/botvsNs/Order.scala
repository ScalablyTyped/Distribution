package typings
package botvsLib.botvsMod.Global.botvsNs

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
  var Amount: scala.Double
  /**
    * 成交数量
    */
  var DealAmount: scala.Double
  /**
    * 交易单唯一标识
    */
  var Id: java.lang.String
  /**
    * 下单价格
    */
  var Price: scala.Double
  /**
    * 订单状态, 参考常量里的订单状态
    */
  var Status: VOrderState
  var Time: scala.Double
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType
}

object Order {
  @scala.inline
  def apply(
    Amount: scala.Double,
    DealAmount: scala.Double,
    Id: java.lang.String,
    Price: scala.Double,
    Status: VOrderState,
    Time: scala.Double,
    Type: VOrderType
  ): Order = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Amount")(Amount)
    __obj.updateDynamic("DealAmount")(DealAmount)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Price")(Price)
    __obj.updateDynamic("Status")(Status)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Order]
  }
}

