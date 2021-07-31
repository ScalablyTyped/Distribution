package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTypeConfiguration extends StObject {
  
  /**
    *  The default maximum time, in seconds, before which a worker processing a task must report progress by calling RecordActivityTaskHeartbeat. You can specify this value only when registering an activity type. The registered default value can be overridden when you schedule a task through the ScheduleActivityTask Decision. If the activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an UnknownResource fault. In this case, Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    *  The default task list specified for this activity type at registration. This default is used if a task list isn't provided when a task is scheduled through the ScheduleActivityTask Decision. You can override the default registered task list when scheduling a task through the ScheduleActivityTask Decision.
    */
  var defaultTaskList: js.UndefOr[TaskList] = js.undefined
  
  /**
    *  The default task priority for tasks of this activity type, specified at registration. If not set, then 0 is used as the default priority. This default can be overridden when scheduling an activity task. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
  
  /**
    *  The default maximum duration, specified when registering the activity type, for tasks of this activity type. You can override this default when scheduling a task through the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    *  The default maximum duration, specified when registering the activity type, that a task of an activity type can wait before being assigned to a worker. You can override this default when scheduling a task through the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    *  The default maximum duration for tasks of an activity type specified when registering the activity type. You can override this default when scheduling a task through the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
}
object ActivityTypeConfiguration {
  
  @scala.inline
  def apply(): ActivityTypeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityTypeConfiguration]
  }
  
  @scala.inline
  implicit class ActivityTypeConfigurationMutableBuilder[Self <: ActivityTypeConfiguration] (val x: Self) extends AnyVal {
    
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
  }
}
