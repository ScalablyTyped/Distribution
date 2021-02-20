package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOutboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * The id of the outbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.esMod.CrossClusterSearchConnectionId = js.native
}
object DeleteOutboundCrossClusterSearchConnectionRequest {
  
  @scala.inline
  def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteOutboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionRequest]
  }
  
  @scala.inline
  implicit class DeleteOutboundCrossClusterSearchConnectionRequestMutableBuilder[Self <: DeleteOutboundCrossClusterSearchConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}
