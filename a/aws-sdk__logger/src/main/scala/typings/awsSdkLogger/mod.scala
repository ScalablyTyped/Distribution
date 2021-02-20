package typings.awsSdkLogger

import typings.awsSdkTypes.loggerMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/logger", "Logger")
  @js.native
  class Logger protected ()
    extends typings.awsSdkTypes.loggerMod.Logger {
    def this(options: LoggerOptions) = this()
    
    def error(content: String): Unit = js.native
    
    def info(content: String): Unit = js.native
    
    def log(content: String): Unit = js.native
    
    val logLevel: js.Any = js.native
    
    val logger: js.Any = js.native
    
    val options: LoggerOptions = js.native
    
    def warn(content: String): Unit = js.native
    
    var write: js.Any = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("@aws-sdk/logger", "Logger.logLevelPriority")
    @js.native
    val logLevelPriority: js.Any = js.native
  }
}
