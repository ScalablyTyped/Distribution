package typings.delay

import typings.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClearTimeout extends js.Object {
  @JSName("clearTimeout")
  var clearTimeout_Original: Fn_Handle = js.native
  @JSName("setTimeout")
  var setTimeout_Original: Fn_Arguments = js.native
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  def setTimeout(handler: TimerHandler): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}

