package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Fired when the process rendering the guest web content has exited.
         */
@js.native
trait ExitEvent
  extends stdLib.Event {
  /** Chrome's internal ID of the process that exited. */
  var processID: chromeDashAppsLib.chromeNs.integer = js.native
  /** String indicating the reason for the exit. */
  var reason: ExitEventReason = js.native
}

