package typings.braintree.anon

import typings.braintree.mod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerId extends js.Object {
  var customerId: String
  var revokedPaymentMethod: PaymentMethod
  var token: String
}

object CustomerId {
  @scala.inline
  def apply(customerId: String, revokedPaymentMethod: PaymentMethod, token: String): CustomerId = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], revokedPaymentMethod = revokedPaymentMethod.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerId]
  }
}

