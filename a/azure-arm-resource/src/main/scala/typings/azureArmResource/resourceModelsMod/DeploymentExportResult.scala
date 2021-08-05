package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentExportResult extends StObject {
  
  /**
    * The template content.
    */
  var template: js.UndefOr[js.Any] = js.undefined
}
object DeploymentExportResult {
  
  inline def apply(): DeploymentExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentExportResult]
  }
  
  extension [Self <: DeploymentExportResult](x: Self) {
    
    inline def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
