package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitContainerStateChangeRequest extends js.Object {
  /**
    * The short name or full ARN of the cluster that hosts the container.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The exit code returned for the state change request.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  /**
    * The network bindings of the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
    */
  var task: js.UndefOr[String] = js.native
}

object SubmitContainerStateChangeRequest {
  @scala.inline
  def apply(): SubmitContainerStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitContainerStateChangeRequest]
  }
  @scala.inline
  implicit class SubmitContainerStateChangeRequestOps[Self <: SubmitContainerStateChangeRequest] (val x: Self) extends AnyVal {
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    @scala.inline
    def setExitCode(value: BoxedInteger): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    @scala.inline
    def setNetworkBindingsVarargs(value: NetworkBinding*): Self = this.set("networkBindings", js.Array(value :_*))
    @scala.inline
    def setNetworkBindings(value: NetworkBindings): Self = this.set("networkBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkBindings: Self = this.set("networkBindings", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRuntimeId(value: String): Self = this.set("runtimeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeId: Self = this.set("runtimeId", js.undefined)
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

