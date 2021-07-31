package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionStartedEventAttributes extends StObject {
  
  /**
    * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy
  
  /**
    * If this workflow execution was started due to a ContinueAsNewWorkflowExecution decision, then it contains the runId of the previous workflow execution that was closed and continued as this execution.
    */
  var continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
  
  /**
    * The maximum duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The input provided to the workflow execution.
    */
  var input: js.UndefOr[Data] = js.undefined
  
  /**
    * The IAM role attached to the workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this workflow execution. The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var parentInitiatedEventId: js.UndefOr[EventId] = js.undefined
  
  /**
    * The source workflow execution that started this workflow execution. The member isn't set if the workflow execution was not started by a workflow.
    */
  var parentWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
  
  /**
    * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the task list for scheduling the decision tasks for this workflow execution.
    */
  var taskList: TaskList
  
  /**
    * The priority of the decision tasks in the workflow execution.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  
  /**
    * The maximum duration of decision tasks for this workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  
  /**
    * The workflow type of this execution.
    */
  var workflowType: WorkflowType
}
object WorkflowExecutionStartedEventAttributes {
  
  @scala.inline
  def apply(childPolicy: ChildPolicy, taskList: TaskList, workflowType: WorkflowType): WorkflowExecutionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionStartedEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionStartedEventAttributesMutableBuilder[Self <: WorkflowExecutionStartedEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildPolicy(value: ChildPolicy): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuedExecutionRunId(value: WorkflowRunIdOptional): Self = StObject.set(x, "continuedExecutionRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuedExecutionRunIdUndefined: Self = StObject.set(x, "continuedExecutionRunId", js.undefined)
    
    @scala.inline
    def setExecutionStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "executionStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartToCloseTimeoutUndefined: Self = StObject.set(x, "executionStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLambdaRole(value: Arn): Self = StObject.set(x, "lambdaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaRoleUndefined: Self = StObject.set(x, "lambdaRole", js.undefined)
    
    @scala.inline
    def setParentInitiatedEventId(value: EventId): Self = StObject.set(x, "parentInitiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentInitiatedEventIdUndefined: Self = StObject.set(x, "parentInitiatedEventId", js.undefined)
    
    @scala.inline
    def setParentWorkflowExecution(value: WorkflowExecution): Self = StObject.set(x, "parentWorkflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentWorkflowExecutionUndefined: Self = StObject.set(x, "parentWorkflowExecution", js.undefined)
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "tagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "tagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "tagList", js.Array(value :_*))
    
    @scala.inline
    def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
    
    @scala.inline
    def setTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "taskStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartToCloseTimeoutUndefined: Self = StObject.set(x, "taskStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
