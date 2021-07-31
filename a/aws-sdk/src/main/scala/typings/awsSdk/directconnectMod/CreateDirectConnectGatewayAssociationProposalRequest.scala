package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectConnectGatewayAssociationProposalRequest extends StObject {
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: OwnerAccount
  
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: GatewayIdToAssociate
  
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}
object CreateDirectConnectGatewayAssociationProposalRequest {
  
  @scala.inline
  def apply(
    directConnectGatewayId: DirectConnectGatewayId,
    directConnectGatewayOwnerAccount: OwnerAccount,
    gatewayId: GatewayIdToAssociate
  ): CreateDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalRequest]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationProposalRequestMutableBuilder[Self <: CreateDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: GatewayIdToAssociate): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
  }
}
