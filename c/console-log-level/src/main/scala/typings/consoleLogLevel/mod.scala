package typings.consoleLogLevel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Logger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Logger]
  inline def apply(opts: Options): Logger = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  @JSImport("console-log-level", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.consoleLogLevel.consoleLogLevelStrings.trace
    - typings.consoleLogLevel.consoleLogLevelStrings.debug
    - typings.consoleLogLevel.consoleLogLevelStrings.info
    - typings.consoleLogLevel.consoleLogLevelStrings.warn
    - typings.consoleLogLevel.consoleLogLevelStrings.error
    - typings.consoleLogLevel.consoleLogLevelStrings.fatal
  */
  trait LogLevelNames extends StObject
  object LogLevelNames {
    
    inline def debug: typings.consoleLogLevel.consoleLogLevelStrings.debug = "debug".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.debug]
    
    inline def error: typings.consoleLogLevel.consoleLogLevelStrings.error = "error".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.error]
    
    inline def fatal: typings.consoleLogLevel.consoleLogLevelStrings.fatal = "fatal".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.fatal]
    
    inline def info: typings.consoleLogLevel.consoleLogLevelStrings.info = "info".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.info]
    
    inline def trace: typings.consoleLogLevel.consoleLogLevelStrings.trace = "trace".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.trace]
    
    inline def warn: typings.consoleLogLevel.consoleLogLevelStrings.warn = "warn".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.warn]
  }
  
  /* Inlined std.Record<console-log-level.console-log-level.LogLevelNames, (args : ...any): void> */
  trait Logger extends StObject {
    
    def debug(args: Any*): Unit
    @JSName("debug")
    var debug_Original: js.Function1[/* repeated */ Any, Unit]
    
    def error(args: Any*): Unit
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ Any, Unit]
    
    def fatal(args: Any*): Unit
    @JSName("fatal")
    var fatal_Original: js.Function1[/* repeated */ Any, Unit]
    
    def info(args: Any*): Unit
    @JSName("info")
    var info_Original: js.Function1[/* repeated */ Any, Unit]
    
    def trace(args: Any*): Unit
    @JSName("trace")
    var trace_Original: js.Function1[/* repeated */ Any, Unit]
    
    def warn(args: Any*): Unit
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ Any, Unit]
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      fatal: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      trace: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setFatal(value: /* repeated */ Any => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setTrace(value: /* repeated */ Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var level: js.UndefOr[LogLevelNames] = js.undefined
    
    var prefix: js.UndefOr[String | PrefixFunction] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: LogLevelNames): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setPrefix(value: String | PrefixFunction): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction1(value: /* level */ String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    }
  }
  
  type PrefixFunction = js.Function1[/* level */ String, String]
}
