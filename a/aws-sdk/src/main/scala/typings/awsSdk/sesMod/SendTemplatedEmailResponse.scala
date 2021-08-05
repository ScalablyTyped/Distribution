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
  
  inline def apply(MessageId: MessageId): SendTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTemplatedEmailResponse]
  }
  
  extension [Self <: SendTemplatedEmailResponse](x: Self) {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
