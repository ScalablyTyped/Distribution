package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.fixed_price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixed price resource.
  */
@js.native
trait FixedPrice extends js.Object {
  /**
    * Local price in fiat currency.
    */
  var local_price: Price[FiatCurrency] = js.native
  /**
    * Pricing type
    */
  var pricing_type: fixed_price = js.native
}

object FixedPrice {
  @scala.inline
  def apply(local_price: Price[FiatCurrency], pricing_type: fixed_price): FixedPrice = {
    val __obj = js.Dynamic.literal(local_price = local_price.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedPrice]
  }
  @scala.inline
  implicit class FixedPriceOps[Self <: FixedPrice] (val x: Self) extends AnyVal {
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
    def setLocal_price(value: Price[FiatCurrency]): Self = this.set("local_price", value.asInstanceOf[js.Any])
    @scala.inline
    def setPricing_type(value: fixed_price): Self = this.set("pricing_type", value.asInstanceOf[js.Any])
  }
  
}

