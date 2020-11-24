package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab extends js.Object {
  
  /**
    * Whether the tab is active in its window. (Does not necessarily mean the window is focused.)
    * @since Chrome 16.
    */
  var active: Boolean = js.native
  
  /**
    * Optional.
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also muted). Equivalent to whether the speaker audio indicator is showing.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tab can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: Boolean = js.native
  
  /**
    * Whether the tab is discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: Boolean = js.native
  
  /**
    * Optional.
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the "tabs" permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  
  /**
    * Optional. The height of the tab in pixels.
    * @since Chrome 31.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Whether the tab is highlighted.
    * @since Chrome 16.
    */
  var highlighted: Boolean = js.native
  
  /**
    * Optional.
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be assigned an ID, for example when querying foreign tabs using the sessions API, in which case a session ID may be present. Tab ID can also be set to chrome.tabs.TAB_ID_NONE for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.native
  
  /** Whether the tab is in an incognito window. */
  var incognito: Boolean = js.native
  
  /** The zero-based index of the tab within its window. */
  var index: Double = js.native
  
  /**
    * Optional.
    * Current tab muted state and the reason for the last state change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  
  /**
    * Optional.
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  
  /**
    * The URL the tab is navigating to, before it has committed.
    * This property is only present if the extension's manifest includes the "tabs" permission and there is a pending navigation.
    * @since Chrome 79.
    */
  var pendingUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether the tab is pinned.
    * @since Chrome 9.
    */
  var pinned: Boolean = js.native
  
  /**
    * Whether the tab is selected.
    * @deprecated since Chrome 33. Please use tabs.Tab.highlighted.
    */
  var selected: Boolean = js.native
  
  /**
    * Optional. The session ID used to uniquely identify a Tab obtained from the sessions API.
    * @since Chrome 31.
    */
  var sessionId: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * Either loading or complete.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * The title of the tab. This property is only present if the extension's manifest includes the "tabs" permission.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the "tabs" permission.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Optional. The width of the tab in pixels.
    * @since Chrome 31.
    */
  var width: js.UndefOr[Double] = js.native
  
  /** The ID of the window the tab is contained within. */
  var windowId: Double = js.native
}
object Tab {
  
  @scala.inline
  def apply(
    active: Boolean,
    autoDiscardable: Boolean,
    discarded: Boolean,
    highlighted: Boolean,
    incognito: Boolean,
    index: Double,
    pinned: Boolean,
    selected: Boolean,
    windowId: Double
  ): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], autoDiscardable = autoDiscardable.asInstanceOf[js.Any], discarded = discarded.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
    
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
    def setAutoDiscardable(value: Boolean): Self = this.set("autoDiscardable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = this.set("discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    
    @scala.inline
    def setFavIconUrl(value: String): Self = this.set("favIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavIconUrl: Self = this.set("favIconUrl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMutedInfo(value: MutedInfo): Self = this.set("mutedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutedInfo: Self = this.set("mutedInfo", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = this.set("openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenerTabId: Self = this.set("openerTabId", js.undefined)
    
    @scala.inline
    def setPendingUrl(value: String): Self = this.set("pendingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingUrl: Self = this.set("pendingUrl", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
