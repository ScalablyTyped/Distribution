package typings
package chromeDashAppsLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The enum is used by the platform to notify the client of the VPN session status.
  *
  * **'connected'**
  * VPN configuration connected.
  * **'disconnected'**
  * VPN configuration disconnected.
  * **'error'**
  * An error occurred in VPN connection, for example a timeout. A description
  * of the error is given as the error argument to *onPlatformMessage*.
  * **'linkDown'**
  * The default physical network connection is down.
  * **'linkUp'**
  * The default physical network connection is back up.
  * **'linkChanged'**
  * The default physical network connection changed, e.g. wifi->mobile.
  * **'suspend'**
  * The OS is preparing to suspend, so the VPN should drop its connection.
  * The extension is not guaranteed to receive this event prior to suspending.
  * **'resume'**
  * The OS has resumed and the user has logged back in, so the VPN should try to reconnect.
  * @enum
  */
@JSGlobal("chrome.vpnProvider.PlatformMessage")
@js.native
object PlatformMessage extends js.Object {
  var CONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.connected = js.native
  var DISCONNECTED: chromeDashAppsLib.chromeDashAppsLibStrings.disconnected = js.native
  var ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.error = js.native
  var LINK_CHANGED: chromeDashAppsLib.chromeDashAppsLibStrings.linkChanged = js.native
  var LINK_DOWN: chromeDashAppsLib.chromeDashAppsLibStrings.linkDown = js.native
  var LINK_UP: chromeDashAppsLib.chromeDashAppsLibStrings.linkUp = js.native
  var RESUME: chromeDashAppsLib.chromeDashAppsLibStrings.resume = js.native
  var SUSPEND: chromeDashAppsLib.chromeDashAppsLibStrings.suspend = js.native
}

