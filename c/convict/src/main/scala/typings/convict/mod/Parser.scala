package typings.convict.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var extension: String | js.Array[String]
  def parse(content: String): js.Any
}

object Parser {
  @scala.inline
  def apply(extension: String | js.Array[String], parse: String => js.Any): Parser = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parser]
  }
}

