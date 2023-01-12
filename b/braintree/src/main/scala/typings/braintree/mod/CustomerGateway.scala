package typings.braintree.mod

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerGateway extends StObject {
  
  def create(request: CustomerCreateRequest): js.Promise[ValidatedResponse[Customer]]
  
  def delete(customerId: String): js.Promise[Unit]
  
  def find(customerId: String): js.Promise[Customer]
  
  def search(searchFn: Any): Readable
  
  def update(customerId: String, updates: CustomerUpdateRequest): js.Promise[ValidatedResponse[Customer]]
}
object CustomerGateway {
  
  inline def apply(
    create: CustomerCreateRequest => js.Promise[ValidatedResponse[Customer]],
    delete: String => js.Promise[Unit],
    find: String => js.Promise[Customer],
    search: Any => Readable,
    update: (String, CustomerUpdateRequest) => js.Promise[ValidatedResponse[Customer]]
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), search = js.Any.fromFunction1(search), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[CustomerGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerGateway] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: CustomerCreateRequest => js.Promise[ValidatedResponse[Customer]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setFind(value: String => js.Promise[Customer]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setSearch(value: Any => Readable): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (String, CustomerUpdateRequest) => js.Promise[ValidatedResponse[Customer]]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
