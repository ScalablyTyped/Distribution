package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityTask extends StObject {
  
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId
  
  /**
    * The type of this activity task.
    */
  var activityType: ActivityType
  
  /**
    * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be meaningful to the activity implementation.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the ActivityTaskStarted event recorded in the history.
    */
  var startedEventId: EventId
  
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken
  
  /**
    * The workflow execution that started this activity task.
    */
  var workflowExecution: WorkflowExecution
}
object ActivityTask {
  
  inline def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    startedEventId: EventId,
    taskToken: TaskToken,
    workflowExecution: WorkflowExecution
  ): ActivityTask = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], taskToken = taskToken.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTask]
  }
  
  extension [Self <: ActivityTask](x: Self) {
    
    inline def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    inline def setActivityType(value: ActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setStartedEventId(value: EventId): Self = StObject.set(x, "startedEventId", value.asInstanceOf[js.Any])
    
    inline def setTaskToken(value: TaskToken): Self = StObject.set(x, "taskToken", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "workflowExecution", value.asInstanceOf[js.Any])
  }
}
