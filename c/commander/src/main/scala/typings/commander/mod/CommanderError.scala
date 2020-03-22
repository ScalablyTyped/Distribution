package typings.commander.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommanderError extends Error {
  var code: String
  var exitCode: Double
  var nestedError: js.UndefOr[String] = js.undefined
}

object CommanderError {
  @scala.inline
  def apply(
    code: String,
    exitCode: Double,
    message: String,
    name: String,
    nestedError: String = null,
    stack: String = null
  ): CommanderError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (nestedError != null) __obj.updateDynamic("nestedError")(nestedError.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommanderError]
  }
}

