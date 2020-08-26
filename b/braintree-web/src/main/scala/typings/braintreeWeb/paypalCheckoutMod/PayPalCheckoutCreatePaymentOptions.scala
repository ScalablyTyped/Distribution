package typings.braintreeWeb.paypalCheckoutMod

import typings.paypalCheckoutComponents.callbackDataMod.Address
import typings.paypalCheckoutComponents.callbackDataMod.FlowType
import typings.paypalCheckoutComponents.callbackDataMod.Intent
import typings.paypalCheckoutComponents.callbackDataMod.LineItem
import typings.paypalCheckoutComponents.callbackDataMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalCheckoutCreatePaymentOptions extends js.Object {
  var amount: js.UndefOr[String | Double] = js.native
  var billingAgreementDescription: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var enableShippingAddress: js.UndefOr[Boolean] = js.native
  var flow: FlowType = js.native
  var intent: js.UndefOr[Intent] = js.native
  var landingPageType: js.UndefOr[String] = js.native
  var lineItems: js.UndefOr[js.Array[LineItem]] = js.native
  var locale: js.UndefOr[String] = js.native
  var offerCredit: js.UndefOr[Boolean] = js.native
  var shippingAddressEditable: js.UndefOr[Boolean] = js.native
  var shippingAddressOverride: js.UndefOr[Address] = js.native
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
  var vaultInitiatedCheckoutPaymentMethodToken: js.UndefOr[String] = js.native
}

object PayPalCheckoutCreatePaymentOptions {
  @scala.inline
  def apply(flow: FlowType): PayPalCheckoutCreatePaymentOptions = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalCheckoutCreatePaymentOptions]
  }
  @scala.inline
  implicit class PayPalCheckoutCreatePaymentOptionsOps[Self <: PayPalCheckoutCreatePaymentOptions] (val x: Self) extends AnyVal {
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
    def setFlow(value: FlowType): Self = this.set("flow", value.asInstanceOf[js.Any])
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
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    @scala.inline
    def setLandingPageType(value: String): Self = this.set("landingPageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandingPageType: Self = this.set("landingPageType", js.undefined)
    @scala.inline
    def setLineItemsVarargs(value: LineItem*): Self = this.set("lineItems", js.Array(value :_*))
    @scala.inline
    def setLineItems(value: js.Array[LineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
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
    def setShippingAddressOverride(value: Address): Self = this.set("shippingAddressOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddressOverride: Self = this.set("shippingAddressOverride", js.undefined)
    @scala.inline
    def setShippingOptionsVarargs(value: ShippingOption*): Self = this.set("shippingOptions", js.Array(value :_*))
    @scala.inline
    def setShippingOptions(value: js.Array[ShippingOption]): Self = this.set("shippingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOptions: Self = this.set("shippingOptions", js.undefined)
    @scala.inline
    def setVaultInitiatedCheckoutPaymentMethodToken(value: String): Self = this.set("vaultInitiatedCheckoutPaymentMethodToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaultInitiatedCheckoutPaymentMethodToken: Self = this.set("vaultInitiatedCheckoutPaymentMethodToken", js.undefined)
  }
  
}

