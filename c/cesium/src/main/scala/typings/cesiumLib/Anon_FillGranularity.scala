package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillGranularity extends js.Object {
  var fill: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var granularity: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.MaterialProperty] = js.undefined
  var maximumHeights: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var minimumHeights: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var positions: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_FillGranularity {
  @scala.inline
  def apply(
    fill: cesiumLib.cesiumMod.Property = null,
    granularity: cesiumLib.cesiumMod.Property = null,
    material: cesiumLib.cesiumMod.MaterialProperty = null,
    maximumHeights: cesiumLib.cesiumMod.Property = null,
    minimumHeights: cesiumLib.cesiumMod.Property = null,
    outline: cesiumLib.cesiumMod.Property = null,
    outlineColor: cesiumLib.cesiumMod.Property = null,
    outlineWidth: cesiumLib.cesiumMod.Property = null,
    positions: cesiumLib.cesiumMod.Property = null,
    show: cesiumLib.cesiumMod.Property = null
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

