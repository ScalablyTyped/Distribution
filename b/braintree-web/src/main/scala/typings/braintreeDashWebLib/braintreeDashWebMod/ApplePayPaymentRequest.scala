package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// more info https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types/paymentrequest
//  billingContact
//  Billing contact information for the user.
//    countryCode
//Required.The merchant’s two- letter ISO 3166 country code.
//    currencyCode
//  Required.The three- letter ISO 4217 currency code for the payment.
//    lineItems
//A set of line items that explain recurring payments and additional charges.
//    merchantCapabilities
//  Required.The payment capabilities supported by the merchant.The value must be one or more of supports3DS, supportsEMV, supportsCredit, or supportsDebit.
//    requiredBillingContactFields
//  The billing information that is required from the user.The value must be one or more of postalAddress, phone, email, or name.
//    requiredShippingContactFields
//  The shipping information that is required from the user.The value must be one or more of postalAddress, phone, email, or name.
//    shippingContact
//  Shipping contact information for the user.
//    shippingMethods
//A set of available shipping methods.Totals for all shipping methods must be non- negative to pass validation.
//    shippingType
//  How the items are to be shipped.This property is optional.If specified, it must be one or more of shipping, delivery, storePickup, or servicePickup.The default value is shipping.
//    supportedNetworks
//  Required.The payment networks supported by the merchant.The value must be one or more of amex, discover, interac, masterCard, privateLabel, or visa.
//    total
//  Required.The total amount for the payment.The total must be greater than zero and have a label to pass validation.
trait ApplePayPaymentRequest extends js.Object {
  var billingContact: js.UndefOr[js.Any] = js.undefined
  var countryCode: java.lang.String
  var currencyCode: java.lang.String
  var merchantCapabilities: js.Array[java.lang.String]
  var requiredBillingContactFields: js.UndefOr[js.Any] = js.undefined
  var requiredShippingContactFields: js.UndefOr[js.Any] = js.undefined
  var shippingContact: js.UndefOr[js.Any] = js.undefined
  var shippingMethods: js.UndefOr[js.Any] = js.undefined
  var shippingType: js.UndefOr[js.Any] = js.undefined
  var supportedNetworks: js.Array[java.lang.String]
  var total: braintreeDashWebLib.Anon_AmountLabel
}

object ApplePayPaymentRequest {
  @scala.inline
  def apply(
    countryCode: java.lang.String,
    currencyCode: java.lang.String,
    merchantCapabilities: js.Array[java.lang.String],
    supportedNetworks: js.Array[java.lang.String],
    total: braintreeDashWebLib.Anon_AmountLabel,
    billingContact: js.Any = null,
    requiredBillingContactFields: js.Any = null,
    requiredShippingContactFields: js.Any = null,
    shippingContact: js.Any = null,
    shippingMethods: js.Any = null,
    shippingType: js.Any = null
  ): ApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(countryCode = countryCode, currencyCode = currencyCode, merchantCapabilities = merchantCapabilities, supportedNetworks = supportedNetworks, total = total)
    if (billingContact != null) __obj.updateDynamic("billingContact")(billingContact)
    if (requiredBillingContactFields != null) __obj.updateDynamic("requiredBillingContactFields")(requiredBillingContactFields)
    if (requiredShippingContactFields != null) __obj.updateDynamic("requiredShippingContactFields")(requiredShippingContactFields)
    if (shippingContact != null) __obj.updateDynamic("shippingContact")(shippingContact)
    if (shippingMethods != null) __obj.updateDynamic("shippingMethods")(shippingMethods)
    if (shippingType != null) __obj.updateDynamic("shippingType")(shippingType)
    __obj.asInstanceOf[ApplePayPaymentRequest]
  }
}

