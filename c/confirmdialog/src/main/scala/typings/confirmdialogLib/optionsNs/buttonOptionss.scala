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
  def apply(cancel: js.Function0[scala.Unit] = null, confirm: js.Function0[scala.Unit] = null): buttonOptionss = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (confirm != null) __obj.updateDynamic("confirm")(confirm)
    __obj.asInstanceOf[buttonOptionss]
  }
}

