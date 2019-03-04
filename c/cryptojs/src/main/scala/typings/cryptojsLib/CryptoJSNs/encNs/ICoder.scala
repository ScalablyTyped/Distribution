package typings
package cryptojsLib.CryptoJSNs.encNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoder
  extends IEncoder
     with IDecoder

object ICoder {
  @scala.inline
  def apply(
    parse: js.Function1[java.lang.String, cryptojsLib.CryptoJSNs.libNs.WordArray],
    stringify: js.Function1[cryptojsLib.CryptoJSNs.libNs.WordArray, java.lang.String]
  ): ICoder = {
    val __obj = js.Dynamic.literal(parse = parse, stringify = stringify)
  
    __obj.asInstanceOf[ICoder]
  }
}

