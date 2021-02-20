package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVTLDevicesInput extends StObject {
  
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
  implicit class DescribeVTLDevicesInputMutableBuilder[Self <: DescribeVTLDevicesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setVTLDeviceARNs(value: VTLDeviceARNs): Self = StObject.set(x, "VTLDeviceARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceARNsUndefined: Self = StObject.set(x, "VTLDeviceARNs", js.undefined)
    
    @scala.inline
    def setVTLDeviceARNsVarargs(value: VTLDeviceARN*): Self = StObject.set(x, "VTLDeviceARNs", js.Array(value :_*))
  }
}
