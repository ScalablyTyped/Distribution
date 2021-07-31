package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectConnectGatewayAssociationResult extends StObject {
  
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}
object UpdateDirectConnectGatewayAssociationResult {
  
  @scala.inline
  def apply(): UpdateDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationResult]
  }
  
  @scala.inline
  implicit class UpdateDirectConnectGatewayAssociationResultMutableBuilder[Self <: UpdateDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = StObject.set(x, "directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationUndefined: Self = StObject.set(x, "directConnectGatewayAssociation", js.undefined)
  }
}
