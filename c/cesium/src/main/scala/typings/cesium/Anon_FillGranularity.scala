package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillGranularity extends js.Object {
  var fill: js.UndefOr[Property] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var maximumHeights: js.UndefOr[Property] = js.undefined
  var minimumHeights: js.UndefOr[Property] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var positions: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
}

object Anon_FillGranularity {
  @scala.inline
  def apply(
    fill: Property = null,
    granularity: Property = null,
    material: MaterialProperty = null,
    maximumHeights: Property = null,
    minimumHeights: Property = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    positions: Property = null,
    show: Property = null
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

