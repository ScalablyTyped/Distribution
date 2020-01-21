package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

