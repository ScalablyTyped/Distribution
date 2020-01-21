package typings.bunyanConfig.mod

import typings.bunyan.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var closeOnExit: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[LogLevel] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var period: js.UndefOr[String] = js.undefined
  var stream: js.UndefOr[String | StreamConfiguration] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Stream {
  @scala.inline
  def apply(
    closeOnExit: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    level: LogLevel = null,
    path: String = null,
    period: String = null,
    stream: String | StreamConfiguration = null,
    `type`: String = null
  ): Stream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnExit)) __obj.updateDynamic("closeOnExit")(closeOnExit.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

