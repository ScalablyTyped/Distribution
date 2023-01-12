package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionTerminatedEventAttributes extends StObject {
  
  /**
    * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens if the parent workflow execution times out or is terminated and the child policy is set to terminate child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined
  
  /**
    * The policy used for the child workflow executions of this workflow execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy
  
  /**
    * The details provided for the termination.
    */
  var details: js.UndefOr[Data] = js.undefined
  
  /**
    * The reason provided for the termination.
    */
  var reason: js.UndefOr[TerminateReason] = js.undefined
}
object WorkflowExecutionTerminatedEventAttributes {
  
  inline def apply(childPolicy: ChildPolicy): WorkflowExecutionTerminatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowExecutionTerminatedEventAttributes] (val x: Self) extends AnyVal {
    
    inline def setCause(value: WorkflowExecutionTerminatedCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setChildPolicy(value: ChildPolicy): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Data): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReason(value: TerminateReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
