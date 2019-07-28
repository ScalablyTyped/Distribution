package typings.cesium

import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceDisplayCondition extends js.Object {
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  var leadTime: js.UndefOr[Property | Double] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var resolution: js.UndefOr[Property | Double] = js.undefined
  var show: js.UndefOr[Property | Boolean] = js.undefined
  var trailTime: js.UndefOr[Property | Double] = js.undefined
  var width: js.UndefOr[Property | Double] = js.undefined
}

object Anon_DistanceDisplayCondition {
  @scala.inline
  def apply(
    distanceDisplayCondition: Property = null,
    leadTime: Property | Double = null,
    material: MaterialProperty = null,
    resolution: Property | Double = null,
    show: Property | Boolean = null,
    trailTime: Property | Double = null,
    width: Property | Double = null
  ): Anon_DistanceDisplayCondition = {
    val __obj = js.Dynamic.literal()
    if (distanceDisplayCondition != null) __obj.updateDynamic("distanceDisplayCondition")(distanceDisplayCondition)
    if (leadTime != null) __obj.updateDynamic("leadTime")(leadTime.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (trailTime != null) __obj.updateDynamic("trailTime")(trailTime.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DistanceDisplayCondition]
  }
}

