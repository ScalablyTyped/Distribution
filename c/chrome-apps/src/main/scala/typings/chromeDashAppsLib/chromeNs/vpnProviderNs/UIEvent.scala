package typings
package chromeDashAppsLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The enum is used by the platform to indicate the event that triggered *onUIEvent*
  *
  * **'showAddDialog'**
  * Request the VPN client to show add configuration dialog to the user.
  * **'showConfigureDialog'**
  * Request the VPN client to show configuration settings dialog to the user.
  * @enum
  */
@JSGlobal("chrome.vpnProvider.UIEvent")
@js.native
object UIEvent extends js.Object {
  var SHOW_ADD_DIALOG: chromeDashAppsLib.chromeDashAppsLibStrings.showAddDialog = js.native
  var SHOW_CONFIGURE_DIALOG: chromeDashAppsLib.chromeDashAppsLibStrings.showConfigureDialog = js.native
}

