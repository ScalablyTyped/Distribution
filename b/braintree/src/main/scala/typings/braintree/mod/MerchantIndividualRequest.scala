package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantIndividualRequest extends js.Object {
  var address: MerchantAddressDetails = js.native
  var dateOfBirth: String = js.native
  var email: String = js.native
  var firstName: String = js.native
  var lastName: String = js.native
  var phone: js.UndefOr[String] = js.native
  var ssn: js.UndefOr[String] = js.native
  var ssnLast4: js.UndefOr[String] = js.native
}

object MerchantIndividualRequest {
  @scala.inline
  def apply(
    address: MerchantAddressDetails,
    dateOfBirth: String,
    email: String,
    firstName: String,
    lastName: String
  ): MerchantIndividualRequest = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dateOfBirth = dateOfBirth.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantIndividualRequest]
  }
  @scala.inline
  implicit class MerchantIndividualRequestOps[Self <: MerchantIndividualRequest] (val x: Self) extends AnyVal {
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
    def setAddress(value: MerchantAddressDetails): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateOfBirth(value: String): Self = this.set("dateOfBirth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setSsn(value: String): Self = this.set("ssn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsn: Self = this.set("ssn", js.undefined)
    @scala.inline
    def setSsnLast4(value: String): Self = this.set("ssnLast4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsnLast4: Self = this.set("ssnLast4", js.undefined)
  }
  
}

