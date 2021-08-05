package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomSettings extends StObject {
  
  /**
    * Optional.
    * Used to return the default zoom level for the current tab in calls to tabs.getZoomSettings.
    * @since Chrome 43.
    */
  var defaultZoomFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.
    * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page; defaults to "automatic".
    * "automatic": Zoom changes are handled automatically by the browser.
    * "manual": Overrides the automatic handling of zoom changes. The onZoomChange event will still be dispatched, and it is the responsibility of the extension to listen for this event and manually scale the page. This mode does not support per-origin zooming, and will thus ignore the scope zoom setting and assume per-tab.
    * "disabled": Disables all zooming in the tab. The tab will revert to the default zoom level, and all attempted zoom changes will be ignored.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    * Defines whether zoom changes will persist for the page's origin, or only take effect in this tab; defaults to per-origin when in automatic mode, and per-tab otherwise.
    * "per-origin": Zoom changes will persist in the zoomed page's origin, i.e. all other tabs navigated to that same origin will be zoomed as well. Moreover, per-origin zoom changes are saved with the origin, meaning that when navigating to other pages in the same origin, they will all be zoomed to the same zoom factor. The per-origin scope is only available in the automatic mode.
    * "per-tab": Zoom changes only take effect in this tab, and zoom changes in other tabs will not affect the zooming of this tab. Also, per-tab zoom changes are reset on navigation; navigating a tab will always load pages with their per-origin zoom factors.
    */
  var scope: js.UndefOr[String] = js.undefined
}
object ZoomSettings {
  
  inline def apply(): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomSettings]
  }
  
  extension [Self <: ZoomSettings](x: Self) {
    
    inline def setDefaultZoomFactor(value: Double): Self = StObject.set(x, "defaultZoomFactor", value.asInstanceOf[js.Any])
    
    inline def setDefaultZoomFactorUndefined: Self = StObject.set(x, "defaultZoomFactor", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
