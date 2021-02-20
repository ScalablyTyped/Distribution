package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptInboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnection of accepted inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.native
}
object AcceptInboundCrossClusterSearchConnectionResponse {
  
  @scala.inline
  def apply(): AcceptInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionResponse]
  }
  
  @scala.inline
  implicit class AcceptInboundCrossClusterSearchConnectionResponseMutableBuilder[Self <: AcceptInboundCrossClusterSearchConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossClusterSearchConnection(value: InboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}
