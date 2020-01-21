package typings.cesium

import typings.cesium.mod.ArcType
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClassificationType
import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import typings.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArcTypeClampToGround extends js.Object {
  var arcType: js.UndefOr[Property | ArcType] = js.undefined
  var clampToGround: js.UndefOr[Property | Boolean] = js.undefined
  var classificationType: js.UndefOr[Property | ClassificationType] = js.undefined
  var depthFailMaterial: js.UndefOr[MaterialProperty] = js.undefined
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var positions: js.UndefOr[Property | js.Array[Cartesian3]] = js.undefined
  var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
  var show: js.UndefOr[Property | Boolean] = js.undefined
  var width: js.UndefOr[Property | Double] = js.undefined
  var zIndex: js.UndefOr[Property | Double] = js.undefined
}

object AnonArcTypeClampToGround {
  @scala.inline
  def apply(
    arcType: Property | ArcType = null,
    clampToGround: Property | Boolean = null,
    classificationType: Property | ClassificationType = null,
    depthFailMaterial: MaterialProperty = null,
    distanceDisplayCondition: Property = null,
    granularity: Property = null,
    material: MaterialProperty = null,
    positions: Property | js.Array[Cartesian3] = null,
    shadows: Property | ShadowMode = null,
    show: Property | Boolean = null,
    width: Property | Double = null,
    zIndex: Property | Double = null
  ): AnonArcTypeClampToGround = {
    val __obj = js.Dynamic.literal()
    if (arcType != null) __obj.updateDynamic("arcType")(arcType.asInstanceOf[js.Any])
    if (clampToGround != null) __obj.updateDynamic("clampToGround")(clampToGround.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (depthFailMaterial != null) __obj.updateDynamic("depthFailMaterial")(depthFailMaterial.asInstanceOf[js.Any])
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArcTypeClampToGround]
  }
}

