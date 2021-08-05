package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTaskScheduledEventAttributes extends StObject {
  
  /**
    * The unique ID of the activity task.
    */
  var activityId: ActivityId
  
  /**
    * The type of the activity task.
    */
  var activityType: ActivityType
  
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision that resulted in the scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  
  /**
    * The maximum time before which the worker processing this task must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. If the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
    */
  var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The input provided to the activity task.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The maximum amount of time for this activity task.
    */
  var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The maximum amount of time the activity task can wait to be assigned to a worker.
    */
  var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The maximum amount of time a worker may take to process the activity task.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The task list in which the activity task has been scheduled.
    */
  var taskList: TaskList
  
  /**
    *  The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was assigned when the activity type was registered. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.undefined
}
object ActivityTaskScheduledEventAttributes {
  
  inline def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    decisionTaskCompletedEventId: EventId,
    taskList: TaskList
  ): ActivityTaskScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskScheduledEventAttributes]
  }
  
  extension [Self <: ActivityTaskScheduledEventAttributes](x: Self) {
    
    inline def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    inline def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
    
    inline def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setScheduleToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "scheduleToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setScheduleToCloseTimeoutUndefined: Self = StObject.set(x, "scheduleToCloseTimeout", js.undefined)
    
    inline def setScheduleToStartTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "scheduleToStartTimeout", value.asInstanceOf[js.Any])
    
    inline def setScheduleToStartTimeoutUndefined: Self = StObject.set(x, "scheduleToStartTimeout", js.undefined)
    
    inline def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "startToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setStartToCloseTimeoutUndefined: Self = StObject.set(x, "startToCloseTimeout", js.undefined)
    
    inline def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    inline def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    inline def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
  }
}
