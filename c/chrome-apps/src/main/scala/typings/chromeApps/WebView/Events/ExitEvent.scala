package typings.chromeApps.WebView.Events

import typings.chromeApps.chrome.integer
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the process rendering the guest web content has exited.
  */
@js.native
trait ExitEvent extends Event {
  
  /** Chrome's internal ID of the process that exited. */
  var processID: integer = js.native
  
  /** String indicating the reason for the exit. */
  var reason: ExitEventReason = js.native
}
