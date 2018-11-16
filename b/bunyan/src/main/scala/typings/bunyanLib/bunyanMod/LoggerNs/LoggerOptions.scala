package typings
package bunyanLib.bunyanMod.LoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoggerOptions
  extends /* custom */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var level: js.UndefOr[LogLevel] = js.undefined
  var name: java.lang.String
  var serializers: js.UndefOr[Serializers] = js.undefined
  var src: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

