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
  def apply(taskrunnerId: id, hostname: id = null, workerGroup: String = null): ReportTaskRunnerHeartbeatInput = {
    val __obj = js.Dynamic.literal(taskrunnerId = taskrunnerId.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (workerGroup != null) __obj.updateDynamic("workerGroup")(workerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatInput]
  }
}

