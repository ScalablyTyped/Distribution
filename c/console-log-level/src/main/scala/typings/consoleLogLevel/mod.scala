package typings.consoleLogLevel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("console-log-level", JSImport.Namespace)
  @js.native
  def apply(opts: Options): Logger = js.native
  
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
    
    @scala.inline
    def debug: typings.consoleLogLevel.consoleLogLevelStrings.debug = "debug".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.debug]
    
    @scala.inline
    def error: typings.consoleLogLevel.consoleLogLevelStrings.error = "error".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.error]
    
    @scala.inline
    def fatal: typings.consoleLogLevel.consoleLogLevelStrings.fatal = "fatal".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.fatal]
    
    @scala.inline
    def info: typings.consoleLogLevel.consoleLogLevelStrings.info = "info".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.info]
    
    @scala.inline
    def trace: typings.consoleLogLevel.consoleLogLevelStrings.trace = "trace".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.trace]
    
    @scala.inline
    def warn: typings.consoleLogLevel.consoleLogLevelStrings.warn = "warn".asInstanceOf[typings.consoleLogLevel.consoleLogLevelStrings.warn]
  }
  
  /* Inlined std.Record<console-log-level.console-log-level.LogLevelNames, (args : ...any): void> */
  @js.native
  trait Logger extends StObject {
    
    def debug(args: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def error(args: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def fatal(args: js.Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def info(args: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def trace(args: js.Any*): Unit = js.native
    @JSName("trace")
    var trace_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    def warn(args: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var level: js.UndefOr[LogLevelNames] = js.native
    
    var prefix: js.UndefOr[String | PrefixFunction] = js.native
    
    var stderr: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevelNames): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setPrefix(value: String | PrefixFunction): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction1(value: /* level */ String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    }
  }
  
  type PrefixFunction = js.Function1[/* level */ String, String]
}
