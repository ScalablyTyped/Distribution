package typings.delay.anon

import typings.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTimeout extends js.Object {
  @JSName("clearTimeout")
  var clearTimeout_Original: FnCall = js.native
  @JSName("setTimeout")
  var setTimeout_Original: FnCallHandlerTimeoutArguments = js.native
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  def setTimeout(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}

