package typings.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedOffsets extends js.Object {
  var arrow: js.UndefOr[NormalizedOffset] = js.undefined
  var popper: NormalizedOffset
}

object NormalizedOffsets {
  @scala.inline
  def apply(popper: NormalizedOffset, arrow: NormalizedOffset = null): NormalizedOffsets = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOffsets]
  }
}

