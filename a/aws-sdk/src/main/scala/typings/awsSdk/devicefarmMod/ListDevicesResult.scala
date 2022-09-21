package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResult extends StObject {
  
  /**
    * Information about the devices.
    */
  var devices: js.UndefOr[Devices] = js.undefined
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDevicesResult {
  
  inline def apply(): ListDevicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesResult]
  }
  
  extension [Self <: ListDevicesResult](x: Self) {
    
    inline def setDevices(value: Devices): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
