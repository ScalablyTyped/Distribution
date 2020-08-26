package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodRequestablePayload extends js.Object {
  var paymentMethodIsSelected: Boolean = js.native
  var `type`: CreditCard | PayPalAccount = js.native
}

object PaymentMethodRequestablePayload {
  @scala.inline
  def apply(paymentMethodIsSelected: Boolean, `type`: CreditCard | PayPalAccount): PaymentMethodRequestablePayload = {
    val __obj = js.Dynamic.literal(paymentMethodIsSelected = paymentMethodIsSelected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodRequestablePayload]
  }
  @scala.inline
  implicit class PaymentMethodRequestablePayloadOps[Self <: PaymentMethodRequestablePayload] (val x: Self) extends AnyVal {
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
    def setPaymentMethodIsSelected(value: Boolean): Self = this.set("paymentMethodIsSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CreditCard | PayPalAccount): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

