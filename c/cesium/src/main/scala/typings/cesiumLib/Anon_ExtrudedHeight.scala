package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtrudedHeight extends js.Object {
  var extrudedHeight: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var granularity: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var height: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[
    cesiumLib.cesiumMod.CesiumNs.MaterialProperty | cesiumLib.cesiumMod.CesiumNs.Color
  ] = js.undefined
  var numberOfVerticalLines: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Color] = js.undefined
  var outlineWidth: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var semiMajorAxis: js.UndefOr[scala.Double] = js.undefined
  var semiMinorAxis: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var stRotation: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_ExtrudedHeight {
  @scala.inline
  def apply(
    extrudedHeight: cesiumLib.cesiumMod.CesiumNs.Property = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    granularity: cesiumLib.cesiumMod.CesiumNs.Property = null,
    height: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty | cesiumLib.cesiumMod.CesiumNs.Color = null,
    numberOfVerticalLines: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Color = null,
    outlineWidth: scala.Int | scala.Double = null,
    rotation: cesiumLib.cesiumMod.CesiumNs.Property = null,
    semiMajorAxis: scala.Int | scala.Double = null,
    semiMinorAxis: scala.Int | scala.Double = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null,
    stRotation: cesiumLib.cesiumMod.CesiumNs.Property = null
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

