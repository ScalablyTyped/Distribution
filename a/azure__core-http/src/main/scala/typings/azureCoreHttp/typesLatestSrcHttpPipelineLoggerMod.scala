package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpPipelineLogLevelMod.HttpPipelineLogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcHttpPipelineLoggerMod {
  
  @JSImport("@azure/core-http/types/latest/src/httpPipelineLogger", "ConsoleHttpPipelineLogger")
  @js.native
  open class ConsoleHttpPipelineLogger protected ()
    extends StObject
       with HttpPipelineLogger {
    /**
      * Create a new ConsoleHttpPipelineLogger.
      * @param minimumLogLevel - The log level threshold for what logs will be logged.
      */
    def this(minimumLogLevel: HttpPipelineLogLevel) = this()
    
    /**
      * Log the provided message.
      * @param logLevel - The HttpLogDetailLevel associated with this message.
      * @param message - The message to log.
      */
    /* CompleteClass */
    override def log(logLevel: HttpPipelineLogLevel, message: String): Unit = js.native
    
    /**
      * The log level threshold for what logs will be logged.
      */
    /* CompleteClass */
    var minimumLogLevel: HttpPipelineLogLevel = js.native
  }
  
  trait HttpPipelineLogger extends StObject {
    
    /**
      * Log the provided message.
      * @param logLevel - The HttpLogDetailLevel associated with this message.
      * @param message - The message to log.
      */
    def log(logLevel: HttpPipelineLogLevel, message: String): Unit
    
    /**
      * The log level threshold for what logs will be logged.
      */
    var minimumLogLevel: HttpPipelineLogLevel
  }
  object HttpPipelineLogger {
    
    inline def apply(log: (HttpPipelineLogLevel, String) => Unit, minimumLogLevel: HttpPipelineLogLevel): HttpPipelineLogger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log), minimumLogLevel = minimumLogLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpPipelineLogger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpPipelineLogger] (val x: Self) extends AnyVal {
      
      inline def setLog(value: (HttpPipelineLogLevel, String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setMinimumLogLevel(value: HttpPipelineLogLevel): Self = StObject.set(x, "minimumLogLevel", value.asInstanceOf[js.Any])
    }
  }
}
