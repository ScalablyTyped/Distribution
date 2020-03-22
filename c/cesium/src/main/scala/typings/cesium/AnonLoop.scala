package typings.cesium

import typings.cesium.mod.ArcType
import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoop extends js.Object {
  var arcType: js.UndefOr[ArcType] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var positions: js.Array[Cartesian3]
  var width: js.UndefOr[Double] = js.undefined
}

object AnonLoop {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    arcType: ArcType = null,
    granularity: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonLoop = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (arcType != null) __obj.updateDynamic("arcType")(arcType.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoop]
  }
}

