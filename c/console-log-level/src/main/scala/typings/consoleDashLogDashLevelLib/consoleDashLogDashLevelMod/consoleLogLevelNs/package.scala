package typings
package consoleDashLogDashLevelLib.consoleDashLogDashLevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consoleLogLevelNs {
  type LogLevelNames = consoleDashLogDashLevelLib.consoleDashLogDashLevelLibStrings.trace | consoleDashLogDashLevelLib.consoleDashLogDashLevelLibStrings.debug | consoleDashLogDashLevelLib.consoleDashLogDashLevelLibStrings.info | consoleDashLogDashLevelLib.consoleDashLogDashLevelLibStrings.warn | consoleDashLogDashLevelLib.consoleDashLogDashLevelLibStrings.error | consoleDashLogDashLevelLib.consoleDashLogDashLevelLibStrings.fatal
  type Logger = stdLib.Record[LogLevelNames, js.Function1[/* repeated */ js.Any, scala.Unit]]
}
