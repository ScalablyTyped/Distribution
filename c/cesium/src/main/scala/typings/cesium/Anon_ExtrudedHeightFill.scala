package typings.cesium

import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtrudedHeightFill extends js.Object {
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hierarchy: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty | Color] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var outlineColor: js.UndefOr[Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var perPositionHeight: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var stRotation: js.UndefOr[Property] = js.undefined
}

object Anon_ExtrudedHeightFill {
  @scala.inline
  def apply(
    extrudedHeight: Property = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    granularity: Property = null,
    height: Int | Double = null,
    hierarchy: Property = null,
    material: MaterialProperty | Color = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    outlineColor: Color = null,
    outlineWidth: Int | Double = null,
    perPositionHeight: Property = null,
    show: Property = null,
    stRotation: Property = null
  ): Anon_ExtrudedHeightFill = {
    val __obj = js.Dynamic.literal()
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (perPositionHeight != null) __obj.updateDynamic("perPositionHeight")(perPositionHeight.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtrudedHeightFill]
  }
}

