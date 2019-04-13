package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var closeOnExit: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[LogLevel] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var period: js.UndefOr[java.lang.String] = js.undefined
  var reemitErrorEvents: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream | Stream] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Stream {
  @scala.inline
  def apply(
    closeOnExit: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    level: LogLevel = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    period: java.lang.String = null,
    reemitErrorEvents: js.UndefOr[scala.Boolean] = js.undefined,
    stream: nodeLib.NodeJSNs.WritableStream | Stream = null,
    `type`: java.lang.String = null
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

