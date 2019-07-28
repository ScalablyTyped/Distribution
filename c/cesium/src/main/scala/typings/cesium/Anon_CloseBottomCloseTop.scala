package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseBottomCloseTop extends js.Object {
  var closeBottom: js.UndefOr[Property] = js.undefined
  var closeTop: js.UndefOr[Property] = js.undefined
  var coordinates: js.UndefOr[Property] = js.undefined
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Property] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var rotation: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var stRotation: js.UndefOr[Property] = js.undefined
}

object Anon_CloseBottomCloseTop {
  @scala.inline
  def apply(
    closeBottom: Property = null,
    closeTop: Property = null,
    coordinates: Property = null,
    extrudedHeight: Property = null,
    fill: Property = null,
    granularity: Property = null,
    height: Property = null,
    material: MaterialProperty = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    rotation: Property = null,
    show: Property = null,
    stRotation: Property = null
  ): Anon_CloseBottomCloseTop = {
    val __obj = js.Dynamic.literal()
    if (closeBottom != null) __obj.updateDynamic("closeBottom")(closeBottom)
    if (closeTop != null) __obj.updateDynamic("closeTop")(closeTop)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (height != null) __obj.updateDynamic("height")(height)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (show != null) __obj.updateDynamic("show")(show)
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation)
    __obj.asInstanceOf[Anon_CloseBottomCloseTop]
  }
}

