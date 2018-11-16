package typings
package chromeLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider")
@js.native
object vpnProviderNsMembers extends js.Object {
  var onConfigCreated: VpnConfigCreationEvent = js.native
  var onConfigRemoved: VpnConfigRemovalEvent = js.native
  var onPacketReceived: VpnPacketReceptionEvent = js.native
  var onPlatformMessage: VpnPlatformMessageEvent = js.native
  var onUIEvent: VpnUiEvent = js.native
  def createConfig(name: java.lang.String, callback: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def destroyConfig(id: java.lang.String): scala.Unit = js.native
  def destroyConfig(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def notifyConnectionStateChanged(state: java.lang.String): scala.Unit = js.native
  def notifyConnectionStateChanged(state: java.lang.String, callback: js.Function): scala.Unit = js.native
  def sendPacket(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def sendPacket(data: stdLib.ArrayBuffer, callback: js.Function): scala.Unit = js.native
  def setParameters(parameters: VpnSessionParameters, callback: js.Function): scala.Unit = js.native
}

