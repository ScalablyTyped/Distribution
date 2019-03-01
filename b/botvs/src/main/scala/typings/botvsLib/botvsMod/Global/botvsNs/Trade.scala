package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 获取所有交易历史(非自己),由GetTrades函数返回
  */
trait Trade extends js.Object {
  /**
    * 数量
    */
  var Amount: scala.Double
  /**
    * Id(交易所返回的此Trade的唯一Id)
    */
  var Id: java.lang.String
  /**
    * 价格
    */
  var Price: scala.Double
  /**
    * 时间(Unix timestamp 毫秒)
    */
  var Time: scala.Double
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType
}

object Trade {
  @scala.inline
  def apply(
    Amount: scala.Double,
    Id: java.lang.String,
    Price: scala.Double,
    Time: scala.Double,
    Type: VOrderType
  ): Trade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Amount")(Amount)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Price")(Price)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Trade]
  }
}

