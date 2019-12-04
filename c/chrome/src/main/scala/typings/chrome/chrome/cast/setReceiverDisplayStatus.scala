package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.setReceiverDisplayStatus")
@js.native
object setReceiverDisplayStatus extends js.Object {
  def apply(
    receiver: Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}

