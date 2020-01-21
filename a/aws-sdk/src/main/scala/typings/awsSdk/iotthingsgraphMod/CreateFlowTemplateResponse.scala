package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowTemplateResponse extends js.Object {
  /**
    * The summary object that describes the created workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.native
}

object CreateFlowTemplateResponse {
  @scala.inline
  def apply(summary: FlowTemplateSummary = null): CreateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowTemplateResponse]
  }
}

