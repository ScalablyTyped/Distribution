package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupExportResult extends StObject {
  
  /**
    * The error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.native
  
  /**
    * The template content.
    */
  var template: js.UndefOr[js.Any] = js.native
}
object ResourceGroupExportResult {
  
  @scala.inline
  def apply(): ResourceGroupExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupExportResult]
  }
  
  @scala.inline
  implicit class ResourceGroupExportResultMutableBuilder[Self <: ResourceGroupExportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ResourceManagementErrorWithDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
