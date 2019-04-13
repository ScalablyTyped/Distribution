package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorOutlineColor extends js.Object {
  var color: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_ColorOutlineColor {
  @scala.inline
  def apply(
    color: cesiumLib.cesiumMod.Property = null,
    outlineColor: cesiumLib.cesiumMod.Property = null,
    outlineWidth: cesiumLib.cesiumMod.Property = null
  ): Anon_ColorOutlineColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    __obj.asInstanceOf[Anon_ColorOutlineColor]
  }
}

