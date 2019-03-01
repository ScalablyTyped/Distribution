package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FollowSurface extends js.Object {
  var followSurface: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var granularity: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.MaterialProperty] = js.undefined
  var positions: js.UndefOr[js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Property] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FollowSurface {
  @scala.inline
  def apply(
    followSurface: cesiumLib.cesiumMod.CesiumNs.Property = null,
    granularity: cesiumLib.cesiumMod.CesiumNs.Property = null,
    material: cesiumLib.cesiumMod.CesiumNs.MaterialProperty = null,
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = null,
    show: cesiumLib.cesiumMod.CesiumNs.Property = null,
    width: scala.Int | scala.Double = null
  ): Anon_FollowSurface = {
    val __obj = js.Dynamic.literal()
    if (followSurface != null) __obj.updateDynamic("followSurface")(followSurface)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (material != null) __obj.updateDynamic("material")(material)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (show != null) __obj.updateDynamic("show")(show)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FollowSurface]
  }
}

