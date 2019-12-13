package typings.cesium

import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.HeightReference
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDisableDepthTestDistance extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var disableDepthTestDistance: js.UndefOr[Property] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  var outlineColor: js.UndefOr[Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var pixelSize: js.UndefOr[Double] = js.undefined
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
}

object Anon_ColorDisableDepthTestDistance {
  @scala.inline
  def apply(
    color: Color = null,
    disableDepthTestDistance: Property = null,
    distanceDisplayCondition: Property = null,
    heightReference: HeightReference = null,
    outlineColor: Color = null,
    outlineWidth: Int | Double = null,
    pixelSize: Int | Double = null,
    scaleByDistance: Property = null,
    show: js.UndefOr[Boolean] = js.undefined,
    translucencyByDistance: Property = null
  ): Anon_ColorDisableDepthTestDistance = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (disableDepthTestDistance != null) __obj.updateDynamic("disableDepthTestDistance")(disableDepthTestDistance.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorDisableDepthTestDistance]
  }
}

