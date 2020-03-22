package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompleteReplyMsg extends IShellMessage {
  @JSName("content")
  var content_ICompleteReplyMsg: ICompletionContent
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
}

