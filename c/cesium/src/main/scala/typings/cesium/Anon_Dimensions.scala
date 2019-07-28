package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    dimensions: Property = null,
    fill: Property = null,
    material: MaterialProperty = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    show: Property = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

