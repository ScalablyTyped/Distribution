package typings.cryptojs.CryptoJSNs.encNs

import typings.cryptojs.CryptoJSNs.libNs.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncoder extends js.Object {
  def stringify(wordArray: WordArray): String
}

object IEncoder {
  @scala.inline
  def apply(stringify: WordArray => String): IEncoder = {
    val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[IEncoder]
  }
}

