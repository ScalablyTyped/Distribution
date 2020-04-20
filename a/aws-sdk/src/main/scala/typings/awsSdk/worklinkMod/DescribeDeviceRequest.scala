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
}

