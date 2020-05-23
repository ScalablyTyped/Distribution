package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
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

object Material {
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
  ): Material = {
    val __obj = js.Dynamic.literal()
    if (bottomRadius != null) __obj.updateDynamic("bottomRadius")(bottomRadius.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (numberOfVerticalLines != null) __obj.updateDynamic("numberOfVerticalLines")(numberOfVerticalLines.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (topRadius != null) __obj.updateDynamic("topRadius")(topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
}

