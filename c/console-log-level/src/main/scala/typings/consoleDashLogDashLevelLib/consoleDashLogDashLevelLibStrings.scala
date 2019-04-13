package typings
package consoleDashLogDashLevelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object consoleDashLogDashLevelLibStrings {
  @js.native
  sealed trait debug
    extends consoleDashLogDashLevelLib.consoleDashLogDashLevelMod.LogLevelNames
  
  @js.native
  sealed trait error
    extends consoleDashLogDashLevelLib.consoleDashLogDashLevelMod.LogLevelNames
  
  @js.native
  sealed trait fatal
    extends consoleDashLogDashLevelLib.consoleDashLogDashLevelMod.LogLevelNames
  
  @js.native
  sealed trait info
    extends consoleDashLogDashLevelLib.consoleDashLogDashLevelMod.LogLevelNames
  
  @js.native
  sealed trait trace
    extends consoleDashLogDashLevelLib.consoleDashLogDashLevelMod.LogLevelNames
  
  @js.native
  sealed trait warn
    extends consoleDashLogDashLevelLib.consoleDashLogDashLevelMod.LogLevelNames
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

