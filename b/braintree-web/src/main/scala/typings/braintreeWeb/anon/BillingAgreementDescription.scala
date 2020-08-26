package typings.braintreeWeb.anon

import typings.braintreeWeb.paypalMod.PayPalShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingAgreementDescription extends js.Object {
  var amount: js.UndefOr[String | Double] = js.native
  var billingAgreementDescription: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var enableShippingAddress: js.UndefOr[Boolean] = js.native
  var flow: String = js.native
  var intent: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var offerCredit: js.UndefOr[Boolean] = js.native
  var shippingAddressEditable: js.UndefOr[Boolean] = js.native
  var shippingAddressOverride: js.UndefOr[PayPalShippingAddress] = js.native
  var useraction: js.UndefOr[String] = js.native
}

object BillingAgreementDescription {
  @scala.inline
  def apply(flow: String): BillingAgreementDescription = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAgreementDescription]
  }
  @scala.inline
  implicit class BillingAgreementDescriptionOps[Self <: BillingAgreementDescription] (val x: Self) extends AnyVal {
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
    def setFlow(value: String): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: String | Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setBillingAgreementDescription(value: String): Self = this.set("billingAgreementDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAgreementDescription: Self = this.set("billingAgreementDescription", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEnableShippingAddress(value: Boolean): Self = this.set("enableShippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableShippingAddress: Self = this.set("enableShippingAddress", js.undefined)
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOfferCredit(value: Boolean): Self = this.set("offerCredit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferCredit: Self = this.set("offerCredit", js.undefined)
    @scala.inline
    def setShippingAddressEditable(value: Boolean): Self = this.set("shippingAddressEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddressEditable: Self = this.set("shippingAddressEditable", js.undefined)
    @scala.inline
    def setShippingAddressOverride(value: PayPalShippingAddress): Self = this.set("shippingAddressOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddressOverride: Self = this.set("shippingAddressOverride", js.undefined)
    @scala.inline
    def setUseraction(value: String): Self = this.set("useraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseraction: Self = this.set("useraction", js.undefined)
  }
  
}

