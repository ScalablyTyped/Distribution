package typings.chromeDashApps.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider.destroyConfig")
@js.native
object destroyConfig extends js.Object {
  /**
    * Destroys a VPN configuration created by the extension.
    * @param id ID of the VPN configuration to destroy.
    * @param callback Called when the configuration is destroyed or if there is an error.
    */
  def apply(id: String): Unit = js.native
  def apply(id: String, callback: js.Function0[Unit]): Unit = js.native
}

