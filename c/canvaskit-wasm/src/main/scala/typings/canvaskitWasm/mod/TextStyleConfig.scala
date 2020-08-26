package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyleConfig extends js.Object {
  var backgroundColor: js.UndefOr[SkColor] = js.native
  var color: js.UndefOr[SkColor] = js.native
  var decoration: js.UndefOr[SkDecoration] = js.native
  var decorationThickness: js.UndefOr[Double] = js.native
  var fontFamilies: js.Array[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[FontStyleConfig] = js.native
  var foregroundColor: js.UndefOr[SkColor] = js.native
}

object TextStyleConfig {
  @scala.inline
  def apply(fontFamilies: js.Array[String]): TextStyleConfig = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleConfig]
  }
  @scala.inline
  implicit class TextStyleConfigOps[Self <: TextStyleConfig] (val x: Self) extends AnyVal {
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
    def setFontFamiliesVarargs(value: String*): Self = this.set("fontFamilies", js.Array(value :_*))
    @scala.inline
    def setFontFamilies(value: js.Array[String]): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: SkColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColor(value: SkColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDecoration(value: SkDecoration): Self = this.set("decoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    @scala.inline
    def setDecorationThickness(value: Double): Self = this.set("decorationThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorationThickness: Self = this.set("decorationThickness", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: FontStyleConfig): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setForegroundColor(value: SkColor): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
  }
  
}

