package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFontSizeColors extends js.Object {
  var baseFontSize: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[js.Object] = js.native
  var spacing: js.UndefOr[js.Object] = js.native
}

object BaseFontSizeColors {
  @scala.inline
  def apply(): BaseFontSizeColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFontSizeColors]
  }
  @scala.inline
  implicit class BaseFontSizeColorsOps[Self <: BaseFontSizeColors] (val x: Self) extends AnyVal {
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
    def setBaseFontSize(value: Double): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseFontSize: Self = this.set("baseFontSize", js.undefined)
    @scala.inline
    def setColors(value: js.Object): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setSpacing(value: js.Object): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
  
}

