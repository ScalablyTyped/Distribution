package typings.consola

import typings.consola.mod.logType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consolaStrings {
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait debug extends logType
  
  @js.native
  sealed trait error extends logType
  
  @js.native
  sealed trait fatal extends logType
  
  @js.native
  sealed trait info extends logType
  
  @js.native
  sealed trait log extends logType
  
  @js.native
  sealed trait ready extends logType
  
  @js.native
  sealed trait silent extends logType
  
  @js.native
  sealed trait start extends logType
  
  @js.native
  sealed trait success extends logType
  
  @js.native
  sealed trait trace extends logType
  
  @js.native
  sealed trait verbose extends logType
  
  @js.native
  sealed trait warn extends logType
}
