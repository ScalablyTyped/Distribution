package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceDisplayCondition extends js.Object {
  var distanceDisplayCondition: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var leadTime: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property | scala.Double] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.MaterialProperty] = js.undefined
  var resolution: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property | scala.Double] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property | scala.Boolean] = js.undefined
  var trailTime: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property | scala.Double] = js.undefined
  var width: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property | scala.Double] = js.undefined
}

object Anon_DistanceDisplayCondition {
  @scala.inline
  def apply(
    distanceDisplayCondition: cesiumLib.cesiumMod.CesiumNs.Property = null,
    leadTime: cesiumLib.cesiumMod.CesiumNs.Property | scala.Double = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = null,
    resolution: cesiumLib.cesiumMod.CesiumNs.Property | scala.Double = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property | scala.Boolean = null,
    trailTime: cesiumLib.cesiumMod.CesiumNs.Property | scala.Double = null,
    width: cesiumLib.cesiumMod.CesiumNs.Property | scala.Double = null
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

