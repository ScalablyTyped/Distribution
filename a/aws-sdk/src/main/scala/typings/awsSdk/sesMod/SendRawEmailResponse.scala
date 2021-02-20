package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendRawEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendRawEmail action. 
    */
  var MessageId: typings.awsSdk.sesMod.MessageId = js.native
}
object SendRawEmailResponse {
  
  @scala.inline
  def apply(MessageId: MessageId): SendRawEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendRawEmailResponse]
  }
  
  @scala.inline
  implicit class SendRawEmailResponseMutableBuilder[Self <: SendRawEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
