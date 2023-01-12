package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentExportResult extends StObject {
  
  /**
    * The template content.
    */
  var template: js.UndefOr[Any] = js.undefined
}
object DeploymentExportResult {
  
  inline def apply(): DeploymentExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentExportResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentExportResult] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
