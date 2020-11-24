package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSystemTemplateRequest extends js.Object {
  
  /**
    * The namespace version in which the system is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  
  /**
    * The DefinitionDocument used to create the system.
    */
  var definition: DefinitionDocument = js.native
}
object CreateSystemTemplateRequest {
  
  @scala.inline
  def apply(definition: DefinitionDocument): CreateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateSystemTemplateRequestOps[Self <: CreateSystemTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setCompatibleNamespaceVersion(value: Version): Self = this.set("compatibleNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleNamespaceVersion: Self = this.set("compatibleNamespaceVersion", js.undefined)
  }
}
