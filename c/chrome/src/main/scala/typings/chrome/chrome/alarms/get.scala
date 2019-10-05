package typings.chrome.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.get")
@js.native
object get extends js.Object {
  def apply(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  def apply(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
}

