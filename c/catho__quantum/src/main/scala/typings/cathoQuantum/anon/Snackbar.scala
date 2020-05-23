package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snackbar extends js.Object {
  var button: js.UndefOr[js.Object] = js.undefined
  var snackbar: js.UndefOr[js.Object] = js.undefined
}

object Snackbar {
  @scala.inline
  def apply(button: js.Object = null, snackbar: js.Object = null): Snackbar = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (snackbar != null) __obj.updateDynamic("snackbar")(snackbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snackbar]
  }
}

