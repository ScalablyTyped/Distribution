package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * The id of the inbound connection that you want to reject.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId
}
object RejectInboundCrossClusterSearchConnectionRequest {
  
  inline def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): RejectInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionRequest]
  }
  
  extension [Self <: RejectInboundCrossClusterSearchConnectionRequest](x: Self) {
    
    inline def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}
