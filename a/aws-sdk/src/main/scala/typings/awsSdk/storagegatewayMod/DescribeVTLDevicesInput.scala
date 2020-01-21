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
  def apply(
    GatewayARN: GatewayARN,
    Limit: Int | Double = null,
    Marker: Marker = null,
    VTLDeviceARNs: VTLDeviceARNs = null
  ): DescribeVTLDevicesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (VTLDeviceARNs != null) __obj.updateDynamic("VTLDeviceARNs")(VTLDeviceARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVTLDevicesInput]
  }
}

