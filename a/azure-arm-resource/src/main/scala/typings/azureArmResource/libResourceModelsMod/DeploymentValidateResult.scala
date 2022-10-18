package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentValidateResult extends StObject {
  
  /**
    * Validation error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.undefined
  
  /**
    * The template deployment properties.
    */
  var properties: js.UndefOr[DeploymentPropertiesExtended] = js.undefined
}
object DeploymentValidateResult {
  
  inline def apply(): DeploymentValidateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentValidateResult]
  }
  
  extension [Self <: DeploymentValidateResult](x: Self) {
    
    inline def setError(value: ResourceManagementErrorWithDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setProperties(value: DeploymentPropertiesExtended): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
