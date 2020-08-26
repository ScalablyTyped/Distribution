package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSystemTemplateRequest extends js.Object {
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The DefinitionDocument that contains the updated system definition.
    */
  var definition: DefinitionDocument = js.native
  /**
    * The ID of the system to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn = js.native
}

object UpdateSystemTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, id: Urn): UpdateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSystemTemplateRequest]
  }
  @scala.inline
  implicit class UpdateSystemTemplateRequestOps[Self <: UpdateSystemTemplateRequest] (val x: Self) extends AnyVal {
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

