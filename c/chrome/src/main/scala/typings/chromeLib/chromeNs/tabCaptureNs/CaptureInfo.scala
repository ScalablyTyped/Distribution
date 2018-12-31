package typings
package chromeLib.chromeNs.tabCaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureInfo extends js.Object {
  /** Whether an element in the tab being captured is in fullscreen mode. */
  var fullscreen: scala.Boolean
  /**
    * The new capture status of the tab.
    * One of: "pending", "active", "stopped", or "error"
    */
  var status: java.lang.String
  /** The id of the tab whose status changed. */
  var tabId: scala.Double
}

