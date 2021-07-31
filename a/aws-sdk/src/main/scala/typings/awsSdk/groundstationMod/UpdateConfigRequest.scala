package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigRequest extends StObject {
  
  /**
    * Parameters of a Config.
    */
  var configData: ConfigTypeData
  
  /**
    * UUID of a Config.
    */
  var configId: String
  
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
  
  /**
    * Name of a Config.
    */
  var name: SafeName
}
object UpdateConfigRequest {
  
  @scala.inline
  def apply(configData: ConfigTypeData, configId: String, configType: ConfigCapabilityType, name: SafeName): UpdateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigRequest]
  }
  
  @scala.inline
  implicit class UpdateConfigRequestMutableBuilder[Self <: UpdateConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigData(value: ConfigTypeData): Self = StObject.set(x, "configData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
