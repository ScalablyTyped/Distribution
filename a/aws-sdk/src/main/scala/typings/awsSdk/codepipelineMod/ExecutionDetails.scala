package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionDetails extends js.Object {
  /**
    * The system-generated unique ID of this action used to identify this job worker in any external systems, such as AWS CodeDeploy.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  /**
    * The percentage of work completed on the action, represented on a scale of 0 to 100 percent.
    */
  var percentComplete: js.UndefOr[Percentage] = js.native
  /**
    * The summary of the current status of the actions.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.native
}

object ExecutionDetails {
  @scala.inline
  def apply(
    externalExecutionId: ExecutionId = null,
    percentComplete: js.UndefOr[Percentage] = js.undefined,
    summary: ExecutionSummary = null
  ): ExecutionDetails = {
    val __obj = js.Dynamic.literal()
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId.asInstanceOf[js.Any])
    if (!js.isUndefined(percentComplete)) __obj.updateDynamic("percentComplete")(percentComplete.get.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionDetails]
  }
}

