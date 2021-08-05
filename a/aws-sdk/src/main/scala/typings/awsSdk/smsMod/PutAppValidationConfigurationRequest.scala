package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppValidationConfigurationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation
  
  /**
    * The configuration for application validation.
    */
  var appValidationConfigurations: js.UndefOr[AppValidationConfigurations] = js.undefined
  
  /**
    * The configuration for instance validation.
    */
  var serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations] = js.undefined
}
object PutAppValidationConfigurationRequest {
  
  inline def apply(appId: AppIdWithValidation): PutAppValidationConfigurationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppValidationConfigurationRequest]
  }
  
  extension [Self <: PutAppValidationConfigurationRequest](x: Self) {
    
    inline def setAppId(value: AppIdWithValidation): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppValidationConfigurations(value: AppValidationConfigurations): Self = StObject.set(x, "appValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAppValidationConfigurationsUndefined: Self = StObject.set(x, "appValidationConfigurations", js.undefined)
    
    inline def setAppValidationConfigurationsVarargs(value: AppValidationConfiguration*): Self = StObject.set(x, "appValidationConfigurations", js.Array(value :_*))
    
    inline def setServerGroupValidationConfigurations(value: ServerGroupValidationConfigurations): Self = StObject.set(x, "serverGroupValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setServerGroupValidationConfigurationsUndefined: Self = StObject.set(x, "serverGroupValidationConfigurations", js.undefined)
    
    inline def setServerGroupValidationConfigurationsVarargs(value: ServerGroupValidationConfiguration*): Self = StObject.set(x, "serverGroupValidationConfigurations", js.Array(value :_*))
  }
}
