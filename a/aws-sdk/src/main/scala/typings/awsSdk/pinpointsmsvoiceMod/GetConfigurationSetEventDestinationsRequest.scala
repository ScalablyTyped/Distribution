package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationSetEventDestinationsRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String
}
object GetConfigurationSetEventDestinationsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: _String): GetConfigurationSetEventDestinationsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
  }
  
  @scala.inline
  implicit class GetConfigurationSetEventDestinationsRequestMutableBuilder[Self <: GetConfigurationSetEventDestinationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
