package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for confirm modals */
trait BootboxConfirmOptions
  extends BootboxDialogOptions[scala.Boolean] {
  @JSName("buttons")
  var buttons_BootboxConfirmOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  @JSName("callback")
  def callback_MBootboxConfirmOptions(result: scala.Boolean): js.Any
}

