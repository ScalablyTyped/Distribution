package typings.chromeApps.WebView

import typings.chromeApps.chromeAppsStrings.disabled__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the how zooming is handled in the webview.
  * Enum values:
  * 'per-origin'
  *   > Zoom changes will persist in the zoomed page's origin,
  *     i.e. all other webviews in the same partition that are
  *     navigated to that same origin will be zoomed as well.
  *     Moreover, per-origin zoom changes are saved with the origin,
  *     meaning that when navigating to other pages in the same origin,
  *     they will all be zoomed to the same zoom factor.
  * 'per-view'
  *   > Zoom changes only take effect in this webview,
  *     and zoom changes in other webviews will not affect
  *     the zooming of this webview. Also, per-view zoom
  *     changes are reset on navigation; navigating a webview
  *     will always load pages with their per-origin zoom factors
  *     (within the scope of the partition).
  * 'disabled'
  *   > Disables all zooming in the webview.
  *     The content will revert to the default zoom level,
  *     and all attempted zoom changes will be ignored.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.`per-origin`
  - typings.chromeApps.chromeAppsStrings.`per-view`
  - typings.chromeApps.chromeAppsStrings.disabled__
*/
trait ZoomMode extends js.Object
object ZoomMode {
  
  @scala.inline
  def disabled: disabled__ = "disabled".asInstanceOf[disabled__]
  
  @scala.inline
  def `per-origin`: typings.chromeApps.chromeAppsStrings.`per-origin` = "per-origin".asInstanceOf[typings.chromeApps.chromeAppsStrings.`per-origin`]
  
  @scala.inline
  def `per-view`: typings.chromeApps.chromeAppsStrings.`per-view` = "per-view".asInstanceOf[typings.chromeApps.chromeAppsStrings.`per-view`]
}
