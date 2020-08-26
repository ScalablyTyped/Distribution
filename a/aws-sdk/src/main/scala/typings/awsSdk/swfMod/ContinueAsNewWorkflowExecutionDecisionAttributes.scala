package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueAsNewWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    * If set, specifies the policy to use for the child workflow executions of the new execution if it is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This policy overrides the default child policy specified when registering the workflow type using RegisterWorkflowType. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
    */
  var childPolicy: js.UndefOr[ChildPolicy] = js.native
  /**
    * If set, specifies the total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified when registering the workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  An execution start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this field. If neither this field is set nor a default execution start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The input provided to the new workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The IAM role to attach to the new (continued) execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The list of tags to associate with the new workflow execution. A maximum of 5 tags can be specified. You can list workflow executions with a specific tag by calling ListOpenWorkflowExecutions or ListClosedWorkflowExecutions and specifying a TagFilter.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The task list to use for the decisions of the new (continued) workflow execution.
    */
  var taskList: js.UndefOr[TaskList] = js.native
  /**
    *  The task priority that, if set, specifies the priority for the decision tasks for this workflow execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * Specifies the maximum duration of decision tasks for the new workflow execution. This parameter overrides the defaultTaskStartToCloseTimout specified when registering the workflow type using RegisterWorkflowType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A task start-to-close timeout for the new workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The version of the workflow to start.
    */
  var workflowTypeVersion: js.UndefOr[Version] = js.native
}

object ContinueAsNewWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(): ContinueAsNewWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueAsNewWorkflowExecutionDecisionAttributes]
  }
  @scala.inline
  implicit class ContinueAsNewWorkflowExecutionDecisionAttributesOps[Self <: ContinueAsNewWorkflowExecutionDecisionAttributes] (val x: Self) extends AnyVal {
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
    def deleteChildPolicy: Self = this.set("childPolicy", js.undefined)
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
    def setTaskList(value: TaskList): Self = this.set("taskList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskList: Self = this.set("taskList", js.undefined)
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = this.set("taskPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskPriority: Self = this.set("taskPriority", js.undefined)
    @scala.inline
    def setTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("taskStartToCloseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStartToCloseTimeout: Self = this.set("taskStartToCloseTimeout", js.undefined)
    @scala.inline
    def setWorkflowTypeVersion(value: Version): Self = this.set("workflowTypeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowTypeVersion: Self = this.set("workflowTypeVersion", js.undefined)
  }
  
}

