package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVoiceMessageResponse extends StObject {
  
  /**
    * A unique identifier for the voice message.
    */
  var MessageId: js.UndefOr[String] = js.undefined
}
object SendVoiceMessageResponse {
  
  inline def apply(): SendVoiceMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageResponse]
  }
  
  extension [Self <: SendVoiceMessageResponse](x: Self) {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
