package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressGateway extends js.Object {
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
}

