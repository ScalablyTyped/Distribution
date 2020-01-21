package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChildWorkflowExecutionDecisionAttributes extends js.Object {
  /**
    *  If set, specifies the policy to use for the child workflow executions if the workflow execution being started is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This policy overrides the default child policy specified when registering the workflow type using RegisterWorkflowType. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
    */
  var childPolicy: js.UndefOr[ChildPolicy] = js.native
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the child workflow execution.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified when registering the workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  An execution start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default execution start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The input to be provided to the workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The IAM role attached to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can list workflow executions with a specific tag by calling ListOpenWorkflowExecutions or ListClosedWorkflowExecutions and specifying a TagFilter.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The name of the task list to be used for decision tasks of the child workflow execution.  A task list for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task list was specified at registration time then a fault is returned.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var taskList: js.UndefOr[TaskList] = js.native
  /**
    *  A task priority that, if set, specifies the priority for a decision task of this workflow execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the defaultTaskStartToCloseTimout specified when registering the workflow type using RegisterWorkflowType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was specified at registration time then a fault is returned. 
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    *  The workflowId of the workflow execution. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var workflowId: WorkflowId = js.native
  /**
    *  The type of the workflow execution to be started.
    */
  var workflowType: WorkflowType = js.native
}

object StartChildWorkflowExecutionDecisionAttributes {
  @scala.inline
  def apply(
    workflowId: WorkflowId,
    workflowType: WorkflowType,
    childPolicy: ChildPolicy = null,
    control: Data = null,
    executionStartToCloseTimeout: DurationInSecondsOptional = null,
    input: Data = null,
    lambdaRole: Arn = null,
    tagList: TagList = null,
    taskList: TaskList = null,
    taskPriority: TaskPriority = null,
    taskStartToCloseTimeout: DurationInSecondsOptional = null
  ): StartChildWorkflowExecutionDecisionAttributes = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    if (childPolicy != null) __obj.updateDynamic("childPolicy")(childPolicy.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (executionStartToCloseTimeout != null) __obj.updateDynamic("executionStartToCloseTimeout")(executionStartToCloseTimeout.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (lambdaRole != null) __obj.updateDynamic("lambdaRole")(lambdaRole.asInstanceOf[js.Any])
    if (tagList != null) __obj.updateDynamic("tagList")(tagList.asInstanceOf[js.Any])
    if (taskList != null) __obj.updateDynamic("taskList")(taskList.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    if (taskStartToCloseTimeout != null) __obj.updateDynamic("taskStartToCloseTimeout")(taskStartToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChildWorkflowExecutionDecisionAttributes]
  }
}

