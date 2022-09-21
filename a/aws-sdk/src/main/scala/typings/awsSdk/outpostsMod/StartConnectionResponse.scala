package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartConnectionResponse extends StObject {
  
  /**
    *  The ID of the connection. 
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.outpostsMod.ConnectionId] = js.undefined
  
  /**
    *  The underlay IP address. 
    */
  var UnderlayIpAddress: js.UndefOr[typings.awsSdk.outpostsMod.UnderlayIpAddress] = js.undefined
}
object StartConnectionResponse {
  
  inline def apply(): StartConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartConnectionResponse]
  }
  
  extension [Self <: StartConnectionResponse](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setUnderlayIpAddress(value: UnderlayIpAddress): Self = StObject.set(x, "UnderlayIpAddress", value.asInstanceOf[js.Any])
    
    inline def setUnderlayIpAddressUndefined: Self = StObject.set(x, "UnderlayIpAddress", js.undefined)
  }
}
