package typings.chromeDashApps.chromeNs.systemNs.memoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.memory")
@js.native
object ^ extends js.Object {
  /** Get physical memory information. */
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
}

