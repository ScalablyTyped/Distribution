package typings.chromeDashApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.certificateProvider.stopPinRequest")
@js.native
object stopPinRequest extends js.Object {
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def apply(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit = js.native
}

