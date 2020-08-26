package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryEvent extends js.Object {
  var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.native
  /**
    * Contains details about an activity schedule event that failed during an execution.
    */
  var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.native
  var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.native
  var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.native
  var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.native
  var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.native
  var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.native
  var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.native
  var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.native
  var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.native
  var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.native
  /**
    * The id of the event. Events are numbered sequentially, starting at one.
    */
  var id: EventId = js.native
  var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.native
  var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.native
  var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.native
  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.native
  /**
    * Contains details about a lambda function that terminated successfully during an execution.
    */
  var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.native
  var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that was aborted.
    */
  var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that failed.
    */
  var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that was started.
    */
  var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that succeeded.
    */
  var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about Map state that was started.
    */
  var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.native
  /**
    * The id of the previous event.
    */
  var previousEventId: js.UndefOr[EventId] = js.native
  var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.native
  var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.native
  /**
    * Contains details about the failure of a task.
    */
  var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.native
  /**
    * Contains details about a task that was scheduled.
    */
  var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.native
  /**
    * Contains details about a task that failed to start.
    */
  var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.native
  /**
    * Contains details about a task that was started.
    */
  var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.native
  /**
    * Contains details about a task that where the submit failed.
    */
  var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.native
  /**
    * Contains details about a submitted task.
    */
  var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.native
  /**
    * Contains details about a task that succeeded.
    */
  var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.native
  /**
    * Contains details about a task that timed out.
    */
  var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.native
  /**
    * The date and time the event occurred.
    */
  var timestamp: Timestamp = js.native
  /**
    * The type of the event.
    */
  var `type`: HistoryEventType = js.native
}

