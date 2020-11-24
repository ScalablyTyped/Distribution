package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.setReceiverDisplayStatus")
@js.native
object setReceiverDisplayStatus extends js.Object {
  
  def apply(
    receiver: typings.chrome.chrome.cast.Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, Unit]
  ): Unit = js.native
}
