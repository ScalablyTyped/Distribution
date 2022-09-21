package typings.browserBunyan

import org.scalablytyped.runtime.Instantiable1
import typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Logger
import typings.bunyan.mod.LoggerOptions
import typings.bunyan.mod.RingBuffer
import typings.bunyan.mod.RingBufferOptions
import typings.bunyan.mod.RotatingFileStream
import typings.bunyan.mod.RotatingFileStreamOptions
import typings.bunyan.mod.StdSerializers_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConsoleFormattedStream extends StObject {
    
    var ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream
    
    var ConsoleRawStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
  }
  object ConsoleFormattedStream {
    
    inline def apply(
      ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream,
      ConsoleRawStream: ConsoleRawStream
    ): ConsoleFormattedStream = {
      val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsoleFormattedStream]
    }
    
    extension [Self <: ConsoleFormattedStream](x: Self) {
      
      inline def setConsoleFormattedStream(value: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream): Self = StObject.set(x, "ConsoleFormattedStream", value.asInstanceOf[js.Any])
      
      inline def setConsoleRawStream(value: ConsoleRawStream): Self = StObject.set(x, "ConsoleRawStream", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamLevelStyle> */
  trait PartialConsoleFormattedSt extends StObject {
    
    var debug: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var fatal: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var trace: js.UndefOr[String] = js.undefined
    
    var warn: js.UndefOr[String] = js.undefined
  }
  object PartialConsoleFormattedSt {
    
    inline def apply(): PartialConsoleFormattedSt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsoleFormattedSt]
    }
    
    extension [Self <: PartialConsoleFormattedSt](x: Self) {
      
      inline def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFatal(value: String): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  /* Inlined std.Partial<browser-bunyan.browser-bunyan.BrowserBunyan.ConsoleFormattedStreamStyle> */
  trait PartialConsoleFormattedStDef extends StObject {
    
    var `def`: js.UndefOr[String] = js.undefined
    
    var levels: js.UndefOr[PartialConsoleFormattedSt] = js.undefined
    
    var msg: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object PartialConsoleFormattedStDef {
    
    inline def apply(): PartialConsoleFormattedStDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConsoleFormattedStDef]
    }
    
    extension [Self <: PartialConsoleFormattedStDef](x: Self) {
      
      inline def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
      
      inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
      
      inline def setLevels(value: PartialConsoleFormattedSt): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait Typeofbunyan extends StObject {
    
    val DEBUG: Double
    
    val ERROR: Double
    
    val FATAL: Double
    
    val INFO: Double
    
    var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typings.bunyan.mod.RingBuffer]
    
    var RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, typings.bunyan.mod.RotatingFileStream]
    
    val TRACE: Double
    
    val WARN: Double
    
    def createLogger(options: LoggerOptions): Logger
    
    /* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
    val levelFromName: TypeoflevelFromName
    
    val nameFromLevel: Any
    
    def resolveLevel(value: LogLevel): Double
    
    def safeCycles(): js.Function2[/* key */ String, /* value */ Any, Any]
    
    val stdSerializers: StdSerializers_
  }
  object Typeofbunyan {
    
    inline def apply(
      DEBUG: Double,
      ERROR: Double,
      FATAL: Double,
      INFO: Double,
      RingBuffer: Instantiable1[/* options */ RingBufferOptions, RingBuffer],
      RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream],
      TRACE: Double,
      WARN: Double,
      createLogger: LoggerOptions => Logger,
      levelFromName: TypeoflevelFromName,
      nameFromLevel: Any,
      resolveLevel: LogLevel => Double,
      safeCycles: () => js.Function2[/* key */ String, /* value */ Any, Any],
      stdSerializers: StdSerializers_
    ): Typeofbunyan = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], RingBuffer = RingBuffer.asInstanceOf[js.Any], RotatingFileStream = RotatingFileStream.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], createLogger = js.Any.fromFunction1(createLogger), levelFromName = levelFromName.asInstanceOf[js.Any], nameFromLevel = nameFromLevel.asInstanceOf[js.Any], resolveLevel = js.Any.fromFunction1(resolveLevel), safeCycles = js.Any.fromFunction0(safeCycles), stdSerializers = stdSerializers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofbunyan]
    }
    
    extension [Self <: Typeofbunyan](x: Self) {
      
      inline def setCreateLogger(value: LoggerOptions => Logger): Self = StObject.set(x, "createLogger", js.Any.fromFunction1(value))
      
      inline def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setFATAL(value: Double): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setLevelFromName(value: TypeoflevelFromName): Self = StObject.set(x, "levelFromName", value.asInstanceOf[js.Any])
      
      inline def setNameFromLevel(value: Any): Self = StObject.set(x, "nameFromLevel", value.asInstanceOf[js.Any])
      
      inline def setResolveLevel(value: LogLevel => Double): Self = StObject.set(x, "resolveLevel", js.Any.fromFunction1(value))
      
      inline def setRingBuffer(value: Instantiable1[/* options */ RingBufferOptions, RingBuffer]): Self = StObject.set(x, "RingBuffer", value.asInstanceOf[js.Any])
      
      inline def setRotatingFileStream(value: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream]): Self = StObject.set(x, "RotatingFileStream", value.asInstanceOf[js.Any])
      
      inline def setSafeCycles(value: () => js.Function2[/* key */ String, /* value */ Any, Any]): Self = StObject.set(x, "safeCycles", js.Any.fromFunction0(value))
      
      inline def setStdSerializers(value: StdSerializers_): Self = StObject.set(x, "stdSerializers", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: Double): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeoflevelFromName extends StObject {
    
    var debug: Double
    
    var error: Double
    
    var fatal: Double
    
    var info: Double
    
    var trace: Double
    
    var warn: Double
  }
  object TypeoflevelFromName {
    
    inline def apply(debug: Double, error: Double, fatal: Double, info: Double, trace: Double, warn: Double): TypeoflevelFromName = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeoflevelFromName]
    }
    
    extension [Self <: TypeoflevelFromName](x: Self) {
      
      inline def setDebug(value: Double): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: Double): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: Double): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
