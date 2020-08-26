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
  def apply(DeviceDefinitionId: string): CreateDeviceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeviceDefinitionVersionRequest]
  }
  @scala.inline
  implicit class CreateDeviceDefinitionVersionRequestOps[Self <: CreateDeviceDefinitionVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceDefinitionId(value: string): Self = this.set("DeviceDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = this.set("Devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: listOfDevice): Self = this.set("Devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("Devices", js.undefined)
  }
  
}

