package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.MaterialProperty
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FollowSurface extends js.Object {
  var followSurface: js.UndefOr[Property] = js.undefined
  var granularity: js.UndefOr[Property] = js.undefined
  var material: js.UndefOr[MaterialProperty] = js.undefined
  var positions: js.UndefOr[js.Array[Cartesian3]] = js.undefined
  var show: js.UndefOr[Property] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_FollowSurface {
  @scala.inline
  def apply(
    followSurface: Property = null,
    granularity: Property = null,
    material: MaterialProperty = null,
    positions: js.Array[Cartesian3] = null,
    show: Property = null,
    width: Int | Double = null
  ): Anon_FollowSurface = {
    val __obj = js.Dynamic.literal()
    if (followSurface != null) __obj.updateDynamic("followSurface")(followSurface.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FollowSurface]
  }
}

