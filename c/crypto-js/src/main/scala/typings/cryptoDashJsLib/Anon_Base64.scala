package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var Base64: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
  var Hex: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
  var Latin1: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
  var Utf16: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
  var Utf16LE: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
  var Utf8: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
}

object Anon_Base64 {
  @scala.inline
  def apply(
    Base64: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder,
    Hex: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder,
    Latin1: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder,
    Utf16: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder,
    Utf16LE: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder,
    Utf8: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Encoder
  ): Anon_Base64 = {
    val __obj = js.Dynamic.literal(Base64 = Base64, Hex = Hex, Latin1 = Latin1, Utf16 = Utf16, Utf16LE = Utf16LE, Utf8 = Utf8)
  
    __obj.asInstanceOf[Anon_Base64]
  }
}

