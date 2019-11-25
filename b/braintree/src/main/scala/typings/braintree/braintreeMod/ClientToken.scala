package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientToken extends js.Object {
  var clientToken: String
}

object ClientToken {
  @scala.inline
  def apply(clientToken: String): ClientToken = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientToken]
  }
}

