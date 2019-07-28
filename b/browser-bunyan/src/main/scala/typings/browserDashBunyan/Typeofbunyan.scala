package typings.browserDashBunyan

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.bunyan.bunyanMod.LogLevel
import typings.bunyan.bunyanMod.Logger
import typings.bunyan.bunyanMod.LoggerOptions
import typings.bunyan.bunyanMod.RingBuffer
import typings.bunyan.bunyanMod.RingBufferOptions
import typings.bunyan.bunyanMod.RotatingFileStream
import typings.bunyan.bunyanMod.RotatingFileStreamOptions
import typings.bunyan.bunyanMod.StdSerializers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbunyan extends js.Object {
  val DEBUG: Double
  val ERROR: Double
  val FATAL: Double
  val INFO: Double
  var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typings.bunyan.bunyanMod.RingBuffer]
  var RotatingFileStream: Instantiable1[
    /* options */ RotatingFileStreamOptions, 
    typings.bunyan.bunyanMod.RotatingFileStream
  ]
  val TRACE: Double
  val WARN: Double
  val levelFromName: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in bunyan.bunyan.LogLevelString ]: number}
    */ typings.browserDashBunyan.browserDashBunyanStrings.Typeofbunyan with js.Any
  val nameFromLevel: NumberDictionary[String]
  val stdSerializers: StdSerializers
  def createLogger(options: LoggerOptions): Logger
  def resolveLevel(value: LogLevel): Double
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _]
}

object Typeofbunyan {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    FATAL: Double,
    INFO: Double,
    RingBuffer: Instantiable1[/* options */ RingBufferOptions, RingBuffer],
    RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream],
    TRACE: Double,
    WARN: Double,
    createLogger: LoggerOptions => Logger,
    levelFromName: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in bunyan.bunyan.LogLevelString ]: number}
    */ typings.browserDashBunyan.browserDashBunyanStrings.Typeofbunyan with js.Any,
    nameFromLevel: NumberDictionary[String],
    resolveLevel: LogLevel => Double,
    safeCycles: () => js.Function2[/* key */ String, /* value */ js.Any, _],
    stdSerializers: StdSerializers
  ): Typeofbunyan = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG, ERROR = ERROR, FATAL = FATAL, INFO = INFO, RingBuffer = RingBuffer, RotatingFileStream = RotatingFileStream, TRACE = TRACE, WARN = WARN, createLogger = js.Any.fromFunction1(createLogger), levelFromName = levelFromName, nameFromLevel = nameFromLevel, resolveLevel = js.Any.fromFunction1(resolveLevel), safeCycles = js.Any.fromFunction0(safeCycles), stdSerializers = stdSerializers)
  
    __obj.asInstanceOf[Typeofbunyan]
  }
}

