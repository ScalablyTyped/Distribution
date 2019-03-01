package typings
package cryptojsLib.CryptoJSNs.padNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadStatic extends js.Object {
  var AnsiX923: AnsiX923
  var Iso10126: Iso10126
  var Iso97971: Iso97971
  var NoPadding: NoPadding
  var Pkcs7: Pkcs7
  var ZeroPadding: ZeroPadding
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AnsiX923")(AnsiX923)
    __obj.updateDynamic("Iso10126")(Iso10126)
    __obj.updateDynamic("Iso97971")(Iso97971)
    __obj.updateDynamic("NoPadding")(NoPadding)
    __obj.updateDynamic("Pkcs7")(Pkcs7)
    __obj.updateDynamic("ZeroPadding")(ZeroPadding)
    __obj.asInstanceOf[PadStatic]
  }
}

