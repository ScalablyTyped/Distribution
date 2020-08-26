package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVTLDevicesInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * Specifies that the number of VTL devices described be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * An opaque string that indicates the position at which to begin describing the VTL devices.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of strings, where each string represents the Amazon Resource Name (ARN) of a VTL device.  All of the specified VTL devices must be from the same gateway. If no VTL devices are specified, the result will contain all devices on the specified gateway. 
    */
  var VTLDeviceARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDeviceARNs] = js.native
}

object DescribeVTLDevicesInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeVTLDevicesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVTLDevicesInput]
  }
  @scala.inline
  implicit class DescribeVTLDevicesInputOps[Self <: DescribeVTLDevicesInput] (val x: Self) extends AnyVal {
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setVTLDeviceARNsVarargs(value: VTLDeviceARN*): Self = this.set("VTLDeviceARNs", js.Array(value :_*))
    @scala.inline
    def setVTLDeviceARNs(value: VTLDeviceARNs): Self = this.set("VTLDeviceARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVTLDeviceARNs: Self = this.set("VTLDeviceARNs", js.undefined)
  }
  
}

