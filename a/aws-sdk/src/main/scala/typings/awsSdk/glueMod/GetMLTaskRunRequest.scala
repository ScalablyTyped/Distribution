package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTaskRunRequest extends js.Object {
  /**
    * The unique identifier of the task run.
    */
  var TaskRunId: HashString = js.native
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object GetMLTaskRunRequest {
  @scala.inline
  def apply(TaskRunId: HashString, TransformId: HashString): GetMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunRequest]
  }
  @scala.inline
  implicit class GetMLTaskRunRequestOps[Self <: GetMLTaskRunRequest] (val x: Self) extends AnyVal {
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
    def setTaskRunId(value: HashString): Self = this.set("TaskRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
  }
  
}

