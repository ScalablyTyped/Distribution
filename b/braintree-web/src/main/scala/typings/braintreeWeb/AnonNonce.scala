package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNonce extends js.Object {
  var nonce: String
}

object AnonNonce {
  @scala.inline
  def apply(nonce: String): AnonNonce = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNonce]
  }
}

