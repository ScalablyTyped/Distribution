package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecution extends js.Object {
  /**
    * The details of an error returned by a URL external to AWS.
    */
  var errorDetails: js.UndefOr[ErrorDetails] = js.native
  /**
    * The external ID of the run of the action.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  /**
    * The URL of a resource external to AWS that is used when running the action (for example, an external repository URL).
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.native
  /**
    * The last status change of the action.
    */
  var lastStatusChange: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the user who last changed the pipeline.
    */
  var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.native
  /**
    * A percentage of completeness of the action as it runs.
    */
  var percentComplete: js.UndefOr[Percentage] = js.native
  /**
    * The status of the action, or for a completed action, the last status of the action.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.native
  /**
    * A summary of the run of the action.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.native
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState command. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: js.UndefOr[ActionExecutionToken] = js.native
}

object ActionExecution {
  @scala.inline
  def apply(
    errorDetails: ErrorDetails = null,
    externalExecutionId: ExecutionId = null,
    externalExecutionUrl: Url = null,
    lastStatusChange: Timestamp = null,
    lastUpdatedBy: LastUpdatedBy = null,
    percentComplete: Int | Double = null,
    status: ActionExecutionStatus = null,
    summary: ExecutionSummary = null,
    token: ActionExecutionToken = null
  ): ActionExecution = {
    val __obj = js.Dynamic.literal()
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId.asInstanceOf[js.Any])
    if (externalExecutionUrl != null) __obj.updateDynamic("externalExecutionUrl")(externalExecutionUrl.asInstanceOf[js.Any])
    if (lastStatusChange != null) __obj.updateDynamic("lastStatusChange")(lastStatusChange.asInstanceOf[js.Any])
    if (lastUpdatedBy != null) __obj.updateDynamic("lastUpdatedBy")(lastUpdatedBy.asInstanceOf[js.Any])
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecution]
  }
}

