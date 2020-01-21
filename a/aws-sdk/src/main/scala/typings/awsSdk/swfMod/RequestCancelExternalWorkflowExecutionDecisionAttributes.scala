package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The runId of the external workflow execution to cancel.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    *  The workflowId of the external workflow execution to cancel.
    */
  var workflowId: WorkflowId = js.native
}

object RequestCancelExternalWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(workflowId: WorkflowId, control: Data = null, runId: WorkflowRunIdOptional = null): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (runId != null) __obj.updateDynamic("runId")(runId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
  }
}

