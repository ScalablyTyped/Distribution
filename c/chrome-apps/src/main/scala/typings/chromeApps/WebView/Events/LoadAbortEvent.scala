package typings.chromeApps.WebView.Events

import typings.chromeApps.chrome.integer
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a top-level load has aborted without committing.
  * An error message will be printed to the console unless the event is default-prevented.
  *
  * **Note:**
  * When a resource load is aborted, a loadabort event will eventually be followed by a loadstop event,
  * even if all committed loads since the last loadstop event (if any) were aborted.
  *
  * **Note:**
  * When the load of either an about URL or a JavaScript URL is aborted,
  * loadabort will be fired and then the webview will be navigated to 'about:blank'.
  */
@js.native
trait LoadAbortEvent extends Event {
  
  /**
    * Unique chrome.integer ID for the type of abort.
    * Note that this ID is `not` guaranteed to
    * remain backwards compatible between releases.
    * You must not act based upon this specific chrome.integer.
    */
  var code: integer = js.native
  
  /** Whether the load was top-level or in a subframe. */
  var isTopLevel: Boolean = js.native
  
  /**
    * String indicating what type of abort occurred.
    * This string is `not` guaranteed to remain
    * backwards compatible between releases.
    * You must not parse and act based upon its content.
    * It is also possible that, in some cases,
    * an error not listed here could be reported.
    */
  var reason: LoadAbortReason = js.native
  
  /** Requested URL. */
  var url: String = js.native
}
