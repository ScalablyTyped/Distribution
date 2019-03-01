package typings
package bunyanLib.bunyanMod.LoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions
  extends /* custom */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var level: js.UndefOr[LogLevel] = js.undefined
  var name: java.lang.String
  var serializers: js.UndefOr[Serializers] = js.undefined
  var src: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    StringDictionary: /* custom */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    level: LogLevel = null,
    serializers: Serializers = null,
    src: js.UndefOr[scala.Boolean] = js.undefined,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    streams: js.Array[Stream] = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    if (!js.isUndefined(src)) __obj.updateDynamic("src")(src)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[LoggerOptions]
  }
}

