package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressGateway extends StObject {
  
  def create(request: AddressCreateRequest): js.Promise[ValidatedResponse[Address]]
  
  def delete(customerId: String, addressId: String): js.Promise[Unit]
  
  def find(customerId: String, addressId: String): js.Promise[Address]
  
  def update(customerId: String, addressId: String, updates: AddressUpdateRequest): js.Promise[ValidatedResponse[Address]]
}
object AddressGateway {
  
  @scala.inline
  def apply(
    create: AddressCreateRequest => js.Promise[ValidatedResponse[Address]],
    delete: (String, String) => js.Promise[Unit],
    find: (String, String) => js.Promise[Address],
    update: (String, String, AddressUpdateRequest) => js.Promise[ValidatedResponse[Address]]
  ): AddressGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction2(delete), find = js.Any.fromFunction2(find), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[AddressGateway]
  }
  
  @scala.inline
  implicit class AddressGatewayMutableBuilder[Self <: AddressGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: AddressCreateRequest => js.Promise[ValidatedResponse[Address]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFind(value: (String, String) => js.Promise[Address]): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (String, String, AddressUpdateRequest) => js.Promise[ValidatedResponse[Address]]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
