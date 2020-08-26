package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPaletteSpecimenProps extends js.Object {
  var colors: js.Array[ColorSpecimenProps] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
}

object ColorPaletteSpecimenProps {
  @scala.inline
  def apply(colors: js.Array[ColorSpecimenProps]): ColorPaletteSpecimenProps = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaletteSpecimenProps]
  }
  @scala.inline
  implicit class ColorPaletteSpecimenPropsOps[Self <: ColorPaletteSpecimenProps] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: ColorSpecimenProps*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[ColorSpecimenProps]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
  }
  
}

