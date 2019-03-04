package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The payment method nonce.
  * @property {string} type The payment method type, always `PayPalAccount`.
  * @property {object} details Additional PayPal account details.
  * @property {string} details.email User's email address.
  * @property {string} details.payerId User's payer ID, the unique identifier for each PayPal account.
  * @property {string} details.firstName User's given name.
  * @property {string} details.lastName User's surname.
  * @property {?string} details.countryCode User's 2 character country code.
  * @property {?string} details.phone User's phone number (e.g. 555-867-5309).
  * @property {?object} details.shippingAddress User's shipping address details, only available if shipping address is enabled.
  * @property {string} details.shippingAddress.recipientName Recipient of postage.
  * @property {string} details.shippingAddress.line1 Street number and name.
  * @property {string} details.shippingAddress.line2 Extended address.
  * @property {string} details.shippingAddress.city City or locality.
  * @property {string} details.shippingAddress.state State or region.
  * @property {string} details.shippingAddress.postalCode Postal code.
  * @property {string} details.shippingAddress.countryCode 2 character country code (e.g. US).
  * @property {?object} details.billingAddress User's billing address details.
  * Not available to all merchants; [contact PayPal](https://developers.braintreepayments.com/support/guides/paypal/setup-guide#contacting-paypal-support) for details on eligibility and enabling this feature.
  * To enable this feature, [contact PayPal](https://developers.braintreepayments.com/support/guides/paypal/setup-guide#contacting-paypal-support).
  * Alternatively, see `shippingAddress` above as an available client opt
  * To enable this feature, [contact PayPal](https://developers.braintreepayments.com/support/guides/paypal/setup-guide#contacting-paypal-support).
  * @property {string} details.billingAddress.line1 Street number and name.
  * @property {string} details.billingAddress.line2 Extended address.
  * @property {string} details.billingAddress.city City or locality.
  * @property {string} details.billingAddress.state State or region.
  * @property {string} details.billingAddress.postalCode Postal code.
  * @property {string} details.billingAddress.countryCode 2 character country code (e.g. US).
  */
trait PayPalShippingAddress extends js.Object {
  var city: java.lang.String
  var countryCode: java.lang.String
  var line1: java.lang.String
  var line2: java.lang.String
  var postalCode: java.lang.String
  var recipientName: java.lang.String
  var state: java.lang.String
}

object PayPalShippingAddress {
  @scala.inline
  def apply(
    city: java.lang.String,
    countryCode: java.lang.String,
    line1: java.lang.String,
    line2: java.lang.String,
    postalCode: java.lang.String,
    recipientName: java.lang.String,
    state: java.lang.String
  ): PayPalShippingAddress = {
    val __obj = js.Dynamic.literal(city = city, countryCode = countryCode, line1 = line1, line2 = line2, postalCode = postalCode, recipientName = recipientName, state = state)
  
    __obj.asInstanceOf[PayPalShippingAddress]
  }
}

