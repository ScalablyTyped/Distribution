package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditCardGateway extends StObject {
  
  def create(request: CreditCardCreateRequest): js.Promise[ValidatedResponse[CreditCard]] = js.native
  
  def delete(creditCardToken: String): js.Promise[Unit] = js.native
  
  def expiringBetween(startDate: Date, endDate: Date): js.Promise[CreditCard] = js.native
  
  def find(creditCardToken: String): js.Promise[CreditCard] = js.native
  
  def update(creditCardToken: String, updates: CreditCardUpdateRequest): js.Promise[ValidatedResponse[CreditCard]] = js.native
}
object CreditCardGateway {
  
  @scala.inline
  def apply(
    create: CreditCardCreateRequest => js.Promise[ValidatedResponse[CreditCard]],
    delete: String => js.Promise[Unit],
    expiringBetween: (Date, Date) => js.Promise[CreditCard],
    find: String => js.Promise[CreditCard],
    update: (String, CreditCardUpdateRequest) => js.Promise[ValidatedResponse[CreditCard]]
  ): CreditCardGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), expiringBetween = js.Any.fromFunction2(expiringBetween), find = js.Any.fromFunction1(find), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[CreditCardGateway]
  }
  
  @scala.inline
  implicit class CreditCardGatewayMutableBuilder[Self <: CreditCardGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: CreditCardCreateRequest => js.Promise[ValidatedResponse[CreditCard]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpiringBetween(value: (Date, Date) => js.Promise[CreditCard]): Self = StObject.set(x, "expiringBetween", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFind(value: String => js.Promise[CreditCard]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (String, CreditCardUpdateRequest) => js.Promise[ValidatedResponse[CreditCard]]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
