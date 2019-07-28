package typings.bunnymq.bunnymqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  @JSName("debug")
  var debug_Original: LoggerOutput = js.native
  @JSName("error")
  var error_Original: LoggerOutput = js.native
  @JSName("info")
  var info_Original: LoggerOutput = js.native
  @JSName("log")
  var log_Original: LoggerOutput = js.native
  @JSName("warn")
  var warn_Original: LoggerOutput = js.native
  def debug(format: js.Any, args: js.Any*): Unit = js.native
  def error(format: js.Any, args: js.Any*): Unit = js.native
  def info(format: js.Any, args: js.Any*): Unit = js.native
  def log(format: js.Any, args: js.Any*): Unit = js.native
  def warn(format: js.Any, args: js.Any*): Unit = js.native
}

