package typings.cesium.anon

import typings.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsStopIncluded extends js.Object {
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[JulianDate] = js.undefined
  var stop: js.UndefOr[JulianDate] = js.undefined
}

object IsStopIncluded {
  @scala.inline
  def apply(
    isStartIncluded: js.UndefOr[Boolean] = js.undefined,
    isStopIncluded: js.UndefOr[Boolean] = js.undefined,
    start: JulianDate = null,
    stop: JulianDate = null
  ): IsStopIncluded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isStartIncluded)) __obj.updateDynamic("isStartIncluded")(isStartIncluded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStopIncluded)) __obj.updateDynamic("isStopIncluded")(isStopIncluded.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStopIncluded]
  }
}

