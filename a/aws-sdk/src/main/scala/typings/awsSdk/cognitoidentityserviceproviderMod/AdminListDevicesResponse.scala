package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminListDevicesResponse extends StObject {
  
  /**
    * The devices in the list of devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.undefined
  
  /**
    * The pagination token.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
}
object AdminListDevicesResponse {
  
  inline def apply(): AdminListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListDevicesResponse]
  }
  
  extension [Self <: AdminListDevicesResponse](x: Self) {
    
    inline def setDevices(value: DeviceListType): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceType*): Self = StObject.set(x, "Devices", js.Array(value :_*))
    
    inline def setPaginationToken(value: SearchPaginationTokenType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
