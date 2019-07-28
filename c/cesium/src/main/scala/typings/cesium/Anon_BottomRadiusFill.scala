package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadiusFill extends js.Object {
  var bottomRadius: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Property] = js.undefined
  var length: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var numberOfVerticalLines: js.UndefOr[Property] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var slices: js.UndefOr[Property] = js.undefined
  var topRadius: js.UndefOr[Property] = js.undefined
}

object Anon_BottomRadiusFill {
  @scala.inline
  def apply(
    bottomRadius: Property = null,
    fill: Property = null,
    length: Property = null,
    material: MaterialProperty = null,
    numberOfVerticalLines: Property = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    show: Property = null,
    slices: Property = null,
    topRadius: Property = null
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

