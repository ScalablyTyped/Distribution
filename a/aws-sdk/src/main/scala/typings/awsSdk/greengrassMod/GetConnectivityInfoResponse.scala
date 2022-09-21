package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectivityInfoResponse extends StObject {
  
  /**
    * Connectivity info list.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.undefined
  
  /**
    * A message about the connectivity info request.
    */
  var Message: js.UndefOr[string] = js.undefined
}
object GetConnectivityInfoResponse {
  
  inline def apply(): GetConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectivityInfoResponse]
  }
  
  extension [Self <: GetConnectivityInfoResponse](x: Self) {
    
    inline def setConnectivityInfo(value: listOfConnectivityInfo): Self = StObject.set(x, "ConnectivityInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectivityInfoUndefined: Self = StObject.set(x, "ConnectivityInfo", js.undefined)
    
    inline def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = StObject.set(x, "ConnectivityInfo", js.Array(value*))
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
