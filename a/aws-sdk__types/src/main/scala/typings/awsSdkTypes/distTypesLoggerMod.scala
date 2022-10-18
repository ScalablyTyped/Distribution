package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoggerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkTypes.awsSdkTypesStrings.all
    - typings.awsSdkTypes.awsSdkTypesStrings.log
    - typings.awsSdkTypes.awsSdkTypesStrings.info
    - typings.awsSdkTypes.awsSdkTypesStrings.warn
    - typings.awsSdkTypes.awsSdkTypesStrings.error
    - typings.awsSdkTypes.awsSdkTypesStrings.off
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def all: typings.awsSdkTypes.awsSdkTypesStrings.all = "all".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.all]
    
    inline def error: typings.awsSdkTypes.awsSdkTypesStrings.error = "error".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.error]
    
    inline def info: typings.awsSdkTypes.awsSdkTypesStrings.info = "info".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.info]
    
    inline def log: typings.awsSdkTypes.awsSdkTypesStrings.log = "log".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.log]
    
    inline def off: typings.awsSdkTypes.awsSdkTypesStrings.off = "off".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.off]
    
    inline def warn: typings.awsSdkTypes.awsSdkTypesStrings.warn = "warn".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.warn]
  }
  
  trait Logger extends StObject {
    
    def debug(content: Any*): Unit
    
    def error(content: Any*): Unit
    
    def info(content: Any*): Unit
    
    def warn(content: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait LoggerOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
