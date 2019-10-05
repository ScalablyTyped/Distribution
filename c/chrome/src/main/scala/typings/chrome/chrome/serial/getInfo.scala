package typings.chrome.chrome.serial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial.getInfo")
@js.native
object getInfo extends js.Object {
  def apply(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = js.native
}

