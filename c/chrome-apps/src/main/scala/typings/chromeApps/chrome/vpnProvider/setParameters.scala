package typings.chromeApps.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider.setParameters")
@js.native
object setParameters extends js.Object {
  /**
    * Sets the parameters for the VPN session. This should be called immediately after 'connected' is received from the platform. This will succeed only when the VPN session is owned by the extension.
    * @param parameters The parameters for the VPN session.
    * @param callback Called when the parameters are set or if there is an error.
    */
  def apply(parameters: VpnSessionParameters, callback: js.Function0[Unit]): Unit = js.native
}

