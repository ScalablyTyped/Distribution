package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodNonceGateway extends js.Object {
  def create(paymentMethodToken: java.lang.String): js.Promise[ValidatedResponse[PaymentMethodNonce]]
  def find(paymentMethodNonce: java.lang.String): js.Promise[PaymentMethodNonce]
}

object PaymentMethodNonceGateway {
  @scala.inline
  def apply(
    create: java.lang.String => js.Promise[ValidatedResponse[PaymentMethodNonce]],
    find: java.lang.String => js.Promise[PaymentMethodNonce]
  ): PaymentMethodNonceGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[PaymentMethodNonceGateway]
  }
}

