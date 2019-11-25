package typings.cssDashTree.cssDashTreeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxParseError extends Error {
  var input: String
  var offset: Double
  var rawMessage: String
}

object SyntaxParseError {
  @scala.inline
  def apply(
    input: String,
    message: String,
    name: String,
    offset: Double,
    rawMessage: String,
    stack: String = null
  ): SyntaxParseError = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxParseError]
  }
}

