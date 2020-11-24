package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemTemplateDescription extends js.Object {
  
  /**
    * The definition document of a system.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  
  /**
    * An object that contains summary information about a system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
  
  /**
    * The namespace version against which the system was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}
object SystemTemplateDescription {
  
  @scala.inline
  def apply(): SystemTemplateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemTemplateDescription]
  }
  
  @scala.inline
  implicit class SystemTemplateDescriptionOps[Self <: SystemTemplateDescription] (val x: Self) extends AnyVal {
    
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
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setSummary(value: SystemTemplateSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setValidatedNamespaceVersion(value: Version): Self = this.set("validatedNamespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatedNamespaceVersion: Self = this.set("validatedNamespaceVersion", js.undefined)
  }
}
