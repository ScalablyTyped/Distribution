package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowResponse extends js.Object {
  /**
    * The resource metadata for the workflow.
    */
  var Workflow: js.UndefOr[typings.awsSdk.glueMod.Workflow] = js.native
}

object GetWorkflowResponse {
  @scala.inline
  def apply(): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowResponse]
  }
  @scala.inline
  implicit class GetWorkflowResponseOps[Self <: GetWorkflowResponse] (val x: Self) extends AnyVal {
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
    def setWorkflow(value: Workflow): Self = this.set("Workflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflow: Self = this.set("Workflow", js.undefined)
  }
  
}

