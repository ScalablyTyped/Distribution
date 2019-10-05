package typings.chrome.chrome.vpnProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider")
@js.native
object ^ extends js.Object {
  var onConfigCreated: VpnConfigCreationEvent = js.native
  var onConfigRemoved: VpnConfigRemovalEvent = js.native
  var onPacketReceived: VpnPacketReceptionEvent = js.native
  var onPlatformMessage: VpnPlatformMessageEvent = js.native
  var onUIEvent: VpnUiEvent = js.native
}

