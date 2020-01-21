package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeviceDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
  /**
    * A list of devices in the definition version.
    */
  var Devices: js.UndefOr[listOfDevice] = js.native
}

object CreateDeviceDefinitionVersionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: string, AmznClientToken: string = null, Devices: listOfDevice = null): CreateDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Devices != null) __obj.updateDynamic("Devices")(Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeviceDefinitionVersionRequest]
  }
}

