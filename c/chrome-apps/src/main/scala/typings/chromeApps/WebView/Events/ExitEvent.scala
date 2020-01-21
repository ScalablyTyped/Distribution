package typings.chromeApps.WebView.Events

import typings.chromeApps.chrome.integer
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the process rendering the guest web content has exited.
  */
@js.native
trait ExitEvent extends Event_ {
  /** Chrome's internal ID of the process that exited. */
  var processID: integer = js.native
  /** String indicating the reason for the exit. */
  var reason: ExitEventReason = js.native
}

