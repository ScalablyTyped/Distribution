package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayAssociationRequest extends StObject {
  
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
}
object DeleteDirectConnectGatewayAssociationRequest {
  
  @scala.inline
  def apply(): DeleteDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationRequest]
  }
  
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationRequestMutableBuilder[Self <: DeleteDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setVirtualGatewayId(value: VirtualGatewayId): Self = StObject.set(x, "virtualGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayIdUndefined: Self = StObject.set(x, "virtualGatewayId", js.undefined)
  }
}
