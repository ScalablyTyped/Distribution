package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFlowTemplateResponse extends js.Object {
  /**
    * The object that describes the specified workflow.
    */
  var description: js.UndefOr[FlowTemplateDescription] = js.native
}

object GetFlowTemplateResponse {
  @scala.inline
  def apply(description: FlowTemplateDescription = null): GetFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowTemplateResponse]
  }
}

