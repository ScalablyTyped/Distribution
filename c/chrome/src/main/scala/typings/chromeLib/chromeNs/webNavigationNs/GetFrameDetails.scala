package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFrameDetails extends js.Object {
  /** The ID of the frame in the given tab. */
  var frameId: scala.Double
  /**
    * The ID of the process runs the renderer for this tab.
    * @since Chrome 22.
    * @deprecated since Chrome 49. Frames are now uniquely identified by their tab ID and frame ID; the process ID is no longer needed and therefore ignored.
    */
  var processId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the tab in which the frame is. */
  var tabId: scala.Double
}

object GetFrameDetails {
  @scala.inline
  def apply(frameId: scala.Double, tabId: scala.Double, processId: scala.Int | scala.Double = null): GetFrameDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("tabId")(tabId)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameDetails]
  }
}

