package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodGateway extends js.Object {
  def create(request: PaymentMethodCreateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
  def delete(token: java.lang.String): js.Promise[scala.Unit]
  def find(token: java.lang.String): js.Promise[PaymentMethod]
  def grant(sharedPaymentMethodToken: java.lang.String, options: braintreeLib.Anon_AllowVaulting): js.Promise[java.lang.String]
  def revoke(sharedPaymentMethodToken: java.lang.String): js.Promise[scala.Unit]
  def update(token: java.lang.String, updates: PaymentMethodUpdateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
}

object PaymentMethodGateway {
  @scala.inline
  def apply(
    create: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]],
    delete: java.lang.String => js.Promise[scala.Unit],
    find: java.lang.String => js.Promise[PaymentMethod],
    grant: (java.lang.String, braintreeLib.Anon_AllowVaulting) => js.Promise[java.lang.String],
    revoke: java.lang.String => js.Promise[scala.Unit],
    update: (java.lang.String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]
  ): PaymentMethodGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), grant = js.Any.fromFunction2(grant), revoke = js.Any.fromFunction1(revoke), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PaymentMethodGateway]
  }
}

