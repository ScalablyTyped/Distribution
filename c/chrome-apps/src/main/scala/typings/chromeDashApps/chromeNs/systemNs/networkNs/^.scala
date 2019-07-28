package typings.chromeDashApps.chromeNs.systemNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.network")
@js.native
object ^ extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit = js.native
}

