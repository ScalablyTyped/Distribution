package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkGlyphPosition extends js.Object {
  var affinity: SkAffinity = js.native
  var pos: Double = js.native
}

object SkGlyphPosition {
  @scala.inline
  def apply(affinity: SkAffinity, pos: Double): SkGlyphPosition = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkGlyphPosition]
  }
  @scala.inline
  implicit class SkGlyphPositionOps[Self <: SkGlyphPosition] (val x: Self) extends AnyVal {
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
    def setAffinity(value: SkAffinity): Self = this.set("affinity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
  }
  
}

