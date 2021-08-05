package typings.chrome.chrome.tabs

import typings.chrome.chromeStrings.app
import typings.chrome.chromeStrings.complete
import typings.chrome.chromeStrings.devtools
import typings.chrome.chromeStrings.loading
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.panel
import typings.chrome.chromeStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryInfo extends StObject {
  
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[loading | complete] = js.undefined
  
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[normal | popup | panel | app | devtools] = js.undefined
}
object QueryInfo {
  
  inline def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  extension [Self <: QueryInfo](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    inline def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    inline def setAutoDiscardable(value: Boolean): Self = StObject.set(x, "autoDiscardable", value.asInstanceOf[js.Any])
    
    inline def setAutoDiscardableUndefined: Self = StObject.set(x, "autoDiscardable", js.undefined)
    
    inline def setCurrentWindow(value: Boolean): Self = StObject.set(x, "currentWindow", value.asInstanceOf[js.Any])
    
    inline def setCurrentWindowUndefined: Self = StObject.set(x, "currentWindow", js.undefined)
    
    inline def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    inline def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLastFocusedWindow(value: Boolean): Self = StObject.set(x, "lastFocusedWindow", value.asInstanceOf[js.Any])
    
    inline def setLastFocusedWindowUndefined: Self = StObject.set(x, "lastFocusedWindow", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setStatus(value: loading | complete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    
    inline def setWindowType(value: normal | popup | panel | app | devtools): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
    
    inline def setWindowTypeUndefined: Self = StObject.set(x, "windowType", js.undefined)
  }
}
