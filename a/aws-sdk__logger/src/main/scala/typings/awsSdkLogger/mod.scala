package typings.awsSdkLogger

import typings.awsSdkTypes.loggerMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/logger", "Logger")
  @js.native
  open class Logger protected ()
    extends StObject
       with typings.awsSdkTypes.loggerMod.Logger {
    def this(options: LoggerOptions) = this()
    
    /* CompleteClass */
    override def debug(content: Any*): Unit = js.native
    
    /* CompleteClass */
    override def error(content: Any*): Unit = js.native
    def error(content: String): Unit = js.native
    
    /* CompleteClass */
    override def info(content: Any*): Unit = js.native
    def info(content: String): Unit = js.native
    
    def log(content: String): Unit = js.native
    
    /* private */ val logLevel: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    val options: LoggerOptions = js.native
    
    /* CompleteClass */
    override def warn(content: Any*): Unit = js.native
    def warn(content: String): Unit = js.native
    
    /* private */ var write: Any = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("@aws-sdk/logger", "Logger.logLevelPriority")
    @js.native
    val logLevelPriority: Any = js.native
  }
}
