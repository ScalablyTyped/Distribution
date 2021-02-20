package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.connectparticipantMod.ClientToken] = js.native
  
  /**
    * The authentication token associated with the connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  
  /**
    * The content of the message.
    */
  var Content: ChatContent = js.native
  
  /**
    * The type of the content. Supported types are text/plain.
    */
  var ContentType: ChatContentType = js.native
}
object SendMessageRequest {
  
  @scala.inline
  def apply(ConnectionToken: ParticipantToken, Content: ChatContent, ContentType: ChatContentType): SendMessageRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageRequest]
  }
  
  @scala.inline
  implicit class SendMessageRequestMutableBuilder[Self <: SendMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
  }
}
