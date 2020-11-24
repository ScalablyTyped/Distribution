package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectConnectGatewayAssociationProposalRequest extends js.Object {
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: OwnerAccount = js.native
  
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: GatewayIdToAssociate = js.native
  
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
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
  implicit class CreateDirectConnectGatewayAssociationProposalRequestOps[Self <: CreateDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = this.set("directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: GatewayIdToAssociate): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("addAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAllowedPrefixesToDirectConnectGateway: Self = this.set("addAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("removeAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("removeAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAllowedPrefixesToDirectConnectGateway: Self = this.set("removeAllowedPrefixesToDirectConnectGateway", js.undefined)
  }
}
