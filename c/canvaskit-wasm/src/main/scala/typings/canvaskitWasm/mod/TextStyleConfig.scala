package typings.canvaskitWasm.mod

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
    backgroundColor: js.UndefOr[SkColor] = js.undefined,
    color: js.UndefOr[SkColor] = js.undefined,
    decoration: js.UndefOr[SkDecoration] = js.undefined,
    decorationThickness: js.UndefOr[Double] = js.undefined,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: FontStyleConfig = null,
    foregroundColor: js.UndefOr[SkColor] = js.undefined
  ): TextStyleConfig = {
    val __obj = js.Dynamic.literal(fontFamilies = fontFamilies.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decoration)) __obj.updateDynamic("decoration")(decoration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decorationThickness)) __obj.updateDynamic("decorationThickness")(decorationThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(foregroundColor)) __obj.updateDynamic("foregroundColor")(foregroundColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleConfig]
  }
}

