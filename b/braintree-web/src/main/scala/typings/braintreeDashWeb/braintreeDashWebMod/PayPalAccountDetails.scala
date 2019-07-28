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
    val __obj = js.Dynamic.literal(billingAddress = billingAddress, countryCode = countryCode, email = email, firstName = firstName, lastName = lastName, payerId = payerId, phone = phone, shippingAddress = shippingAddress)
  
    __obj.asInstanceOf[PayPalAccountDetails]
  }
}

