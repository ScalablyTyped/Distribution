package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectConnectGatewayAssociationRequest extends StObject {
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway This parameter is required when you create an association to a transit gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: js.UndefOr[GatewayIdToAssociate] = js.native
  
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}
object CreateDirectConnectGatewayAssociationRequest {
  
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId): CreateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationRequest]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationRequestMutableBuilder[Self <: CreateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: GatewayIdToAssociate): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
  }
}
