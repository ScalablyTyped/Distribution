package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayAssociationResult extends StObject {
  
  /**
    * Information about the deleted association.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}
object DeleteDirectConnectGatewayAssociationResult {
  
  @scala.inline
  def apply(): DeleteDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
  }
  
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationResultMutableBuilder[Self <: DeleteDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = StObject.set(x, "directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationUndefined: Self = StObject.set(x, "directConnectGatewayAssociation", js.undefined)
  }
}
