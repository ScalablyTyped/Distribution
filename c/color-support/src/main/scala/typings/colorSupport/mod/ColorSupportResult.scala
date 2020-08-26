package typings.colorSupport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSupportResult extends js.Object {
  var has16m: Boolean = js.native
  var has256: Boolean = js.native
  var hasBasic: Boolean = js.native
  var level: ColorSupportLevel = js.native
}

object ColorSupportResult {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: ColorSupportLevel): ColorSupportResult = {
    val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSupportResult]
  }
  @scala.inline
  implicit class ColorSupportResultOps[Self <: ColorSupportResult] (val x: Self) extends AnyVal {
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
    def setHas16m(value: Boolean): Self = this.set("has16m", value.asInstanceOf[js.Any])
    @scala.inline
    def setHas256(value: Boolean): Self = this.set("has256", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBasic(value: Boolean): Self = this.set("hasBasic", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: ColorSupportLevel): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

