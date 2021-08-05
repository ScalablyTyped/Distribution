package typings.bunyan

import typings.bunyan.mod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bunyanStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevelString
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevelString
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevelString
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevelString
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait trace
    extends StObject
       with LogLevelString
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevelString
  inline def warn: warn = "warn".asInstanceOf[warn]
}
