package typings.cesium

import typings.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsStartIncluded extends js.Object {
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[JulianDate] = js.undefined
  var stop: js.UndefOr[JulianDate] = js.undefined
}

object AnonIsStartIncluded {
  @scala.inline
  def apply(
    isStartIncluded: js.UndefOr[Boolean] = js.undefined,
    isStopIncluded: js.UndefOr[Boolean] = js.undefined,
    start: JulianDate = null,
    stop: JulianDate = null
  ): AnonIsStartIncluded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isStartIncluded)) __obj.updateDynamic("isStartIncluded")(isStartIncluded.asInstanceOf[js.Any])
    if (!js.isUndefined(isStopIncluded)) __obj.updateDynamic("isStopIncluded")(isStopIncluded.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsStartIncluded]
  }
}

