package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleActivityTaskDecisionAttributes extends js.Object {
  
  /**
    *  The activityId of the activity task. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var activityId: ActivityId = js.native
  
  /**
    *  The type of the activity task to schedule.
    */
  var activityType: ActivityType = js.native
  
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.native
  
  /**
    * If set, specifies the maximum time before which a worker processing a task of this type must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides the default heartbeat timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * The input provided to the activity task.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The maximum duration for this activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default schedule-to-close timeout was specified at registration time then a fault is returned. 
    */
  var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    *  If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the default schedule-to-start timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default schedule-to-start timeout was specified at registration time then a fault is returned. 
    */
  var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the default start-to-close timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A start-to-close timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the defaultTaskList registered with the activity type is used.  A task list for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default task list was specified at registration time then a fault is returned.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var taskList: js.UndefOr[TaskList] = js.native
  
  /**
    *  If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the defaultTaskPriority specified when registering the activity type using RegisterActivityType. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
}
object ScheduleActivityTaskDecisionAttributes {
  
  @scala.inline
  def apply(activityId: ActivityId, activityType: ActivityType): ScheduleActivityTaskDecisionAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleActivityTaskDecisionAttributes]
  }
  
  @scala.inline
  implicit class ScheduleActivityTaskDecisionAttributesOps[Self <: ScheduleActivityTaskDecisionAttributes] (val x: Self) extends AnyVal {
    
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
    def setActivityId(value: ActivityId): Self = this.set("activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: Data): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setHeartbeatTimeout(value: DurationInSecondsOptional): Self = this.set("heartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatTimeout: Self = this.set("heartbeatTimeout", js.undefined)
    
    @scala.inline
    def setInput(value: Data): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setScheduleToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("scheduleToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleToCloseTimeout: Self = this.set("scheduleToCloseTimeout", js.undefined)
    
    @scala.inline
    def setScheduleToStartTimeout(value: DurationInSecondsOptional): Self = this.set("scheduleToStartTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleToStartTimeout: Self = this.set("scheduleToStartTimeout", js.undefined)
    
    @scala.inline
    def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("startToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartToCloseTimeout: Self = this.set("startToCloseTimeout", js.undefined)
    
    @scala.inline
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskList: Self = this.set("taskList", js.undefined)
    
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = this.set("taskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskPriority: Self = this.set("taskPriority", js.undefined)
  }
}
