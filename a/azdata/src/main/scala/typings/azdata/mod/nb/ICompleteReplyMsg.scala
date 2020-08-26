package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompleteReplyMsg extends IShellMessage {
  @JSName("content")
  var content_ICompleteReplyMsg: ICompletionContent = js.native
}

object ICompleteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ICompletionContent,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  @scala.inline
  implicit class ICompleteReplyMsgOps[Self <: ICompleteReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: ICompletionContent): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

