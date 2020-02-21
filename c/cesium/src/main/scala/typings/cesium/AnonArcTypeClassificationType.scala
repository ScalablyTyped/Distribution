package typings.cesium

import typings.cesium.mod.ArcType
import typings.cesium.mod.ClassificationType
import typings.cesium.mod.Color
import typings.cesium.mod.ConstantProperty
import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArcTypeClassificationType extends js.Object {
  var arcType: js.UndefOr[Property | ArcType] = js.undefined
  var classificationType: js.UndefOr[Property | ClassificationType] = js.undefined
  var closeBottom: js.UndefOr[Boolean] = js.undefined
  var closeTop: js.UndefOr[Boolean] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var extrudedHeight: js.UndefOr[Property] = js.undefined
  var extrudedHeightReference: js.UndefOr[Property] = js.undefined
  var fill: js.UndefOr[Property | Boolean] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var height: js.UndefOr[Property | Double] = js.undefined
  var heightReference: js.UndefOr[Property] = js.undefined
  var hierarchy: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty | Color] = js.undefined
  var outline: js.UndefOr[Property | Boolean] = js.undefined
  var outlineColor: js.UndefOr[Property | Color] = js.undefined
  var outlineWidth: js.UndefOr[Property | Double] = js.undefined
  var perPositionHeight: js.UndefOr[Property] = js.undefined
  var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
  var show: js.UndefOr[Property | Boolean] = js.undefined
  var stRotation: js.UndefOr[Property] = js.undefined
  var zIndex: js.UndefOr[ConstantProperty | Double] = js.undefined
}

object AnonArcTypeClassificationType {
  @scala.inline
  def apply(
    arcType: Property | ArcType = null,
    classificationType: Property | ClassificationType = null,
    closeBottom: js.UndefOr[Boolean] = js.undefined,
    closeTop: js.UndefOr[Boolean] = js.undefined,
    distanceDisplayCondition: Property = null,
    extrudedHeight: Property = null,
    extrudedHeightReference: Property = null,
    fill: Property | Boolean = null,
    granularity: Property = null,
    height: Property | Double = null,
    heightReference: Property = null,
    hierarchy: Property = null,
    material: MaterialProperty | Color = null,
    outline: Property | Boolean = null,
    outlineColor: Property | Color = null,
    outlineWidth: Property | Double = null,
    perPositionHeight: Property = null,
    shadows: Property | ShadowMode = null,
    show: Property | Boolean = null,
    stRotation: Property = null,
    zIndex: ConstantProperty | Double = null
  ): AnonArcTypeClassificationType = {
    val __obj = js.Dynamic.literal()
    if (arcType != null) __obj.updateDynamic("arcType")(arcType.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (!js.isUndefined(closeBottom)) __obj.updateDynamic("closeBottom")(closeBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(closeTop)) __obj.updateDynamic("closeTop")(closeTop.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (extrudedHeightReference != null) __obj.updateDynamic("extrudedHeightReference")(extrudedHeightReference.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightReference != null) __obj.updateDynamic("heightReference")(heightReference.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (perPositionHeight != null) __obj.updateDynamic("perPositionHeight")(perPositionHeight.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArcTypeClassificationType]
  }
}

