package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecisionTaskScheduledEventAttributes extends StObject {
  
  /**
    * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this duration. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The name of the task list in which the decision task was scheduled.
    */
  var taskList: TaskList
  
  /**
    *  A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.undefined
}
object DecisionTaskScheduledEventAttributes {
  
  inline def apply(taskList: TaskList): DecisionTaskScheduledEventAttributes = {
    val __obj = js.Dynamic.literal(taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionTaskScheduledEventAttributes]
  }
  
  extension [Self <: DecisionTaskScheduledEventAttributes](x: Self) {
    
    inline def setStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "startToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setStartToCloseTimeoutUndefined: Self = StObject.set(x, "startToCloseTimeout", js.undefined)
    
    inline def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    inline def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    inline def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
  }
}
