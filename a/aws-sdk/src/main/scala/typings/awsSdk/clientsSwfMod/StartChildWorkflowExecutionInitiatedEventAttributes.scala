package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChildWorkflowExecutionInitiatedEventAttributes extends StObject {
  
  /**
    * The policy to use for the child workflow executions if this execution gets terminated by explicitly calling the TerminateWorkflowExecution action or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy
  
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.undefined
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartChildWorkflowExecution Decision to request this child workflow execution. This information can be useful for diagnosing problems by tracing back the cause of events.
    */
  var decisionTaskCompletedEventId: EventId
  
  /**
    * The maximum duration for the child workflow execution. If the workflow execution isn't closed within this duration, it is timed out and force-terminated. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The inputs provided to the child workflow execution.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The IAM role to attach to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.undefined
  
  /**
    * The list of tags to associated with the child workflow execution.
    */
  var tagList: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the task list used for the decision tasks of the child workflow execution.
    */
  var taskList: TaskList
  
  /**
    *  The priority assigned for the decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  
  /**
    * The maximum duration allowed for the decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The workflowId of the child workflow execution.
    */
  var workflowId: WorkflowId
  
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType
}
object StartChildWorkflowExecutionInitiatedEventAttributes {
  
  inline def apply(
    childPolicy: ChildPolicy,
    decisionTaskCompletedEventId: EventId,
    taskList: TaskList,
    workflowId: WorkflowId,
    workflowType: WorkflowType
  ): StartChildWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
  }
  
  extension [Self <: StartChildWorkflowExecutionInitiatedEventAttributes](x: Self) {
    
    inline def setChildPolicy(value: ChildPolicy): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    inline def setControl(value: Data): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "executionStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartToCloseTimeoutUndefined: Self = StObject.set(x, "executionStartToCloseTimeout", js.undefined)
    
    inline def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLambdaRole(value: Arn): Self = StObject.set(x, "lambdaRole", value.asInstanceOf[js.Any])
    
    inline def setLambdaRoleUndefined: Self = StObject.set(x, "lambdaRole", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "tagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "tagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "tagList", js.Array(value*))
    
    inline def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    inline def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    inline def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
    
    inline def setTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "taskStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setTaskStartToCloseTimeoutUndefined: Self = StObject.set(x, "taskStartToCloseTimeout", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
