package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Fired when the guest page attempts to open a new browser window.
         * The following example code will create and navigate a new webview in the embedder for each requested new window:
         * @example
         * webview.addEventListener('newwindow', function(e) {
         *  const newWebview = document.createElement('webview');
         *  document.body.appendChild(newWebview);
         *  e.window.attach(newWebview);
         * });
         */
@js.native
trait NewWindowEvent
  extends stdLib.Event {
  /** The initial height requested for the new window. */
  var initialHeight: chromeDashAppsLib.chromeNs.integer = js.native
  /** The initial width requested for the new window. */
  var initialWidth: chromeDashAppsLib.chromeNs.integer = js.native
  /** The requested name of the new window. */
  var name: java.lang.String = js.native
  /** The target URL requested for the new window. */
  var targetUrl: java.lang.String = js.native
  /**
               * An interface that can be used to either attach the requested
               * target page to an existing webview element or explicitly
               * discard the request.
               **/
  var window: chromeDashAppsLib.WebViewNs.NewWindow = js.native
  /** The requested disposition of the new window. */
  var windowOpenDisposition: WindowOpenDisposition = js.native
}

