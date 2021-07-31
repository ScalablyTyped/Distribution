package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryEvent extends StObject {
  
  var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.undefined
  
  /**
    * Contains details about an activity schedule event that failed during an execution.
    */
  var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.undefined
  
  var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.undefined
  
  var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.undefined
  
  var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.undefined
  
  var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.undefined
  
  var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.undefined
  
  var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.undefined
  
  var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.undefined
  
  var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.undefined
  
  var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.undefined
  
  /**
    * The id of the event. Events are numbered sequentially, starting at one.
    */
  var id: EventId
  
  var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.undefined
  
  var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.undefined
  
  var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.undefined
  
  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a lambda function that terminated successfully during an execution.
    */
  var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.undefined
  
  var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that was aborted.
    */
  var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that failed.
    */
  var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that was started.
    */
  var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that succeeded.
    */
  var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about Map state that was started.
    */
  var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.undefined
  
  /**
    * The id of the previous event.
    */
  var previousEventId: js.UndefOr[EventId] = js.undefined
  
  var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.undefined
  
  var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.undefined
  
  /**
    * Contains details about the failure of a task.
    */
  var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that was scheduled.
    */
  var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.undefined
  
  /**
    * Contains details about a task that failed to start.
    */
  var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that was started.
    */
  var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that where the submit failed.
    */
  var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a submitted task.
    */
  var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that succeeded.
    */
  var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.undefined
  
  /**
    * Contains details about a task that timed out.
    */
  var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.undefined
  
  /**
    * The date and time the event occurred.
    */
  var timestamp: Timestamp
  
  /**
    * The type of the event.
    */
  var `type`: HistoryEventType
}
object HistoryEvent {
  
