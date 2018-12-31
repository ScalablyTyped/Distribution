package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the process rendering the guest web content has become unresponsive.
  * This event will be generated once with a matching responsive event if the guest begins to respond again.
  */
@js.native
trait UnresponsiveEvent
  extends stdLib.Event {
  /** Chrome's internal ID of the process that has become unresponsive. */
  var processID: chromeDashAppsLib.chromeNs.integer = js.native
}

