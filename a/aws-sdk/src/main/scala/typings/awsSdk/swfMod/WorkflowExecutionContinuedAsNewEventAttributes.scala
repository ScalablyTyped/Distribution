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
    workflowType: WorkflowType,
    executionStartToCloseTimeout: DurationInSecondsOptional = null,
    input: Data = null,
    lambdaRole: Arn = null,
    tagList: TagList = null,
    taskPriority: TaskPriority = null,
    taskStartToCloseTimeout: DurationInSecondsOptional = null
  ): WorkflowExecutionContinuedAsNewEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], newExecutionRunId = newExecutionRunId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    if (executionStartToCloseTimeout != null) __obj.updateDynamic("executionStartToCloseTimeout")(executionStartToCloseTimeout.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (lambdaRole != null) __obj.updateDynamic("lambdaRole")(lambdaRole.asInstanceOf[js.Any])
    if (tagList != null) __obj.updateDynamic("tagList")(tagList.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    if (taskStartToCloseTimeout != null) __obj.updateDynamic("taskStartToCloseTimeout")(taskStartToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
  }
}

