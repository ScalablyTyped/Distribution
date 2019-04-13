package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadiusFill extends js.Object {
  var bottomRadius: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var fill: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var length: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.MaterialProperty] = js.undefined
  var numberOfVerticalLines: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var slices: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var topRadius: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_BottomRadiusFill {
  @scala.inline
  def apply(
    bottomRadius: cesiumLib.cesiumMod.Property = null,
    fill: cesiumLib.cesiumMod.Property = null,
    length: cesiumLib.cesiumMod.Property = null,
    material: cesiumLib.cesiumMod.MaterialProperty = null,
    numberOfVerticalLines: cesiumLib.cesiumMod.Property = null,
    outline: cesiumLib.cesiumMod.Property = null,
    outlineColor: cesiumLib.cesiumMod.Property = null,
    outlineWidth: cesiumLib.cesiumMod.Property = null,
    show: cesiumLib.cesiumMod.Property = null,
    slices: cesiumLib.cesiumMod.Property = null,
    topRadius: cesiumLib.cesiumMod.Property = null
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

