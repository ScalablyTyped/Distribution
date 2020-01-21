package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceDefinitionRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
}

object DeleteDeviceDefinitionRequest {
  @scala.inline
  def apply(DeviceDefinitionId: string): DeleteDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
  }
}

