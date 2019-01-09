package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreateConfig extends js.Object {
  var onConfigCreated: chromeLib.chromeNs.vpnProviderNs.VpnConfigCreationEvent = js.native
  var onConfigRemoved: chromeLib.chromeNs.vpnProviderNs.VpnConfigRemovalEvent = js.native
  var onPacketReceived: chromeLib.chromeNs.vpnProviderNs.VpnPacketReceptionEvent = js.native
  var onPlatformMessage: chromeLib.chromeNs.vpnProviderNs.VpnPlatformMessageEvent = js.native
  var onUIEvent: chromeLib.chromeNs.vpnProviderNs.VpnUiEvent = js.native
  def createConfig(name: java.lang.String, callback: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def destroyConfig(id: java.lang.String): scala.Unit = js.native
  def destroyConfig(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def notifyConnectionStateChanged(state: java.lang.String): scala.Unit = js.native
  def notifyConnectionStateChanged(state: java.lang.String, callback: js.Function): scala.Unit = js.native
  def sendPacket(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def sendPacket(data: stdLib.ArrayBuffer, callback: js.Function): scala.Unit = js.native
  def setParameters(parameters: chromeLib.chromeNs.vpnProviderNs.VpnSessionParameters, callback: js.Function): scala.Unit = js.native
}

