package typings.consoleDashLogDashLevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consoleDashLogDashLevelMod {
  import typings.std.Record

  type Logger = Record[LogLevelNames, js.Function1[/* repeated */ js.Any, Unit]]
  type PrefixFunction = js.Function1[/* level */ String, String]
}
