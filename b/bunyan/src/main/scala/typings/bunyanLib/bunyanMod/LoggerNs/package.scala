package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LoggerNs {
  type LogLevel = LogLevelString | scala.Double
  type LogLevelString = bunyanLib.bunyanLibStrings.trace | bunyanLib.bunyanLibStrings.debug | bunyanLib.bunyanLibStrings.info | bunyanLib.bunyanLibStrings.warn | bunyanLib.bunyanLibStrings.error | bunyanLib.bunyanLibStrings.fatal
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
}
