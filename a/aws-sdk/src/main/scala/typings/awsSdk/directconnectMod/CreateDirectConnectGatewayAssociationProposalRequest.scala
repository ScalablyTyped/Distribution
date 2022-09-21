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
    * The ID of the Amazon Web Services account that owns the Direct Connect gateway.
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
  
  inline def apply(
    directConnectGatewayId: DirectConnectGatewayId,
    directConnectGatewayOwnerAccount: OwnerAccount,
    gatewayId: GatewayIdToAssociate
  ): CreateDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalRequest]
  }
  
  extension [Self <: CreateDirectConnectGatewayAssociationProposalRequest](x: Self) {
    
    inline def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setAddAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    inline def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.Array(value*))
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setGatewayId(value: GatewayIdToAssociate): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    inline def setRemoveAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.Array(value*))
  }
}
