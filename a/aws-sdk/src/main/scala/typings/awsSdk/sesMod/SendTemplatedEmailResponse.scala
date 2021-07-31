package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendTemplatedEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendTemplatedEmail action. 
    */
  var MessageId: typings.awsSdk.sesMod.MessageId
}
object SendTemplatedEmailResponse {
  
  @scala.inline
  def apply(MessageId: MessageId): SendTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTemplatedEmailResponse]
  }
  
  @scala.inline
  implicit class SendTemplatedEmailResponseMutableBuilder[Self <: SendTemplatedEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
