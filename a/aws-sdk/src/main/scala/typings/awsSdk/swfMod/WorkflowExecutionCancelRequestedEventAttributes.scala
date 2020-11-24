package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
  
  /**
    * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set to cancel child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.native
  
  /**
    * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.native
  
  /**
    * The external workflow execution for which the cancellation was requested.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.native
}
object WorkflowExecutionCancelRequestedEventAttributes {
  
  @scala.inline
  def apply(): WorkflowExecutionCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionCancelRequestedEventAttributesOps[Self <: WorkflowExecutionCancelRequestedEventAttributes] (val x: Self) extends AnyVal {
    
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
    def setCause(value: WorkflowExecutionCancelRequestedCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    
    @scala.inline
    def setExternalInitiatedEventId(value: EventId): Self = this.set("externalInitiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalInitiatedEventId: Self = this.set("externalInitiatedEventId", js.undefined)
    
    @scala.inline
    def setExternalWorkflowExecution(value: WorkflowExecution): Self = this.set("externalWorkflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalWorkflowExecution: Self = this.set("externalWorkflowExecution", js.undefined)
  }
}
