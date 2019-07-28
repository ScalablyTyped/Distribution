package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeExtrudedHeight extends js.Object {
  var cornerType: js.UndefOr[Property] = js.undefined
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Property] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var positions: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var width: js.UndefOr[Property] = js.undefined
}

object Anon_CornerTypeExtrudedHeight {
  @scala.inline
  def apply(
    cornerType: Property = null,
    extrudedHeight: Property = null,
    fill: Property = null,
    granularity: Property = null,
    height: Property = null,
    material: MaterialProperty = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    positions: Property = null,
    show: Property = null,
    width: Property = null
  ): Anon_CornerTypeExtrudedHeight = {
    val __obj = js.Dynamic.literal()
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (height != null) __obj.updateDynamic("height")(height)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (show != null) __obj.updateDynamic("show")(show)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_CornerTypeExtrudedHeight]
  }
}

