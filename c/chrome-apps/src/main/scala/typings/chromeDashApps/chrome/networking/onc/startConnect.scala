package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.onc.startConnect")
@js.native
object startConnect extends js.Object {
  /**
    * @description Starts a connection to the network with networkGuid.
    * @param networkGuid The GUID of the network to connect to.
    * @param [callback] Creates a new network configuration from properties.
    *                   If a matching configured network already exists, this will fail.
    *                   Otherwise returns the GUID of the new network.
    */
  def apply(networkGuid: String): Unit = js.native
  def apply(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
}

