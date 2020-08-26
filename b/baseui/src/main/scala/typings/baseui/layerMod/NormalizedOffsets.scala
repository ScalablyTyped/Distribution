package typings.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedOffsets extends js.Object {
  var arrow: js.UndefOr[NormalizedOffset] = js.native
  var popper: NormalizedOffset = js.native
}

object NormalizedOffsets {
  @scala.inline
  def apply(popper: NormalizedOffset): NormalizedOffsets = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOffsets]
  }
  @scala.inline
  implicit class NormalizedOffsetsOps[Self <: NormalizedOffsets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPopper(value: NormalizedOffset): Self = this.set("popper", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrow(value: NormalizedOffset): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
  }
  
}

