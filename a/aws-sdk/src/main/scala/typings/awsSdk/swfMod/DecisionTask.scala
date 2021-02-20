package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecisionTask extends StObject {
  
  /**
    * A paginated list of history events of the workflow execution. The decider uses this during the processing of the decision task.
    */
  var events: HistoryEventList = js.native
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was processed by the decider. This can be used to determine the events in the history new since the last decision task received by the decider.
    */
  var previousStartedEventId: js.UndefOr[EventId] = js.native
  
  /**
    * The ID of the DecisionTaskStarted event recorded in the history.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken = js.native
  
  /**
    * The workflow execution for which this decision task was created.
    */
  var workflowExecution: WorkflowExecution = js.native
  
  /**
    * The type of the workflow execution for which this decision task was created.
    */
  var workflowType: WorkflowType = js.native
}
object DecisionTask {
  
  @scala.inline
  def apply(
    events: HistoryEventList,
    startedEventId: EventId,
    taskToken: TaskToken,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): DecisionTask = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], taskToken = taskToken.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTask]
  }
  
  @scala.inline
  implicit class DecisionTaskMutableBuilder[Self <: DecisionTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: HistoryEventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: HistoryEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPreviousStartedEventId(value: EventId): Self = StObject.set(x, "previousStartedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStartedEventIdUndefined: Self = StObject.set(x, "previousStartedEventId", js.undefined)
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskToken(value: TaskToken): Self = StObject.set(x, "taskToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
