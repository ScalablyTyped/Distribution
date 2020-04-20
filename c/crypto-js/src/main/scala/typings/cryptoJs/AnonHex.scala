package typings.cryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHex extends js.Object {
  var Hex: js.Any
  var OpenSSL: js.Any
}

object AnonHex {
  @scala.inline
  def apply(Hex: js.Any, OpenSSL: js.Any): AnonHex = {
    val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHex]
  }
}

