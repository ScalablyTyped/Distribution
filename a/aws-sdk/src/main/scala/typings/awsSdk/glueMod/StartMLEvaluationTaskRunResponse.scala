package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMLEvaluationTaskRunResponse extends js.Object {
  /**
    * The unique identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}

object StartMLEvaluationTaskRunResponse {
  @scala.inline
  def apply(): StartMLEvaluationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMLEvaluationTaskRunResponse]
  }
  @scala.inline
  implicit class StartMLEvaluationTaskRunResponseOps[Self <: StartMLEvaluationTaskRunResponse] (val x: Self) extends AnyVal {
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
    def deleteTaskRunId: Self = this.set("TaskRunId", js.undefined)
  }
  
}

