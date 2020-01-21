package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardGateway extends js.Object {
  def create(request: CreditCardCreateRequest): js.Promise[ValidatedResponse[CreditCard]]
  def delete(creditCardToken: String): js.Promise[Unit]
  def expiringBetween(startDate: Date, endDate: Date): js.Promise[CreditCard]
  def find(creditCardToken: String): js.Promise[CreditCard]
  def update(creditCardToken: String, updates: CreditCardUpdateRequest): js.Promise[ValidatedResponse[CreditCard]]
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
}

