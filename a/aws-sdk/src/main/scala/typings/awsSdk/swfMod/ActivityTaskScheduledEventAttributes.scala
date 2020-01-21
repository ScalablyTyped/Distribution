package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskScheduledEventAttributes extends js.Object {
  /**
    * The unique ID of the activity task.
    */
  var activityId: ActivityId = js.native
  /**
    * The type of the activity task.
    */
  var activityType: ActivityType = js.native
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision that resulted in the scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The maximum time before which the worker processing this task must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. If the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
    */
  var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The input provided to the activity task.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The maximum amount of time for this activity task.
    */
  var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The maximum amount of time the activity task can wait to be assigned to a worker.
    */
  var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The maximum amount of time a worker may take to process the activity task.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The task list in which the activity task has been scheduled.
    */
  var taskList: TaskList = js.native
  /**
    *  The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was assigned when the activity type was registered. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
}

object ActivityTaskScheduledEventAttributes {
  @scala.inline
  def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    decisionTaskCompletedEventId: EventId,
    taskList: TaskList,
    control: Data = null,
    heartbeatTimeout: DurationInSecondsOptional = null,
    input: Data = null,
    scheduleToCloseTimeout: DurationInSecondsOptional = null,
    scheduleToStartTimeout: DurationInSecondsOptional = null,
    startToCloseTimeout: DurationInSecondsOptional = null,
    taskPriority: TaskPriority = null
  ): ActivityTaskScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (scheduleToCloseTimeout != null) __obj.updateDynamic("scheduleToCloseTimeout")(scheduleToCloseTimeout.asInstanceOf[js.Any])
    if (scheduleToStartTimeout != null) __obj.updateDynamic("scheduleToStartTimeout")(scheduleToStartTimeout.asInstanceOf[js.Any])
    if (startToCloseTimeout != null) __obj.updateDynamic("startToCloseTimeout")(startToCloseTimeout.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskScheduledEventAttributes]
  }
}

