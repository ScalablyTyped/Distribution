package typings.confirmdialog.optionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait buttonOptionss extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var confirm: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object buttonOptionss {
  @scala.inline
  def apply(cancel: () => Unit = null, confirm: () => Unit = null): buttonOptionss = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (confirm != null) __obj.updateDynamic("confirm")(js.Any.fromFunction0(confirm))
    __obj.asInstanceOf[buttonOptionss]
  }
}

