package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutMessageRequest extends StObject {
  
  /**
    * The name of the channel where the messages are sent.
    */
  var channelName: ChannelName
  
  /**
    * The list of messages to be sent. Each message has the format: { "messageId": "string", "payload": "string"}. The field names of message payloads (data) that you send to IoT Analytics:   Must contain only alphanumeric characters and undescores (_). No other special characters are allowed.   Must begin with an alphabetic character or single underscore (_).   Cannot contain hyphens (-).   In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".    Cannot be more than 255 characters.   Are case insensitive. (Fields named foo and FOO in the same payload are considered duplicates.)   For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01": 29} are invalid in message payloads. 
    */
  var messages: Messages
}
object BatchPutMessageRequest {
  
  inline def apply(channelName: ChannelName, messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
  
  extension [Self <: BatchPutMessageRequest](x: Self) {
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
