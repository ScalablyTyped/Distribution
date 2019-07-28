package typings.chromeDashApps.chromeNs.systemNs.cpuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.cpu")
@js.native
object ^ extends js.Object {
  /** Queries basic CPU information of the system. */
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
}

