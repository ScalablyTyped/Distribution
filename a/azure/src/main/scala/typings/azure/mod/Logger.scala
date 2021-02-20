package typings.azure.mod

import typings.azure.anon.ALERT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "Logger")
@js.native
class Logger () extends StObject {
  
  def alert(message: String): Unit = js.native
  
  def critical(message: String): Unit = js.native
  
  def debug(message: String): Unit = js.native
  
  def defaultLoggerFunction(level: String, message: String): Unit = js.native
  
  def emergency(message: String): Unit = js.native
  
  def error(message: String): Unit = js.native
  
  def info(message: String): Unit = js.native
  
  var level: String = js.native
  
  def log(level: String, message: String): Unit = js.native
  
  def loggerFunction(level: String, message: String): Unit = js.native
  
  def notice(message: String): Unit = js.native
  
  def warning(message: String): Unit = js.native
}
/* static members */
object Logger {
  
  @JSImport("azure", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("azure", "Logger.LogLevels")
  @js.native
  def LogLevels: ALERT = js.native
  @scala.inline
  def LogLevels_=(x: ALERT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogLevels")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "Logger.logPriority")
  @js.native
  def logPriority: js.Array[String] = js.native
  @scala.inline
  def logPriority_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logPriority")(x.asInstanceOf[js.Any])
}
