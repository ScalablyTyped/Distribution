package typings.braintreeWebDropIn.anon

import typings.braintreeWebDropIn.braintreeWebDropInStrings.card
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentOption extends js.Object {
  var paymentOption: card | paypal | paypalCredit
}

object PaymentOption {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): PaymentOption = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOption]
  }
}

