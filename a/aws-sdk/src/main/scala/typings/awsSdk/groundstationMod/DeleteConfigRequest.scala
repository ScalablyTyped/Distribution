package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigRequest extends StObject {
  
  /**
    * UUID of a Config.
    */
  var configId: String
  
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
}
object DeleteConfigRequest {
  
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): DeleteConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigRequestMutableBuilder[Self <: DeleteConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
  }
}
