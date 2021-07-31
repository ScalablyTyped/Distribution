package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that contains the event destination that you want to modify.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName
  
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition
  
  /**
    * The name of the event destination that you want to modify.
    */
  var EventDestinationName: typings.awsSdk.pinpointemailMod.EventDestinationName
}
object UpdateConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class UpdateConfigurationSetEventDestinationRequestMutableBuilder[Self <: UpdateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
