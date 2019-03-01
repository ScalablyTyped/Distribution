package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadiusFill extends js.Object {
  var bottomRadius: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var fill: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var length: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.MaterialProperty] = js.undefined
  var numberOfVerticalLines: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var slices: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var topRadius: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
}

object Anon_BottomRadiusFill {
  @scala.inline
  def apply(
    bottomRadius: cesiumLib.cesiumMod.CesiumNs.Property = null,
    fill: cesiumLib.cesiumMod.CesiumNs.Property = null,
    length: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = null,
    numberOfVerticalLines: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outline: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineColor: cesiumLib.cesiumMod.CesiumNs.Property = null,
    outlineWidth: cesiumLib.cesiumMod.CesiumNs.Property = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null,
    slices: cesiumLib.cesiumMod.CesiumNs.Property = null,
    topRadius: cesiumLib.cesiumMod.CesiumNs.Property = null
  ): Anon_BottomRadiusFill = {
    val __obj = js.Dynamic.literal()
    if (bottomRadius != null) __obj.updateDynamic("bottomRadius")(bottomRadius)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (length != null) __obj.updateDynamic("length")(length)
    if (material != null) __obj.updateDynamic("material")(material)
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (show != null) __obj.updateDynamic("show")(show)
    if (slices != null) __obj.updateDynamic("slices")(slices)
    if (topRadius != null) __obj.updateDynamic("topRadius")(topRadius)
    __obj.asInstanceOf[Anon_BottomRadiusFill]
  }
}

