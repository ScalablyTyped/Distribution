package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevicesResponse extends js.Object {
  /**
    * A list of devices.
    */
  var Devices: js.UndefOr[listOfDeviceDescription] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDevicesResponse {
  @scala.inline
  def apply(Devices: listOfDeviceDescription = null, NextToken: string = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (Devices != null) __obj.updateDynamic("Devices")(Devices.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

