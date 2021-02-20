package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to add an event destination to.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  
  /**
    * An object that defines the event destination.
    */
  var EventDestination: EventDestinationDefinition = js.native
  
  /**
    * A name that identifies the event destination within the configuration set.
    */
  var EventDestinationName: typings.awsSdk.pinpointemailMod.EventDestinationName = js.native
}
object CreateConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    EventDestination: EventDestinationDefinition,
    EventDestinationName: EventDestinationName
  ): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetEventDestinationRequestMutableBuilder[Self <: CreateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
