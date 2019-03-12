package typings
package confirmdialogLib.optionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait buttonOptionss extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var confirm: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object buttonOptionss {
  @scala.inline
  def apply(cancel: () => scala.Unit = null, confirm: () => scala.Unit = null): buttonOptionss = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (confirm != null) __obj.updateDynamic("confirm")(js.Any.fromFunction0(confirm))
    __obj.asInstanceOf[buttonOptionss]
  }
}

