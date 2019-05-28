package typings
package browserDashBunyanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbunyan extends js.Object {
  val DEBUG: scala.Double
  val ERROR: scala.Double
  val FATAL: scala.Double
  val INFO: scala.Double
  var RingBuffer: org.scalablytyped.runtime.Instantiable1[
    /* options */ bunyanLib.bunyanMod.RingBufferOptions, 
    bunyanLib.bunyanMod.RingBuffer
  ]
  var RotatingFileStream: org.scalablytyped.runtime.Instantiable1[
    /* options */ bunyanLib.bunyanMod.RotatingFileStreamOptions, 
    bunyanLib.bunyanMod.RotatingFileStream
  ]
  val TRACE: scala.Double
  val WARN: scala.Double
  val levelFromName: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in bunyan.bunyan.LogLevelString ]: number}
    */ browserDashBunyanLib.browserDashBunyanLibStrings.Typeofbunyan with js.Any
  val nameFromLevel: org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  val stdSerializers: bunyanLib.bunyanMod.StdSerializers
  def createLogger(options: bunyanLib.bunyanMod.LoggerOptions): bunyanLib.bunyanMod.Logger
  def resolveLevel(value: bunyanLib.bunyanMod.LogLevel): scala.Double
  def safeCycles(): js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]
}

object Typeofbunyan {
  @scala.inline
  def apply(
    DEBUG: scala.Double,
    ERROR: scala.Double,
    FATAL: scala.Double,
    INFO: scala.Double,
    RingBuffer: org.scalablytyped.runtime.Instantiable1[
      /* options */ bunyanLib.bunyanMod.RingBufferOptions, 
      bunyanLib.bunyanMod.RingBuffer
    ],
    RotatingFileStream: org.scalablytyped.runtime.Instantiable1[
      /* options */ bunyanLib.bunyanMod.RotatingFileStreamOptions, 
      bunyanLib.bunyanMod.RotatingFileStream
    ],
    TRACE: scala.Double,
    WARN: scala.Double,
    createLogger: bunyanLib.bunyanMod.LoggerOptions => bunyanLib.bunyanMod.Logger,
    levelFromName: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in bunyan.bunyan.LogLevelString ]: number}
    */ browserDashBunyanLib.browserDashBunyanLibStrings.Typeofbunyan with js.Any,
    nameFromLevel: org.scalablytyped.runtime.NumberDictionary[java.lang.String],
    resolveLevel: bunyanLib.bunyanMod.LogLevel => scala.Double,
    safeCycles: () => js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    stdSerializers: bunyanLib.bunyanMod.StdSerializers
  ): Typeofbunyan = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG, ERROR = ERROR, FATAL = FATAL, INFO = INFO, RingBuffer = RingBuffer, RotatingFileStream = RotatingFileStream, TRACE = TRACE, WARN = WARN, createLogger = js.Any.fromFunction1(createLogger), levelFromName = levelFromName, nameFromLevel = nameFromLevel, resolveLevel = js.Any.fromFunction1(resolveLevel), safeCycles = js.Any.fromFunction0(safeCycles), stdSerializers = stdSerializers)
  
    __obj.asInstanceOf[Typeofbunyan]
  }
}

