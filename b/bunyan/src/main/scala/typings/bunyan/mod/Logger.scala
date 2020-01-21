package typings.bunyan.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends EventEmitter {
  var fields: js.Any = js.native
  var src: Boolean = js.native
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

