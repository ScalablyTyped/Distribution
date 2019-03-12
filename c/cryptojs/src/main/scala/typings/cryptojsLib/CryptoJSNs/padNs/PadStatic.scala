package typings
package cryptojsLib.CryptoJSNs.padNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadStatic extends js.Object {
  var AnsiX923: cryptojsLib.CryptoJSNs.padNs.AnsiX923
  var Iso10126: cryptojsLib.CryptoJSNs.padNs.Iso10126
  var Iso97971: cryptojsLib.CryptoJSNs.padNs.Iso97971
  var NoPadding: cryptojsLib.CryptoJSNs.padNs.NoPadding
  var Pkcs7: cryptojsLib.CryptoJSNs.padNs.Pkcs7
  var ZeroPadding: cryptojsLib.CryptoJSNs.padNs.ZeroPadding
}

object PadStatic {
  @scala.inline
  def apply(
    AnsiX923: AnsiX923,
    Iso10126: Iso10126,
    Iso97971: Iso97971,
    NoPadding: NoPadding,
    Pkcs7: Pkcs7,
    ZeroPadding: ZeroPadding
  ): PadStatic = {
    val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923, Iso10126 = Iso10126, Iso97971 = Iso97971, NoPadding = NoPadding, Pkcs7 = Pkcs7, ZeroPadding = ZeroPadding)
  
    __obj.asInstanceOf[PadStatic]
  }
}

