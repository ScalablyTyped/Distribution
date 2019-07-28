package typings.cesium

import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtrudedHeight extends js.Object {
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty | Color] = js.undefined
  var numberOfVerticalLines: js.UndefOr[Property] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var outlineColor: js.UndefOr[Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Property] = js.undefined
  var semiMajorAxis: js.UndefOr[Double] = js.undefined
  var semiMinorAxis: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var stRotation: js.UndefOr[Property] = js.undefined
}

object Anon_ExtrudedHeight {
  @scala.inline
  def apply(
    extrudedHeight: Property = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    granularity: Property = null,
    height: Property = null,
    material: MaterialProperty | Color = null,
    numberOfVerticalLines: Property = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    outlineColor: Color = null,
    outlineWidth: Int | Double = null,
    rotation: Property = null,
    semiMajorAxis: Int | Double = null,
    semiMinorAxis: Int | Double = null,
    show: Property = null,
    stRotation: Property = null
  ): Anon_ExtrudedHeight = {
    val __obj = js.Dynamic.literal()
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (height != null) __obj.updateDynamic("height")(height)
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (semiMajorAxis != null) __obj.updateDynamic("semiMajorAxis")(semiMajorAxis.asInstanceOf[js.Any])
    if (semiMinorAxis != null) __obj.updateDynamic("semiMinorAxis")(semiMinorAxis.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show)
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation)
    __obj.asInstanceOf[Anon_ExtrudedHeight]
  }
}

