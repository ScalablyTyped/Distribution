package typings.cesium

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignedAxis extends js.Object {
  var alignedAxis: js.UndefOr[Property] = js.undefined
  var color: js.UndefOr[Property] = js.undefined
  var eyeOffset: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property] = js.undefined
  var heightReference: js.UndefOr[Property] = js.undefined
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

object AnonAlignedAxis {
  @scala.inline
  def apply(
    alignedAxis: Property = null,
    color: Property = null,
    eyeOffset: Property = null,
    height: Property = null,
    heightReference: Property = null,
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
  ): AnonAlignedAxis = {
    val __obj = js.Dynamic.literal()
    if (alignedAxis != null) __obj.updateDynamic("alignedAxis")(alignedAxis.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (eyeOffset != null) __obj.updateDynamic("eyeOffset")(eyeOffset.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (horizontalOrigin != null) __obj.updateDynamic("horizontalOrigin")(horizontalOrigin.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageSubRegion != null) __obj.updateDynamic("imageSubRegion")(imageSubRegion.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (pixelOffsetScaleByDistance != null) __obj.updateDynamic("pixelOffsetScaleByDistance")(pixelOffsetScaleByDistance.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance.asInstanceOf[js.Any])
    if (verticalOrigin != null) __obj.updateDynamic("verticalOrigin")(verticalOrigin.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignedAxis]
  }
}

