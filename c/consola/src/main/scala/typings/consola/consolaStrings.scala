package typings.consola

import typings.consola.mod.logType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consolaStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with logType
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with logType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with logType
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with logType
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log
    extends StObject
       with logType
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait ready
    extends StObject
       with logType
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait silent
    extends StObject
       with logType
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait start
    extends StObject
       with logType
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait success
    extends StObject
       with logType
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait trace
    extends StObject
       with logType
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait verbose
    extends StObject
       with logType
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with logType
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
