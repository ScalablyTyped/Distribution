package typings.chromeApps

import typings.chromeApps.chrome.runtime.WebViewPartition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartitions extends js.Object {
  /** Webview partition list */
  var partitions: js.Array[WebViewPartition]
}

object AnonPartitions {
  @scala.inline
  def apply(partitions: js.Array[WebViewPartition]): AnonPartitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPartitions]
  }
}

