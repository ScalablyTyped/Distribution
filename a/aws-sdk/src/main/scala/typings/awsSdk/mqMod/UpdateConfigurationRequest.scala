package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string
  
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[string] = js.undefined
  
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.undefined
}
object UpdateConfigurationRequest {
  
  @scala.inline
  def apply(ConfigurationId: string): UpdateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateConfigurationRequestMutableBuilder[Self <: UpdateConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
