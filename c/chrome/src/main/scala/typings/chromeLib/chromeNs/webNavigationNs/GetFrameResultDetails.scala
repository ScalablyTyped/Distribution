package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFrameResultDetails extends js.Object {
  /** True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired. */
  var errorOccurred: scala.Boolean
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: scala.Double
  /** The URL currently associated with this frame, if the frame identified by the frameId existed at one point in the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding frame still exists. */
  var url: java.lang.String
}

object GetFrameResultDetails {
  @scala.inline
  def apply(errorOccurred: scala.Boolean, parentFrameId: scala.Double, url: java.lang.String): GetFrameResultDetails = {
    val __obj = js.Dynamic.literal(errorOccurred = errorOccurred, parentFrameId = parentFrameId, url = url)
  
    __obj.asInstanceOf[GetFrameResultDetails]
  }
}

