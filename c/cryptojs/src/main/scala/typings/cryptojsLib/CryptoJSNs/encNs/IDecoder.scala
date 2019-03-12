package typings
package cryptojsLib.CryptoJSNs.encNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecoder extends js.Object {
  def parse(s: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray
}

object IDecoder {
  @scala.inline
  def apply(parse: java.lang.String => cryptojsLib.CryptoJSNs.libNs.WordArray): IDecoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[IDecoder]
  }
}

