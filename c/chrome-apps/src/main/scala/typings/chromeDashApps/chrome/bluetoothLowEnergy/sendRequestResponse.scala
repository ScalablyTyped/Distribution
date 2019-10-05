package typings.chromeDashApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.sendRequestResponse")
@js.native
object sendRequestResponse extends js.Object {
  /**
    * Sends a response for a characteristic or descriptor read/write request. This function is only available if the app has both the bluetooth:low_energy and the bluetooth:peripheral permissions set to true. The peripheral permission may not be available to all apps.
    * @since Chrome 52.
    * @param response The response to the request.
    */
  def apply(response: IResponse): Unit = js.native
}

