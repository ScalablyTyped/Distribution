package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ClearTimeout extends js.Object {
  @JSName("clearTimeout")
  var clearTimeout_Original: Fn_Handle = js.native
  @JSName("setTimeout")
  var setTimeout_Original: Fn_Arguments = js.native
  def clearTimeout(): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def setTimeout(handler: stdLib.TimerHandler): scala.Double = js.native
  def setTimeout(handler: stdLib.TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
}

