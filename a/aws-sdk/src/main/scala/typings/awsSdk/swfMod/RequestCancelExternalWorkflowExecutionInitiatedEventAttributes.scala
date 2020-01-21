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
  def apply(
    decisionTaskCompletedEventId: EventId,
    workflowId: WorkflowId,
    control: Data = null,
    runId: WorkflowRunIdOptional = null
  ): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (runId != null) __obj.updateDynamic("runId")(runId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
  }
}

