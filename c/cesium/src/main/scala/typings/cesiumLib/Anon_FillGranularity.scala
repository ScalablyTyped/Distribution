package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillGranularity extends js.Object {
  var fill: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var granularity: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.MaterialProperty] = js.undefined
  var maximumHeights: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var minimumHeights: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var positions: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_FillGranularity {
  @scala.inline
  def apply(
    fill: cesiumLib.cesiumMod.CesiumNs.Property = null,
    granularity: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = null,
    maximumHeights: cesiumLib.cesiumMod.CesiumNs.Property = null,
    minimumHeights: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outline: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineWidth: cesiumLib.cesiumMod.CesiumNs.Property = null,
    positions: cesiumLib.cesiumMod.CesiumNs.Property = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_FillGranularity = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (material != null) __obj.updateDynamic("material")(material)
    if (maximumHeights != null) __obj.updateDynamic("maximumHeights")(maximumHeights)
    if (minimumHeights != null) __obj.updateDynamic("minimumHeights")(minimumHeights)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_FillGranularity]
  }
}

