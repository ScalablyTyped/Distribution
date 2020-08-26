package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeviceRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
}

object DescribeDeviceRequest {
  @scala.inline
  def apply(DeviceId: string): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
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
    def setDeviceId(value: string): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
  }
  
}

