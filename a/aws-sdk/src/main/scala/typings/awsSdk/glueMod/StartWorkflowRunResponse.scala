package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartWorkflowRunResponse extends js.Object {
  /**
    * An Id for the new run.
    */
  var RunId: js.UndefOr[IdString] = js.native
}

object StartWorkflowRunResponse {
  @scala.inline
  def apply(): StartWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWorkflowRunResponse]
  }
  @scala.inline
  implicit class StartWorkflowRunResponseOps[Self <: StartWorkflowRunResponse] (val x: Self) extends AnyVal {
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
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunId: Self = this.set("RunId", js.undefined)
  }
  
}

