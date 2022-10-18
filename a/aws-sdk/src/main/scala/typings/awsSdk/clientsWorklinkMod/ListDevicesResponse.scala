package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResponse extends StObject {
  
  /**
    * Information about the devices.
    */
  var Devices: js.UndefOr[DeviceSummaryList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorklinkMod.NextToken] = js.undefined
}
object ListDevicesResponse {
  
  inline def apply(): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResponse]
  }
  
  extension [Self <: ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: DeviceSummaryList): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceSummary*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
