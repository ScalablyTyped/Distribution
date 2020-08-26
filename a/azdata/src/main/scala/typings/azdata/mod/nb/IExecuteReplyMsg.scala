package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecuteReplyMsg extends IShellMessage {
  @JSName("content")
  var content_IExecuteReplyMsg: IExecuteReply = js.native
}

object IExecuteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: IExecuteReply,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
  @scala.inline
  implicit class IExecuteReplyMsgOps[Self <: IExecuteReplyMsg] (val x: Self) extends AnyVal {
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
    def setContent(value: IExecuteReply): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

