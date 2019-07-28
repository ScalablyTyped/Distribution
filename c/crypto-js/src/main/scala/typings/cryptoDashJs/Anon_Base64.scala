package typings.cryptoDashJs

import typings.cryptoDashJs.cryptoDashJsMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var Base64: Encoder
  var Hex: Encoder
  var Latin1: Encoder
  var Utf16: Encoder
  var Utf16LE: Encoder
  var Utf8: Encoder
}

object Anon_Base64 {
  @scala.inline
  def apply(Base64: Encoder, Hex: Encoder, Latin1: Encoder, Utf16: Encoder, Utf16LE: Encoder, Utf8: Encoder): Anon_Base64 = {
    val __obj = js.Dynamic.literal(Base64 = Base64, Hex = Hex, Latin1 = Latin1, Utf16 = Utf16, Utf16LE = Utf16LE, Utf8 = Utf8)
  
    __obj.asInstanceOf[Anon_Base64]
  }
}

