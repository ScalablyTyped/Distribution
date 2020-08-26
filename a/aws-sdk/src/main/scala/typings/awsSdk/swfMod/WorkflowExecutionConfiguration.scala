package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionConfiguration extends js.Object {
  /**
    * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * The total duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: DurationInSeconds = js.native
  /**
    * The IAM role attached to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The task list used for the decision tasks generated for this workflow execution.
    */
  var taskList: TaskList = js.native
  /**
    * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * The maximum duration allowed for decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: DurationInSeconds = js.native
}

object WorkflowExecutionConfiguration {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    executionStartToCloseTimeout: DurationInSeconds,
    taskList: TaskList,
    taskStartToCloseTimeout: DurationInSeconds
  ): WorkflowExecutionConfiguration = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], executionStartToCloseTimeout = executionStartToCloseTimeout.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], taskStartToCloseTimeout = taskStartToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionConfiguration]
  }
  @scala.inline
  implicit class WorkflowExecutionConfigurationOps[Self <: WorkflowExecutionConfiguration] (val x: Self) extends AnyVal {
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
    def setExecutionStartToCloseTimeout(value: DurationInSeconds): Self = this.set("executionStartToCloseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskStartToCloseTimeout(value: DurationInSeconds): Self = this.set("taskStartToCloseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLambdaRole(value: Arn): Self = this.set("lambdaRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaRole: Self = this.set("lambdaRole", js.undefined)
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = this.set("taskPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskPriority: Self = this.set("taskPriority", js.undefined)
  }
  
}

