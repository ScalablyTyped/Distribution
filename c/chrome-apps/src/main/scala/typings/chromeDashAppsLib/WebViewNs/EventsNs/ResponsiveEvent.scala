package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Fired when the process rendering the guest web content has become responsive again
         * after being unresponsive.
         *
         * The following example code will fade the `webview` element in or out as it becomes
         * responsive or unresponsive:
         *
         * @example
         * webview.style.webkitTransition = 'opacity 250ms';
         * webview.addEventListener('unresponsive', () => {
         *     webview.style.opacity = '0.5';
         * });
         * webview.addEventListener('responsive', () => {
         *     webview.style.opacity = '1';
         * });
         */
@js.native
trait ResponsiveEvent
  extends stdLib.Event {
  /** Chrome's internal ID of the process that became responsive. */
  var processID: chromeDashAppsLib.chromeNs.integer = js.native
}

