package typings.chrome.global.chrome

import typings.chrome.chrome.vpnProvider.VpnConfigCreationEvent
import typings.chrome.chrome.vpnProvider.VpnConfigRemovalEvent
import typings.chrome.chrome.vpnProvider.VpnPacketReceptionEvent
import typings.chrome.chrome.vpnProvider.VpnPlatformMessageEvent
import typings.chrome.chrome.vpnProvider.VpnSessionParameters
import typings.chrome.chrome.vpnProvider.VpnUiEvent
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object vpnProvider {
  
  @JSGlobal("chrome.vpnProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfig")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def destroyConfig(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyConfig")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def destroyConfig(id: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyConfig")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notifyConnectionStateChanged(state: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyConnectionStateChanged")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notifyConnectionStateChanged(state: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyConnectionStateChanged")(state.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.vpnProvider.onConfigCreated")
  @js.native
  def onConfigCreated: VpnConfigCreationEvent = js.native
  inline def onConfigCreated_=(x: VpnConfigCreationEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConfigCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onConfigRemoved")
  @js.native
  def onConfigRemoved: VpnConfigRemovalEvent = js.native
  inline def onConfigRemoved_=(x: VpnConfigRemovalEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConfigRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onPacketReceived")
  @js.native
  def onPacketReceived: VpnPacketReceptionEvent = js.native
  inline def onPacketReceived_=(x: VpnPacketReceptionEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPacketReceived")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onPlatformMessage")
  @js.native
  def onPlatformMessage: VpnPlatformMessageEvent = js.native
  inline def onPlatformMessage_=(x: VpnPlatformMessageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPlatformMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.vpnProvider.onUIEvent")
  @js.native
  def onUIEvent: VpnUiEvent = js.native
  inline def onUIEvent_=(x: VpnUiEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUIEvent")(x.asInstanceOf[js.Any])
  
  inline def sendPacket(data: ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendPacket")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sendPacket(data: ArrayBuffer, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPacket")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setParameters(parameters: VpnSessionParameters, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParameters")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
