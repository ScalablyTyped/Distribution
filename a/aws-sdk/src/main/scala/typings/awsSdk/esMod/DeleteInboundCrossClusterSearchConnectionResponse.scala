package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnection of deleted inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
}
object DeleteInboundCrossClusterSearchConnectionResponse {
  
  @scala.inline
  def apply(): DeleteInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionResponse]
  }
  
  @scala.inline
  implicit class DeleteInboundCrossClusterSearchConnectionResponseMutableBuilder[Self <: DeleteInboundCrossClusterSearchConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnection(value: InboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}
