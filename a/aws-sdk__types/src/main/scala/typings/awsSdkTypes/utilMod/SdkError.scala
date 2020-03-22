package typings.awsSdkTypes.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  connectionError ? :boolean} */
trait SdkError extends js.Object {
  var connectionError: js.UndefOr[Boolean] = js.undefined
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object SdkError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    connectionError: js.UndefOr[Boolean] = js.undefined,
    stack: String = null
  ): SdkError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionError)) __obj.updateDynamic("connectionError")(connectionError.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkError]
  }
}

