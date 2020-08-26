package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkTextStyle extends js.Object {
  var backgroundColor: SkColor = js.native
  var color: SkColor = js.native
  var decoration: SkDecoration = js.native
  var decorationThickness: Double = js.native
  var fontFamilies: js.Array[String] = js.native
  var fontSize: Double = js.native
  var fontStyle: FontStyle = js.native
  var foregroundColor: SkColor = js.native
}

object SkTextStyle {
  @scala.inline
  def apply(
    backgroundColor: SkColor,
    color: SkColor,
    decoration: SkDecoration,
    decorationThickness: Double,
    fontFamilies: js.Array[String],
    fontSize: Double,
    fontStyle: FontStyle,
    foregroundColor: SkColor
  ): SkTextStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], decorationThickness = decorationThickness.asInstanceOf[js.Any], fontFamilies = fontFamilies.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkTextStyle]
  }
  @scala.inline
  implicit class SkTextStyleOps[Self <: SkTextStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: SkColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: SkColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoration(value: SkDecoration): Self = this.set("decoration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecorationThickness(value: Double): Self = this.set("decorationThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamiliesVarargs(value: String*): Self = this.set("fontFamilies", js.Array(value :_*))
    @scala.inline
    def setFontFamilies(value: js.Array[String]): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setForegroundColor(value: SkColor): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
  }
  
}

