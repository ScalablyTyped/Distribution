package typings.chromeApps.chrome.vpnProvider

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider.sendPacket")
@js.native
object sendPacket extends js.Object {
  /**
    * Sends an IP packet through the tunnel created for the VPN session. This will succeed only when the VPN session is owned by the extension.
    * @param data The IP packet to be sent to the platform.
    * @param callback Called when the packet is sent or if there is an error.
    */
  def apply(data: ArrayBuffer): Unit = js.native
  def apply(data: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

