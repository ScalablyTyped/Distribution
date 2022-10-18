package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroupExportResult extends StObject {
  
  /**
    * The error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.undefined
  
  /**
    * The template content.
    */
  var template: js.UndefOr[Any] = js.undefined
}
object ResourceGroupExportResult {
  
  inline def apply(): ResourceGroupExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupExportResult]
  }
  
  extension [Self <: ResourceGroupExportResult](x: Self) {
    
    inline def setError(value: ResourceManagementErrorWithDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
