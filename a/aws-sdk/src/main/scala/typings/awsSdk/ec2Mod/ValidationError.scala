package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  /**
    * The error code that indicates why the parameter or parameter combination is not valid. For more information about error codes, see Error Codes.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The error message that describes why the parameter or parameter combination is not valid. For more information about error messages, see Error Codes.
    */
  var Message: js.UndefOr[String] = js.native
}

object ValidationError {
  @scala.inline
  def apply(Code: String = null, Message: String = null): ValidationError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

