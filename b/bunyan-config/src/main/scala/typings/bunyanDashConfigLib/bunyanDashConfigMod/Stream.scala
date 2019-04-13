package typings
package bunyanDashConfigLib.bunyanDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var closeOnExit: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[bunyanLib.bunyanMod.LogLevel] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var period: js.UndefOr[java.lang.String] = js.undefined
  var stream: js.UndefOr[java.lang.String | StreamConfiguration] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Stream {
  @scala.inline
  def apply(
    closeOnExit: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    level: bunyanLib.bunyanMod.LogLevel = null,
    path: java.lang.String = null,
    period: java.lang.String = null,
    stream: java.lang.String | StreamConfiguration = null,
    `type`: java.lang.String = null
  ): Stream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnExit)) __obj.updateDynamic("closeOnExit")(closeOnExit)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (period != null) __obj.updateDynamic("period")(period)
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Stream]
  }
}

