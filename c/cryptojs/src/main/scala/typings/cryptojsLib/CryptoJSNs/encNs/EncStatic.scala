package typings
package cryptojsLib.CryptoJSNs.encNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncStatic extends js.Object {
  var Base64: ICoder
  var Hex: ICoder
  var Latin1: ICoder
  var Utf16: ICoder
  var Utf16BE: ICoder
  var Utf16LE: ICoder
  var Utf8: ICoder
}

object EncStatic {
  @scala.inline
  def apply(
    Base64: ICoder,
    Hex: ICoder,
    Latin1: ICoder,
    Utf16: ICoder,
    Utf16BE: ICoder,
    Utf16LE: ICoder,
    Utf8: ICoder
  ): EncStatic = {
    val __obj = js.Dynamic.literal(Base64 = Base64, Hex = Hex, Latin1 = Latin1, Utf16 = Utf16, Utf16BE = Utf16BE, Utf16LE = Utf16LE, Utf8 = Utf8)
  
    __obj.asInstanceOf[EncStatic]
  }
}

