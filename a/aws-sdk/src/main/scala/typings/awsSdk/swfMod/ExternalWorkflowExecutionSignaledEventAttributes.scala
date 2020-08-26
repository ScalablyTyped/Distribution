package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalWorkflowExecutionSignaledEventAttributes extends js.Object {
  /**
    * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflowExecution decision to request this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var initiatedEventId: EventId = js.native
  /**
    * The external workflow execution that the signal was delivered to.
    */
  var workflowExecution: WorkflowExecution = js.native
}

object ExternalWorkflowExecutionSignaledEventAttributes {
  @scala.inline
  def apply(initiatedEventId: EventId, workflowExecution: WorkflowExecution): ExternalWorkflowExecutionSignaledEventAttributes = {
    val __obj = js.Dynamic.literal(initiatedEventId = initiatedEventId.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWorkflowExecutionSignaledEventAttributes]
  }
  @scala.inline
  implicit class ExternalWorkflowExecutionSignaledEventAttributesOps[Self <: ExternalWorkflowExecutionSignaledEventAttributes] (val x: Self) extends AnyVal {
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
    def setInitiatedEventId(value: EventId): Self = this.set("initiatedEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = this.set("workflowExecution", value.asInstanceOf[js.Any])
  }
  
}

