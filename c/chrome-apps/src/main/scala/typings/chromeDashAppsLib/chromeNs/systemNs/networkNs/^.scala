package typings
package chromeDashAppsLib.chromeNs.systemNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.network")
@js.native
object ^ extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(
    callback: js.Function1[
      /* networkInterfaces */ js.Array[chromeDashAppsLib.chromeNs.systemNs.networkNs.NetworkInterface], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

