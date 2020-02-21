package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonSnackbar extends js.Object {
  var button: js.UndefOr[js.Object] = js.undefined
  var snackbar: js.UndefOr[js.Object] = js.undefined
}

object AnonButtonSnackbar {
  @scala.inline
  def apply(button: js.Object = null, snackbar: js.Object = null): AnonButtonSnackbar = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (snackbar != null) __obj.updateDynamic("snackbar")(snackbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonSnackbar]
  }
}

