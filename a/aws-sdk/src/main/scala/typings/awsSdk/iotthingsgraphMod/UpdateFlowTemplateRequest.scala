package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(definition: DefinitionDocument, id: Urn): UpdateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateFlowTemplateRequestOps[Self <: UpdateFlowTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleNamespaceVersion(value: Version): Self = this.set("compatibleNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleNamespaceVersion: Self = this.set("compatibleNamespaceVersion", js.undefined)
  }
}
