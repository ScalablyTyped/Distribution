package typings.azureLogger

import typings.azureLogger.mod.AzureLogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureLoggerStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with AzureLogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with AzureLogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait verbose
    extends StObject
       with AzureLogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warning
    extends StObject
       with AzureLogLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
}
