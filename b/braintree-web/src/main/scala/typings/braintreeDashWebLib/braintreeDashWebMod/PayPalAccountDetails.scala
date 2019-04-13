package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayPalAccountDetails extends js.Object {
  var billingAddress: PayPalBillingAddress
  var countryCode: java.lang.String
  var email: java.lang.String
  var firstName: java.lang.String
  var lastName: java.lang.String
  var payerId: java.lang.String
  var phone: java.lang.String
  var shippingAddress: PayPalShippingAddress
}

object PayPalAccountDetails {
  @scala.inline
  def apply(
    billingAddress: PayPalBillingAddress,
    countryCode: java.lang.String,
    email: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String,
    payerId: java.lang.String,
    phone: java.lang.String,
    shippingAddress: PayPalShippingAddress
  ): PayPalAccountDetails = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress, countryCode = countryCode, email = email, firstName = firstName, lastName = lastName, payerId = payerId, phone = phone, shippingAddress = shippingAddress)
  
    __obj.asInstanceOf[PayPalAccountDetails]
  }
}

