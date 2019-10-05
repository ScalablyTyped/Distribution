package typings.bunyan.bunyanMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions
  extends /* custom */ StringDictionary[js.Any] {
  var level: js.UndefOr[LogLevel] = js.undefined
  var name: String
  var serializers: js.UndefOr[Serializers] = js.undefined
  var src: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[WritableStream] = js.undefined
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* custom */ StringDictionary[js.Any] = null,
    level: LogLevel = null,
    serializers: Serializers = null,
    src: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null,
    streams: js.Array[Stream] = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    if (!js.isUndefined(src)) __obj.updateDynamic("src")(src)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[LoggerOptions]
  }
}

