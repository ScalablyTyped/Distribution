package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the OutboundCrossClusterSearchConnection of deleted outbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[OutboundCrossClusterSearchConnection] = js.undefined
}
object DeleteOutboundCrossClusterSearchConnectionResponse {
  
  inline def apply(): DeleteOutboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionResponse]
  }
  
  extension [Self <: DeleteOutboundCrossClusterSearchConnectionResponse](x: Self) {
    
    inline def setCrossClusterSearchConnection(value: OutboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}
