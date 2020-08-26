package typings.braintree.mod

import typings.braintree.anon.Company
import typings.braintree.anon.MakeDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodCreateRequest extends js.Object {
  var billingAddress: js.UndefOr[Company] = js.native
  var billingAddressId: js.UndefOr[String] = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var customerId: String = js.native
  var cvv: js.UndefOr[String] = js.native
  var deviceData: js.UndefOr[String] = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var expirationMonth: js.UndefOr[String] = js.native
  var expirationYear: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var options: js.UndefOr[MakeDefault] = js.native
  var paymentMethodNonce: String = js.native
}

object PaymentMethodCreateRequest {
  @scala.inline
  def apply(customerId: String, paymentMethodNonce: String): PaymentMethodCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodCreateRequest]
  }
  @scala.inline
  implicit class PaymentMethodCreateRequestOps[Self <: PaymentMethodCreateRequest] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = this.set("paymentMethodNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingAddress(value: Company): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    @scala.inline
    def setBillingAddressId(value: String): Self = this.set("billingAddressId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingAddressId: Self = this.set("billingAddressId", js.undefined)
    @scala.inline
    def setCardholderName(value: String): Self = this.set("cardholderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardholderName: Self = this.set("cardholderName", js.undefined)
    @scala.inline
    def setCvv(value: String): Self = this.set("cvv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCvv: Self = this.set("cvv", js.undefined)
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceData: Self = this.set("deviceData", js.undefined)
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setExpirationMonth(value: String): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationMonth: Self = this.set("expirationMonth", js.undefined)
    @scala.inline
    def setExpirationYear(value: String): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationYear: Self = this.set("expirationYear", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOptions(value: MakeDefault): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

