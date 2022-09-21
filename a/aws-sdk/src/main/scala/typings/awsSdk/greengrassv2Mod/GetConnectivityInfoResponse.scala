package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectivityInfoResponse extends StObject {
  
  /**
    * The connectivity information for the core device.
    */
  var connectivityInfo: js.UndefOr[connectivityInfoList] = js.undefined
  
  /**
    * A message about the connectivity information request.
    */
  var message: js.UndefOr[String] = js.undefined
}
object GetConnectivityInfoResponse {
  
  inline def apply(): GetConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectivityInfoResponse]
  }
  
  extension [Self <: GetConnectivityInfoResponse](x: Self) {
    
    inline def setConnectivityInfo(value: connectivityInfoList): Self = StObject.set(x, "connectivityInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectivityInfoUndefined: Self = StObject.set(x, "connectivityInfo", js.undefined)
    
    inline def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = StObject.set(x, "connectivityInfo", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
