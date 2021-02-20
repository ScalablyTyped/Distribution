package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
  
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.native
  
  /**
    * A name that identifies the event destination.
    */
  var EventDestinationName: js.UndefOr[NonEmptyString] = js.native
}
object CreateConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: _String): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetEventDestinationRequestMutableBuilder[Self <: CreateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationName(value: NonEmptyString): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationNameUndefined: Self = StObject.set(x, "EventDestinationName", js.undefined)
    
    @scala.inline
    def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
