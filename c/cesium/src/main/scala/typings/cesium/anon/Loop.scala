package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loop extends js.Object {
  var arcType: js.UndefOr[typings.cesium.mod.ArcType] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var positions: js.Array[Cartesian3]
  var width: js.UndefOr[Double] = js.undefined
}

object Loop {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    arcType: typings.cesium.mod.ArcType = null,
    granularity: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Loop = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (arcType != null) __obj.updateDynamic("arcType")(arcType.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
}

