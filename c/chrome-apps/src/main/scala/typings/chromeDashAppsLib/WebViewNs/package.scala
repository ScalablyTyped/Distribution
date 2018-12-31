package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebViewNs {
  /**
    * The different contexts a menu can appear in.
    * Specifying 'all' is equivalent to the combination of all other contexts.
    **/
  type ContextType = chromeDashAppsLib.chromeDashAppsLibStrings.all | chromeDashAppsLib.chromeDashAppsLibStrings.page | chromeDashAppsLib.chromeDashAppsLibStrings.frame | chromeDashAppsLib.chromeDashAppsLibStrings.selection | chromeDashAppsLib.chromeDashAppsLibStrings.link | chromeDashAppsLib.chromeDashAppsLibStrings.editable | chromeDashAppsLib.chromeDashAppsLibStrings.image | chromeDashAppsLib.chromeDashAppsLibStrings.video | chromeDashAppsLib.chromeDashAppsLibStrings.audio
  type WebRedirectionResponseEvent = _WebResponseHeadersEvent[WebRedirectionResponseDetails]
  type WebResponseCacheEvent = _WebResponseHeadersEvent[WebResponseCacheDetails]
  type WebResponseErrorEvent = _WebResponseHeadersEvent[WebResponseErrorDetails]
  type WebResponseHeadersEvent = _WebResponseHeadersEvent[WebResponseHeadersDetails]
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
  type ZoomMode = chromeDashAppsLib.chromeDashAppsLibStrings.`per-origin` | chromeDashAppsLib.chromeDashAppsLibStrings.`per-view` | chromeDashAppsLib.chromeDashAppsLibStrings.disabled
}
