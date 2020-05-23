package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFlowTemplateRequest extends js.Object {
  /**
    * The ID of the workflow. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn = js.native
  /**
    * The number of the workflow revision to retrieve.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}

object GetFlowTemplateRequest {
  @scala.inline
  def apply(id: Urn, revisionNumber: js.UndefOr[Version] = js.undefined): GetFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowTemplateRequest]
  }
}

