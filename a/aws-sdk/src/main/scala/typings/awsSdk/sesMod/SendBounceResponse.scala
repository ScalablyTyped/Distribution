package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendBounceResponse extends StObject {
  
  /**
    * The message ID of the bounce message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.sesMod.MessageId] = js.native
}
object SendBounceResponse {
  
  @scala.inline
  def apply(): SendBounceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBounceResponse]
  }
  
  @scala.inline
  implicit class SendBounceResponseMutableBuilder[Self <: SendBounceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
