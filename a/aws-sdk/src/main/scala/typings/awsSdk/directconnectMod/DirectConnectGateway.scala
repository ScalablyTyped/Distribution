package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectConnectGateway extends StObject {
  
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.native
  
  /**
    * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
    */
  var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.native
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
}
object DirectConnectGateway {
  
  @scala.inline
  def apply(): DirectConnectGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGateway]
  }
  
  @scala.inline
  implicit class DirectConnectGatewayMutableBuilder[Self <: DirectConnectGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonSideAsn(value: LongAsn): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayName(value: DirectConnectGatewayName): Self = StObject.set(x, "directConnectGatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayNameUndefined: Self = StObject.set(x, "directConnectGatewayName", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayState(value: DirectConnectGatewayState): Self = StObject.set(x, "directConnectGatewayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayStateUndefined: Self = StObject.set(x, "directConnectGatewayState", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    @scala.inline
    def setStateChangeError(value: StateChangeError): Self = StObject.set(x, "stateChangeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeErrorUndefined: Self = StObject.set(x, "stateChangeError", js.undefined)
  }
}
