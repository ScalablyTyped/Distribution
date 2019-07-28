package typings.cryptojs.CryptoJSNs.padNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadStatic extends js.Object {
  var AnsiX923: typings.cryptojs.CryptoJSNs.padNs.AnsiX923
  var Iso10126: typings.cryptojs.CryptoJSNs.padNs.Iso10126
  var Iso97971: typings.cryptojs.CryptoJSNs.padNs.Iso97971
  var NoPadding: typings.cryptojs.CryptoJSNs.padNs.NoPadding
  var Pkcs7: typings.cryptojs.CryptoJSNs.padNs.Pkcs7
  var ZeroPadding: typings.cryptojs.CryptoJSNs.padNs.ZeroPadding
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

