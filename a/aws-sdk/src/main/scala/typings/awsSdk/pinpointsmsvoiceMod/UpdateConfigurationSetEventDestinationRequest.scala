package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
  
  var EventDestination: js.UndefOr[EventDestinationDefinition] = js.native
  
  /**
    * EventDestinationName
    */
  var EventDestinationName: _String = js.native
}
object UpdateConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: _String, EventDestinationName: _String): UpdateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class UpdateConfigurationSetEventDestinationRequestMutableBuilder[Self <: UpdateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestination(value: EventDestinationDefinition): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationName(value: _String): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationUndefined: Self = StObject.set(x, "EventDestination", js.undefined)
  }
}
