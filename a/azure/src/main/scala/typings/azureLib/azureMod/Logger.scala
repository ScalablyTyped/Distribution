package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "Logger")
@js.native
class Logger () extends js.Object {
  var level: java.lang.String = js.native
  def alert(message: java.lang.String): scala.Unit = js.native
  def critical(message: java.lang.String): scala.Unit = js.native
  def debug(message: java.lang.String): scala.Unit = js.native
  def defaultLoggerFunction(level: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def emergency(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String): scala.Unit = js.native
  def log(level: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def loggerFunction(level: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def notice(message: java.lang.String): scala.Unit = js.native
  def warning(message: java.lang.String): scala.Unit = js.native
}

@JSImport("azure", "Logger")
@js.native
object Logger extends js.Object {
  var LogLevels: azureLib.Anon_NOTICE = js.native
  var logPriority: js.Array[java.lang.String] = js.native
}

