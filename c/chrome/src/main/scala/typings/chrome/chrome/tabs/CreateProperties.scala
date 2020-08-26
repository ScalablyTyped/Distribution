package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProperties extends js.Object {
  /**
    * Optional.
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see windows.update). Defaults to true.
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.native
  /** Optional. The position the tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window. */
  var index: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly created tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /**
    * Optional. Whether the tab should be pinned. Defaults to false
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tab should become the selected tab in the window. Defaults to true
    * @deprecated since Chrome 33. Please use active.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String] = js.native
  /** Optional. The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.native
}

object CreateProperties {
  @scala.inline
  def apply(): CreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProperties]
  }
  @scala.inline
  implicit class CreatePropertiesOps[Self <: CreateProperties] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOpenerTabId(value: Double): Self = this.set("openerTabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenerTabId: Self = this.set("openerTabId", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

