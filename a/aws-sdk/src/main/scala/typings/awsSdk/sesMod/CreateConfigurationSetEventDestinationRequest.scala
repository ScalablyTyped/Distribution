package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that the event destination should be associated with.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  
  /**
    * An object that describes the AWS service that email sending event information will be published to.
    */
  var EventDestination: typings.awsSdk.sesMod.EventDestination = js.native
}
object CreateConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestination: EventDestination): CreateConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestination = EventDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetEventDestinationRequestMutableBuilder[Self <: CreateConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestination(value: EventDestination): Self = StObject.set(x, "EventDestination", value.asInstanceOf[js.Any])
  }
}
