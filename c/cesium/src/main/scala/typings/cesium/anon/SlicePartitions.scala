package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlicePartitions extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var slicePartitions: js.UndefOr[Double] = js.undefined
  var stackPartitions: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
}

object SlicePartitions {
  @scala.inline
  def apply(
    radius: js.UndefOr[Double] = js.undefined,
    slicePartitions: js.UndefOr[Double] = js.undefined,
    stackPartitions: js.UndefOr[Double] = js.undefined,
    subdivisions: js.UndefOr[Double] = js.undefined
  ): SlicePartitions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slicePartitions)) __obj.updateDynamic("slicePartitions")(slicePartitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stackPartitions)) __obj.updateDynamic("stackPartitions")(stackPartitions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicePartitions]
  }
}

