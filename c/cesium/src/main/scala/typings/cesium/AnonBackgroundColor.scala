package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[Property] = js.undefined
  var backgroundPadding: js.UndefOr[Property] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var eyeOffset: js.UndefOr[Property] = js.undefined
  var fillColor: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var heightReference: js.UndefOr[Property] = js.undefined
  var horizontalOrigin: js.UndefOr[Property] = js.undefined
  var outlineColor: js.UndefOr[Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var pixelOffset: js.UndefOr[Property] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.undefined
  var scale: js.UndefOr[Property] = js.undefined
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var showBackground: js.UndefOr[Property] = js.undefined
  var style: js.UndefOr[Property] = js.undefined
  var text: js.UndefOr[Property] = js.undefined
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
  var verticalOrigin: js.UndefOr[Property] = js.undefined
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: Property = null,
    backgroundPadding: Property = null,
    distanceDisplayCondition: Property = null,
    eyeOffset: Property = null,
    fillColor: Color = null,
    font: String = null,
    heightReference: Property = null,
    horizontalOrigin: Property = null,
    outlineColor: Color = null,
    outlineWidth: Int | Double = null,
    pixelOffset: Property = null,
    pixelOffsetScaleByDistance: Property = null,
    scale: Property = null,
    scaleByDistance: Property = null,
    show: Property = null,
    showBackground: Property = null,
    style: Property = null,
    text: Property = null,
    translucencyByDistance: Property = null,
    verticalOrigin: Property = null
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (eyeOffset != null) __obj.updateDynamic("eyeOffset")(eyeOffset.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (horizontalOrigin != null) __obj.updateDynamic("horizontalOrigin")(horizontalOrigin.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

