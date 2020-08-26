package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOnDemandAuditTaskResponse extends js.Object {
  /**
    * The ID of the on-demand audit you started.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
}

object StartOnDemandAuditTaskResponse {
  @scala.inline
  def apply(): StartOnDemandAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOnDemandAuditTaskResponse]
  }
  @scala.inline
  implicit class StartOnDemandAuditTaskResponseOps[Self <: StartOnDemandAuditTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
  
}

