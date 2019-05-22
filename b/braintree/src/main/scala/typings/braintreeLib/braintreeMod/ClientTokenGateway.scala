package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTokenGateway extends js.Object {
  def generate(request: ClientTokenRequest): js.Promise[ValidatedResponse[ClientToken]]
}

object ClientTokenGateway {
  @scala.inline
  def apply(generate: ClientTokenRequest => js.Promise[ValidatedResponse[ClientToken]]): ClientTokenGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
  
    __obj.asInstanceOf[ClientTokenGateway]
  }
}

