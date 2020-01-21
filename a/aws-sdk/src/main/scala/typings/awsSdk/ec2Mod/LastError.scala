package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastError extends js.Object {
  /**
    * The error code for the VPC endpoint error.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The error message for the VPC endpoint error.
    */
  var Message: js.UndefOr[String] = js.native
}

object LastError {
  @scala.inline
  def apply(Code: String = null, Message: String = null): LastError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastError]
  }
}

