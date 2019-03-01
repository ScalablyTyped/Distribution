package typings
package cryptojsLib.CryptoJSNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatter extends js.Object {
  def parse(s: java.lang.String): cryptojsLib.CryptoJSNs.libNs.CipherParams
  def stringify(cipherParams: cryptojsLib.CryptoJSNs.libNs.CipherParamsData): java.lang.String
}

object IFormatter {
  @scala.inline
  def apply(
    parse: js.Function1[java.lang.String, cryptojsLib.CryptoJSNs.libNs.CipherParams],
    stringify: js.Function1[cryptojsLib.CryptoJSNs.libNs.CipherParamsData, java.lang.String]
  ): IFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[IFormatter]
  }
}

