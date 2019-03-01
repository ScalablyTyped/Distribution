package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtrudedHeightFill extends js.Object {
  var extrudedHeight: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var granularity: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hierarchy: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[
    cesiumLib.cesiumMod.CesiumNs.MaterialProperty | cesiumLib.cesiumMod.CesiumNs.Color
  ] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Color] = js.undefined
  var outlineWidth: js.UndefOr[scala.Double] = js.undefined
  var perPositionHeight: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var stRotation: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_ExtrudedHeightFill {
  @scala.inline
  def apply(
    extrudedHeight: cesiumLib.cesiumMod.CesiumNs.Property = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    granularity: cesiumLib.cesiumMod.CesiumNs.Property = null,
    height: scala.Int | scala.Double = null,
    hierarchy: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty | cesiumLib.cesiumMod.CesiumNs.Color = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Color = null,
    outlineWidth: scala.Int | scala.Double = null,
    perPositionHeight: cesiumLib.cesiumMod.CesiumNs.Property = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null,
    stRotation: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_ExtrudedHeightFill = {
    val __obj = js.Dynamic.literal()
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy)
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (perPositionHeight != null) __obj.updateDynamic("perPositionHeight")(perPositionHeight)
    if (show != null) __obj.updateDynamic("show")(show)
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation)
    __obj.asInstanceOf[Anon_ExtrudedHeightFill]
  }
}

