package typings.bsLogger

import typings.bsLogger.distLoggerContextMod.LogContext
import typings.bsLogger.distLoggerMessageMod.LogMessage
import typings.bsLogger.distLoggerMessageMod.LogMessageTranslator
import typings.bsLogger.distLoggerTargetMod.LogTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerMod {
  
  @JSImport("bs-logger/dist/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Logger]
  inline def createLogger(param0: CreateLoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(param0.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def lastSequenceNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastSequenceNumber")().asInstanceOf[Double]
  
  inline def resetSequence(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSequence")().asInstanceOf[Unit]
  inline def resetSequence(next: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSequence")(next.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CreateLoggerOptions extends StObject {
    
    var context: js.UndefOr[LogContext] = js.undefined
    
    var targets: js.UndefOr[String | js.Array[LogTarget]] = js.undefined
    
    var translate: js.UndefOr[LogMessageTranslator] = js.undefined
  }
  object CreateLoggerOptions {
    
    inline def apply(): CreateLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLoggerOptions]
    }
    
    extension [Self <: CreateLoggerOptions](x: Self) {
      
      inline def setContext(value: LogContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setTargets(value: String | js.Array[LogTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: LogTarget*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setTranslate(value: /* msg */ LogMessage => LogMessage): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    }
  }
  
  @js.native
  trait LogChildMethod extends StObject {
    
    def apply(context: LogContext): Logger = js.native
    def apply(translate: LogMessageTranslator): Logger = js.native
  }
  
  @js.native
  trait LogMethod extends StObject {
    
    def apply(context: LogContext, message: String, args: Any*): Unit = js.native
    def apply(message: String, args: Any*): Unit = js.native
    
    var isEmptyFunction: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait LogWrapMethod extends StObject {
    
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](context: LogContext, message: String, func: F): F = js.native
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): F = js.native
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](level: Double, message: String, func: F): F = js.native
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](message: String, func: F): F = js.native
  }
  
  @js.native
  trait Logger
    extends StObject
       with LogMethod {
    
    def child(context: LogContext): Logger = js.native
    def child(translate: LogMessageTranslator): Logger = js.native
    @JSName("child")
    var child_Original: LogChildMethod = js.native
    
    def debug(context: LogContext, message: String, args: Any*): Unit = js.native
    def debug(message: String, args: Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LogMethod = js.native
    
    def error(context: LogContext, message: String, args: Any*): Unit = js.native
    def error(message: String, args: Any*): Unit = js.native
    @JSName("error")
    var error_Original: LogMethod = js.native
    
    def fatal(context: LogContext, message: String, args: Any*): Unit = js.native
    def fatal(message: String, args: Any*): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LogMethod = js.native
    
    def info(context: LogContext, message: String, args: Any*): Unit = js.native
    def info(message: String, args: Any*): Unit = js.native
    @JSName("info")
    var info_Original: LogMethod = js.native
    
    def trace(context: LogContext, message: String, args: Any*): Unit = js.native
    def trace(message: String, args: Any*): Unit = js.native
    @JSName("trace")
    var trace_Original: LogMethod = js.native
    
    def warn(context: LogContext, message: String, args: Any*): Unit = js.native
    def warn(message: String, args: Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: LogMethod = js.native
    
    def wrap[F /* <: js.Function1[/* repeated */ Any, Any] */](context: LogContext, message: String, func: F): F = js.native
    def wrap[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): F = js.native
    def wrap[F /* <: js.Function1[/* repeated */ Any, Any] */](level: Double, message: String, func: F): F = js.native
    def wrap[F /* <: js.Function1[/* repeated */ Any, Any] */](message: String, func: F): F = js.native
    @JSName("wrap")
    var wrap_Original: LogWrapMethod = js.native
  }
}
