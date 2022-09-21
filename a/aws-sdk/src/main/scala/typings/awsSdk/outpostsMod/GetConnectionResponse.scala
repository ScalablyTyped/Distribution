package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionResponse extends StObject {
  
  /**
    *  Information about a connection. 
    */
  var ConnectionDetails: js.UndefOr[typings.awsSdk.outpostsMod.ConnectionDetails] = js.undefined
  
  /**
    *  The ID of the connection you receive. 
    */
  var ConnectionId: js.UndefOr[typings.awsSdk.outpostsMod.ConnectionId] = js.undefined
}
object GetConnectionResponse {
  
  inline def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  
  extension [Self <: GetConnectionResponse](x: Self) {
    
    inline def setConnectionDetails(value: ConnectionDetails): Self = StObject.set(x, "ConnectionDetails", value.asInstanceOf[js.Any])
    
    inline def setConnectionDetailsUndefined: Self = StObject.set(x, "ConnectionDetails", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
  }
}
