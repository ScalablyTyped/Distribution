package typings.braintreeWebDropIn.mod

import typings.braintreeWebDropIn.braintreeWebDropInStrings.card
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentOptionSelectedPayload extends js.Object {
  var paymentOption: card | paypal | paypalCredit = js.native
}

object PaymentOptionSelectedPayload {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): PaymentOptionSelectedPayload = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOptionSelectedPayload]
  }
  @scala.inline
  implicit class PaymentOptionSelectedPayloadOps[Self <: PaymentOptionSelectedPayload] (val x: Self) extends AnyVal {
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
    def setPaymentOption(value: card | paypal | paypalCredit): Self = this.set("paymentOption", value.asInstanceOf[js.Any])
  }
  
}

