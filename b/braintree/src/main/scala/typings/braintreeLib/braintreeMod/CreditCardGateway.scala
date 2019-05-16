package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardGateway extends js.Object {
  def create(request: CreditCardCreateRequest): js.Promise[ValidatedResponse[CreditCard]]
  def delete(creditCardToken: java.lang.String): js.Promise[scala.Unit]
  def expiringBetween(startDate: stdLib.Date, endDate: stdLib.Date): js.Promise[CreditCard]
  def find(creditCardToken: java.lang.String): js.Promise[CreditCard]
  def update(creditCardToken: java.lang.String, updates: CreditCardUpdateRequest): js.Promise[ValidatedResponse[CreditCard]]
}

object CreditCardGateway {
  @scala.inline
  def apply(
    create: CreditCardCreateRequest => js.Promise[ValidatedResponse[CreditCard]],
    delete: java.lang.String => js.Promise[scala.Unit],
    expiringBetween: (stdLib.Date, stdLib.Date) => js.Promise[CreditCard],
    find: java.lang.String => js.Promise[CreditCard],
    update: (java.lang.String, CreditCardUpdateRequest) => js.Promise[ValidatedResponse[CreditCard]]
  ): CreditCardGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), expiringBetween = js.Any.fromFunction2(expiringBetween), find = js.Any.fromFunction1(find), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[CreditCardGateway]
  }
}

