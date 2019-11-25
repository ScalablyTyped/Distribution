package typings.chromeDashApps.chrome.vpnProvider

import typings.chromeDashApps.chromeDashAppsStrings.connected_
import typings.chromeDashApps.chromeDashAppsStrings.disconnected_
import typings.chromeDashApps.chromeDashAppsStrings.error
import typings.chromeDashApps.chromeDashAppsStrings.linkChanged
import typings.chromeDashApps.chromeDashAppsStrings.linkDown
import typings.chromeDashApps.chromeDashAppsStrings.linkUp
import typings.chromeDashApps.chromeDashAppsStrings.resume
import typings.chromeDashApps.chromeDashAppsStrings.suspend
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
  var CONNECTED: connected_ = js.native
  var DISCONNECTED: disconnected_ = js.native
  var ERROR: error = js.native
  var LINK_CHANGED: linkChanged = js.native
  var LINK_DOWN: linkDown = js.native
  var LINK_UP: linkUp = js.native
  var RESUME: resume = js.native
  var SUSPEND: suspend = js.native
}

