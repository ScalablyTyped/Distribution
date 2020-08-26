package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingAddress extends js.Object {
  var billingAddress: js.UndefOr[js.Any] = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var vault: js.UndefOr[Boolean] = js.native
}

object BillingAddress {
  @scala.inline
  def apply(): BillingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAddress]
  }
  @scala.inline
  implicit class BillingAddressOps[Self <: BillingAddress] (val x: Self) extends AnyVal {
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
    def setBillingAddress(value: js.Any): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    @scala.inline
    def setCardholderName(value: String): Self = this.set("cardholderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardholderName: Self = this.set("cardholderName", js.undefined)
    @scala.inline
    def setVault(value: Boolean): Self = this.set("vault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVault: Self = this.set("vault", js.undefined)
  }
  
}

