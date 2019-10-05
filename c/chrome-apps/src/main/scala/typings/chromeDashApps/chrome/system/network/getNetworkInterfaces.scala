package typings.chromeDashApps.chrome.system.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.network.getNetworkInterfaces")
@js.native
object getNetworkInterfaces extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def apply(callback: js.Function1[/* networkInterfaces */ js.Array[NetworkInterface], Unit]): Unit = js.native
}

