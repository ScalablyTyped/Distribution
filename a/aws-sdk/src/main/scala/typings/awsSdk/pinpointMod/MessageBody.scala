package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBody extends StObject {
  
  /**
    * The message that's returned from the API.
    */
  var Message: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the request or response.
    */
  var RequestID: js.UndefOr[string] = js.native
}
object MessageBody {
  
  @scala.inline
  def apply(): MessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBody]
  }
  
  @scala.inline
  implicit class MessageBodyMutableBuilder[Self <: MessageBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setRequestID(value: string): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
  }
}
