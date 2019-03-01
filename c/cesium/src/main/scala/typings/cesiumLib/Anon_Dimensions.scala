package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var fill: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.MaterialProperty] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    dimensions: cesiumLib.cesiumMod.CesiumNs.Property = null,
    fill: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = null,
    outline: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineWidth: cesiumLib.cesiumMod.CesiumNs.Property = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null
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

