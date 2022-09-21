package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesOutput extends StObject {
  
  /**
    * A list of device structures that contain information about the device.
    */
  var devices: js.UndefOr[DeviceSummaryList] = js.undefined
  
  /**
    * A pagination token to continue to the next page of devices.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDevicesOutput {
  
  inline def apply(): ListDevicesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesOutput]
  }
  
  extension [Self <: ListDevicesOutput](x: Self) {
    
    inline def setDevices(value: DeviceSummaryList): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceSummary*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
