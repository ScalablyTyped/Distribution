package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskObject extends js.Object {
  /**
    * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
    */
  var attemptId: js.UndefOr[id] = js.native
  /**
    * Connection information for the location where the task runner will publish the output of the task.
    */
  var objects: js.UndefOr[PipelineObjectMap] = js.native
  /**
    * The ID of the pipeline that provided the task.
    */
  var pipelineId: js.UndefOr[id] = js.native
  /**
    * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
    */
  var taskId: js.UndefOr[typings.awsSdk.datapipelineMod.taskId] = js.native
}

object TaskObject {
  @scala.inline
  def apply(): TaskObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskObject]
  }
  @scala.inline
  implicit class TaskObjectOps[Self <: TaskObject] (val x: Self) extends AnyVal {
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
    def setAttemptId(value: id): Self = this.set("attemptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptId: Self = this.set("attemptId", js.undefined)
    @scala.inline
    def setObjects(value: PipelineObjectMap): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineId: Self = this.set("pipelineId", js.undefined)
    @scala.inline
    def setTaskId(value: taskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
  
}

