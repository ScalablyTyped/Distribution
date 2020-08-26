package typings.braintreeWeb.applePayMod

import typings.braintreeWeb.anon.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePayPaymentRequest extends js.Object {
  var billingContact: js.UndefOr[js.Any] = js.native
  var countryCode: String = js.native
  var currencyCode: String = js.native
  var merchantCapabilities: js.Array[String] = js.native
  var requiredBillingContactFields: js.UndefOr[js.Any] = js.native
  var requiredShippingContactFields: js.UndefOr[js.Any] = js.native
  var shippingContact: js.UndefOr[js.Any] = js.native
  var shippingMethods: js.UndefOr[js.Any] = js.native
  var shippingType: js.UndefOr[js.Any] = js.native
  var supportedNetworks: js.Array[String] = js.native
  var total: Amount = js.native
}

object ApplePayPaymentRequest {
  @scala.inline
  def apply(
    countryCode: String,
    currencyCode: String,
    merchantCapabilities: js.Array[String],
    supportedNetworks: js.Array[String],
    total: Amount
  ): ApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], merchantCapabilities = merchantCapabilities.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentRequest]
  }
  @scala.inline
  implicit class ApplePayPaymentRequestOps[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchantCapabilitiesVarargs(value: String*): Self = this.set("merchantCapabilities", js.Array(value :_*))
    @scala.inline
    def setMerchantCapabilities(value: js.Array[String]): Self = this.set("merchantCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedNetworksVarargs(value: String*): Self = this.set("supportedNetworks", js.Array(value :_*))
    @scala.inline
    def setSupportedNetworks(value: js.Array[String]): Self = this.set("supportedNetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Amount): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingContact(value: js.Any): Self = this.set("billingContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingContact: Self = this.set("billingContact", js.undefined)
    @scala.inline
    def setRequiredBillingContactFields(value: js.Any): Self = this.set("requiredBillingContactFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredBillingContactFields: Self = this.set("requiredBillingContactFields", js.undefined)
    @scala.inline
    def setRequiredShippingContactFields(value: js.Any): Self = this.set("requiredShippingContactFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredShippingContactFields: Self = this.set("requiredShippingContactFields", js.undefined)
    @scala.inline
    def setShippingContact(value: js.Any): Self = this.set("shippingContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingContact: Self = this.set("shippingContact", js.undefined)
    @scala.inline
    def setShippingMethods(value: js.Any): Self = this.set("shippingMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingMethods: Self = this.set("shippingMethods", js.undefined)
    @scala.inline
    def setShippingType(value: js.Any): Self = this.set("shippingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingType: Self = this.set("shippingType", js.undefined)
  }
  
}

