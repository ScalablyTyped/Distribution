package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var animation: js.UndefOr[Animation] = js.undefined
  var borders: js.UndefOr[Borders] = js.undefined
  var breakpoints: js.UndefOr[Breakpoints] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var lighting: js.UndefOr[Lighting] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sizing: js.UndefOr[Sizing] = js.undefined
  // Remove in next major version
  var tooltip: js.UndefOr[Anon_BackgroundColor] = js.undefined
  var typography: js.UndefOr[Typography] = js.undefined
  var zIndex: js.UndefOr[ZIndex] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    animation: Animation = null,
    borders: Borders = null,
    breakpoints: Breakpoints = null,
    colors: Colors = null,
    lighting: Lighting = null,
    name: java.lang.String = null,
    sizing: Sizing = null,
    tooltip: Anon_BackgroundColor = null,
    typography: Typography = null,
    zIndex: ZIndex = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (lighting != null) __obj.updateDynamic("lighting")(lighting)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sizing != null) __obj.updateDynamic("sizing")(sizing)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (typography != null) __obj.updateDynamic("typography")(typography)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex)
    __obj.asInstanceOf[Theme]
  }
}

