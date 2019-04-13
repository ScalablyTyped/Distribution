package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var fill: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.MaterialProperty] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    dimensions: cesiumLib.cesiumMod.Property = null,
    fill: cesiumLib.cesiumMod.Property = null,
    material: cesiumLib.cesiumMod.MaterialProperty = null,
    outline: cesiumLib.cesiumMod.Property = null,
    outlineColor: cesiumLib.cesiumMod.Property = null,
    outlineWidth: cesiumLib.cesiumMod.Property = null,
    show: cesiumLib.cesiumMod.Property = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

