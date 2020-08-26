package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerCreateRequest extends js.Object {
  var company: js.UndefOr[String] = js.native
  var creditCard: js.UndefOr[CreditCardCreateRequest] = js.native
  var customFields: js.UndefOr[js.Any] = js.native
  var deviceData: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var fax: js.UndefOr[String] = js.native
  var firstName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var paymentMethodNonce: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var riskData: js.UndefOr[CustomerRiskData] = js.native
  var website: js.UndefOr[String] = js.native
}

object CustomerCreateRequest {
  @scala.inline
  def apply(): CustomerCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerCreateRequest]
  }
  @scala.inline
  implicit class CustomerCreateRequestOps[Self <: CustomerCreateRequest] (val x: Self) extends AnyVal {
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
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setCreditCard(value: CreditCardCreateRequest): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditCard: Self = this.set("creditCard", js.undefined)
    @scala.inline
    def setCustomFields(value: js.Any): Self = this.set("customFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceData: Self = this.set("deviceData", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFax(value: String): Self = this.set("fax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFax: Self = this.set("fax", js.undefined)
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = this.set("paymentMethodNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentMethodNonce: Self = this.set("paymentMethodNonce", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setRiskData(value: CustomerRiskData): Self = this.set("riskData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskData: Self = this.set("riskData", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

