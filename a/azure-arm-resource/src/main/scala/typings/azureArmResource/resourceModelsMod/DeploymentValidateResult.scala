package typings.azureArmResource.resourceModelsMod

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
  
  @scala.inline
  def apply(): DeploymentValidateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentValidateResult]
  }
  
  @scala.inline
  implicit class DeploymentValidateResultMutableBuilder[Self <: DeploymentValidateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ResourceManagementErrorWithDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setProperties(value: DeploymentPropertiesExtended): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
