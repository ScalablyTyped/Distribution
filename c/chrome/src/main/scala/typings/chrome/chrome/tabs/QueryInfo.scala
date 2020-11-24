package typings.chrome.chrome.tabs

import typings.chrome.chromeStrings.app
import typings.chrome.chromeStrings.complete
import typings.chrome.chromeStrings.devtools
import typings.chrome.chromeStrings.loading
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.panel
import typings.chrome.chromeStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends js.Object {
  
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.native
  
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[loading | complete] = js.native
  
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.native
  
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[normal | popup | panel | app | devtools] = js.native
}
object QueryInfo {
  
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
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
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    
    @scala.inline
    def setAutoDiscardable(value: Boolean): Self = this.set("autoDiscardable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDiscardable: Self = this.set("autoDiscardable", js.undefined)
    
    @scala.inline
    def setCurrentWindow(value: Boolean): Self = this.set("currentWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentWindow: Self = this.set("currentWindow", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = this.set("discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscarded: Self = this.set("discarded", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlighted: Self = this.set("highlighted", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLastFocusedWindow(value: Boolean): Self = this.set("lastFocusedWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastFocusedWindow: Self = this.set("lastFocusedWindow", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setStatus(value: loading | complete): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: String*): Self = this.set("url", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
    
    @scala.inline
    def setWindowType(value: normal | popup | panel | app | devtools): Self = this.set("windowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowType: Self = this.set("windowType", js.undefined)
  }
}
