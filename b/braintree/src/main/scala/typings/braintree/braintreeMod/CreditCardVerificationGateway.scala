package typings.braintree.braintreeMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardVerificationGateway extends js.Object {
  def search(searchFn: js.Any): Readable
}

object CreditCardVerificationGateway {
  @scala.inline
  def apply(search: js.Any => Readable): CreditCardVerificationGateway = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[CreditCardVerificationGateway]
  }
}

