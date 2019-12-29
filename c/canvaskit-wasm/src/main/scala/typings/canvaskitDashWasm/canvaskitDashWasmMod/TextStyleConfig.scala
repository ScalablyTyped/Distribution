package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleConfig extends js.Object {
  var backgroundColor: js.UndefOr[SkColor] = js.undefined
  var color: js.UndefOr[SkColor] = js.undefined
  var decoration: js.UndefOr[SkDecoration] = js.undefined
  var decorationThickness: js.UndefOr[Double] = js.undefined
  var fontFamilies: js.Array[String]
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[FontStyleConfig] = js.undefined
  var foregroundColor: js.UndefOr[SkColor] = js.undefined
}

object TextStyleConfig {
  @scala.inline
  def apply(
    fontFamilies: js.Array[String],
    backgroundColor: Int | Double = null,
    color: Int | Double = null,
    decoration: Int | Double = null,
    decorationThickness: Int | Double = null,
    fontSize: Int | Double = null,
    fontStyle: FontStyleConfig = null,
    foregroundColor: Int | Double = null
  ): TextStyleConfig = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (decoration != null) __obj.updateDynamic("decoration")(decoration.asInstanceOf[js.Any])
    if (decorationThickness != null) __obj.updateDynamic("decorationThickness")(decorationThickness.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleConfig]
  }
}

