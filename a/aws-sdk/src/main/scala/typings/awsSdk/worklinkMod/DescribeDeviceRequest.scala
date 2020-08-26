package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeviceRequest extends js.Object {
  /**
    * A unique identifier for a registered user's device.
    */
  var DeviceId: Id = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object DescribeDeviceRequest {
  @scala.inline
  def apply(DeviceId: Id, FleetArn: FleetArn): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceRequest]
  }
  @scala.inline
  implicit class DescribeDeviceRequestOps[Self <: DescribeDeviceRequest] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: Id): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
  }
  
}

