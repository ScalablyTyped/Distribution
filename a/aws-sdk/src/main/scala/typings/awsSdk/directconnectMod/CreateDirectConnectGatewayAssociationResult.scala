package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectConnectGatewayAssociationResult extends StObject {
  
  /**
    * The association to be created.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}
object CreateDirectConnectGatewayAssociationResult {
  
  @scala.inline
  def apply(): CreateDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationResult]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationResultMutableBuilder[Self <: CreateDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = StObject.set(x, "directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationUndefined: Self = StObject.set(x, "directConnectGatewayAssociation", js.undefined)
  }
}
