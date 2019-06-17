package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arrow extends js.Object {
  var arrow: js.UndefOr[baseuiLib.layerMod.PopperOffset] = js.undefined
  var popper: baseuiLib.layerMod.PopperOffset
}

object Anon_Arrow {
  @scala.inline
  def apply(popper: baseuiLib.layerMod.PopperOffset, arrow: baseuiLib.layerMod.PopperOffset = null): Anon_Arrow = {
    val __obj = js.Dynamic.literal(popper = popper)
    if (arrow != null) __obj.updateDynamic("arrow")(arrow)
    __obj.asInstanceOf[Anon_Arrow]
  }
}

