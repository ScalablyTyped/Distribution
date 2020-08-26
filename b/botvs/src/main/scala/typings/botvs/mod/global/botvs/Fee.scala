package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 手续费结构, 由GetFee函数返回(如国外平台bitfinex买入卖出手续费跟账户交易量相关)
  */
@js.native
trait Fee extends js.Object {
  /**
    * 买入手续费, 格式同上
    */
  var Buy: Double = js.native
  /**
    * 卖出手续费, 为一个浮点数, 如0.2表示0.2%的手续费
    */
  var Sell: Double = js.native
}

object Fee {
  @scala.inline
  def apply(Buy: Double, Sell: Double): Fee = {
    val __obj = js.Dynamic.literal(Buy = Buy.asInstanceOf[js.Any], Sell = Sell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
  @scala.inline
  implicit class FeeOps[Self <: Fee] (val x: Self) extends AnyVal {
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
    def setBuy(value: Double): Self = this.set("Buy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSell(value: Double): Self = this.set("Sell", value.asInstanceOf[js.Any])
  }
  
}

