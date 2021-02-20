package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointsBatchResponse extends StObject {
  
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody = js.native
}
object UpdateEndpointsBatchResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): UpdateEndpointsBatchResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointsBatchResponse]
  }
  
  @scala.inline
  implicit class UpdateEndpointsBatchResponseMutableBuilder[Self <: UpdateEndpointsBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
