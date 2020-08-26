package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelExternalWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The runId of the external workflow execution to be canceled.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The workflowId of the external workflow execution to be canceled.
    */
  var workflowId: WorkflowId = js.native
}

object RequestCancelExternalWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, workflowId: WorkflowId): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
  }
  @scala.inline
  implicit class RequestCancelExternalWorkflowExecutionInitiatedEventAttributesOps[Self <: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] (val x: Self) extends AnyVal {
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
    def setDecisionTaskCompletedEventId(value: EventId): Self = this.set("decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setControl(value: Data): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setRunId(value: WorkflowRunIdOptional): Self = this.set("runId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunId: Self = this.set("runId", js.undefined)
  }
  
}

