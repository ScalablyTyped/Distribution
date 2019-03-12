package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger
  extends nodeLib.eventsMod.EventEmitter {
  var fields: js.Any = js.native
  var src: scala.Boolean = js.native
  def addSerializers(serializers: bunyanLib.bunyanMod.LoggerNs.Serializers): scala.Unit = js.native
  def addStream(stream: bunyanLib.bunyanMod.LoggerNs.Stream): scala.Unit = js.native
  def child(options: js.Object): Logger = js.native
  def child(options: js.Object, simple: scala.Boolean): Logger = js.native
  /**
    * Returns a boolean: is the `debug` level enabled?
    *
    * This is equivalent to `log.isDebugEnabled()` or `log.isEnabledFor(DEBUG)` in log4j.
    */
  def debug(): scala.Boolean = js.native
  /**
    * Special case to log an `Error` instance to the record.
    * This adds an `err` field with exception details
    * (including the stack) and sets `msg` to the exception
    * message or you can specify the `msg`.
    */
  def debug(error: stdLib.Error, params: js.Any*): scala.Unit = js.native
  /**
    * Uses `util.format` for msg formatting.
    */
  def debug(format: js.Any, params: js.Any*): scala.Unit = js.native
  /**
    * The first field can optionally be a "fields" object, which
    * is merged into the log record.
    *
    * To pass in an Error *and* other fields, use the `err`
    * field name for the Error instance.
    */
  def debug(obj: js.Object, params: js.Any*): scala.Unit = js.native
  /**
    * Returns a boolean: is the `error` level enabled?
    *
    * This is equivalent to `log.isErrorEnabled()` or `log.isEnabledFor(ERROR)` in log4j.
    */
  def error(): scala.Boolean = js.native
  /**
    * Special case to log an `Error` instance to the record.
    * This adds an `err` field with exception details
    * (including the stack) and sets `msg` to the exception
    * message or you can specify the `msg`.
    */
  def error(error: stdLib.Error, params: js.Any*): scala.Unit = js.native
  /**
    * Uses `util.format` for msg formatting.
    */
  def error(format: js.Any, params: js.Any*): scala.Unit = js.native
  /**
    * The first field can optionally be a "fields" object, which
    * is merged into the log record.
    *
    * To pass in an Error *and* other fields, use the `err`
    * field name for the Error instance.
    */
  def error(obj: js.Object, params: js.Any*): scala.Unit = js.native
  /**
    * Returns a boolean: is the `fatal` level enabled?
    *
    * This is equivalent to `log.isFatalEnabled()` or `log.isEnabledFor(FATAL)` in log4j.
    */
  def fatal(): scala.Boolean = js.native
  /**
    * Special case to log an `Error` instance to the record.
    * This adds an `err` field with exception details
    * (including the stack) and sets `msg` to the exception
    * message or you can specify the `msg`.
    */
  def fatal(error: stdLib.Error, params: js.Any*): scala.Unit = js.native
  /**
    * Uses `util.format` for msg formatting.
    */
  def fatal(format: js.Any, params: js.Any*): scala.Unit = js.native
  /**
    * The first field can optionally be a "fields" object, which
    * is merged into the log record.
    *
    * To pass in an Error *and* other fields, use the `err`
    * field name for the Error instance.
    */
  def fatal(obj: js.Object, params: js.Any*): scala.Unit = js.native
  /**
    * Returns a boolean: is the `info` level enabled?
    *
    * This is equivalent to `log.isInfoEnabled()` or `log.isEnabledFor(INFO)` in log4j.
    */
  def info(): scala.Boolean = js.native
  /**
    * Special case to log an `Error` instance to the record.
    * This adds an `err` field with exception details
    * (including the stack) and sets `msg` to the exception
    * message or you can specify the `msg`.
    */
  def info(error: stdLib.Error, params: js.Any*): scala.Unit = js.native
  /**
    * Uses `util.format` for msg formatting.
    */
  def info(format: js.Any, params: js.Any*): scala.Unit = js.native
  /**
    * The first field can optionally be a "fields" object, which
    * is merged into the log record.
    *
    * To pass in an Error *and* other fields, use the `err`
    * field name for the Error instance.
    */
  def info(obj: js.Object, params: js.Any*): scala.Unit = js.native
  def level(): scala.Double = js.native
  def level(value: bunyanLib.bunyanMod.LoggerNs.LogLevel): scala.Unit = js.native
  def levels(): js.Array[scala.Double] = js.native
  def levels(name: java.lang.String): scala.Double = js.native
  def levels(name: java.lang.String, value: bunyanLib.bunyanMod.LoggerNs.LogLevel): scala.Unit = js.native
  def levels(name: scala.Double): scala.Double = js.native
  def levels(name: scala.Double, value: bunyanLib.bunyanMod.LoggerNs.LogLevel): scala.Unit = js.native
  def reopenFileStreams(): scala.Unit = js.native
  /**
    * Returns a boolean: is the `trace` level enabled?
    *
    * This is equivalent to `log.isTraceEnabled()` or `log.isEnabledFor(TRACE)` in log4j.
    */
  def trace(): scala.Boolean = js.native
  /**
    * Special case to log an `Error` instance to the record.
    * This adds an `err` field with exception details
    * (including the stack) and sets `msg` to the exception
    * message or you can specify the `msg`.
    */
  def trace(error: stdLib.Error, params: js.Any*): scala.Unit = js.native
  /**
    * Uses `util.format` for msg formatting.
    */
  def trace(format: js.Any, params: js.Any*): scala.Unit = js.native
  /**
    * The first field can optionally be a "fields" object, which
    * is merged into the log record.
    *
    * To pass in an Error *and* other fields, use the `err`
    * field name for the Error instance.
    */
  def trace(obj: js.Object, params: js.Any*): scala.Unit = js.native
  /**
    * Returns a boolean: is the `warn` level enabled?
    *
    * This is equivalent to `log.isWarnEnabled()` or `log.isEnabledFor(WARN)` in log4j.
    */
  def warn(): scala.Boolean = js.native
  /**
    * Special case to log an `Error` instance to the record.
    * This adds an `err` field with exception details
    * (including the stack) and sets `msg` to the exception
    * message or you can specify the `msg`.
    */
  def warn(error: stdLib.Error, params: js.Any*): scala.Unit = js.native
  /**
    * Uses `util.format` for msg formatting.
    */
  def warn(format: js.Any, params: js.Any*): scala.Unit = js.native
  /**
    * The first field can optionally be a "fields" object, which
    * is merged into the log record.
    *
    * To pass in an Error *and* other fields, use the `err`
    * field name for the Error instance.
    */
  def warn(obj: js.Object, params: js.Any*): scala.Unit = js.native
}

