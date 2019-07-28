package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardVerificationGateway extends js.Object {
  def search(searchFn: js.Any): js.Promise[js.Array[CreditCardVerification]]
}

object CreditCardVerificationGateway {
  @scala.inline
  def apply(search: js.Any => js.Promise[js.Array[CreditCardVerification]]): CreditCardVerificationGateway = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[CreditCardVerificationGateway]
  }
}

