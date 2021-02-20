package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveMessageResult extends StObject {
  
  /**
    * A list of messages.
    */
  var Messages: js.UndefOr[MessageList] = js.native
}
object ReceiveMessageResult {
  
  @scala.inline
  def apply(): ReceiveMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveMessageResult]
  }
  
  @scala.inline
  implicit class ReceiveMessageResultMutableBuilder[Self <: ReceiveMessageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: MessageList): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "Messages", js.Array(value :_*))
  }
}
