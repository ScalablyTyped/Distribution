package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectivityInfoResponse extends StObject {
  
  /**
    * A message about the connectivity information update request.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The new version of the connectivity information for the core device.
    */
  var version: js.UndefOr[String] = js.undefined
}
object UpdateConnectivityInfoResponse {
  
  inline def apply(): UpdateConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectivityInfoResponse]
  }
  
  extension [Self <: UpdateConnectivityInfoResponse](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
