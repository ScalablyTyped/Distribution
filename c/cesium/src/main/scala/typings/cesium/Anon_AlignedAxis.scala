package typings.cesium

import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignedAxis extends js.Object {
  var alignedAxis: js.UndefOr[Property] = js.undefined
  var color: js.UndefOr[Property] = js.undefined
  var eyeOffset: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property] = js.undefined
  var horizontalOrigin: js.UndefOr[Property] = js.undefined
  var image: js.UndefOr[Property] = js.undefined
  var imageSubRegion: js.UndefOr[Property] = js.undefined
  var pixelOffset: js.UndefOr[Property] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.undefined
  var rotation: js.UndefOr[Property] = js.undefined
  var scale: js.UndefOr[Property] = js.undefined
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
  var verticalOrigin: js.UndefOr[Property] = js.undefined
  var width: js.UndefOr[Property] = js.undefined
}

object Anon_AlignedAxis {
  @scala.inline
  def apply(
    alignedAxis: Property = null,
    color: Property = null,
    eyeOffset: Property = null,
    height: Property = null,
    horizontalOrigin: Property = null,
    image: Property = null,
    imageSubRegion: Property = null,
    pixelOffset: Property = null,
    pixelOffsetScaleByDistance: Property = null,
    rotation: Property = null,
    scale: Property = null,
    scaleByDistance: Property = null,
    show: Property = null,
    translucencyByDistance: Property = null,
    verticalOrigin: Property = null,
    width: Property = null
  ): Anon_AlignedAxis = {
    val __obj = js.Dynamic.literal()
    if (alignedAxis != null) __obj.updateDynamic("alignedAxis")(alignedAxis)
    if (color != null) __obj.updateDynamic("color")(color)
    if (eyeOffset != null) __obj.updateDynamic("eyeOffset")(eyeOffset)
    if (height != null) __obj.updateDynamic("height")(height)
    if (horizontalOrigin != null) __obj.updateDynamic("horizontalOrigin")(horizontalOrigin)
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageSubRegion != null) __obj.updateDynamic("imageSubRegion")(imageSubRegion)
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset)
    if (pixelOffsetScaleByDistance != null) __obj.updateDynamic("pixelOffsetScaleByDistance")(pixelOffsetScaleByDistance)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance)
    if (show != null) __obj.updateDynamic("show")(show)
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance)
    if (verticalOrigin != null) __obj.updateDynamic("verticalOrigin")(verticalOrigin)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_AlignedAxis]
  }
}

