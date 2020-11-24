package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessage extends js.Object {
  
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
  implicit class ChatMessageOps[Self <: ChatMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: ChatContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ChatContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
  }
}
