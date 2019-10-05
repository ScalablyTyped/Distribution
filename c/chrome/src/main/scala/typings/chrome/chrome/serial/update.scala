package typings.chrome.chrome.serial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial.update")
@js.native
object update extends js.Object {
  def apply(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
}

