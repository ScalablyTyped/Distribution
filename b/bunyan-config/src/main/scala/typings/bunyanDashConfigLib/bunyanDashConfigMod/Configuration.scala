package typings
package bunyanDashConfigLib.bunyanDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration.
  * @interface
  */
trait Configuration extends js.Object {
  var level: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var name: java.lang.String
  var serializers: js.UndefOr[js.Object] = js.undefined
  var src: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    name: java.lang.String,
    level: java.lang.String | scala.Double = null,
    serializers: js.Object = null,
    src: js.UndefOr[scala.Boolean] = js.undefined,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    streams: js.Array[Stream] = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(name = name)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers)
    if (!js.isUndefined(src)) __obj.updateDynamic("src")(src)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[Configuration]
  }
}

