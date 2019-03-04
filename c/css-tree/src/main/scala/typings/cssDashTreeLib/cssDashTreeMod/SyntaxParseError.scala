package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxParseError
  extends stdLib.Error {
  var input: java.lang.String
  var offset: scala.Double
  var rawMessage: java.lang.String
}

object SyntaxParseError {
  @scala.inline
  def apply(
    input: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    offset: scala.Double,
    rawMessage: java.lang.String,
    stack: java.lang.String = null
  ): SyntaxParseError = {
    val __obj = js.Dynamic.literal(input = input, message = message, name = name, offset = offset, rawMessage = rawMessage)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SyntaxParseError]
  }
}

