package typings.cryptojs.CryptoJS.pad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadStatic extends js.Object {
  var AnsiX923: typings.cryptojs.CryptoJS.pad.AnsiX923
  var Iso10126: typings.cryptojs.CryptoJS.pad.Iso10126
  var Iso97971: typings.cryptojs.CryptoJS.pad.Iso97971
  var NoPadding: typings.cryptojs.CryptoJS.pad.NoPadding
  var Pkcs7: typings.cryptojs.CryptoJS.pad.Pkcs7
  var ZeroPadding: typings.cryptojs.CryptoJS.pad.ZeroPadding
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

