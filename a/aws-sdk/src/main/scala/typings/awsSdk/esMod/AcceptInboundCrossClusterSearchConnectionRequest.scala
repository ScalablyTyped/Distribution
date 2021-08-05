package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * The id of the inbound connection that you want to accept.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId
}
object AcceptInboundCrossClusterSearchConnectionRequest {
  
  inline def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): AcceptInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionRequest]
  }
  
  extension [Self <: AcceptInboundCrossClusterSearchConnectionRequest](x: Self) {
    
    inline def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}
