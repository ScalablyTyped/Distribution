package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectConnectGatewayAssociation extends js.Object {
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var allowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.native
  
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  
  /**
    * The state of the association. The following are the possible values:    associating: The initial state after calling CreateDirectConnectGatewayAssociation.    associated: The Direct Connect gateway and virtual private gateway or transit gateway are successfully associated and ready to pass traffic.    disassociating: The initial state after calling DeleteDirectConnectGatewayAssociation.    disassociated: The virtual private gateway or transit gateway is disassociated from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual private gateway or transit gateway is stopped.  
    */
  var associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * The ID of the AWS account that owns the associated gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
  
  /**
    * The ID of the virtual private gateway. Applies only to private virtual interfaces.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
  
  /**
    * The ID of the AWS account that owns the virtual private gateway.
    */
  var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The AWS Region where the virtual private gateway is located.
    */
  var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.native
}
object DirectConnectGatewayAssociation {
  
  @scala.inline
  def apply(): DirectConnectGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAssociation]
  }
  
  @scala.inline
  implicit class DirectConnectGatewayAssociationOps[Self <: DirectConnectGatewayAssociation] (val x: Self) extends AnyVal {
    
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
    def setAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("allowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("allowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPrefixesToDirectConnectGateway: Self = this.set("allowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setAssociatedGateway(value: AssociatedGateway): Self = this.set("associatedGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedGateway: Self = this.set("associatedGateway", js.undefined)
    
    @scala.inline
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = this.set("associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("associationId", js.undefined)
    
    @scala.inline
    def setAssociationState(value: DirectConnectGatewayAssociationState): Self = this.set("associationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationState: Self = this.set("associationState", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = this.set("directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayOwnerAccount: Self = this.set("directConnectGatewayOwnerAccount", js.undefined)
    
    @scala.inline
    def setStateChangeError(value: StateChangeError): Self = this.set("stateChangeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeError: Self = this.set("stateChangeError", js.undefined)
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = this.set("virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualGatewayId: Self = this.set("virtualGatewayId", js.undefined)
    
    @scala.inline
    def setVirtualGatewayOwnerAccount(value: OwnerAccount): Self = this.set("virtualGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualGatewayOwnerAccount: Self = this.set("virtualGatewayOwnerAccount", js.undefined)
    
    @scala.inline
    def setVirtualGatewayRegion(value: VirtualGatewayRegion): Self = this.set("virtualGatewayRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualGatewayRegion: Self = this.set("virtualGatewayRegion", js.undefined)
  }
}
