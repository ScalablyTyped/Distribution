package typings.chromeDashApps.WebViewNs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventsNs {
  /**
    * Fired when the guest window attempts to close itself.
    * The following example code navigates the webview to about:blank when the guest attempts to close itself.
    */
  type CloseEvent = Event
  /**
    * Fired when the guest window fires a load event, i.e., when a new document is loaded. This does not include page navigation within the current document or asynchronous resource loads.
    * The following example code modifies the default font size of the guest's body element after the page loads:
    * @example
    * webview.addEventListener('contentload', function() {
    *  webview.executeScript({ code: 'document.body.style.fontSize = '42px'' })
    * });
    */
  type ContentLoadEvent = Event
  /**
    * Fired when all frame-level loads in a guest page (including all its subframes) have completed.
    * This includes navigation within the current document as well as subframe document-level loads,
    * but does not include asynchronous resource loads.
    *
    * This event fires every time the number of document-level loads transitions from one (or more) to zero.
    * For example, if a page that has already finished loading (i.e., loadstop already fired once) creates
    * a new iframe which loads a page, then a second loadstop will fire when the iframe page load completes.
    *
    * This pattern is commonly observed on pages that load ads.
    *
    * **Note:**
    * When a committed load is aborted, a loadstop event will eventually follow a loadabort event,
    * even if all committed loads since the last loadstop event (if any) were aborted.
    */
  type LoadStopEvent = Event
}
