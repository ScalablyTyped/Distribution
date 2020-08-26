package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessage extends js.Object {
  var content: js.Any = js.native
  var header: IHeader = js.native
  var parent_header: IHeader | js.Object = js.native
  var `type`: Channel = js.native
}

object IMessage {
  @scala.inline
  def apply(content: js.Any, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): IMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: IHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent_header(value: IHeader | js.Object): Self = this.set("parent_header", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Channel): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

