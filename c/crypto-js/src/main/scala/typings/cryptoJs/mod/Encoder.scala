package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  def parse(encodedMessage: String): js.Any
  def stringify(words: js.Any): String
}

object Encoder {
  @scala.inline
  def apply(parse: String => js.Any, stringify: js.Any => String): Encoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[Encoder]
  }
}

