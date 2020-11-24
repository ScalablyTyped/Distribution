package typings.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def debug(format: js.Any, args: js.Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: LoggerOutput = js.native
  
  def error(format: js.Any, args: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: LoggerOutput = js.native
  
  def info(format: js.Any, args: js.Any*): Unit = js.native
  @JSName("info")
  var info_Original: LoggerOutput = js.native
  
  def log(format: js.Any, args: js.Any*): Unit = js.native
  @JSName("log")
  var log_Original: LoggerOutput = js.native
  
  def warn(format: js.Any, args: js.Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: LoggerOutput = js.native
}
