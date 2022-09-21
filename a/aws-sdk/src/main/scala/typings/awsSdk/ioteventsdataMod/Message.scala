package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The name of the input into which the message payload is transformed.
    */
  var inputName: EphemeralInputName
  
  /**
    * The ID to assign to the message. Within each batch sent, each "messageId" must be unique.
    */
  var messageId: MessageId
  
  /**
    * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in which case you must decode it).
    */
  var payload: Payload
  
  /**
    * The timestamp associated with the message.
    */
  var timestamp: js.UndefOr[TimestampValue] = js.undefined
}
object Message {
  
  inline def apply(inputName: EphemeralInputName, messageId: MessageId, payload: Payload): Message = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setInputName(value: EphemeralInputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: TimestampValue): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