object HistoryEvent {
  @scala.inline
  def apply(id: EventId, timestamp: Timestamp, `type`: HistoryEventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  @scala.inline
  implicit class HistoryEventOps[Self <: HistoryEvent] (val x: Self) extends AnyVal {
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
    def setId(value: EventId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: HistoryEventType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivityFailedEventDetails(value: ActivityFailedEventDetails): Self = this.set("activityFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityFailedEventDetails: Self = this.set("activityFailedEventDetails", js.undefined)
    @scala.inline
    def setActivityScheduleFailedEventDetails(value: ActivityScheduleFailedEventDetails): Self = this.set("activityScheduleFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityScheduleFailedEventDetails: Self = this.set("activityScheduleFailedEventDetails", js.undefined)
    @scala.inline
    def setActivityScheduledEventDetails(value: ActivityScheduledEventDetails): Self = this.set("activityScheduledEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityScheduledEventDetails: Self = this.set("activityScheduledEventDetails", js.undefined)
    @scala.inline
    def setActivityStartedEventDetails(value: ActivityStartedEventDetails): Self = this.set("activityStartedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityStartedEventDetails: Self = this.set("activityStartedEventDetails", js.undefined)
    @scala.inline
    def setActivitySucceededEventDetails(value: ActivitySucceededEventDetails): Self = this.set("activitySucceededEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivitySucceededEventDetails: Self = this.set("activitySucceededEventDetails", js.undefined)
    @scala.inline
    def setActivityTimedOutEventDetails(value: ActivityTimedOutEventDetails): Self = this.set("activityTimedOutEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityTimedOutEventDetails: Self = this.set("activityTimedOutEventDetails", js.undefined)
    @scala.inline
    def setExecutionAbortedEventDetails(value: ExecutionAbortedEventDetails): Self = this.set("executionAbortedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionAbortedEventDetails: Self = this.set("executionAbortedEventDetails", js.undefined)
    @scala.inline
    def setExecutionFailedEventDetails(value: ExecutionFailedEventDetails): Self = this.set("executionFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionFailedEventDetails: Self = this.set("executionFailedEventDetails", js.undefined)
    @scala.inline
    def setExecutionStartedEventDetails(value: ExecutionStartedEventDetails): Self = this.set("executionStartedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStartedEventDetails: Self = this.set("executionStartedEventDetails", js.undefined)
    @scala.inline
    def setExecutionSucceededEventDetails(value: ExecutionSucceededEventDetails): Self = this.set("executionSucceededEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionSucceededEventDetails: Self = this.set("executionSucceededEventDetails", js.undefined)
    @scala.inline
    def setExecutionTimedOutEventDetails(value: ExecutionTimedOutEventDetails): Self = this.set("executionTimedOutEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionTimedOutEventDetails: Self = this.set("executionTimedOutEventDetails", js.undefined)
    @scala.inline
    def setLambdaFunctionFailedEventDetails(value: LambdaFunctionFailedEventDetails): Self = this.set("lambdaFunctionFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionFailedEventDetails: Self = this.set("lambdaFunctionFailedEventDetails", js.undefined)
    @scala.inline
    def setLambdaFunctionScheduleFailedEventDetails(value: LambdaFunctionScheduleFailedEventDetails): Self = this.set("lambdaFunctionScheduleFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionScheduleFailedEventDetails: Self = this.set("lambdaFunctionScheduleFailedEventDetails", js.undefined)
    @scala.inline
    def setLambdaFunctionScheduledEventDetails(value: LambdaFunctionScheduledEventDetails): Self = this.set("lambdaFunctionScheduledEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionScheduledEventDetails: Self = this.set("lambdaFunctionScheduledEventDetails", js.undefined)
    @scala.inline
    def setLambdaFunctionStartFailedEventDetails(value: LambdaFunctionStartFailedEventDetails): Self = this.set("lambdaFunctionStartFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionStartFailedEventDetails: Self = this.set("lambdaFunctionStartFailedEventDetails", js.undefined)
    @scala.inline
    def setLambdaFunctionSucceededEventDetails(value: LambdaFunctionSucceededEventDetails): Self = this.set("lambdaFunctionSucceededEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionSucceededEventDetails: Self = this.set("lambdaFunctionSucceededEventDetails", js.undefined)
    @scala.inline
    def setLambdaFunctionTimedOutEventDetails(value: LambdaFunctionTimedOutEventDetails): Self = this.set("lambdaFunctionTimedOutEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionTimedOutEventDetails: Self = this.set("lambdaFunctionTimedOutEventDetails", js.undefined)
    @scala.inline
    def setMapIterationAbortedEventDetails(value: MapIterationEventDetails): Self = this.set("mapIterationAbortedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapIterationAbortedEventDetails: Self = this.set("mapIterationAbortedEventDetails", js.undefined)
    @scala.inline
    def setMapIterationFailedEventDetails(value: MapIterationEventDetails): Self = this.set("mapIterationFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapIterationFailedEventDetails: Self = this.set("mapIterationFailedEventDetails", js.undefined)
    @scala.inline
    def setMapIterationStartedEventDetails(value: MapIterationEventDetails): Self = this.set("mapIterationStartedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapIterationStartedEventDetails: Self = this.set("mapIterationStartedEventDetails", js.undefined)
    @scala.inline
    def setMapIterationSucceededEventDetails(value: MapIterationEventDetails): Self = this.set("mapIterationSucceededEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapIterationSucceededEventDetails: Self = this.set("mapIterationSucceededEventDetails", js.undefined)
    @scala.inline
    def setMapStateStartedEventDetails(value: MapStateStartedEventDetails): Self = this.set("mapStateStartedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapStateStartedEventDetails: Self = this.set("mapStateStartedEventDetails", js.undefined)
    @scala.inline
    def setPreviousEventId(value: EventId): Self = this.set("previousEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousEventId: Self = this.set("previousEventId", js.undefined)
    @scala.inline
    def setStateEnteredEventDetails(value: StateEnteredEventDetails): Self = this.set("stateEnteredEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateEnteredEventDetails: Self = this.set("stateEnteredEventDetails", js.undefined)
    @scala.inline
    def setStateExitedEventDetails(value: StateExitedEventDetails): Self = this.set("stateExitedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateExitedEventDetails: Self = this.set("stateExitedEventDetails", js.undefined)
    @scala.inline
    def setTaskFailedEventDetails(value: TaskFailedEventDetails): Self = this.set("taskFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskFailedEventDetails: Self = this.set("taskFailedEventDetails", js.undefined)
    @scala.inline
    def setTaskScheduledEventDetails(value: TaskScheduledEventDetails): Self = this.set("taskScheduledEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskScheduledEventDetails: Self = this.set("taskScheduledEventDetails", js.undefined)
    @scala.inline
    def setTaskStartFailedEventDetails(value: TaskStartFailedEventDetails): Self = this.set("taskStartFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStartFailedEventDetails: Self = this.set("taskStartFailedEventDetails", js.undefined)
    @scala.inline
    def setTaskStartedEventDetails(value: TaskStartedEventDetails): Self = this.set("taskStartedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStartedEventDetails: Self = this.set("taskStartedEventDetails", js.undefined)
    @scala.inline
    def setTaskSubmitFailedEventDetails(value: TaskSubmitFailedEventDetails): Self = this.set("taskSubmitFailedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskSubmitFailedEventDetails: Self = this.set("taskSubmitFailedEventDetails", js.undefined)
    @scala.inline
    def setTaskSubmittedEventDetails(value: TaskSubmittedEventDetails): Self = this.set("taskSubmittedEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskSubmittedEventDetails: Self = this.set("taskSubmittedEventDetails", js.undefined)
    @scala.inline
    def setTaskSucceededEventDetails(value: TaskSucceededEventDetails): Self = this.set("taskSucceededEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskSucceededEventDetails: Self = this.set("taskSucceededEventDetails", js.undefined)
    @scala.inline
    def setTaskTimedOutEventDetails(value: TaskTimedOutEventDetails): Self = this.set("taskTimedOutEventDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskTimedOutEventDetails: Self = this.set("taskTimedOutEventDetails", js.undefined)
  }
  
}

