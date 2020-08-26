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
  def apply(): StopDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDeploymentOutput]
  }
  @scala.inline
  implicit class StopDeploymentOutputOps[Self <: StopDeploymentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: StopStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: Message): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
  
}

