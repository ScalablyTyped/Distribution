package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.LabelStyle
import typings.cesium.mod.Property
import typings.cesium.mod.VerticalOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[Property] = js.undefined
  var backgroundPadding: js.UndefOr[Property] = js.undefined
  var disableDepthTestDistance: js.UndefOr[Property | Double] = js.undefined
  var distanceDisplayCondition: js.UndefOr[typings.cesium.mod.DistanceDisplayCondition | Property] = js.undefined
  var eyeOffset: js.UndefOr[Property] = js.undefined
  var fillColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var heightReference: js.UndefOr[Property] = js.undefined
  var horizontalOrigin: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var pixelOffset: js.UndefOr[Cartesian2 | Property] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.undefined
  var scale: js.UndefOr[Property] = js.undefined
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var showBackground: js.UndefOr[Property] = js.undefined
  var style: js.UndefOr[LabelStyle | Property] = js.undefined
  var text: js.UndefOr[Property | String] = js.undefined
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
  var verticalOrigin: js.UndefOr[VerticalOrigin | Property] = js.undefined
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: Property = null,
    backgroundPadding: Property = null,
    disableDepthTestDistance: Property | Double = null,
    distanceDisplayCondition: typings.cesium.mod.DistanceDisplayCondition | Property = null,
    eyeOffset: Property = null,
    fillColor: typings.cesium.mod.Color = null,
    font: String = null,
    heightReference: Property = null,
    horizontalOrigin: Property = null,
    outlineColor: typings.cesium.mod.Color = null,
    outlineWidth: js.UndefOr[Double] = js.undefined,
    pixelOffset: Cartesian2 | Property = null,
    pixelOffsetScaleByDistance: Property = null,
    scale: Property = null,
    scaleByDistance: Property = null,
    show: Property = null,
    showBackground: Property = null,
    style: LabelStyle | Property = null,
    text: Property | String = null,
    translucencyByDistance: Property = null,
    verticalOrigin: VerticalOrigin | Property = null
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (disableDepthTestDistance != null) __obj.updateDynamic("disableDepthTestDistance")(disableDepthTestDistance.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (eyeOffset != null) __obj.updateDynamic("eyeOffset")(eyeOffset.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (horizontalOrigin != null) __obj.updateDynamic("horizontalOrigin")(horizontalOrigin.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineWidth)) __obj.updateDynamic("outlineWidth")(outlineWidth.get.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (pixelOffsetScaleByDistance != null) __obj.updateDynamic("pixelOffsetScaleByDistance")(pixelOffsetScaleByDistance.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleByDistance != null) __obj.updateDynamic("scaleByDistance")(scaleByDistance.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (showBackground != null) __obj.updateDynamic("showBackground")(showBackground.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance.asInstanceOf[js.Any])
    if (verticalOrigin != null) __obj.updateDynamic("verticalOrigin")(verticalOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

