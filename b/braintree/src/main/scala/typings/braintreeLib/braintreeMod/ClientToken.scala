package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientToken extends js.Object {
  var clientToken: java.lang.String
}

object ClientToken {
  @scala.inline
  def apply(clientToken: java.lang.String): ClientToken = {
    val __obj = js.Dynamic.literal(clientToken = clientToken)
  
    __obj.asInstanceOf[ClientToken]
  }
}

