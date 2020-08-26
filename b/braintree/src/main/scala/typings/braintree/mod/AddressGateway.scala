package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressGateway extends js.Object {
  def create(request: AddressCreateRequest): js.Promise[ValidatedResponse[Address]] = js.native
  def delete(customerId: String, addressId: String): js.Promise[Unit] = js.native
  def find(customerId: String, addressId: String): js.Promise[Address] = js.native
  def update(customerId: String, addressId: String, updates: AddressUpdateRequest): js.Promise[ValidatedResponse[Address]] = js.native
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
  implicit class AddressGatewayOps[Self <: AddressGateway] (val x: Self) extends AnyVal {
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
    def setCreate(value: AddressCreateRequest => js.Promise[ValidatedResponse[Address]]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: (String, String) => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction2(value))
    @scala.inline
    def setFind(value: (String, String) => js.Promise[Address]): Self = this.set("find", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: (String, String, AddressUpdateRequest) => js.Promise[ValidatedResponse[Address]]): Self = this.set("update", js.Any.fromFunction3(value))
  }
  
}

