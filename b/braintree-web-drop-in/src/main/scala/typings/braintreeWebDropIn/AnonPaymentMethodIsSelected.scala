package typings.braintreeWebDropIn

import typings.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typings.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaymentMethodIsSelected extends js.Object {
  var paymentMethodIsSelected: Boolean
  var `type`: CreditCard | PayPalAccount
}

object AnonPaymentMethodIsSelected {
  @scala.inline
  def apply(paymentMethodIsSelected: Boolean, `type`: CreditCard | PayPalAccount): AnonPaymentMethodIsSelected = {
    val __obj = js.Dynamic.literal(paymentMethodIsSelected = paymentMethodIsSelected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaymentMethodIsSelected]
  }
}

