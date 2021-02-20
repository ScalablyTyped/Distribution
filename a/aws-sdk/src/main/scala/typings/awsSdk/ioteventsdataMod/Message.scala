package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  /**
    * The name of the input into which the message payload is transformed.
    */
  var inputName: InputName = js.native
  
  /**
    * The ID to assign to the message. Within each batch sent, each "messageId" must be unique.
    */
  var messageId: MessageId = js.native
  
  /**
    * The payload of the message. This can be a JSON string or a Base-64-encoded string representing binary data (in which case you must decode it).
    */
  var payload: Payload = js.native
}
object Message {
  
  @scala.inline
  def apply(inputName: InputName, messageId: MessageId, payload: Payload): Message = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
