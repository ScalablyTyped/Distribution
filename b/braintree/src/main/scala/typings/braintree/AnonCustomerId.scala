package typings.braintree

import typings.braintree.mod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomerId extends js.Object {
  var customerId: String
  var revokedPaymentMethod: PaymentMethod
  var token: String
}

object AnonCustomerId {
  @scala.inline
  def apply(customerId: String, revokedPaymentMethod: PaymentMethod, token: String): AnonCustomerId = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], revokedPaymentMethod = revokedPaymentMethod.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomerId]
  }
}

