package typings
package chromeDashAppsLib.chromeNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UninstallOptions extends js.Object {
  /**
    * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false for self uninstalls.
    * If an extension uninstalls another extension, this parameter is ignored and the dialog is always shown.
    */
  var showConfirmDialog: js.UndefOr[scala.Boolean] = js.undefined
}

