package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressGateway extends js.Object {
  def create(request: AddressCreateRequest): js.Promise[ValidatedResponse[Address]]
  def delete(customerId: java.lang.String, addressId: java.lang.String): js.Promise[scala.Unit]
  def find(customerId: java.lang.String, addressId: java.lang.String): js.Promise[Address]
  def update(customerId: java.lang.String, addressId: java.lang.String, updates: AddressUpdateRequest): js.Promise[ValidatedResponse[Address]]
}

object AddressGateway {
  @scala.inline
  def apply(
    create: AddressCreateRequest => js.Promise[ValidatedResponse[Address]],
    delete: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    find: (java.lang.String, java.lang.String) => js.Promise[Address],
    update: (java.lang.String, java.lang.String, AddressUpdateRequest) => js.Promise[ValidatedResponse[Address]]
  ): AddressGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction2(delete), find = js.Any.fromFunction2(find), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[AddressGateway]
  }
}

