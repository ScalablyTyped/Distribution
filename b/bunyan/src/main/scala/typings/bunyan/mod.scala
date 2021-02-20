package typings.bunyan

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan", JSImport.Namespace)
  @js.native
  class ^ protected () extends Logger {
    def this(options: LoggerOptions) = this()
  }
  
  @JSImport("bunyan", "DEBUG")
  @js.native
  val DEBUG: Double = js.native
  
  @JSImport("bunyan", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("bunyan", "FATAL")
  @js.native
  val FATAL: Double = js.native
  
  @JSImport("bunyan", "INFO")
  @js.native
  val INFO: Double = js.native
  
  @JSImport("bunyan", "RingBuffer")
  @js.native
  class RingBuffer protected () extends EventEmitter {
    def this(options: RingBufferOptions) = this()
    
    def destroy(): Unit = js.native
    
    def destroySoon(): Unit = js.native
    
    def end(): Unit = js.native
    def end(record: js.Any): Unit = js.native
    
    var records: js.Array[_] = js.native
    
    var writable: Boolean = js.native
    
    def write(record: js.Any): Boolean = js.native
  }
  
  @JSImport("bunyan", "RotatingFileStream")
  @js.native
  class RotatingFileStream protected () extends EventEmitter {
    def this(options: RotatingFileStreamOptions) = this()
    
    def destroy(): Unit = js.native
    
    def destroySoon(): Unit = js.native
    
    def end(): Unit = js.native
    def end(record: js.Any): Unit = js.native
    
    var periodNum: Double = js.native
    
    var periodScope: String = js.native
    
    var rotQueue: js.Array[_] = js.native
    
    def rotate(): Unit = js.native
    
    var rotating: Boolean = js.native
    
    var stream: js.Any = js.native
    
    var writable: Boolean = js.native
    
    def write(record: js.Any): Boolean = js.native
  }
  
  @JSImport("bunyan", "TRACE")
  @js.native
  val TRACE: Double = js.native
  
  @JSImport("bunyan", "WARN")
  @js.native
  val WARN: Double = js.native
  
  @JSImport("bunyan", "createLogger")
  @js.native
  def createLogger(options: LoggerOptions): Logger = js.native
  
  /* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
  object levelFromName {
    
    @JSImport("bunyan", "levelFromName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bunyan", "levelFromName.debug")
    @js.native
    def debug: Double = js.native
    @scala.inline
    def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("bunyan", "levelFromName.error")
    @js.native
    def error: Double = js.native
    @scala.inline
    def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("bunyan", "levelFromName.fatal")
    @js.native
    def fatal: Double = js.native
    @scala.inline
    def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("bunyan", "levelFromName.info")
    @js.native
    def info: Double = js.native
    @scala.inline
    def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("bunyan", "levelFromName.trace")
    @js.native
    def trace: Double = js.native
    @scala.inline
    def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("bunyan", "levelFromName.warn")
    @js.native
    def warn: Double = js.native
    @scala.inline
    def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bunyan", "resolveLevel")
  @js.native
  def resolveLevel(value: LogLevel): Double = js.native
  
  @JSImport("bunyan", "safeCycles")
  @js.native
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
  
  @JSImport("bunyan", "stdSerializers")
  @js.native
  val stdSerializers: StdSerializers_ = js.native
  
  type LogLevel = LogLevelString | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.bunyan.bunyanStrings.trace
    - typings.bunyan.bunyanStrings.debug
    - typings.bunyan.bunyanStrings.info
    - typings.bunyan.bunyanStrings.warn
    - typings.bunyan.bunyanStrings.error
    - typings.bunyan.bunyanStrings.fatal
  */
  trait LogLevelString extends StObject
  object LogLevelString {
    
    @scala.inline
    def debug: typings.bunyan.bunyanStrings.debug = "debug".asInstanceOf[typings.bunyan.bunyanStrings.debug]
    
    @scala.inline
    def error: typings.bunyan.bunyanStrings.error = "error".asInstanceOf[typings.bunyan.bunyanStrings.error]
    
    @scala.inline
    def fatal: typings.bunyan.bunyanStrings.fatal = "fatal".asInstanceOf[typings.bunyan.bunyanStrings.fatal]
    
    @scala.inline
    def info: typings.bunyan.bunyanStrings.info = "info".asInstanceOf[typings.bunyan.bunyanStrings.info]
    
    @scala.inline
    def trace: typings.bunyan.bunyanStrings.trace = "trace".asInstanceOf[typings.bunyan.bunyanStrings.trace]
    
    @scala.inline
    def warn: typings.bunyan.bunyanStrings.warn = "warn".asInstanceOf[typings.bunyan.bunyanStrings.warn]
  }
  
  @js.native
  trait Logger extends EventEmitter {
    
    def addSerializers(serializers: Serializers): Unit = js.native
    
    def addStream(stream: Stream): Unit = js.native
    
    def child(options: js.Object): Logger = js.native
    def child(options: js.Object, simple: Boolean): Logger = js.native
    
    /**
      * Returns a boolean: is the `debug` level enabled?
      *
      * This is equivalent to `log.isDebugEnabled()` or `log.isEnabledFor(DEBUG)` in log4j.
      */
    def debug(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def debug(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def debug(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def debug(obj: js.Object, params: js.Any*): Unit = js.native
    
    /**
      * Returns a boolean: is the `error` level enabled?
      *
      * This is equivalent to `log.isErrorEnabled()` or `log.isEnabledFor(ERROR)` in log4j.
      */
    def error(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def error(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def error(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def error(obj: js.Object, params: js.Any*): Unit = js.native
    
    /**
      * Returns a boolean: is the `fatal` level enabled?
      *
      * This is equivalent to `log.isFatalEnabled()` or `log.isEnabledFor(FATAL)` in log4j.
      */
    def fatal(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def fatal(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def fatal(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def fatal(obj: js.Object, params: js.Any*): Unit = js.native
    
    var fields: js.Any = js.native
    
    /**
      * Returns a boolean: is the `info` level enabled?
      *
      * This is equivalent to `log.isInfoEnabled()` or `log.isEnabledFor(INFO)` in log4j.
      */
    def info(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def info(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def info(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def info(obj: js.Object, params: js.Any*): Unit = js.native
    
    def level(): Double = js.native
    def level(value: LogLevel): Unit = js.native
    
    def levels(): js.Array[Double] = js.native
    def levels(name: String): Double = js.native
    def levels(name: String, value: LogLevel): Unit = js.native
    def levels(name: Double): Double = js.native
    def levels(name: Double, value: LogLevel): Unit = js.native
    
    def reopenFileStreams(): Unit = js.native
    
    var src: Boolean = js.native
    
    /**
      * Returns a boolean: is the `trace` level enabled?
      *
      * This is equivalent to `log.isTraceEnabled()` or `log.isEnabledFor(TRACE)` in log4j.
      */
    def trace(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def trace(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def trace(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def trace(obj: js.Object, params: js.Any*): Unit = js.native
    
    /**
      * Returns a boolean: is the `warn` level enabled?
      *
      * This is equivalent to `log.isWarnEnabled()` or `log.isEnabledFor(WARN)` in log4j.
      */
    def warn(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def warn(error: Error, params: js.Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def warn(format: js.Any, params: js.Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def warn(obj: js.Object, params: js.Any*): Unit = js.native
  }
  
  @js.native
  trait LoggerOptions
    extends /* custom */ StringDictionary[js.Any] {
    
    var level: js.UndefOr[LogLevel] = js.native
    
    var name: String = js.native
    
    var serializers: js.UndefOr[Serializers] = js.native
    
    var src: js.UndefOr[Boolean] = js.native
    
    var stream: js.UndefOr[WritableStream] = js.native
    
    var streams: js.UndefOr[js.Array[Stream]] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(name: String): LoggerOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializers(value: Serializers): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      @scala.inline
      def setSrc(value: Boolean): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      @scala.inline
      def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RingBufferOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.native
  }
  object RingBufferOptions {
    
    @scala.inline
    def apply(): RingBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RingBufferOptions]
    }
    
    @scala.inline
    implicit class RingBufferOptionsMutableBuilder[Self <: RingBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  @js.native
  trait RotatingFileStreamOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var path: String = js.native
    
    var period: js.UndefOr[String] = js.native
  }
  object RotatingFileStreamOptions {
    
    @scala.inline
    def apply(path: String): RotatingFileStreamOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotatingFileStreamOptions]
    }
    
    @scala.inline
    implicit class RotatingFileStreamOptionsMutableBuilder[Self <: RotatingFileStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    }
  }
  
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
  
  type Serializers = StringDictionary[Serializer]
  
  @js.native
  trait StdSerializers_ extends Serializers {
    
    def err(input: js.Any): js.Any = js.native
    @JSName("err")
    var err_Original: Serializer = js.native
    
    def req(input: js.Any): js.Any = js.native
    @JSName("req")
    var req_Original: Serializer = js.native
    
    def res(input: js.Any): js.Any = js.native
    @JSName("res")
    var res_Original: Serializer = js.native
  }
  
  @js.native
  trait Stream extends StObject {
    
    var closeOnExit: js.UndefOr[Boolean] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var level: js.UndefOr[LogLevel] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var period: js.UndefOr[String] = js.native
    
    var reemitErrorEvents: js.UndefOr[Boolean] = js.native
    
    var stream: js.UndefOr[WritableStream | Stream] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Stream {
    
    @scala.inline
    def apply(): Stream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOnExit(value: Boolean): Self = StObject.set(x, "closeOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnExitUndefined: Self = StObject.set(x, "closeOnExit", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setReemitErrorEvents(value: Boolean): Self = StObject.set(x, "reemitErrorEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReemitErrorEventsUndefined: Self = StObject.set(x, "reemitErrorEvents", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream | Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
