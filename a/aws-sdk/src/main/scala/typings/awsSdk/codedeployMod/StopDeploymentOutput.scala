package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeploymentOutput extends js.Object {
  /**
    * The status of the stop deployment operation:   Pending: The stop operation is pending.   Succeeded: The stop operation was successful.  
    */
  var status: js.UndefOr[StopStatus] = js.native
  /**
    * An accompanying status message.
    */
  var statusMessage: js.UndefOr[Message] = js.native
}

object StopDeploymentOutput {
  @scala.inline
  def apply(status: StopStatus = null, statusMessage: Message = null): StopDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentOutput]
  }
}

