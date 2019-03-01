package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetNetworkInterfaces extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(
    callback: js.Function1[
      /* networkInterfaces */ js.Array[chromeDashAppsLib.chromeNs.systemNs.networkNs.NetworkInterface], 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_CallbackGetNetworkInterfaces {
  @scala.inline
  def apply(
    getNetworkInterfaces: js.Function1[
      js.Function1[
        /* networkInterfaces */ js.Array[chromeDashAppsLib.chromeNs.systemNs.networkNs.NetworkInterface], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_CallbackGetNetworkInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNetworkInterfaces")(getNetworkInterfaces)
    __obj.asInstanceOf[Anon_CallbackGetNetworkInterfaces]
  }
}

