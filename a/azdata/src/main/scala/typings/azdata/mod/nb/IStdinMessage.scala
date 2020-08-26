package typings.azdata.mod.nb

import typings.azdata.anon.Password
import typings.azdata.azdataStrings.stdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStdinMessage extends IMessage {
  var channel: stdin = js.native
  @JSName("content")
  var content_IStdinMessage: Password = js.native
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
  @scala.inline
  implicit class IStdinMessageOps[Self <: IStdinMessage] (val x: Self) extends AnyVal {
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
    def setChannel(value: stdin): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Password): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

