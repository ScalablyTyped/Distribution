package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodNonceGateway extends js.Object {
  def create(paymentMethodToken: String): js.Promise[ValidatedResponse[PaymentMethodNonce]]
  def find(paymentMethodNonce: String): js.Promise[PaymentMethodNonce]
}

object PaymentMethodNonceGateway {
  @scala.inline
  def apply(
    create: String => js.Promise[ValidatedResponse[PaymentMethodNonce]],
    find: String => js.Promise[PaymentMethodNonce]
  ): PaymentMethodNonceGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PaymentMethodNonceGateway]
  }
}

