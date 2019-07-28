package typings.cesium

import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EyeOffset extends js.Object {
  var eyeOffset: js.UndefOr[Property] = js.undefined
  var fillColor: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var horizontalOrigin: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var pixelOffset: js.UndefOr[Property] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.undefined
  var scale: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var style: js.UndefOr[Property] = js.undefined
  var text: js.UndefOr[Property] = js.undefined
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
  var verticalOrigin: js.UndefOr[Property] = js.undefined
}

object Anon_EyeOffset {
  @scala.inline
  def apply(
    eyeOffset: Property = null,
    fillColor: Color = null,
    font: String = null,
    horizontalOrigin: Property = null,
    outlineColor: Color = null,
    outlineWidth: Int | Double = null,
    pixelOffset: Property = null,
    pixelOffsetScaleByDistance: Property = null,
    scale: Property = null,
    show: Property = null,
    style: Property = null,
    text: Property = null,
    translucencyByDistance: Property = null,
    verticalOrigin: Property = null
  ): Anon_EyeOffset = {
    val __obj = js.Dynamic.literal()
    if (eyeOffset != null) __obj.updateDynamic("eyeOffset")(eyeOffset)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalOrigin != null) __obj.updateDynamic("horizontalOrigin")(horizontalOrigin)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset)
    if (pixelOffsetScaleByDistance != null) __obj.updateDynamic("pixelOffsetScaleByDistance")(pixelOffsetScaleByDistance)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (show != null) __obj.updateDynamic("show")(show)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance)
    if (verticalOrigin != null) __obj.updateDynamic("verticalOrigin")(verticalOrigin)
    __obj.asInstanceOf[Anon_EyeOffset]
  }
}

