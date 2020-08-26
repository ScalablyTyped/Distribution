package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场深度单
  */
@js.native
trait MarketOrder extends js.Object {
  /**
    * 数量
    */
  var Amount: Double = js.native
  /**
    * 价格
    */
  var Price: Double = js.native
}

object MarketOrder {
  @scala.inline
  def apply(Amount: Double, Price: Double): MarketOrder = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketOrder]
  }
  @scala.inline
  implicit class MarketOrderOps[Self <: MarketOrder] (val x: Self) extends AnyVal {
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
    def setPrice(value: Double): Self = this.set("Price", value.asInstanceOf[js.Any])
  }
  
}

