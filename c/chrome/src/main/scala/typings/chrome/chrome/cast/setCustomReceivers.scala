package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.setCustomReceivers")
@js.native
object setCustomReceivers extends js.Object {
  def apply(
    receivers: js.Array[Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}

