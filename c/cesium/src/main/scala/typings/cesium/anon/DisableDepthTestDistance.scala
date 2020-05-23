package typings.cesium.anon

import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableDepthTestDistance extends js.Object {
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var disableDepthTestDistance: js.UndefOr[Property] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var pixelSize: js.UndefOr[Double] = js.undefined
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
}

object DisableDepthTestDistance {
  @scala.inline
  def apply(
    color: typings.cesium.mod.Color = null,
    disableDepthTestDistance: Property = null,
    distanceDisplayCondition: Property = null,
    heightReference: HeightReference = null,
    outlineColor: typings.cesium.mod.Color = null,
    outlineWidth: js.UndefOr[Double] = js.undefined,
    pixelSize: js.UndefOr[Double] = js.undefined,
    scaleByDistance: Property = null,
    show: js.UndefOr[Boolean] = js.undefined,
    translucencyByDistance: Property = null
  ): DisableDepthTestDistance = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (disableDepthTestDistance != null) __obj.updateDynamic("disableDepthTestDistance")(disableDepthTestDistance.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineWidth)) __obj.updateDynamic("outlineWidth")(outlineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelSize)) __obj.updateDynamic("pixelSize")(pixelSize.get.asInstanceOf[js.Any])
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDepthTestDistance]
  }
}

