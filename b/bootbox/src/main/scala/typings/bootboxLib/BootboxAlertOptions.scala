package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for alert modals */
trait BootboxAlertOptions
  extends BootboxDialogOptions[scala.Unit] {
  @JSName("buttons")
  var buttons_BootboxAlertOptions: js.UndefOr[BootboxAlertButtonMap] = js.undefined
  @JSName("callback")
  var callback_BootboxAlertOptions: js.UndefOr[js.Function0[_]] = js.undefined
}

