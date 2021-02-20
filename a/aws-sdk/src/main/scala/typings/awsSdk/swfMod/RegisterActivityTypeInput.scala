package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterActivityTypeInput extends StObject {
  
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
  implicit class RegisterActivityTypeInputMutableBuilder[Self <: RegisterActivityTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTaskHeartbeatTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "defaultTaskHeartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTaskHeartbeatTimeoutUndefined: Self = StObject.set(x, "defaultTaskHeartbeatTimeout", js.undefined)
    
    @scala.inline
    def setDefaultTaskList(value: TaskList): Self = StObject.set(x, "defaultTaskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTaskListUndefined: Self = StObject.set(x, "defaultTaskList", js.undefined)
    
    @scala.inline
    def setDefaultTaskPriority(value: TaskPriority): Self = StObject.set(x, "defaultTaskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTaskPriorityUndefined: Self = StObject.set(x, "defaultTaskPriority", js.undefined)
    
    @scala.inline
    def setDefaultTaskScheduleToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "defaultTaskScheduleToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTaskScheduleToCloseTimeoutUndefined: Self = StObject.set(x, "defaultTaskScheduleToCloseTimeout", js.undefined)
    
    @scala.inline
    def setDefaultTaskScheduleToStartTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "defaultTaskScheduleToStartTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTaskScheduleToStartTimeoutUndefined: Self = StObject.set(x, "defaultTaskScheduleToStartTimeout", js.undefined)
    
    @scala.inline
    def setDefaultTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "defaultTaskStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTaskStartToCloseTimeoutUndefined: Self = StObject.set(x, "defaultTaskStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
