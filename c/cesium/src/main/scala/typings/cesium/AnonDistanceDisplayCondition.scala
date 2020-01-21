package typings.cesium

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDistanceDisplayCondition extends js.Object {
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var leadTime: js.UndefOr[Property | Double] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var resolution: js.UndefOr[Property | Double] = js.undefined
  var show: js.UndefOr[Property | Boolean] = js.undefined
  var trailTime: js.UndefOr[Property | Double] = js.undefined
  var width: js.UndefOr[Property | Double] = js.undefined
}

object AnonDistanceDisplayCondition {
  @scala.inline
  def apply(
    distanceDisplayCondition: Property = null,
    leadTime: Property | Double = null,
    material: MaterialProperty = null,
    resolution: Property | Double = null,
    show: Property | Boolean = null,
    trailTime: Property | Double = null,
    width: Property | Double = null
  ): AnonDistanceDisplayCondition = {
    val __obj = js.Dynamic.literal()
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any])
    if (leadTime != null) __obj.updateDynamic("leadTime")(leadTime.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (trailTime != null) __obj.updateDynamic("trailTime")(trailTime.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDistanceDisplayCondition]
  }
}

