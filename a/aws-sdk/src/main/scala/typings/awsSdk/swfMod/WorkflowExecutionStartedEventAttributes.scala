package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionStartedEventAttributes extends js.Object {
  
  /**
    * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  
  /**
    * If this workflow execution was started due to a ContinueAsNewWorkflowExecution decision, then it contains the runId of the previous workflow execution that was closed and continued as this execution.
    */
  var continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional] = js.native
  
  /**
    * The maximum duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * The input provided to the workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The IAM role attached to the workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this workflow execution. The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var parentInitiatedEventId: js.UndefOr[EventId] = js.native
  
  /**
    * The source workflow execution that started this workflow execution. The member isn't set if the workflow execution was not started by a workflow.
    */
  var parentWorkflowExecution: js.UndefOr[WorkflowExecution] = js.native
  
  /**
    * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the task list for scheduling the decision tasks for this workflow execution.
    */
  var taskList: TaskList = js.native
  
  /**
    * The priority of the decision tasks in the workflow execution.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  
  /**
    * The maximum duration of decision tasks for this workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * The workflow type of this execution.
    */
  var workflowType: WorkflowType = js.native
}
object WorkflowExecutionStartedEventAttributes {
  
  @scala.inline
  def apply(childPolicy: ChildPolicy, taskList: TaskList, workflowType: WorkflowType): WorkflowExecutionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionStartedEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionStartedEventAttributesOps[Self <: WorkflowExecutionStartedEventAttributes] (val x: Self) extends AnyVal {
    
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
    def setChildPolicy(value: ChildPolicy): Self = this.set("childPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuedExecutionRunId(value: WorkflowRunIdOptional): Self = this.set("continuedExecutionRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuedExecutionRunId: Self = this.set("continuedExecutionRunId", js.undefined)
    
    @scala.inline
    def setExecutionStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("executionStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStartToCloseTimeout: Self = this.set("executionStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setInput(value: Data): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLambdaRole(value: Arn): Self = this.set("lambdaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaRole: Self = this.set("lambdaRole", js.undefined)
    
    @scala.inline
    def setParentInitiatedEventId(value: EventId): Self = this.set("parentInitiatedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentInitiatedEventId: Self = this.set("parentInitiatedEventId", js.undefined)
    
    @scala.inline
    def setParentWorkflowExecution(value: WorkflowExecution): Self = this.set("parentWorkflowExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentWorkflowExecution: Self = this.set("parentWorkflowExecution", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("tagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = this.set("tagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagList: Self = this.set("tagList", js.undefined)
    
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = this.set("taskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskPriority: Self = this.set("taskPriority", js.undefined)
    
    @scala.inline
    def setTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("taskStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskStartToCloseTimeout: Self = this.set("taskStartToCloseTimeout", js.undefined)
  }
}
