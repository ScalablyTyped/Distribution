package typings.cryptojs.CryptoJSNs.encNs

import typings.cryptojs.CryptoJSNs.libNs.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoder
  extends IEncoder
     with IDecoder

object ICoder {
  @scala.inline
  def apply(parse: String => WordArray, stringify: WordArray => String): ICoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[ICoder]
  }
}

