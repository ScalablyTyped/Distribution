package typings.chromeApps.chrome.system.cpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.cpu.getInfo")
@js.native
object getInfo extends js.Object {
  /** Queries basic CPU information of the system. */
  def apply(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
}

