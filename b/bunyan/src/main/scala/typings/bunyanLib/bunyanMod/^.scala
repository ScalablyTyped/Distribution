package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan", JSImport.Namespace)
@js.native
class ^ protected () extends Logger {
  def this(options: LoggerOptions) = this()
}

@JSImport("bunyan", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEBUG: scala.Double = js.native
  val ERROR: scala.Double = js.native
  val FATAL: scala.Double = js.native
  val INFO: scala.Double = js.native
  val TRACE: scala.Double = js.native
  val WARN: scala.Double = js.native
  val stdSerializers: StdSerializers = js.native
  def createLogger(options: LoggerOptions): Logger = js.native
  def resolveLevel(value: LogLevel): scala.Double = js.native
  def safeCycles(): js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = js.native
}

