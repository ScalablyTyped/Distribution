package typings.chromeApps.global.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.forgetNetwork")
@js.native
object forgetNetwork extends js.Object {
  
  /**
    * Forgets a network configuration by clearing any configured properties for the network with GUID networkGuid.
    * This may also include any other networks with matching identifiers (e.g. WiFi SSID and Security).
    * If no such configuration exists, an error will be set and the operation will fail.
    * **In kiosk sessions, this method will not be able to forget shared network configurations.**
    * @param networkGuid The GUID of the network to forget.
    * @param [callback] Called when the operation has completed.
    */
  def apply(networkGuid: String): Unit = js.native
  def apply(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
}
