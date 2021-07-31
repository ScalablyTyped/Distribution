package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupValidationConfiguration extends StObject {
  
  /**
    * The ID of the server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  
  /**
    * The validation configuration.
    */
  var serverValidationConfigurations: js.UndefOr[ServerValidationConfigurations] = js.undefined
}
object ServerGroupValidationConfiguration {
  
  @scala.inline
  def apply(): ServerGroupValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupValidationConfiguration]
  }
  
  @scala.inline
  implicit class ServerGroupValidationConfigurationMutableBuilder[Self <: ServerGroupValidationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    @scala.inline
    def setServerValidationConfigurations(value: ServerValidationConfigurations): Self = StObject.set(x, "serverValidationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerValidationConfigurationsUndefined: Self = StObject.set(x, "serverValidationConfigurations", js.undefined)
    
    @scala.inline
    def setServerValidationConfigurationsVarargs(value: ServerValidationConfiguration*): Self = StObject.set(x, "serverValidationConfigurations", js.Array(value :_*))
  }
}
