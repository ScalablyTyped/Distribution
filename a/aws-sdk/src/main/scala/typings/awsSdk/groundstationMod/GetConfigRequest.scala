package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigRequest extends StObject {
  
  /**
    * UUID of a Config.
    */
  var configId: String
  
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
}
object GetConfigRequest {
  
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): GetConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigRequest]
  }
  
  @scala.inline
  implicit class GetConfigRequestMutableBuilder[Self <: GetConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
  }
}
