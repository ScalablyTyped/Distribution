package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var fill: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var outline: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Property] = js.undefined
  var outlineWidth: js.UndefOr[Property] = js.undefined
  var radii: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var slicePartitions: js.UndefOr[Property] = js.undefined
  var stackPartitions: js.UndefOr[Property] = js.undefined
  var subdivisions: js.UndefOr[Property] = js.undefined
}

object Anon_Fill {
  @scala.inline
  def apply(
    fill: Property = null,
    material: MaterialProperty = null,
    outline: Property = null,
    outlineColor: Property = null,
    outlineWidth: Property = null,
    radii: Property = null,
    show: Property = null,
    slicePartitions: Property = null,
    stackPartitions: Property = null,
    subdivisions: Property = null
  ): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (radii != null) __obj.updateDynamic("radii")(radii)
    if (show != null) __obj.updateDynamic("show")(show)
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions)
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions)
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions)
    __obj.asInstanceOf[Anon_Fill]
  }
}

