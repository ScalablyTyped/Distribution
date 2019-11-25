package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidGranularityMaximumHeights extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var maximumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  var minimumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  var positions: js.Array[Cartesian3]
}

object Anon_EllipsoidGranularityMaximumHeights {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    ellipsoid: Ellipsoid = null,
    granularity: Int | Double = null,
    maximumHeights: js.Array[Double] = null,
    minimumHeights: js.Array[Double] = null
  ): Anon_EllipsoidGranularityMaximumHeights = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (maximumHeights != null) __obj.updateDynamic("maximumHeights")(maximumHeights.asInstanceOf[js.Any])
    if (minimumHeights != null) __obj.updateDynamic("minimumHeights")(minimumHeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EllipsoidGranularityMaximumHeights]
  }
}

