package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVTLDevicesOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * An opaque string that indicates the position at which the VTL devices that were fetched for description ended. Use the marker in your next request to fetch the next set of VTL devices in the list. If there are no more VTL devices to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of VTL device objects composed of the Amazon Resource Name (ARN) of the VTL devices.
    */
  var VTLDevices: js.UndefOr[typings.awsSdk.storagegatewayMod.VTLDevices] = js.native
}

object DescribeVTLDevicesOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, Marker: Marker = null, VTLDevices: VTLDevices = null): DescribeVTLDevicesOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (VTLDevices != null) __obj.updateDynamic("VTLDevices")(VTLDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVTLDevicesOutput]
  }
}

