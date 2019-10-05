package typings.chromeDashApps.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.config.setNetworkFilter")
@js.native
object setNetworkFilter extends js.Object {
  /**
    * Allows an extension to define network filters for the networks it can handle.
    * A call to this function will remove all filters previously
    * installed by the extension before setting the new list.
    * @param networks Network filters to set. Array of objects with either HexSSID or SSID set.
    * @param callback Called back when this operation is finished.
    */
  def apply(networks: js.Array[NetworkInfoFilterHexSSID | NetworkInfoFilterSSID], callback: js.Function0[Unit]): Unit = js.native
}

