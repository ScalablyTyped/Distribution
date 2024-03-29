package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendEmail action. 
    */
  var MessageId: typings.awsSdk2Types.clientsSesMod.MessageId
}
object SendEmailResponse {
  
  inline def apply(MessageId: MessageId): SendEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendEmailResponse] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
