package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeFill extends js.Object {
  var cornerType: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var fill: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var granularity: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.MaterialProperty] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var positions: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var shape: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_CornerTypeFill {
  @scala.inline
  def apply(
    cornerType: cesiumLib.cesiumMod.CesiumNs.Property = null,
    fill: cesiumLib.cesiumMod.CesiumNs.Property = null,
    granularity: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = null,
    outline: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineWidth: cesiumLib.cesiumMod.CesiumNs.Property = null,
    positions: cesiumLib.cesiumMod.CesiumNs.Property = null,
    shape: cesiumLib.cesiumMod.CesiumNs.Property = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_CornerTypeFill = {
    val __obj = js.Dynamic.literal()
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_CornerTypeFill]
  }
}

