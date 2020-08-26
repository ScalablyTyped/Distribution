package typings.chromeApps.chrome.runtime

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the script context that sent a message or request.
  * @since Chrome 26.
  */
@js.native
trait MessageSender extends js.Object {
  /**
    * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be set when tab is set.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[integer] = js.native
  /** The ID of the app that opened the connection, if any. */
  var id: js.UndefOr[String] = js.native
  /**
    * The TLS channel ID of the page or frame that opened the connection, if requested by the app, and if available.
    * @since Chrome 32.
    */
  var tlsChannelId: js.UndefOr[String] = js.native
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
    * @since Chrome 28.
    */
  var url: js.UndefOr[String] = js.native
}

object MessageSender {
  @scala.inline
  def apply(): MessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSender]
  }
  @scala.inline
  implicit class MessageSenderOps[Self <: MessageSender] (val x: Self) extends AnyVal {
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
    def setFrameId(value: integer): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTlsChannelId(value: String): Self = this.set("tlsChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsChannelId: Self = this.set("tlsChannelId", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

