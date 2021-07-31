package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectConnectGatewayAssociationRequest extends StObject {
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}
object UpdateDirectConnectGatewayAssociationRequest {
  
  @scala.inline
  def apply(): UpdateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
  }
  
  @scala.inline
  implicit class UpdateDirectConnectGatewayAssociationRequestMutableBuilder[Self <: UpdateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setAddAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "addAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setAssociationId(value: DirectConnectGatewayAssociationId): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setRemoveAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "removeAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
  }
}
