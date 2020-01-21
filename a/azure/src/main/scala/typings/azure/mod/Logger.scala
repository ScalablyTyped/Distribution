package typings.azure.mod

import typings.azure.AnonALERT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "Logger")
@js.native
class Logger () extends js.Object {
  var level: String = js.native
  def alert(message: String): Unit = js.native
  def critical(message: String): Unit = js.native
  def debug(message: String): Unit = js.native
  def defaultLoggerFunction(level: String, message: String): Unit = js.native
  def emergency(message: String): Unit = js.native
  def error(message: String): Unit = js.native
  def info(message: String): Unit = js.native
  def log(level: String, message: String): Unit = js.native
  def loggerFunction(level: String, message: String): Unit = js.native
  def notice(message: String): Unit = js.native
  def warning(message: String): Unit = js.native
}

/* static members */
@JSImport("azure", "Logger")
@js.native
object Logger extends js.Object {
  var LogLevels: AnonALERT = js.native
  var logPriority: js.Array[String] = js.native
}

