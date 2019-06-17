package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndex extends js.Object {
  var modal: js.UndefOr[scala.Double] = js.undefined
}

object ZIndex {
  @scala.inline
  def apply(modal: scala.Int | scala.Double = null): ZIndex = {
    val __obj = js.Dynamic.literal()
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
}

