package typings.cyberblastLogger.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@cyberblast/logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(configPath: String) = this()
  var category: StringDictionary[String] = js.native
  def close(): Unit = js.native
  def defineCategory(name: String): Unit = js.native
  def init(): js.Promise[Unit] = js.native
  def log(logData: LogData): Unit = js.native
  def logError(message: String): Unit = js.native
  def logError(message: String, category: String, data: js.Any*): Unit = js.native
  def logInfo(message: String): Unit = js.native
  def logInfo(message: String, category: String, data: js.Any*): Unit = js.native
  def logVerbose(message: String): Unit = js.native
  def logVerbose(message: String, category: String, data: js.Any*): Unit = js.native
  def logWarning(message: String): Unit = js.native
  def logWarning(message: String, category: String, data: js.Any*): Unit = js.native
  def on(ruleName: String, callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
  def onError(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
  def onInfo(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
  def onLog(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
  def onVerbose(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
  def onWarning(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
}

