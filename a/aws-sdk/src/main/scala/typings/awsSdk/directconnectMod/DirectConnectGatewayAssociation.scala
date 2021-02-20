package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectConnectGatewayAssociation extends StObject {
  
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
  implicit class DirectConnectGatewayAssociationMutableBuilder[Self <: DirectConnectGatewayAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "allowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "allowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "allowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedGateway(value: AssociatedGateway): Self = StObject.set(x, "associatedGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedGatewayUndefined: Self = StObject.set(x, "associatedGateway", js.undefined)
    
    @scala.inline
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
    
    @scala.inline
    def setAssociationState(value: DirectConnectGatewayAssociationState): Self = StObject.set(x, "associationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStateUndefined: Self = StObject.set(x, "associationState", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccountUndefined: Self = StObject.set(x, "directConnectGatewayOwnerAccount", js.undefined)
    
    @scala.inline
    def setStateChangeError(value: StateChangeError): Self = StObject.set(x, "stateChangeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeErrorUndefined: Self = StObject.set(x, "stateChangeError", js.undefined)
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
    
    @scala.inline
    def setVirtualGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "virtualGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayOwnerAccountUndefined: Self = StObject.set(x, "virtualGatewayOwnerAccount", js.undefined)
    
    @scala.inline
    def setVirtualGatewayRegion(value: VirtualGatewayRegion): Self = StObject.set(x, "virtualGatewayRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayRegionUndefined: Self = StObject.set(x, "virtualGatewayRegion", js.undefined)
  }
}
