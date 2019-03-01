package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnsiX923 extends js.Object {
  var AnsiX923: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
  var Iso10126: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
  var Iso97971: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
  var NoPadding: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
  var Pkcs7: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
  var ZeroPadding: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
}

object Anon_AnsiX923 {
  @scala.inline
  def apply(
    AnsiX923: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding,
    Iso10126: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding,
    Iso97971: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding,
    NoPadding: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding,
    Pkcs7: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding,
    ZeroPadding: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Padding
  ): Anon_AnsiX923 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AnsiX923")(AnsiX923)
    __obj.updateDynamic("Iso10126")(Iso10126)
    __obj.updateDynamic("Iso97971")(Iso97971)
    __obj.updateDynamic("NoPadding")(NoPadding)
    __obj.updateDynamic("Pkcs7")(Pkcs7)
    __obj.updateDynamic("ZeroPadding")(ZeroPadding)
    __obj.asInstanceOf[Anon_AnsiX923]
  }
}

