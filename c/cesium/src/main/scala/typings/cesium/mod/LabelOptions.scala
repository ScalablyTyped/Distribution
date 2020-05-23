package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var backgroundPadding: js.UndefOr[Cartesian2] = js.undefined
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.undefined
  var eyeOffset: js.UndefOr[Cartesian3] = js.undefined
  var fillColor: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.undefined
  var outlineColor: js.UndefOr[Color] = js.undefined
  var outlineWidth: js.UndefOr[Double] = js.undefined
  var pixelOffset: js.UndefOr[Cartesian2] = js.undefined
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.undefined
  var position: js.UndefOr[Cartesian3] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var showBackground: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[LabelStyle] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.undefined
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    backgroundPadding: Cartesian2 = null,
    distanceDisplayCondition: DistanceDisplayCondition = null,
    eyeOffset: Cartesian3 = null,
    fillColor: Color = null,
    font: String = null,
    heightReference: HeightReference = null,
    horizontalOrigin: HorizontalOrigin = null,
    outlineColor: Color = null,
    outlineWidth: js.UndefOr[Double] = js.undefined,
    pixelOffset: Cartesian2 = null,
    pixelOffsetScaleByDistance: NearFarScalar = null,
    position: Cartesian3 = null,
    scale: js.UndefOr[Double] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    showBackground: js.UndefOr[Boolean] = js.undefined,
    style: LabelStyle = null,
    text: String = null,
    translucencyByDistance: NearFarScalar = null,
    verticalOrigin: VerticalOrigin = null
  ): LabelOptions = {
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
    if (!js.isUndefined(outlineWidth)) __obj.updateDynamic("outlineWidth")(outlineWidth.get.asInstanceOf[js.Any])
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset.asInstanceOf[js.Any])
    if (pixelOffsetScaleByDistance != null) __obj.updateDynamic("pixelOffsetScaleByDistance")(pixelOffsetScaleByDistance.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackground)) __obj.updateDynamic("showBackground")(showBackground.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (translucencyByDistance != null) __obj.updateDynamic("translucencyByDistance")(translucencyByDistance.asInstanceOf[js.Any])
    if (verticalOrigin != null) __obj.updateDynamic("verticalOrigin")(verticalOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

