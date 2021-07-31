package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * The id of the inbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId
}
object DeleteInboundCrossClusterSearchConnectionRequest {
  
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionRequest]
  }
  
  @scala.inline
  implicit class DeleteInboundCrossClusterSearchConnectionRequestMutableBuilder[Self <: DeleteInboundCrossClusterSearchConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}
