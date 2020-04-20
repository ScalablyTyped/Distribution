package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateFlowTemplateRequest extends js.Object {
  /**
    * The ID of the workflow to be deleted. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn = js.native
}

object DeprecateFlowTemplateRequest {
  @scala.inline
  def apply(id: Urn): DeprecateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateFlowTemplateRequest]
  }
}

