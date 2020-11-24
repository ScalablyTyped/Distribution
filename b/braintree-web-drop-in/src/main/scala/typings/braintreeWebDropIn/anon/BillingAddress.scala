package typings.braintreeWebDropIn.anon

import typings.braintreeWebDropIn.mod.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAddress extends js.Object {
  
  var billingAddress: js.UndefOr[Address] = js.native
  
  var countryCode: js.UndefOr[String] = js.native
  
  var email: String = js.native
  
  var firstName: String = js.native
  
  var lastName: String = js.native
  
  var payerId: String = js.native
  
  var phone: js.UndefOr[String] = js.native
  
  var shippingAddress: js.UndefOr[Address] = js.native
}
object BillingAddress {
  
  @scala.inline
  def apply(email: String, firstName: String, lastName: String, payerId: String): BillingAddress = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any])
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerId(value: String): Self = this.set("payerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddress(value: Address): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setShippingAddress(value: Address): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingAddress: Self = this.set("shippingAddress", js.undefined)
  }
}
