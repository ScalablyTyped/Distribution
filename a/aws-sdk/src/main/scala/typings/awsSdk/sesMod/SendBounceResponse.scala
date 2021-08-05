package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBounceResponse extends StObject {
  
  /**
    * The message ID of the bounce message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.sesMod.MessageId] = js.undefined
}
object SendBounceResponse {
  
  inline def apply(): SendBounceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBounceResponse]
  }
  
  extension [Self <: SendBounceResponse](x: Self) {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
