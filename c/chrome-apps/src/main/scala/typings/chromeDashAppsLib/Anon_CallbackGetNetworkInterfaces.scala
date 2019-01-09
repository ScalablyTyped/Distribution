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

