package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTemplateRequest extends StObject {
  
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
  implicit class ExportTemplateRequestMutableBuilder[Self <: ExportTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
