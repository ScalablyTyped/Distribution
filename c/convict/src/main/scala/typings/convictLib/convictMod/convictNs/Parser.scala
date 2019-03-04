package typings
package convictLib.convictMod.convictNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var extension: java.lang.String | js.Array[java.lang.String]
  def parse(content: java.lang.String): js.Any
}

object Parser {
  @scala.inline
  def apply(
    extension: java.lang.String | js.Array[java.lang.String],
    parse: js.Function1[java.lang.String, js.Any]
  ): Parser = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], parse = parse)
  
    __obj.asInstanceOf[Parser]
  }
}

