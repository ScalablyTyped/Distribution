package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTask extends js.Object {
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId = js.native
  /**
    * The type of this activity task.
    */
  var activityType: ActivityType = js.native
  /**
    * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be meaningful to the activity implementation.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The ID of the ActivityTaskStarted event recorded in the history.
    */
  var startedEventId: EventId = js.native
  /**
    * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
    */
  var taskToken: TaskToken = js.native
  /**
    * The workflow execution that started this activity task.
    */
  var workflowExecution: WorkflowExecution = js.native
}

object ActivityTask {
  @scala.inline
  def apply(
    activityId: ActivityId,
    activityType: ActivityType,
    startedEventId: EventId,
    taskToken: TaskToken,
    workflowExecution: WorkflowExecution
  ): ActivityTask = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], startedEventId = startedEventId.asInstanceOf[js.Any], taskToken = taskToken.asInstanceOf[js.Any], workflowExecution = workflowExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTask]
  }
  @scala.inline
  implicit class ActivityTaskOps[Self <: ActivityTask] (val x: Self) extends AnyVal {
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
    def setActivityId(value: ActivityId): Self = this.set("activityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivityType(value: ActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedEventId(value: EventId): Self = this.set("startedEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskToken(value: TaskToken): Self = this.set("taskToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowExecution(value: WorkflowExecution): Self = this.set("workflowExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Data): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
  }
  
}

