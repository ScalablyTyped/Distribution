package typings.braintree.mod

import typings.braintree.AnonAllowVaulting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodGateway extends js.Object {
  def create(request: PaymentMethodCreateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
  def delete(token: String): js.Promise[Unit]
  def find(token: String): js.Promise[PaymentMethod]
  def grant(sharedPaymentMethodToken: String, options: AnonAllowVaulting): js.Promise[String]
  def revoke(sharedPaymentMethodToken: String): js.Promise[Unit]
  def update(token: String, updates: PaymentMethodUpdateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
}

object PaymentMethodGateway {
  @scala.inline
  def apply(
    create: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]],
    delete: String => js.Promise[Unit],
    find: String => js.Promise[PaymentMethod],
    grant: (String, AnonAllowVaulting) => js.Promise[String],
    revoke: String => js.Promise[Unit],
    update: (String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]
  ): PaymentMethodGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), grant = js.Any.fromFunction2(grant), revoke = js.Any.fromFunction1(revoke), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[PaymentMethodGateway]
  }
}

