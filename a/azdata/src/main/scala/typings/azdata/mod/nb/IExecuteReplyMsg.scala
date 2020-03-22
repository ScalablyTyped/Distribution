package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteReplyMsg extends IShellMessage {
  @JSName("content")
  var content_IExecuteReplyMsg: IExecuteReply
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
}

