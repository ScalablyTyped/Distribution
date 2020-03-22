package typings.cesium

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShow extends js.Object {
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

object AnonShow {
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
  ): AnonShow = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (maximumHeights != null) __obj.updateDynamic("maximumHeights")(maximumHeights.asInstanceOf[js.Any])
    if (minimumHeights != null) __obj.updateDynamic("minimumHeights")(minimumHeights.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShow]
  }
}

