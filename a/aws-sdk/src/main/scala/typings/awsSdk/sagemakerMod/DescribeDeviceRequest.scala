package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceRequest extends StObject {
  
  /**
    * The name of the fleet the devices belong to.
    */
  var DeviceFleetName: EntityName
  
  /**
    * The unique ID of the device.
    */
  var DeviceName: EntityName
  
  /**
    * Next token of device description.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object DescribeDeviceRequest {
  
  inline def apply(DeviceFleetName: EntityName, DeviceName: EntityName): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceRequest]
  }
  
  extension [Self <: DescribeDeviceRequest](x: Self) {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: EntityName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
