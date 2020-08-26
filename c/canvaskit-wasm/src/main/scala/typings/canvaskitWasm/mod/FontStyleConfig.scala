package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<canvaskit-wasm.canvaskit-wasm.FontStyle> */
@js.native
trait FontStyleConfig extends js.Object {
  var slant: js.UndefOr[SkFontSlant] = js.native
  var weight: js.UndefOr[SkFontWeight] = js.native
  var width: js.UndefOr[SkFontWidth] = js.native
}

object FontStyleConfig {
  @scala.inline
  def apply(): FontStyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleConfig]
  }
  @scala.inline
  implicit class FontStyleConfigOps[Self <: FontStyleConfig] (val x: Self) extends AnyVal {
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
    def setSlant(value: SkFontSlant): Self = this.set("slant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlant: Self = this.set("slant", js.undefined)
    @scala.inline
    def setWeight(value: SkFontWeight): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    @scala.inline
    def setWidth(value: SkFontWidth): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

