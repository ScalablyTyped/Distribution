package typings.braintree.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerGateway extends js.Object {
  
  def create(request: CustomerCreateRequest): js.Promise[ValidatedResponse[Customer]] = js.native
  
  def delete(customerId: String): js.Promise[Unit] = js.native
  
  def find(customerId: String): js.Promise[Customer] = js.native
  
  def search(searchFn: js.Any): Readable = js.native
  
  def update(customerId: String, updates: CustomerUpdateRequest): js.Promise[ValidatedResponse[Customer]] = js.native
}
object CustomerGateway {
  
  @scala.inline
  def apply(
    create: CustomerCreateRequest => js.Promise[ValidatedResponse[Customer]],
    delete: String => js.Promise[Unit],
    find: String => js.Promise[Customer],
    search: js.Any => Readable,
    update: (String, CustomerUpdateRequest) => js.Promise[ValidatedResponse[Customer]]
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), search = js.Any.fromFunction1(search), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[CustomerGateway]
  }
  
  @scala.inline
  implicit class CustomerGatewayOps[Self <: CustomerGateway] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: CustomerCreateRequest => js.Promise[ValidatedResponse[Customer]]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: String => js.Promise[Customer]): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearch(value: js.Any => Readable): Self = this.set("search", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (String, CustomerUpdateRequest) => js.Promise[ValidatedResponse[Customer]]): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
