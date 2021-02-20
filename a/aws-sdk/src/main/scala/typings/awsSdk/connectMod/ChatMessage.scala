package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessage extends StObject {
  
  /**
    * The content of the chat message.
    */
  var Content: ChatContent = js.native
  
  /**
    * The type of the content. Supported types are text/plain.
    */
  var ContentType: ChatContentType = js.native
}
object ChatMessage {
  
  @scala.inline
  def apply(Content: ChatContent, ContentType: ChatContentType): ChatMessage = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessage]
  }
  
  @scala.inline
  implicit class ChatMessageMutableBuilder[Self <: ChatMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
  }
}
