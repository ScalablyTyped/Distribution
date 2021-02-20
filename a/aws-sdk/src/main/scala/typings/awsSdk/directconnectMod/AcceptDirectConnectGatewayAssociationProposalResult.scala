package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDirectConnectGatewayAssociationProposalResult extends StObject {
  
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}
object AcceptDirectConnectGatewayAssociationProposalResult {
  
  @scala.inline
  def apply(): AcceptDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalResult]
  }
  
  @scala.inline
  implicit class AcceptDirectConnectGatewayAssociationProposalResultMutableBuilder[Self <: AcceptDirectConnectGatewayAssociationProposalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = StObject.set(x, "directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationUndefined: Self = StObject.set(x, "directConnectGatewayAssociation", js.undefined)
  }
}
