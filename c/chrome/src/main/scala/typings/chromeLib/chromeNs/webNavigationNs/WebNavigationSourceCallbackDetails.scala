package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationSourceCallbackDetails extends WebNavigationUrlCallbackDetails {
  /** The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame. */
  var sourceFrameId: scala.Double
  /**
    * The ID of the process runs the renderer for the source tab.
    * @since Chrome 22.
    */
  var sourceProcessId: scala.Double
  /** The ID of the tab in which the navigation is triggered. */
  var sourceTabId: scala.Double
}

