package typings.bunyan.bunyanMod

import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var closeOnExit: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[LogLevel] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var period: js.UndefOr[String] = js.undefined
  var reemitErrorEvents: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[WritableStream | Stream] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Stream {
  @scala.inline
  def apply(
    closeOnExit: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    level: LogLevel = null,
    name: String = null,
    path: String = null,
    period: String = null,
    reemitErrorEvents: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream | Stream = null,
    `type`: String = null
  ): Stream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnExit)) __obj.updateDynamic("closeOnExit")(closeOnExit)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (period != null) __obj.updateDynamic("period")(period)
    if (!js.isUndefined(reemitErrorEvents)) __obj.updateDynamic("reemitErrorEvents")(reemitErrorEvents)
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Stream]
  }
}

