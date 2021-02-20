package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendVoiceMessageResponse extends StObject {
  
  /**
    * A unique identifier for the voice message.
    */
  var MessageId: js.UndefOr[String] = js.native
}
object SendVoiceMessageResponse {
  
  @scala.inline
  def apply(): SendVoiceMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageResponse]
  }
  
  @scala.inline
  implicit class SendVoiceMessageResponseMutableBuilder[Self <: SendVoiceMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
