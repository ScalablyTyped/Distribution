package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.setCustomReceivers")
@js.native
object setCustomReceivers extends js.Object {
  def apply(
    receivers: js.Array[typings.chrome.chrome.cast.Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
  ): Unit = js.native
}

