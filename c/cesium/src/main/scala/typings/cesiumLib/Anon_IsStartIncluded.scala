package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsStartIncluded extends js.Object {
  var isStartIncluded: js.UndefOr[scala.Boolean] = js.undefined
  var isStopIncluded: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[cesiumLib.cesiumMod.JulianDate] = js.undefined
  var stop: js.UndefOr[cesiumLib.cesiumMod.JulianDate] = js.undefined
}

object Anon_IsStartIncluded {
  @scala.inline
  def apply(
    isStartIncluded: js.UndefOr[scala.Boolean] = js.undefined,
    isStopIncluded: js.UndefOr[scala.Boolean] = js.undefined,
    start: cesiumLib.cesiumMod.JulianDate = null,
    stop: cesiumLib.cesiumMod.JulianDate = null
  ): Anon_IsStartIncluded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isStartIncluded)) __obj.updateDynamic("isStartIncluded")(isStartIncluded)
    if (!js.isUndefined(isStopIncluded)) __obj.updateDynamic("isStopIncluded")(isStopIncluded)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Anon_IsStartIncluded]
  }
}

