package typings.consoleLogLevel

import typings.consoleLogLevel.mod.LogLevelNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleLogLevelStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevelNames
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevelNames
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevelNames
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevelNames
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait trace
    extends StObject
       with LogLevelNames
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevelNames
  inline def warn: warn = "warn".asInstanceOf[warn]
}
