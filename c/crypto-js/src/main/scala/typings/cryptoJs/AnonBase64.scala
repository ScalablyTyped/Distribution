package typings.cryptoJs

import typings.cryptoJs.mod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64 extends js.Object {
  var Base64: Encoder
  var Hex: Encoder
  var Latin1: Encoder
  var Utf16: Encoder
  var Utf16LE: Encoder
  var Utf8: Encoder
}

object AnonBase64 {
  @scala.inline
  def apply(Base64: Encoder, Hex: Encoder, Latin1: Encoder, Utf16: Encoder, Utf16LE: Encoder, Utf8: Encoder): AnonBase64 = {
    val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase64]
  }
}

