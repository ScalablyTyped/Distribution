package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set or the configuration set's Amazon Resource Name (ARN) to remove the event destination from. The ConfigurateSetName and ConfigurationSetArn can be found using the DescribeConfigurationSets action.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
  
  /**
    * The name of the event destination to delete.
    */
  var EventDestinationName: typings.awsSdk.pinpointsmsvoicev2Mod.EventDestinationName
}
object DeleteEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn, EventDestinationName: EventDestinationName): DeleteEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventDestinationRequest]
  }
  
  extension [Self <: DeleteEventDestinationRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
