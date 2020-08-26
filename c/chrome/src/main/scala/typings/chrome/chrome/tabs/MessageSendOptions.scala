package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSendOptions extends js.Object {
  /** Optional. Send a message to a specific frame identified by frameId instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.native
}

object MessageSendOptions {
  @scala.inline
  def apply(): MessageSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSendOptions]
  }
  @scala.inline
  implicit class MessageSendOptionsOps[Self <: MessageSendOptions] (val x: Self) extends AnyVal {
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
  }
  
}

