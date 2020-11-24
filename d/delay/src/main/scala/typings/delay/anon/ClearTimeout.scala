package typings.delay.anon

import typings.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearTimeout extends js.Object {
  
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  @JSName("clearTimeout")
  var clearTimeout_Original: FnCall = js.native
  
  def setTimeout(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  @JSName("setTimeout")
  var setTimeout_Original: FnCallHandlerTimeoutArguments = js.native
}
