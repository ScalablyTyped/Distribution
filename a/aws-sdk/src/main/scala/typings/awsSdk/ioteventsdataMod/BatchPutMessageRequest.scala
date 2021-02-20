package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutMessageRequest extends StObject {
  
  /**
    * The list of messages to send. Each message has the following format: '{ "messageId": "string", "inputName": "string", "payload": "string"}' 
    */
  var messages: Messages = js.native
}
object BatchPutMessageRequest {
  
  @scala.inline
  def apply(messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
  
  @scala.inline
  implicit class BatchPutMessageRequestMutableBuilder[Self <: BatchPutMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
