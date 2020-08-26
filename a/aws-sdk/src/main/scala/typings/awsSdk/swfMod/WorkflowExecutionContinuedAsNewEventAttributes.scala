package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionContinuedAsNewEventAttributes extends js.Object {
  /**
    * The policy to use for the child workflow executions of the new execution if it is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the ContinueAsNewWorkflowExecution decision that started this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The total duration allowed for the new workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The input provided to the new workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The IAM role to attach to the new (continued) workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The runId of the new workflow execution.
    */
  var newExecutionRunId: WorkflowRunId = js.native
  /**
    * The list of tags associated with the new workflow execution.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The task list to use for the decisions of the new (continued) workflow execution.
    */
  var taskList: TaskList = js.native
  /**
    * The priority of the task to use for the decisions of the new (continued) workflow execution.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * The maximum duration of decision tasks for the new workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The workflow type of this execution.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowExecutionContinuedAsNewEventAttributes {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    decisionTaskCompletedEventId: EventId,
    newExecutionRunId: WorkflowRunId,
    taskList: TaskList,
    workflowType: WorkflowType
  ): WorkflowExecutionContinuedAsNewEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], newExecutionRunId = newExecutionRunId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
  }
  @scala.inline
  implicit class WorkflowExecutionContinuedAsNewEventAttributesOps[Self <: WorkflowExecutionContinuedAsNewEventAttributes] (val x: Self) extends AnyVal {
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
    def setDecisionTaskCompletedEventId(value: EventId): Self = this.set("decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewExecutionRunId(value: WorkflowRunId): Self = this.set("newExecutionRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
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

