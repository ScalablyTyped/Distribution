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
    parse: java.lang.String => cryptojsLib.CryptoJSNs.libNs.WordArray,
    stringify: cryptojsLib.CryptoJSNs.libNs.WordArray => java.lang.String
  ): ICoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[ICoder]
  }
}

