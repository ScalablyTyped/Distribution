package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectInfo extends js.Object {
  /**
    * Open a port to a specific frame identified by frameId instead of all frames in the tab.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  /** Optional. Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}

object ConnectInfo {
  @scala.inline
  def apply(frameId: js.UndefOr[Double] = js.undefined, name: String = null): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectInfo]
  }
}

