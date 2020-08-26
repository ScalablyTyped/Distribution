package typings.braintreeWeb.paypalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalAccountDetails extends js.Object {
  var billingAddress: PayPalBillingAddress = js.native
  var countryCode: String = js.native
  var email: String = js.native
  var firstName: String = js.native
  var lastName: String = js.native
  var payerId: String = js.native
  var phone: String = js.native
  var shippingAddress: PayPalShippingAddress = js.native
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
  @scala.inline
  implicit class PayPalAccountDetailsOps[Self <: PayPalAccountDetails] (val x: Self) extends AnyVal {
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
    def setBillingAddress(value: PayPalBillingAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayerId(value: String): Self = this.set("payerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setShippingAddress(value: PayPalShippingAddress): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
  }
  
}

