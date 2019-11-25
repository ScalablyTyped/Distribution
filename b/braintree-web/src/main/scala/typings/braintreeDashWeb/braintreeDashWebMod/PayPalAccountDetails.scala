package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalAccountDetails extends js.Object {
  var billingAddress: PayPalBillingAddress
  var countryCode: String
  var email: String
  var firstName: String
  var lastName: String
  var payerId: String
  var phone: String
  var shippingAddress: PayPalShippingAddress
}

object PayPalAccountDetails {
  @scala.inline
  def apply(
    billingAddress: PayPalBillingAddress,
    countryCode: String,
    email: String,
    firstName: String,
    lastName: String,
    payerId: String,
    phone: String,
    shippingAddress: PayPalShippingAddress
  ): PayPalAccountDetails = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PayPalAccountDetails]
  }
}

