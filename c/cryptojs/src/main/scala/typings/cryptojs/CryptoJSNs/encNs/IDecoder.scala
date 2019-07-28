package typings.cryptojs.CryptoJSNs.encNs

import typings.cryptojs.CryptoJSNs.libNs.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecoder extends js.Object {
  def parse(s: String): WordArray
}

object IDecoder {
  @scala.inline
  def apply(parse: String => WordArray): IDecoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[IDecoder]
  }
}

