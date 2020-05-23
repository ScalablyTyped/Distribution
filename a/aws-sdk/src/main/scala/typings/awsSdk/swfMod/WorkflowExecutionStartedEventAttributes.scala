package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    childPolicy: ChildPolicy,
    taskList: TaskList,
    workflowType: WorkflowType,
    continuedExecutionRunId: WorkflowRunIdOptional = null,
    executionStartToCloseTimeout: DurationInSecondsOptional = null,
    input: Data = null,
    lambdaRole: Arn = null,
    parentInitiatedEventId: js.UndefOr[EventId] = js.undefined,
    parentWorkflowExecution: WorkflowExecution = null,
    tagList: TagList = null,
    taskPriority: TaskPriority = null,
    taskStartToCloseTimeout: DurationInSecondsOptional = null
  ): WorkflowExecutionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    if (continuedExecutionRunId != null) __obj.updateDynamic("continuedExecutionRunId")(continuedExecutionRunId.asInstanceOf[js.Any])
    if (executionStartToCloseTimeout != null) __obj.updateDynamic("executionStartToCloseTimeout")(executionStartToCloseTimeout.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (lambdaRole != null) __obj.updateDynamic("lambdaRole")(lambdaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(parentInitiatedEventId)) __obj.updateDynamic("parentInitiatedEventId")(parentInitiatedEventId.get.asInstanceOf[js.Any])
    if (parentWorkflowExecution != null) __obj.updateDynamic("parentWorkflowExecution")(parentWorkflowExecution.asInstanceOf[js.Any])
    if (tagList != null) __obj.updateDynamic("tagList")(tagList.asInstanceOf[js.Any])
    if (taskPriority != null) __obj.updateDynamic("taskPriority")(taskPriority.asInstanceOf[js.Any])
    if (taskStartToCloseTimeout != null) __obj.updateDynamic("taskStartToCloseTimeout")(taskStartToCloseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionStartedEventAttributes]
  }
}

