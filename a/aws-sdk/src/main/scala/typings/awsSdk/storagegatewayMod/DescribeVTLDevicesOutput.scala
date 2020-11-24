package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeVTLDevicesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVTLDevicesOutput]
  }
  
  @scala.inline
  implicit class DescribeVTLDevicesOutputOps[Self <: DescribeVTLDevicesOutput] (val x: Self) extends AnyVal {
    
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
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setVTLDevicesVarargs(value: VTLDevice*): Self = this.set("VTLDevices", js.Array(value :_*))
    
    @scala.inline
    def setVTLDevices(value: VTLDevices): Self = this.set("VTLDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVTLDevices: Self = this.set("VTLDevices", js.undefined)
  }
}
