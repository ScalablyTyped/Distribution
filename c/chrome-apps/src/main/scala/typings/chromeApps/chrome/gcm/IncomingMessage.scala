package typings.chromeApps.chrome.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage extends js.Object {
  /**
    * Optional.
    * The collapse key of a message. See Collapsible Messages section of Cloud Messaging documentation for details.
    */
  var collapseKey: js.UndefOr[String] = js.native
  /** The message data. */
  var data: IGCMDataReceive = js.native
  /**
    * Optional.
    * The sender who issued the message.
    * @since Chrome 41.
    */
  var from: js.UndefOr[String] = js.native
}

object IncomingMessage {
  @scala.inline
  def apply(data: IGCMDataReceive): IncomingMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
  @scala.inline
  implicit class IncomingMessageOps[Self <: IncomingMessage] (val x: Self) extends AnyVal {
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
    def setData(value: IGCMDataReceive): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapseKey(value: String): Self = this.set("collapseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseKey: Self = this.set("collapseKey", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
  
}

