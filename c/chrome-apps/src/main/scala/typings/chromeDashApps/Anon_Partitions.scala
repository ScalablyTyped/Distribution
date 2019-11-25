package typings.chromeDashApps

import typings.chromeDashApps.chrome.runtime.WebViewPartition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Partitions extends js.Object {
  /** Webview partition list */
  var partitions: js.Array[WebViewPartition]
}

object Anon_Partitions {
  @scala.inline
  def apply(partitions: js.Array[WebViewPartition]): Anon_Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Partitions]
  }
}

