package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumClock extends js.Object {
  var innerRadii: js.UndefOr[Cartesian3] = js.undefined
  var maximumClock: js.UndefOr[Double] = js.undefined
  var maximumCone: js.UndefOr[Double] = js.undefined
  var minimumClock: js.UndefOr[Double] = js.undefined
  var minimumCone: js.UndefOr[Double] = js.undefined
  var radii: js.UndefOr[Cartesian3] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
}

object MaximumClock {
  @scala.inline
  def apply(
    innerRadii: Cartesian3 = null,
    maximumClock: js.UndefOr[Double] = js.undefined,
    maximumCone: js.UndefOr[Double] = js.undefined,
    minimumClock: js.UndefOr[Double] = js.undefined,
    minimumCone: js.UndefOr[Double] = js.undefined,
    radii: Cartesian3 = null,
    slicePartitions: js.UndefOr[Double] = js.undefined,
    stackPartitions: js.UndefOr[Double] = js.undefined,
    subdivisions: js.UndefOr[Double] = js.undefined
  ): MaximumClock = {
    val __obj = js.Dynamic.literal()
    if (innerRadii != null) __obj.updateDynamic("innerRadii")(innerRadii.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumClock)) __obj.updateDynamic("maximumClock")(maximumClock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumCone)) __obj.updateDynamic("maximumCone")(maximumCone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumClock)) __obj.updateDynamic("minimumClock")(minimumClock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumCone)) __obj.updateDynamic("minimumCone")(minimumCone.get.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (!js.isUndefined(slicePartitions)) __obj.updateDynamic("slicePartitions")(slicePartitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stackPartitions)) __obj.updateDynamic("stackPartitions")(stackPartitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumClock]
  }
}

