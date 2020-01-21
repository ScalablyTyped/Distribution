package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[SensitiveString] = js.native
}

object EnvironmentError {
  @scala.inline
  def apply(ErrorCode: String = null, Message: SensitiveString = null): EnvironmentError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentError]
  }
}

