package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGateway extends js.Object {
  def create(request: CustomerCreateRequest): js.Promise[ValidatedResponse[Customer]]
  def delete(customerId: java.lang.String): js.Promise[scala.Unit]
  def find(customerId: java.lang.String): js.Promise[Customer]
  def search(searchFn: js.Any): js.Promise[js.Array[Customer]]
  def update(customerId: java.lang.String, updates: CustomerUpdateRequest): js.Promise[ValidatedResponse[Customer]]
}

object CustomerGateway {
  @scala.inline
  def apply(
    create: CustomerCreateRequest => js.Promise[ValidatedResponse[Customer]],
    delete: java.lang.String => js.Promise[scala.Unit],
    find: java.lang.String => js.Promise[Customer],
    search: js.Any => js.Promise[js.Array[Customer]],
    update: (java.lang.String, CustomerUpdateRequest) => js.Promise[ValidatedResponse[Customer]]
  ): CustomerGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), search = js.Any.fromFunction1(search), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[CustomerGateway]
  }
}

