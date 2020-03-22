package typings.cesium

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximumClock extends js.Object {
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

object AnonMaximumClock {
  @scala.inline
  def apply(
    innerRadii: Cartesian3 = null,
    maximumClock: Int | Double = null,
    maximumCone: Int | Double = null,
    minimumClock: Int | Double = null,
    minimumCone: Int | Double = null,
    radii: Cartesian3 = null,
    slicePartitions: Int | Double = null,
    stackPartitions: Int | Double = null,
    subdivisions: Int | Double = null
  ): AnonMaximumClock = {
    val __obj = js.Dynamic.literal()
    if (innerRadii != null) __obj.updateDynamic("innerRadii")(innerRadii.asInstanceOf[js.Any])
    if (maximumClock != null) __obj.updateDynamic("maximumClock")(maximumClock.asInstanceOf[js.Any])
    if (maximumCone != null) __obj.updateDynamic("maximumCone")(maximumCone.asInstanceOf[js.Any])
    if (minimumClock != null) __obj.updateDynamic("minimumClock")(minimumClock.asInstanceOf[js.Any])
    if (minimumCone != null) __obj.updateDynamic("minimumCone")(minimumCone.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions.asInstanceOf[js.Any])
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaximumClock]
  }
}

