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
    parse: java.lang.String => cryptojsLib.CryptoJSNs.libNs.CipherParams,
    stringify: cryptojsLib.CryptoJSNs.libNs.CipherParamsData => java.lang.String
  ): IFormatter = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[IFormatter]
  }
}