  @scala.inline
  def apply(id: EventId, timestamp: Timestamp, `type`: HistoryEventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  
  @scala.inline
  implicit class HistoryEventMutableBuilder[Self <: HistoryEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityFailedEventDetails(value: ActivityFailedEventDetails): Self = StObject.set(x, "activityFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityFailedEventDetailsUndefined: Self = StObject.set(x, "activityFailedEventDetails", js.undefined)
    
    @scala.inline
    def setActivityScheduleFailedEventDetails(value: ActivityScheduleFailedEventDetails): Self = StObject.set(x, "activityScheduleFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityScheduleFailedEventDetailsUndefined: Self = StObject.set(x, "activityScheduleFailedEventDetails", js.undefined)
    
    @scala.inline
    def setActivityScheduledEventDetails(value: ActivityScheduledEventDetails): Self = StObject.set(x, "activityScheduledEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityScheduledEventDetailsUndefined: Self = StObject.set(x, "activityScheduledEventDetails", js.undefined)
    
    @scala.inline
    def setActivityStartedEventDetails(value: ActivityStartedEventDetails): Self = StObject.set(x, "activityStartedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityStartedEventDetailsUndefined: Self = StObject.set(x, "activityStartedEventDetails", js.undefined)
    
    @scala.inline
    def setActivitySucceededEventDetails(value: ActivitySucceededEventDetails): Self = StObject.set(x, "activitySucceededEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitySucceededEventDetailsUndefined: Self = StObject.set(x, "activitySucceededEventDetails", js.undefined)
    
    @scala.inline
    def setActivityTimedOutEventDetails(value: ActivityTimedOutEventDetails): Self = StObject.set(x, "activityTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTimedOutEventDetailsUndefined: Self = StObject.set(x, "activityTimedOutEventDetails", js.undefined)
    
    @scala.inline
    def setExecutionAbortedEventDetails(value: ExecutionAbortedEventDetails): Self = StObject.set(x, "executionAbortedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionAbortedEventDetailsUndefined: Self = StObject.set(x, "executionAbortedEventDetails", js.undefined)
    
    @scala.inline
    def setExecutionFailedEventDetails(value: ExecutionFailedEventDetails): Self = StObject.set(x, "executionFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionFailedEventDetailsUndefined: Self = StObject.set(x, "executionFailedEventDetails", js.undefined)
    
    @scala.inline
    def setExecutionStartedEventDetails(value: ExecutionStartedEventDetails): Self = StObject.set(x, "executionStartedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartedEventDetailsUndefined: Self = StObject.set(x, "executionStartedEventDetails", js.undefined)
    
    @scala.inline
    def setExecutionSucceededEventDetails(value: ExecutionSucceededEventDetails): Self = StObject.set(x, "executionSucceededEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSucceededEventDetailsUndefined: Self = StObject.set(x, "executionSucceededEventDetails", js.undefined)
    
    @scala.inline
    def setExecutionTimedOutEventDetails(value: ExecutionTimedOutEventDetails): Self = StObject.set(x, "executionTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimedOutEventDetailsUndefined: Self = StObject.set(x, "executionTimedOutEventDetails", js.undefined)
    
    @scala.inline
    def setId(value: EventId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionFailedEventDetails(value: LambdaFunctionFailedEventDetails): Self = StObject.set(x, "lambdaFunctionFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionFailedEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionFailedEventDetails", js.undefined)
    
    @scala.inline
    def setLambdaFunctionScheduleFailedEventDetails(value: LambdaFunctionScheduleFailedEventDetails): Self = StObject.set(x, "lambdaFunctionScheduleFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionScheduleFailedEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionScheduleFailedEventDetails", js.undefined)
    
    @scala.inline
    def setLambdaFunctionScheduledEventDetails(value: LambdaFunctionScheduledEventDetails): Self = StObject.set(x, "lambdaFunctionScheduledEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionScheduledEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionScheduledEventDetails", js.undefined)
    
    @scala.inline
    def setLambdaFunctionStartFailedEventDetails(value: LambdaFunctionStartFailedEventDetails): Self = StObject.set(x, "lambdaFunctionStartFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionStartFailedEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionStartFailedEventDetails", js.undefined)
    
    @scala.inline
    def setLambdaFunctionSucceededEventDetails(value: LambdaFunctionSucceededEventDetails): Self = StObject.set(x, "lambdaFunctionSucceededEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionSucceededEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionSucceededEventDetails", js.undefined)
    
    @scala.inline
    def setLambdaFunctionTimedOutEventDetails(value: LambdaFunctionTimedOutEventDetails): Self = StObject.set(x, "lambdaFunctionTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionTimedOutEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionTimedOutEventDetails", js.undefined)
    
    @scala.inline
    def setMapIterationAbortedEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationAbortedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapIterationAbortedEventDetailsUndefined: Self = StObject.set(x, "mapIterationAbortedEventDetails", js.undefined)
    
    @scala.inline
    def setMapIterationFailedEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapIterationFailedEventDetailsUndefined: Self = StObject.set(x, "mapIterationFailedEventDetails", js.undefined)
    
    @scala.inline
    def setMapIterationStartedEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationStartedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapIterationStartedEventDetailsUndefined: Self = StObject.set(x, "mapIterationStartedEventDetails", js.undefined)
    
    @scala.inline
    def setMapIterationSucceededEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationSucceededEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapIterationSucceededEventDetailsUndefined: Self = StObject.set(x, "mapIterationSucceededEventDetails", js.undefined)
    
    @scala.inline
    def setMapStateStartedEventDetails(value: MapStateStartedEventDetails): Self = StObject.set(x, "mapStateStartedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapStateStartedEventDetailsUndefined: Self = StObject.set(x, "mapStateStartedEventDetails", js.undefined)
    
    @scala.inline
    def setPreviousEventId(value: EventId): Self = StObject.set(x, "previousEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousEventIdUndefined: Self = StObject.set(x, "previousEventId", js.undefined)
    
    @scala.inline
    def setStateEnteredEventDetails(value: StateEnteredEventDetails): Self = StObject.set(x, "stateEnteredEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateEnteredEventDetailsUndefined: Self = StObject.set(x, "stateEnteredEventDetails", js.undefined)
    
    @scala.inline
    def setStateExitedEventDetails(value: StateExitedEventDetails): Self = StObject.set(x, "stateExitedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateExitedEventDetailsUndefined: Self = StObject.set(x, "stateExitedEventDetails", js.undefined)
    
    @scala.inline
    def setTaskFailedEventDetails(value: TaskFailedEventDetails): Self = StObject.set(x, "taskFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskFailedEventDetailsUndefined: Self = StObject.set(x, "taskFailedEventDetails", js.undefined)
    
    @scala.inline
    def setTaskScheduledEventDetails(value: TaskScheduledEventDetails): Self = StObject.set(x, "taskScheduledEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskScheduledEventDetailsUndefined: Self = StObject.set(x, "taskScheduledEventDetails", js.undefined)
    
    @scala.inline
    def setTaskStartFailedEventDetails(value: TaskStartFailedEventDetails): Self = StObject.set(x, "taskStartFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartFailedEventDetailsUndefined: Self = StObject.set(x, "taskStartFailedEventDetails", js.undefined)
    
    @scala.inline
    def setTaskStartedEventDetails(value: TaskStartedEventDetails): Self = StObject.set(x, "taskStartedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartedEventDetailsUndefined: Self = StObject.set(x, "taskStartedEventDetails", js.undefined)
    
    @scala.inline
    def setTaskSubmitFailedEventDetails(value: TaskSubmitFailedEventDetails): Self = StObject.set(x, "taskSubmitFailedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSubmitFailedEventDetailsUndefined: Self = StObject.set(x, "taskSubmitFailedEventDetails", js.undefined)
    
    @scala.inline
    def setTaskSubmittedEventDetails(value: TaskSubmittedEventDetails): Self = StObject.set(x, "taskSubmittedEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSubmittedEventDetailsUndefined: Self = StObject.set(x, "taskSubmittedEventDetails", js.undefined)
    
    @scala.inline
    def setTaskSucceededEventDetails(value: TaskSucceededEventDetails): Self = StObject.set(x, "taskSucceededEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSucceededEventDetailsUndefined: Self = StObject.set(x, "taskSucceededEventDetails", js.undefined)
    
    @scala.inline
    def setTaskTimedOutEventDetails(value: TaskTimedOutEventDetails): Self = StObject.set(x, "taskTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTimedOutEventDetailsUndefined: Self = StObject.set(x, "taskTimedOutEventDetails", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HistoryEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
