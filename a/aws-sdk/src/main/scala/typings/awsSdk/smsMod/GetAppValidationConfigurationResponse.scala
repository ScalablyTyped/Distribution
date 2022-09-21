package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppValidationConfigurationResponse extends StObject {
  
  /**
    * The configuration for application validation.
    */
  var appValidationConfigurations: js.UndefOr[AppValidationConfigurations] = js.undefined
  
  /**
    * The configuration for instance validation.
    */
  var serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations] = js.undefined
}
object GetAppValidationConfigurationResponse {
  
  inline def apply(): GetAppValidationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppValidationConfigurationResponse]
  }
  
  extension [Self <: GetAppValidationConfigurationResponse](x: Self) {
    
    inline def setAppValidationConfigurations(value: AppValidationConfigurations): Self = StObject.set(x, "appValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAppValidationConfigurationsUndefined: Self = StObject.set(x, "appValidationConfigurations", js.undefined)
    
    inline def setAppValidationConfigurationsVarargs(value: AppValidationConfiguration*): Self = StObject.set(x, "appValidationConfigurations", js.Array(value*))
    
    inline def setServerGroupValidationConfigurations(value: ServerGroupValidationConfigurations): Self = StObject.set(x, "serverGroupValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerGroupValidationConfigurationsUndefined: Self = StObject.set(x, "serverGroupValidationConfigurations", js.undefined)
    
    inline def setServerGroupValidationConfigurationsVarargs(value: ServerGroupValidationConfiguration*): Self = StObject.set(x, "serverGroupValidationConfigurations", js.Array(value*))
  }
}
