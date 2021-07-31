package typings.braintree.mod

import typings.braintree.anon.AllowVaulting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodGateway extends StObject {
  
  def create(request: PaymentMethodCreateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
  
  def delete(token: String): js.Promise[Unit]
  
  def find(token: String): js.Promise[PaymentMethod]
  
  def grant(sharedPaymentMethodToken: String, options: AllowVaulting): js.Promise[ValidatedResponse[PaymentMethodNonce]]
  
  def revoke(sharedPaymentMethodToken: String): js.Promise[Unit]
  
  def update(token: String, updates: PaymentMethodUpdateRequest): js.Promise[ValidatedResponse[PaymentMethod]]
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
  implicit class PaymentMethodGatewayMutableBuilder[Self <: PaymentMethodGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: String => js.Promise[PaymentMethod]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGrant(value: (String, AllowVaulting) => js.Promise[ValidatedResponse[PaymentMethodNonce]]): Self = StObject.set(x, "grant", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRevoke(value: String => js.Promise[Unit]): Self = StObject.set(x, "revoke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
