package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionCompletedEventAttributes extends StObject {
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CompleteWorkflowExecution decision to complete this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The result produced by the workflow execution upon successful completion.
    */
  var result: js.UndefOr[Data] = js.native
}
object WorkflowExecutionCompletedEventAttributes {
  
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId): WorkflowExecutionCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionCompletedEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionCompletedEventAttributesMutableBuilder[Self <: WorkflowExecutionCompletedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Data): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
