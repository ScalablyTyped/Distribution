package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowTemplateRequest extends js.Object {
  /**
    * The version of the user's namespace. If no value is specified, the latest version is used by default. Use the GetFlowTemplateRevisions if you want to find earlier revisions of the flow to update.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The DefinitionDocument that contains the updated workflow definition.
    */
  var definition: DefinitionDocument = js.native
  /**
    * The ID of the workflow to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn = js.native
}

object UpdateFlowTemplateRequest {
  @scala.inline
  def apply(
    definition: DefinitionDocument,
    id: Urn,
    compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  ): UpdateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(compatibleNamespaceVersion)) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowTemplateRequest]
  }
}

