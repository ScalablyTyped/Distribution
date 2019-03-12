package typings
package cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  def parse(encodedMessage: java.lang.String): js.Any
  def stringify(words: js.Any): java.lang.String
}

object Encoder {
  @scala.inline
  def apply(parse: java.lang.String => js.Any, stringify: js.Any => java.lang.String): Encoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[Encoder]
  }
}

