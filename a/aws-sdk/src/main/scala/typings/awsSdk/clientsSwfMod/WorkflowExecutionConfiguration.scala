package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionConfiguration extends StObject {
  
  /**
    * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy
  
  /**
    * The total duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: DurationInSeconds
  
  /**
    * The IAM role attached to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.undefined
  
  /**
    * The task list used for the decision tasks generated for this workflow execution.
    */
  var taskList: TaskList
  
  /**
    * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  
  /**
    * The maximum duration allowed for decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: DurationInSeconds
}
object WorkflowExecutionConfiguration {
  
  inline def apply(
    childPolicy: ChildPolicy,
    executionStartToCloseTimeout: DurationInSeconds,
    taskList: TaskList,
    taskStartToCloseTimeout: DurationInSeconds
  ): WorkflowExecutionConfiguration = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], executionStartToCloseTimeout = executionStartToCloseTimeout.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], taskStartToCloseTimeout = taskStartToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowExecutionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setChildPolicy(value: ChildPolicy): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartToCloseTimeout(value: DurationInSeconds): Self = StObject.set(x, "executionStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    inline def setLambdaRole(value: Arn): Self = StObject.set(x, "lambdaRole", value.asInstanceOf[js.Any])
    
    inline def setLambdaRoleUndefined: Self = StObject.set(x, "lambdaRole", js.undefined)
    
    inline def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    inline def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    inline def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
    
    inline def setTaskStartToCloseTimeout(value: DurationInSeconds): Self = StObject.set(x, "taskStartToCloseTimeout", value.asInstanceOf[js.Any])
  }
}
