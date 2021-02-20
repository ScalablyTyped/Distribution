package typings.consoleLogLevel

import typings.consoleLogLevel.mod.LogLevelNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleLogLevelStrings {
  
  @js.native
  sealed trait debug extends LogLevelNames
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error extends LogLevelNames
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal extends LogLevelNames
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info extends LogLevelNames
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait trace extends LogLevelNames
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn extends LogLevelNames
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
