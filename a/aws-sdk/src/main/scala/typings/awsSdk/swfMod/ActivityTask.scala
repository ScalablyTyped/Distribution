package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTask extends StObject {
  
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId = js.native
  
  /**
    * The type of this activity task.
    */
  var activityType: ActivityType = js.native
  
  /**
    * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be meaningful to the activity implementation.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The ID of the ActivityTaskStarted event recorded in the history.
    */
  var startedEventId: EventId = js.native
  
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken = js.native
  
  /**
    * The workflow execution that started this activity task.
    */
  var workflowExecution: WorkflowExecution = js.native
}
object ActivityTask {
  
  @scala.inline
  def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    startedEventId: EventId,
    taskToken: TaskToken,
    workflowExecution: WorkflowExecution
  ): ActivityTask = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], taskToken = taskToken.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTask]
  }
  
  @scala.inline
  implicit class ActivityTaskMutableBuilder[Self <: ActivityTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskToken(value: TaskToken): Self = StObject.set(x, "taskToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
  }
}
