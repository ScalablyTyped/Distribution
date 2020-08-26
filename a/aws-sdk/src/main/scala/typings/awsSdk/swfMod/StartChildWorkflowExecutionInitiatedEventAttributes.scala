package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * The policy to use for the child workflow executions if this execution gets terminated by explicitly calling the TerminateWorkflowExecution action or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartChildWorkflowExecution Decision to request this child workflow execution. This information can be useful for diagnosing problems by tracing back the cause of events.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The maximum duration for the child workflow execution. If the workflow execution isn't closed within this duration, it is timed out and force-terminated. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The inputs provided to the child workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The IAM role to attach to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The list of tags to associated with the child workflow execution.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The name of the task list used for the decision tasks of the child workflow execution.
    */
  var taskList: TaskList = js.native
  /**
    *  The priority assigned for the decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * The maximum duration allowed for the decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The workflowId of the child workflow execution.
    */
  var workflowId: WorkflowId = js.native
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType = js.native
}

object StartChildWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    decisionTaskCompletedEventId: EventId,
    taskList: TaskList,
    workflowId: WorkflowId,
    workflowType: WorkflowType
  ): StartChildWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
  }
  @scala.inline
  implicit class StartChildWorkflowExecutionInitiatedEventAttributesOps[Self <: StartChildWorkflowExecutionInitiatedEventAttributes] (val x: Self) extends AnyVal {
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
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowId(value: WorkflowId): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = this.set("workflowType", value.asInstanceOf[js.Any])
    @scala.inline
    def setControl(value: Data): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
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

