package typings.chrome.chrome.windows

import typings.chrome.chrome.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /**
    * Whether the window is set to be always on top.
    * @since Chrome 19.
    */
  var alwaysOnTop: Boolean = js.native
  /** Whether the window is currently the focused window. */
  var focused: Boolean = js.native
  /** Optional. The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the sessions API. */
  var height: js.UndefOr[Double] = js.native
  /** Optional. The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the sessions API, in which case a session ID may be present. */
  var id: Double = js.native
  /** Whether the window is incognito. */
  var incognito: Boolean = js.native
  /** Optional. The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the sessions API. */
  var left: js.UndefOr[Double] = js.native
  /**
    * The session ID used to uniquely identify a Window obtained from the sessions API.
    * @since Chrome 31.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * The state of this browser window.
    * One of: "normal", "minimized", "maximized", "fullscreen", or "docked"
    * @since Chrome 17.
    */
  var state: String = js.native
  /** Array of tabs.Tab objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[Tab]] = js.native
  /** Optional. The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the sessions API. */
  var top: js.UndefOr[Double] = js.native
  /**
    * The type of browser window this is.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var `type`: String = js.native
  /** Optional. The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the sessions API. */
  var width: js.UndefOr[Double] = js.native
}

object Window {
  @scala.inline
  def apply(
    alwaysOnTop: Boolean,
    focused: Boolean,
    id: Double,
    incognito: Boolean,
    state: String,
    `type`: String
  ): Window = {
    val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

