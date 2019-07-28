package typings.chromeDashApps.chromeNs.vpnProviderNs

import typings.chromeDashApps.chromeDashAppsStrings.showAddDialog
import typings.chromeDashApps.chromeDashAppsStrings.showConfigureDialog
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
  var SHOW_ADD_DIALOG: showAddDialog = js.native
  var SHOW_CONFIGURE_DIALOG: showConfigureDialog = js.native
}

