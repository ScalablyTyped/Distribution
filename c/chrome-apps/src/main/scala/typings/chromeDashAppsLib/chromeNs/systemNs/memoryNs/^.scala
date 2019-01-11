package typings
package chromeDashAppsLib.chromeNs.systemNs.memoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.memory")
@js.native
object ^ extends js.Object {
  /** Get physical memory information. */
  def getInfo(
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit]
  ): scala.Unit = js.native
}

