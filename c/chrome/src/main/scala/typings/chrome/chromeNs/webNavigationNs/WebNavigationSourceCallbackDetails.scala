package typings.chrome.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationSourceCallbackDetails extends WebNavigationUrlCallbackDetails {
  /** The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame. */
  var sourceFrameId: Double
  /**
    * The ID of the process runs the renderer for the source tab.
    * @since Chrome 22.
    */
  var sourceProcessId: Double
  /** The ID of the tab in which the navigation is triggered. */
  var sourceTabId: Double
}

object WebNavigationSourceCallbackDetails {
  @scala.inline
  def apply(
    sourceFrameId: Double,
    sourceProcessId: Double,
    sourceTabId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): WebNavigationSourceCallbackDetails = {
    val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId, sourceProcessId = sourceProcessId, sourceTabId = sourceTabId, tabId = tabId, timeStamp = timeStamp, url = url)
  
    __obj.asInstanceOf[WebNavigationSourceCallbackDetails]
  }
}

