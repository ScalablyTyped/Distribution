package typings.chromeApps.global.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.startDisconnect")
@js.native
object startDisconnect extends js.Object {
  
  /**
    * @description Starts a disconnect from the network with networkGuid.
    * @param networkGuid The GUID of the network to connect to.
    * @param [callback] Called when the disconnect request has been sent. See note for *startConnect*.
    */
  def apply(networkGuid: String): Unit = js.native
  def apply(networkGuid: String, callback: js.Function0[Unit]): Unit = js.native
}
