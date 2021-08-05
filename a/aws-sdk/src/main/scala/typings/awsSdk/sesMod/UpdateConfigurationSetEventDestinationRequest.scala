package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that contains the event destination that you want to update.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName
  
  /**
    * The event destination object that you want to apply to the specified configuration set.
    */
  var EventDestination: typings.awsSdk.sesMod.EventDestination
}
object UpdateConfigurationSetEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName, EventDestination: EventDestination): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
  
  extension [Self <: UpdateConfigurationSetEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestination(value: EventDestination): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
  }
}
