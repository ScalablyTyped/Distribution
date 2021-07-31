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
  
  @scala.inline
  def apply(): GetAppValidationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppValidationConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetAppValidationConfigurationResponseMutableBuilder[Self <: GetAppValidationConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppValidationConfigurations(value: AppValidationConfigurations): Self = StObject.set(x, "appValidationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppValidationConfigurationsUndefined: Self = StObject.set(x, "appValidationConfigurations", js.undefined)
    
    @scala.inline
    def setAppValidationConfigurationsVarargs(value: AppValidationConfiguration*): Self = StObject.set(x, "appValidationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServerGroupValidationConfigurations(value: ServerGroupValidationConfigurations): Self = StObject.set(x, "serverGroupValidationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupValidationConfigurationsUndefined: Self = StObject.set(x, "serverGroupValidationConfigurations", js.undefined)
    
    @scala.inline
    def setServerGroupValidationConfigurationsVarargs(value: ServerGroupValidationConfiguration*): Self = StObject.set(x, "serverGroupValidationConfigurations", js.Array(value :_*))
  }
}
