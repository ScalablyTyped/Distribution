package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMLTaskRunResponse extends js.Object {
  /**
    * The status for this run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object CancelMLTaskRunResponse {
  @scala.inline
  def apply(): CancelMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelMLTaskRunResponse]
  }
  @scala.inline
  implicit class CancelMLTaskRunResponseOps[Self <: CancelMLTaskRunResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: TaskStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTaskRunId(value: HashString): Self = this.set("TaskRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRunId: Self = this.set("TaskRunId", js.undefined)
    @scala.inline
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformId: Self = this.set("TransformId", js.undefined)
  }
  
}

