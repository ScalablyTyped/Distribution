package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LoggerNs {
  type LogLevel = LogLevelString | scala.Double
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
}
