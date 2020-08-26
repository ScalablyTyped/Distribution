package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The text of the message.
    */
  var content: ContentString = js.native
  /**
    * The content type of the message string.
    */
  var contentType: ContentType = js.native
  /**
    * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[GroupNumber] = js.native
}

object Message {
  @scala.inline
  def apply(content: ContentString, contentType: ContentType): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setContent(value: ContentString): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupNumber(value: GroupNumber): Self = this.set("groupNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupNumber: Self = this.set("groupNumber", js.undefined)
  }
  
}

