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
  def apply(): ActionExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecution]
  }
  @scala.inline
  implicit class ActionExecutionOps[Self <: ActionExecution] (val x: Self) extends AnyVal {
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
    def setErrorDetails(value: ErrorDetails): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    @scala.inline
    def setExternalExecutionId(value: ExecutionId): Self = this.set("externalExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalExecutionId: Self = this.set("externalExecutionId", js.undefined)
    @scala.inline
    def setExternalExecutionUrl(value: Url): Self = this.set("externalExecutionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalExecutionUrl: Self = this.set("externalExecutionUrl", js.undefined)
    @scala.inline
    def setLastStatusChange(value: Timestamp): Self = this.set("lastStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStatusChange: Self = this.set("lastStatusChange", js.undefined)
    @scala.inline
    def setLastUpdatedBy(value: LastUpdatedBy): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedBy: Self = this.set("lastUpdatedBy", js.undefined)
    @scala.inline
    def setPercentComplete(value: Percentage): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    @scala.inline
    def setStatus(value: ActionExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSummary(value: ExecutionSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setToken(value: ActionExecutionToken): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

