package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
}

object UpdateDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: string): UpdateDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceDefinitionRequest]
  }
  @scala.inline
  implicit class UpdateDeviceDefinitionRequestOps[Self <: UpdateDeviceDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

