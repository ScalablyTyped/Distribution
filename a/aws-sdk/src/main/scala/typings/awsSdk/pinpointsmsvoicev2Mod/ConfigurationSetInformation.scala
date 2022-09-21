package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationSetInformation extends StObject {
  
  /**
    * The Resource Name (ARN) of the ConfigurationSet.
    */
  var ConfigurationSetArn: String
  
  /**
    * The name of the ConfigurationSet.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointsmsvoicev2Mod.ConfigurationSetName
  
  /**
    * The time when the ConfigurationSet was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.Date
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var DefaultMessageType: js.UndefOr[MessageType] = js.undefined
  
  /**
    * The default sender ID used by the ConfigurationSet.
    */
  var DefaultSenderId: js.UndefOr[SenderId] = js.undefined
  
  /**
    * An array of EventDestination objects that describe any events to log and where to log them.
    */
  var EventDestinations: EventDestinationList
}
object ConfigurationSetInformation {
  
  inline def apply(
    ConfigurationSetArn: String,
    ConfigurationSetName: ConfigurationSetName,
    CreatedTimestamp: js.Date,
    EventDestinations: EventDestinationList
  ): ConfigurationSetInformation = {
    val __obj = js.Dynamic.literal(ConfigurationSetArn = ConfigurationSetArn.asInstanceOf[js.Any], ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], CreatedTimestamp = CreatedTimestamp.asInstanceOf[js.Any], EventDestinations = EventDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSetInformation]
  }
  
  extension [Self <: ConfigurationSetInformation](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageType(value: MessageType): Self = StObject.set(x, "DefaultMessageType", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTypeUndefined: Self = StObject.set(x, "DefaultMessageType", js.undefined)
    
    inline def setDefaultSenderId(value: SenderId): Self = StObject.set(x, "DefaultSenderId", value.asInstanceOf[js.Any])
    
    inline def setDefaultSenderIdUndefined: Self = StObject.set(x, "DefaultSenderId", js.undefined)
    
    inline def setEventDestinations(value: EventDestinationList): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value*))
  }
}
