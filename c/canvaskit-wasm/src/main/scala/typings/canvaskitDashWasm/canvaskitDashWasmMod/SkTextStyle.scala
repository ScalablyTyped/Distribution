package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkTextStyle extends js.Object {
  var backgroundColor: SkColor
  var color: SkColor
  var decoration: SkDecoration
  var decorationThickness: Double
  var fontFamilies: js.Array[String]
  var fontSize: Double
  var fontStyle: FontStyle
  var foregroundColor: SkColor
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
}

