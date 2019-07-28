package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.CornerType
import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CornerTypeEllipsoid extends js.Object {
  var cornerType: js.UndefOr[CornerType] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var positions: js.Array[Cartesian3]
  var width: Double
}

object Anon_CornerTypeEllipsoid {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    width: Double,
    cornerType: CornerType = null,
    ellipsoid: Ellipsoid = null,
    extrudedHeight: Int | Double = null,
    granularity: Int | Double = null,
    height: Int | Double = null
  ): Anon_CornerTypeEllipsoid = {
    val __obj = js.Dynamic.literal(positions = positions, width = width)
    if (cornerType != null) __obj.updateDynamic("cornerType")(cornerType)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CornerTypeEllipsoid]
  }
}

