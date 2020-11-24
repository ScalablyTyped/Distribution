package typings.braintree.mod

import typings.braintree.anon.AllowVaulting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodGateway extends js.Object {
  
  def create(request: PaymentMethodCreateRequest): js.Promise[ValidatedResponse[PaymentMethod]] = js.native
  
  def delete(token: String): js.Promise[Unit] = js.native
  
  def find(token: String): js.Promise[PaymentMethod] = js.native
  
  def grant(sharedPaymentMethodToken: String, options: AllowVaulting): js.Promise[ValidatedResponse[PaymentMethodNonce]] = js.native
  
  def revoke(sharedPaymentMethodToken: String): js.Promise[Unit] = js.native
  
  def update(token: String, updates: PaymentMethodUpdateRequest): js.Promise[ValidatedResponse[PaymentMethod]] = js.native
}
object PaymentMethodGateway {
  
  @scala.inline
  def apply(
    create: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]],
    delete: String => js.Promise[Unit],
    find: String => js.Promise[PaymentMethod],
    grant: (String, AllowVaulting) => js.Promise[ValidatedResponse[PaymentMethodNonce]],
    revoke: String => js.Promise[Unit],
    update: (String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]
  ): PaymentMethodGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), grant = js.Any.fromFunction2(grant), revoke = js.Any.fromFunction1(revoke), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[PaymentMethodGateway]
  }
  
  @scala.inline
  implicit class PaymentMethodGatewayOps[Self <: PaymentMethodGateway] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: String => js.Promise[PaymentMethod]): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGrant(value: (String, AllowVaulting) => js.Promise[ValidatedResponse[PaymentMethodNonce]]): Self = this.set("grant", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRevoke(value: String => js.Promise[Unit]): Self = this.set("revoke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
