package typings.bristol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogError extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[js.Any] = js.undefined
  var stack: js.UndefOr[js.Any] = js.undefined
}

object LogError {
  @scala.inline
  def apply(message: String = null, reason: js.Any = null, stack: js.Any = null): LogError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogError]
  }
}

