package typings.chrome.chrome.serial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial.connect")
@js.native
object connect extends js.Object {
  def apply(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit = js.native
}

