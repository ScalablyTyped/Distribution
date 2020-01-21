package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[CancelBatchErrorCode] = js.native
  /**
    * The description for the error code.
    */
  var Message: js.UndefOr[String] = js.native
}

object CancelSpotFleetRequestsError {
  @scala.inline
  def apply(Code: CancelBatchErrorCode = null, Message: String = null): CancelSpotFleetRequestsError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsError]
  }
}

