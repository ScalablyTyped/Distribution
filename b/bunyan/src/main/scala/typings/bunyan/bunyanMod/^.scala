package typings.bunyan.bunyanMod

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
  val DEBUG: Double = js.native
  val ERROR: Double = js.native
  val FATAL: Double = js.native
  val INFO: Double = js.native
  val TRACE: Double = js.native
  val WARN: Double = js.native
  val stdSerializers: StdSerializers = js.native
  def createLogger(options: LoggerOptions): Logger = js.native
  def resolveLevel(value: LogLevel): Double = js.native
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
}

