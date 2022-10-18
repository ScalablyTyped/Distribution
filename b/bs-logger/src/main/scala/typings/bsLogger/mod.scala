package typings.bsLogger

import typings.bsLogger.distLoggerMessageMod.LogMessageFormatter
import typings.bsLogger.distLoggerMod.CreateLoggerOptions
import typings.bsLogger.distLoggerMod.Logger
import typings.bsLogger.distLoggerTargetMod.LogTarget
import typings.bsLogger.distTestingMod.LoggerMock
import typings.bsLogger.distTestingTargetMockMod.ExtendedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bs-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger", JSImport.Default)
  @js.native
  val default: Logger = js.native
  
  @JSImport("bs-logger", "DEFAULT_LOG_TARGET")
  @js.native
  val DEFAULT_LOG_TARGET: String = js.native
  
  @JSImport("bs-logger", "LogContexts")
  @js.native
  object LogContexts extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bsLogger.distLoggerContextMod.LogContexts & String] = js.native
    
    /* "package" */ val _package: typings.bsLogger.distLoggerContextMod.LogContexts._package & String = js.native
    
    /* "application" */ val application: typings.bsLogger.distLoggerContextMod.LogContexts.application & String = js.native
    
    /* "hostname" */ val hostname: typings.bsLogger.distLoggerContextMod.LogContexts.hostname & String = js.native
    
    /* "logLevel" */ val logLevel: typings.bsLogger.distLoggerContextMod.LogContexts.logLevel & String = js.native
    
    /* "namespace" */ val namespace: typings.bsLogger.distLoggerContextMod.LogContexts.namespace & String = js.native
  }
  
  object LogLevels {
    
    @JSImport("bs-logger", "LogLevels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bs-logger", "LogLevels.debug")
    @js.native
    def debug: Double = js.native
    inline def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger", "LogLevels.error")
    @js.native
    def error: Double = js.native
    inline def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger", "LogLevels.fatal")
    @js.native
    def fatal: Double = js.native
    inline def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger", "LogLevels.higher")
    @js.native
    val higher: Double = js.native
    
    @JSImport("bs-logger", "LogLevels.info")
    @js.native
    def info: Double = js.native
    inline def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger", "LogLevels.lower")
    @js.native
    val lower: Double = js.native
    
    @JSImport("bs-logger", "LogLevels.trace")
    @js.native
    def trace: Double = js.native
    inline def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("bs-logger", "LogLevels.warn")
    @js.native
    def warn: Double = js.native
    inline def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  inline def createLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Logger]
  inline def createLogger(hasBaseContextLogTargetsLogTranslator: CreateLoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(hasBaseContextLogTargetsLogTranslator.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def lastSequenceNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastSequenceNumber")().asInstanceOf[Double]
  
  inline def logLevelNameFor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logLevelNameFor")().asInstanceOf[String]
  inline def logLevelNameFor(level: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logLevelNameFor")(level.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("bs-logger", "logger")
  @js.native
  val logger: Logger = js.native
  
  inline def parseLogLevel(level: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def parseLogLevel(level: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def parseLogTargets(): js.Array[LogTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogTargets")().asInstanceOf[js.Array[LogTarget]]
  inline def parseLogTargets(targetString: String): js.Array[LogTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLogTargets")(targetString.asInstanceOf[js.Any]).asInstanceOf[js.Array[LogTarget]]
  
  inline def registerLogFormatter(name: String, format: LogMessageFormatter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLogFormatter")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetLogFormatters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLogFormatters")().asInstanceOf[Unit]
  
  inline def resetSequence(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSequence")().asInstanceOf[Unit]
  inline def resetSequence(next: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSequence")(next.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  inline def setup(factory: js.Function0[Logger]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object testing {
    
    @JSImport("bs-logger", "testing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bs-logger", "testing.LogTargetMock")
    @js.native
    open class LogTargetMock ()
      extends typings.bsLogger.distTestingMod.LogTargetMock {
      def this(minLevel: Double) = this()
    }
    
    inline def createLoggerMock(): LoggerMock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")().asInstanceOf[LoggerMock]
    inline def createLoggerMock(options: Unit, target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock): LoggerMock = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[LoggerMock]
    inline def createLoggerMock(options: CreateLoggerOptions): LoggerMock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any]).asInstanceOf[LoggerMock]
    inline def createLoggerMock(options: CreateLoggerOptions, target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock): LoggerMock = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerMock")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[LoggerMock]
    
    inline def extendArray[T](array: js.Array[T]): ExtendedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("extendArray")(array.asInstanceOf[js.Any]).asInstanceOf[ExtendedArray[T]]
    
    inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
    inline def setup(target: typings.bsLogger.distTestingTargetMockMod.LogTargetMock): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
