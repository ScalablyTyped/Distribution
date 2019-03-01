package typings
package bunyanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bunyanLibStrings {
  @js.native
  sealed trait debug
    extends bunyanLib.bunyanMod.LoggerNs.LogLevelString
  
  @js.native
  sealed trait error
    extends bunyanLib.bunyanMod.LoggerNs.LogLevelString
  
  @js.native
  sealed trait fatal
    extends bunyanLib.bunyanMod.LoggerNs.LogLevelString
  
  @js.native
  sealed trait info
    extends bunyanLib.bunyanMod.LoggerNs.LogLevelString
  
  @js.native
  sealed trait trace
    extends bunyanLib.bunyanMod.LoggerNs.LogLevelString
  
  @js.native
  sealed trait warn
    extends bunyanLib.bunyanMod.LoggerNs.LogLevelString
  
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

