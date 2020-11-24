package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTemplateRequest extends js.Object {
  
  /**
    * The export template options. Supported values include 'IncludeParameterDefaultValue',
    * 'IncludeComments' or 'IncludeParameterDefaultValue, IncludeComments
    */
  var options: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the resources. The only supported string currently is '*' (all resources). Future
    * updates will support exporting specific resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
}
object ExportTemplateRequest {
  
  @scala.inline
  def apply(): ExportTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTemplateRequest]
  }
  
  @scala.inline
  implicit class ExportTemplateRequestOps[Self <: ExportTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
