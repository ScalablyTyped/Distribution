package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGateway extends js.Object {
  def create(request: CustomerCreateRequest): js.Promise[ValidatedResponse[Customer]]
  def delete(customerId: String): js.Promise[Unit]
  def find(customerId: String): js.Promise[Customer]
  def search(searchFn: js.Any): js.Promise[js.Array[Customer]]
  def update(customerId: String, updates: CustomerUpdateRequest): js.Promise[ValidatedResponse[Customer]]
}

object CustomerGateway {
  @scala.inline
  def apply(
    create: CustomerCreateRequest => js.Promise[ValidatedResponse[Customer]],
    delete: String => js.Promise[Unit],
    find: String => js.Promise[Customer],
    search: js.Any => js.Promise[js.Array[Customer]],
    update: (String, CustomerUpdateRequest) => js.Promise[ValidatedResponse[Customer]]
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), search = js.Any.fromFunction1(search), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[CustomerGateway]
  }
}

