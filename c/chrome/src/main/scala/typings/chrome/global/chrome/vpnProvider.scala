package typings.chrome.global.chrome

import typings.chrome.chrome.vpnProvider.VpnConfigCreationEvent
import typings.chrome.chrome.vpnProvider.VpnConfigRemovalEvent
import typings.chrome.chrome.vpnProvider.VpnPacketReceptionEvent
import typings.chrome.chrome.vpnProvider.VpnPlatformMessageEvent
import typings.chrome.chrome.vpnProvider.VpnSessionParameters
import typings.chrome.chrome.vpnProvider.VpnUiEvent
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// VPN Provider
////////////////////
/**
  * Use the chrome.vpnProvider API to implement a VPN client.
  * Permissions:  "vpnProvider"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
@JSGlobal("chrome.vpnProvider")
@js.native
object vpnProvider extends js.Object {
  
  def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  
  def destroyConfig(id: String): Unit = js.native
  def destroyConfig(id: String, callback: js.Function): Unit = js.native
  
  def notifyConnectionStateChanged(state: String): Unit = js.native
  def notifyConnectionStateChanged(state: String, callback: js.Function): Unit = js.native
  
  var onConfigCreated: VpnConfigCreationEvent = js.native
  
  var onConfigRemoved: VpnConfigRemovalEvent = js.native
  
  var onPacketReceived: VpnPacketReceptionEvent = js.native
  
  var onPlatformMessage: VpnPlatformMessageEvent = js.native
  
  var onUIEvent: VpnUiEvent = js.native
  
  def sendPacket(data: ArrayBuffer): Unit = js.native
  def sendPacket(data: ArrayBuffer, callback: js.Function): Unit = js.native
  
  def setParameters(parameters: VpnSessionParameters, callback: js.Function): Unit = js.native
}
