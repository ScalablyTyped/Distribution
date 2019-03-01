package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Partitions extends js.Object {
  /** Webview partition list */
  var partitions: js.Array[chromeDashAppsLib.chromeNs.runtimeNs.WebViewPartition]
}

object Anon_Partitions {
  @scala.inline
  def apply(partitions: js.Array[chromeDashAppsLib.chromeNs.runtimeNs.WebViewPartition]): Anon_Partitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("partitions")(partitions)
    __obj.asInstanceOf[Anon_Partitions]
  }
}

