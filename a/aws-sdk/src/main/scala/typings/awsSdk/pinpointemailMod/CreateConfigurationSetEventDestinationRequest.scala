package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to add an event destination to.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName
  
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition
  
  /**
    * A name that identifies the event destination within the configuration set.
    */
  var EventDestinationName: typings.awsSdk.pinpointemailMod.EventDestinationName
}
object CreateConfigurationSetEventDestinationRequest {
  
  inline def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  
  extension [Self <: CreateConfigurationSetEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
