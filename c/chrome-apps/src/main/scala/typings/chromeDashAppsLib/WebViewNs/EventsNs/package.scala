package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventsNs {
  /**
    * Fired when the guest window attempts to close itself.
    * The following example code navigates the webview to about:blank when the guest attempts to close itself.
    */
  type CloseEvent = stdLib.Event
  type ConsoleMessageLevel = chromeDashAppsLib.chromeDashAppsLibNumbers.`-1` | chromeDashAppsLib.chromeDashAppsLibNumbers.`0` | chromeDashAppsLib.chromeDashAppsLibNumbers.`1` | chromeDashAppsLib.chromeDashAppsLibNumbers.`2`
  /**
    * Fired when the guest window fires a load event, i.e., when a new document is loaded. This does not include page navigation within the current document or asynchronous resource loads.
    * The following example code modifies the default font size of the guest's body element after the page loads:
    * @example
    * webview.addEventListener('contentload', function() {
    *  webview.executeScript({ code: 'document.body.style.fontSize = '42px'' })
    * });
    */
  type ContentLoadEvent = stdLib.Event
  /**
    * The type of modal dialog requested by the guest.
    */
  type DialogMessageType = chromeDashAppsLib.chromeDashAppsLibStrings.alert | chromeDashAppsLib.chromeDashAppsLibStrings.confirm | chromeDashAppsLib.chromeDashAppsLibStrings.prompt
  /**
    * String indicating the reason for the exit.
    */
  type ExitEventReason = chromeDashAppsLib.chromeDashAppsLibStrings.normal | chromeDashAppsLib.chromeDashAppsLibStrings.abnormal | chromeDashAppsLib.chromeDashAppsLibStrings.crash | chromeDashAppsLib.chromeDashAppsLibStrings.kill
  /**
    * String indicating what type of abort occurred.
    * This string is *not* guaranteed to remain backwards compatible between releases.
    * You must not parse and act based upon its content. It is also possible that,
    * in some cases, an error not listed here could be reported.
    */
  type LoadAbortReason = chromeDashAppsLib.chromeDashAppsLibStrings.ERR_ABORTED | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_INVALID_URL | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_DISALLOWED_URL_SCHEME | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_BLOCKED_BY_CLIENT | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_ADDRESS_UNREACHABLE | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_EMPTY_RESPONSE | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_FILE_NOT_FOUND | chromeDashAppsLib.chromeDashAppsLibStrings.ERR_UNKNOWN_URL_SCHEME
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
  type LoadStopEvent = stdLib.Event
  type RequestedPermission = chromeDashAppsLib.chromeDashAppsLibStrings.media | chromeDashAppsLib.chromeDashAppsLibStrings.geolocation | chromeDashAppsLib.chromeDashAppsLibStrings.pointerLock | chromeDashAppsLib.chromeDashAppsLibStrings.download | chromeDashAppsLib.chromeDashAppsLibStrings.loadplugin | chromeDashAppsLib.chromeDashAppsLibStrings.filesystem | chromeDashAppsLib.chromeDashAppsLibStrings.fullscreen
  /** The requested disposition of the new window. */
  type WindowOpenDisposition = chromeDashAppsLib.chromeDashAppsLibStrings.ignore | chromeDashAppsLib.chromeDashAppsLibStrings.save_to_disk | chromeDashAppsLib.chromeDashAppsLibStrings.current_tab | chromeDashAppsLib.chromeDashAppsLibStrings.new_background_tab | chromeDashAppsLib.chromeDashAppsLibStrings.new_foreground_tab | chromeDashAppsLib.chromeDashAppsLibStrings.new_window | chromeDashAppsLib.chromeDashAppsLibStrings.new_popup
}
