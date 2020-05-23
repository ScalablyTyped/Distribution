package typings.azdata.mod.nb

import typings.azdata.anon.Password
import typings.azdata.azdataStrings.stdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStdinMessage extends IMessage {
  var channel: stdin
  @JSName("content")
  var content_IStdinMessage: Password
}

object IStdinMessage {
  @scala.inline
  def apply(
    channel: stdin,
    content: Password,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IStdinMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStdinMessage]
  }
}

