package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodNonceGateway extends js.Object {
  def create(paymentMethodToken: String): js.Promise[ValidatedResponse[PaymentMethodNonce]] = js.native
  def find(paymentMethodNonce: String): js.Promise[PaymentMethodNonce] = js.native
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
  @scala.inline
  implicit class PaymentMethodNonceGatewayOps[Self <: PaymentMethodNonceGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: String => js.Promise[ValidatedResponse[PaymentMethodNonce]]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setFind(value: String => js.Promise[PaymentMethodNonce]): Self = this.set("find", js.Any.fromFunction1(value))
  }
  
}

