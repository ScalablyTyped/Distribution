package typings.cordovaPluginBackgroundMode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICordovaPluginBackgroundModeNotificationItem extends js.Object {
  /**
    * Handles if app is coming to foreground when tapping on the notification
    */
  var resume: js.UndefOr[Boolean] = js.native
  /**
    * Handles if there is a notification when background is activated
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * The body of the notification displayed in background mode
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The ticker of the notification displayed in background mode
    */
  var ticker: js.UndefOr[String] = js.native
  /**
    * The title of the notification displayed in background mode
    */
  var title: js.UndefOr[String] = js.native
}

object ICordovaPluginBackgroundModeNotificationItem {
  @scala.inline
  def apply(): ICordovaPluginBackgroundModeNotificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordovaPluginBackgroundModeNotificationItem]
  }
  @scala.inline
  implicit class ICordovaPluginBackgroundModeNotificationItemOps[Self <: ICordovaPluginBackgroundModeNotificationItem] (val x: Self) extends AnyVal {
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
    def setResume(value: Boolean): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTicker(value: String): Self = this.set("ticker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicker: Self = this.set("ticker", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

