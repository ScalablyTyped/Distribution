package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBin extends js.Object {
  var bin: String
  var nonce: String
}

object AnonBin {
  @scala.inline
  def apply(bin: String, nonce: String): AnonBin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBin]
  }
}

