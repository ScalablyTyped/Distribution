package typings.botvs.mod.global.botvs

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
  var Amount: Double
  /**
    * Id(交易所返回的此Trade的唯一Id)
    */
  var Id: String
  /**
    * 价格
    */
  var Price: Double
  /**
    * 时间(Unix timestamp 毫秒)
    */
  var Time: Double
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType
}

object Trade {
  @scala.inline
  def apply(Amount: Double, Id: String, Price: Double, Time: Double, Type: VOrderType): Trade = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trade]
  }
}

