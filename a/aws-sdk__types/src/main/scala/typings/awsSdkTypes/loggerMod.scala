package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
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
    
    @scala.inline
    def all: typings.awsSdkTypes.awsSdkTypesStrings.all = "all".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.all]
    
    @scala.inline
    def error: typings.awsSdkTypes.awsSdkTypesStrings.error = "error".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.error]
    
    @scala.inline
    def info: typings.awsSdkTypes.awsSdkTypesStrings.info = "info".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.info]
    
    @scala.inline
    def log: typings.awsSdkTypes.awsSdkTypesStrings.log = "log".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.log]
    
    @scala.inline
    def off: typings.awsSdkTypes.awsSdkTypesStrings.off = "off".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.off]
    
    @scala.inline
    def warn: typings.awsSdkTypes.awsSdkTypesStrings.warn = "warn".asInstanceOf[typings.awsSdkTypes.awsSdkTypesStrings.warn]
  }
  
  @js.native
  trait Logger extends StObject {
    
    def debug(content: js.Object): Unit = js.native
    
    def error(content: js.Object): Unit = js.native
    
    def info(content: js.Object): Unit = js.native
    
    def warn(content: js.Object): Unit = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(
      debug: js.Object => Unit,
      error: js.Object => Unit,
      info: js.Object => Unit,
      warn: js.Object => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: js.Object => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: js.Object => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: js.Object => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: js.Object => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LoggerOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
