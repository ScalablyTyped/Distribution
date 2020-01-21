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
  def apply(Workflow: Workflow = null): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Workflow != null) __obj.updateDynamic("Workflow")(Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowResponse]
  }
}

