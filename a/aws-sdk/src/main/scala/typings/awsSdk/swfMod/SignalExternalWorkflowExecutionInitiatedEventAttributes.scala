package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The input provided to the signal.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The runId of the external workflow execution to send the signal to.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The name of the signal.
    */
  var signalName: SignalName = js.native
  /**
    * The workflowId of the external workflow execution.
    */
  var workflowId: WorkflowId = js.native
}

object SignalExternalWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(
    decisionTaskCompletedEventId: EventId,
    signalName: SignalName,
    workflowId: WorkflowId,
    control: Data = null,
    input: Data = null,
    runId: WorkflowRunIdOptional = null
  ): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (runId != null) __obj.updateDynamic("runId")(runId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
  }
}

