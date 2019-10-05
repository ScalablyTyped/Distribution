package typings.chromeDashApps.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider.createConfig")
@js.native
object createConfig extends js.Object {
  /**
    * Creates a new VPN configuration that persists across multiple login sessions of the user.
    * @param name The name of the VPN configuration.
    * @param callback Called when the configuration is created or if there is an error.
    * Parameter id: A unique ID for the created configuration, empty string on failure.
    */
  def apply(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
}

