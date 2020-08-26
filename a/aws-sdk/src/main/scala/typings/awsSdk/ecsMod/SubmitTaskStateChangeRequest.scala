package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitTaskStateChangeRequest extends js.Object {
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: js.UndefOr[AttachmentStateChanges] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Any containers associated with the state change request.
    */
  var containers: js.UndefOr[ContainerStateChanges] = js.native
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The task ID or full ARN of the task in the state change request.
    */
  var task: js.UndefOr[String] = js.native
}

object SubmitTaskStateChangeRequest {
  @scala.inline
  def apply(): SubmitTaskStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitTaskStateChangeRequest]
  }
  @scala.inline
  implicit class SubmitTaskStateChangeRequestOps[Self <: SubmitTaskStateChangeRequest] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: AttachmentStateChange*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: AttachmentStateChanges): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setContainersVarargs(value: ContainerStateChange*): Self = this.set("containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: ContainerStateChanges): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    @scala.inline
    def setExecutionStoppedAt(value: Timestamp): Self = this.set("executionStoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStoppedAt: Self = this.set("executionStoppedAt", js.undefined)
    @scala.inline
    def setPullStartedAt(value: Timestamp): Self = this.set("pullStartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullStartedAt: Self = this.set("pullStartedAt", js.undefined)
    @scala.inline
    def setPullStoppedAt(value: Timestamp): Self = this.set("pullStoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullStoppedAt: Self = this.set("pullStoppedAt", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTask(value: String): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
  }
  
}

