package typings.chrome.chrome.sessions

import typings.chrome.chrome.tabs.Tab
import typings.chrome.chrome.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /** The time when the window or tab was closed or modified, represented in milliseconds since the epoch. */
  var lastModified: Double = js.native
  /**
    * Optional.
    * The tabs.Tab, if this entry describes a tab. Either this or sessions.Session.window will be set.
    */
  var tab: js.UndefOr[Tab] = js.native
  /**
    * Optional.
    * The windows.Window, if this entry describes a window. Either this or sessions.Session.tab will be set.
    */
  var window: js.UndefOr[Window] = js.native
}

object Session {
  @scala.inline
  def apply(lastModified: Double): Session = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
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
    def setLastModified(value: Double): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: Tab): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab: Self = this.set("tab", js.undefined)
    @scala.inline
    def setWindow(value: Window): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

