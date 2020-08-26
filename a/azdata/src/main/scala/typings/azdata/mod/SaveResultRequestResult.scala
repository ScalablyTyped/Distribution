package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveResultRequestResult extends js.Object {
  var messages: String = js.native
}

object SaveResultRequestResult {
  @scala.inline
  def apply(messages: String): SaveResultRequestResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResultRequestResult]
  }
  @scala.inline
  implicit class SaveResultRequestResultOps[Self <: SaveResultRequestResult] (val x: Self) extends AnyVal {
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
    def setMessages(value: String): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

