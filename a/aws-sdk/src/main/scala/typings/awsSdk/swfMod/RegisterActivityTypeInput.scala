package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterActivityTypeInput extends js.Object {
  /**
    * If set, specifies the default maximum time before which a worker processing a task of this type must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. If the activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an UnknownResource fault. In this case, Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * If set, specifies the default task list to use for scheduling tasks of this activity type. This default task list is used if a task list isn't provided when a task is scheduled through the ScheduleActivityTask Decision.
    */
  var defaultTaskList: js.UndefOr[TaskList] = js.native
  /**
    * The default task priority to assign to the activity type. If not assigned, then 0 is used. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the in the Amazon SWF Developer Guide..
    */
  var defaultTaskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * If set, specifies the default maximum duration for a task of this activity type. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * If set, specifies the default maximum duration that a task of this activity type can wait before being assigned to a worker. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * If set, specifies the default maximum duration that a worker can take to process tasks of this activity type. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * A textual description of the activity type.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The name of the domain in which this activity is to be registered.
    */
  var domain: DomainName = js.native
  /**
    * The name of the activity type within the domain. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var name: Name = js.native
  /**
    * The version of the activity type.  The activity type consists of the name and version, the combination of which must be unique within the domain.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var version: Version = js.native
}

object RegisterActivityTypeInput {
  @scala.inline
  def apply(domain: DomainName, name: Name, version: Version): RegisterActivityTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterActivityTypeInput]
  }
  @scala.inline
  implicit class RegisterActivityTypeInputOps[Self <: RegisterActivityTypeInput] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTaskHeartbeatTimeout(value: DurationInSecondsOptional): Self = this.set("defaultTaskHeartbeatTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTaskHeartbeatTimeout: Self = this.set("defaultTaskHeartbeatTimeout", js.undefined)
    @scala.inline
    def setDefaultTaskList(value: TaskList): Self = this.set("defaultTaskList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTaskList: Self = this.set("defaultTaskList", js.undefined)
    @scala.inline
    def setDefaultTaskPriority(value: TaskPriority): Self = this.set("defaultTaskPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTaskPriority: Self = this.set("defaultTaskPriority", js.undefined)
    @scala.inline
    def setDefaultTaskScheduleToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("defaultTaskScheduleToCloseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTaskScheduleToCloseTimeout: Self = this.set("defaultTaskScheduleToCloseTimeout", js.undefined)
    @scala.inline
    def setDefaultTaskScheduleToStartTimeout(value: DurationInSecondsOptional): Self = this.set("defaultTaskScheduleToStartTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTaskScheduleToStartTimeout: Self = this.set("defaultTaskScheduleToStartTimeout", js.undefined)
    @scala.inline
    def setDefaultTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("defaultTaskStartToCloseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTaskStartToCloseTimeout: Self = this.set("defaultTaskStartToCloseTimeout", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

