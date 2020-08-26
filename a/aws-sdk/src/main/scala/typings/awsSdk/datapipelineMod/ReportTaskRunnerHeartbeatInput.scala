package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskRunnerHeartbeatInput extends js.Object {
  /**
    * The public DNS name of the task runner.
    */
  var hostname: js.UndefOr[id] = js.native
  /**
    * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier when it launches the application. If you have written a custom task runner, you should assign a unique identifier for the task runner.
    */
  var taskrunnerId: id = js.native
  /**
    * The type of task the task runner is configured to accept and process. The worker group is set as a field on objects in the pipeline when they are created. You can only specify a single value for workerGroup. There are no wildcard values permitted in workerGroup; the string must be an exact, case-sensitive, match.
    */
  var workerGroup: js.UndefOr[String] = js.native
}

object ReportTaskRunnerHeartbeatInput {
  @scala.inline
  def apply(taskrunnerId: id): ReportTaskRunnerHeartbeatInput = {
    val __obj = js.Dynamic.literal(taskrunnerId = taskrunnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatInput]
  }
  @scala.inline
  implicit class ReportTaskRunnerHeartbeatInputOps[Self <: ReportTaskRunnerHeartbeatInput] (val x: Self) extends AnyVal {
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
    def setTaskrunnerId(value: id): Self = this.set("taskrunnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: id): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setWorkerGroup(value: String): Self = this.set("workerGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerGroup: Self = this.set("workerGroup", js.undefined)
  }
  
}

