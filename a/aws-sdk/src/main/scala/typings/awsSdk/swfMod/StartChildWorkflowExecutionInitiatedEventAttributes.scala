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
    workflowType: WorkflowType,
    control: Data = null,
    executionStartToCloseTimeout: DurationInSecondsOptional = null,
    input: Data = null,
    lambdaRole: Arn = null,
    tagList: TagList = null,
    taskPriority: TaskPriority = null,
    taskStartToCloseTimeout: DurationInSecondsOptional = null
  ): StartChildWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (executionStartToCloseTimeout != null) __obj.updateDynamic("executionStartToCloseTimeout")(executionStartToCloseTimeout.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (lambdaRole != null) __obj.updateDynamic("lambdaRole")(lambdaRole.asInstanceOf[js.Any])
    if (tagList != null) __obj.updateDynamic("tagList")(tagList.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    if (taskStartToCloseTimeout != null) __obj.updateDynamic("taskStartToCloseTimeout")(taskStartToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
  }
}

