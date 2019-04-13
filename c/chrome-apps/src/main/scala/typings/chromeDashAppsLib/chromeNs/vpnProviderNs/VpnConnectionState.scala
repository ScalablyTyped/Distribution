package typings
package chromeDashAppsLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The enum is used by the VPN client to inform the platform of its current state.
  * This helps provide meaningful messages to the user.
  *
  * **'connected'**
  * VPN connection was successful.
  * **'failure'**
  * VPN connection failed.
  * @enum
  */
@JSGlobal("chrome.vpnProvider.VpnConnectionState")
@js.native
object VpnConnectionState extends js.Object {
  var CONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.connected = js.native
  var FAILURE: chromeDashAppsLib.chromeDashAppsLibStrings.failure = js.native
}

