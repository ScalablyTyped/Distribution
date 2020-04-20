package typings.braintreeWeb.mod

import typings.braintreeWeb.AnonPostalCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardInfo extends js.Object {
  var billingAddress: AnonPostalCode
  var cvv: String
  var expirationDate: String
  var number: String
}

object CreditCardInfo {
  @scala.inline
  def apply(billingAddress: AnonPostalCode, cvv: String, expirationDate: String, number: String): CreditCardInfo = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardInfo]
  }
}

