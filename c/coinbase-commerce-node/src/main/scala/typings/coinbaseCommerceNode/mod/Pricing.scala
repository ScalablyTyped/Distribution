package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing object.
  */
@js.native
trait Pricing extends CryptoPricing {
  var local: Price[FiatCurrency] = js.native
}

object Pricing {
  @scala.inline
  def apply(local: Price[FiatCurrency]): Pricing = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pricing]
  }
  @scala.inline
  implicit class PricingOps[Self <: Pricing] (val x: Self) extends AnyVal {
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
    def setLocal(value: Price[FiatCurrency]): Self = this.set("local", value.asInstanceOf[js.Any])
  }
  
}

