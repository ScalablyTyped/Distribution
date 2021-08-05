package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecisionTask extends StObject {
  
  /**
    * A paginated list of history events of the workflow execution. The decider uses this during the processing of the decision task.
    */
  var events: HistoryEventList
  
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was processed by the decider. This can be used to determine the events in the history new since the last decision task received by the decider.
    */
  var previousStartedEventId: js.UndefOr[EventId] = js.undefined
  
  /**
    * The ID of the DecisionTaskStarted event recorded in the history.
    */
  var startedEventId: EventId
  
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken
  
  /**
    * The workflow execution for which this decision task was created.
    */
  var workflowExecution: WorkflowExecution
  
  /**
    * The type of the workflow execution for which this decision task was created.
    */
  var workflowType: WorkflowType
}
object DecisionTask {
  
  inline def apply(
    events: HistoryEventList,
    startedEventId: EventId,
    taskToken: TaskToken,
    workflowExecution: WorkflowExecution,
    workflowType: WorkflowType
  ): DecisionTask = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], taskToken = taskToken.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTask]
  }
  
  extension [Self <: DecisionTask](x: Self) {
    
    inline def setEvents(value: HistoryEventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: HistoryEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPreviousStartedEventId(value: EventId): Self = StObject.set(x, "previousStartedEventId", value.asInstanceOf[js.Any])
    
    inline def setPreviousStartedEventIdUndefined: Self = StObject.set(x, "previousStartedEventId", js.undefined)
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    inline def setTaskToken(value: TaskToken): Self = StObject.set(x, "taskToken", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
