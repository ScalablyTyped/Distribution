package typings.cesium.mod

import typings.cesium.mod.Billboard.CreateImageCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillboardOptions extends js.Object {
  var alignedAxis: js.UndefOr[Cartesian3] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.undefined
  var eyeOffset: js.UndefOr[Cartesian3] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback] = js.undefined
  var imageSubRegion: js.UndefOr[BoundingRectangle] = js.undefined
  var pixelOffset: js.UndefOr[Cartesian2] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.undefined
  var position: js.UndefOr[Cartesian3] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scaleByDistance: js.UndefOr[NearFarScalar] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var sizeInMeters: js.UndefOr[Boolean] = js.undefined
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.undefined
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BillboardOptions {
  @scala.inline
  def apply(
    alignedAxis: Cartesian3 = null,
    color: Color = null,
    distanceDisplayCondition: DistanceDisplayCondition = null,
    eyeOffset: Cartesian3 = null,
    height: Int | Double = null,
    heightReference: HeightReference = null,
    horizontalOrigin: HorizontalOrigin = null,
    id: js.Any = null,
    image: HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback = null,
    imageSubRegion: BoundingRectangle = null,
    pixelOffset: Cartesian2 = null,
    pixelOffsetScaleByDistance: NearFarScalar = null,
    position: Cartesian3 = null,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    scaleByDistance: NearFarScalar = null,
    show: js.UndefOr[Boolean] = js.undefined,
    sizeInMeters: js.UndefOr[Boolean] = js.undefined,
    translucencyByDistance: NearFarScalar = null,
    verticalOrigin: VerticalOrigin = null,
    width: Int | Double = null
  ): BillboardOptions = {
    val __obj = js.Dynamic.literal()
    if (alignedAxis != null) __obj.updateDynamic("alignedAxis")(alignedAxis.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (eyeOffset != null) __obj.updateDynamic("eyeOffset")(eyeOffset.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (horizontalOrigin != null) __obj.updateDynamic("horizontalOrigin")(horizontalOrigin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageSubRegion != null) __obj.updateDynamic("imageSubRegion")(imageSubRegion.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (pixelOffsetScaleByDistance != null) __obj.updateDynamic("pixelOffsetScaleByDistance")(pixelOffsetScaleByDistance.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInMeters)) __obj.updateDynamic("sizeInMeters")(sizeInMeters.asInstanceOf[js.Any])
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance.asInstanceOf[js.Any])
    if (verticalOrigin != null) __obj.updateDynamic("verticalOrigin")(verticalOrigin.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillboardOptions]
  }
}

