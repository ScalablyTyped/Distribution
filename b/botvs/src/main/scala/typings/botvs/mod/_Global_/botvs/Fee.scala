package typings.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 手续费结构, 由GetFee函数返回(如国外平台bitfinex买入卖出手续费跟账户交易量相关)
  */
trait Fee extends js.Object {
  /**
    * 买入手续费, 格式同上
    */
  var Buy: Double
  /**
    * 卖出手续费, 为一个浮点数, 如0.2表示0.2%的手续费
    */
  var Sell: Double
}

object Fee {
  @scala.inline
  def apply(Buy: Double, Sell: Double): Fee = {
    val __obj = js.Dynamic.literal(Buy = Buy.asInstanceOf[js.Any], Sell = Sell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
}

