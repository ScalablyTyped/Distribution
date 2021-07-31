package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigurationSetEventDestinationsRequest extends StObject {
  
  /**
    * The name of the configuration set that contains the event destination.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName
}
object GetConfigurationSetEventDestinationsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): GetConfigurationSetEventDestinationsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
  }
  
  @scala.inline
  implicit class GetConfigurationSetEventDestinationsRequestMutableBuilder[Self <: GetConfigurationSetEventDestinationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
