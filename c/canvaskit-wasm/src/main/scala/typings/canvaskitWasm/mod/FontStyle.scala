package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontStyle extends js.Object {
  var slant: SkFontSlant = js.native
  var weight: SkFontWeight = js.native
  var width: SkFontWidth = js.native
}

object FontStyle {
  @scala.inline
  def apply(slant: SkFontSlant, weight: SkFontWeight, width: SkFontWidth): FontStyle = {
    val __obj = js.Dynamic.literal(slant = slant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  @scala.inline
  implicit class FontStyleOps[Self <: FontStyle] (val x: Self) extends AnyVal {
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
    def setWeight(value: SkFontWeight): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: SkFontWidth): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

