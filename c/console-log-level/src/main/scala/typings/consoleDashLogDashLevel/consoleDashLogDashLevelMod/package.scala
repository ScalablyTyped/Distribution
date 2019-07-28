package typings.consoleDashLogDashLevel

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consoleDashLogDashLevelMod {
  type Logger = Record[LogLevelNames, js.Function1[/* repeated */ js.Any, Unit]]
  type PrefixFunction = js.Function1[/* level */ String, String]
}
