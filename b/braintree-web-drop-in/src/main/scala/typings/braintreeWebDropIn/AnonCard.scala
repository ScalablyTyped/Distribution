package typings.braintreeWebDropIn

import typings.braintreeWebDropIn.braintreeWebDropInStrings.card
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typings.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCard extends js.Object {
  var paymentOption: card | paypal | paypalCredit
}

object AnonCard {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): AnonCard = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCard]
  }
}

