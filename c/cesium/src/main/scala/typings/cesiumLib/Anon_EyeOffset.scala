package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EyeOffset extends js.Object {
  var eyeOffset: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var fillColor: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var horizontalOrigin: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.Color] = js.undefined
  var outlineWidth: js.UndefOr[scala.Double] = js.undefined
  var pixelOffset: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var scale: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var style: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var text: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var translucencyByDistance: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var verticalOrigin: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_EyeOffset {
  @scala.inline
  def apply(
    eyeOffset: cesiumLib.cesiumMod.Property = null,
    fillColor: cesiumLib.cesiumMod.Color = null,
    font: java.lang.String = null,
    horizontalOrigin: cesiumLib.cesiumMod.Property = null,
    outlineColor: cesiumLib.cesiumMod.Color = null,
    outlineWidth: scala.Int | scala.Double = null,
    pixelOffset: cesiumLib.cesiumMod.Property = null,
    pixelOffsetScaleByDistance: cesiumLib.cesiumMod.Property = null,
    scale: cesiumLib.cesiumMod.Property = null,
    show: cesiumLib.cesiumMod.Property = null,
    style: cesiumLib.cesiumMod.Property = null,
    text: cesiumLib.cesiumMod.Property = null,
    translucencyByDistance: cesiumLib.cesiumMod.Property = null,
    verticalOrigin: cesiumLib.cesiumMod.Property = null
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

