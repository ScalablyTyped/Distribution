package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectConnectGateway extends StObject {
  
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined
  
  /**
    * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
    */
  var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.undefined
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.undefined
}
object DirectConnectGateway {
  
  inline def apply(): DirectConnectGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGateway]
  }
  
  extension [Self <: DirectConnectGateway](x: Self) {
    
    inline def setAmazonSideAsn(value: LongAsn): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
    
    inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
    
    inline def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    inline def setDirectConnectGatewayName(value: DirectConnectGatewayName): Self = StObject.set(x, "directConnectGatewayName", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayNameUndefined: Self = StObject.set(x, "directConnectGatewayName", js.undefined)
    
    inline def setDirectConnectGatewayState(value: DirectConnectGatewayState): Self = StObject.set(x, "directConnectGatewayState", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayStateUndefined: Self = StObject.set(x, "directConnectGatewayState", js.undefined)
    
    inline def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setStateChangeError(value: StateChangeError): Self = StObject.set(x, "stateChangeError", value.asInstanceOf[js.Any])
    
    inline def setStateChangeErrorUndefined: Self = StObject.set(x, "stateChangeError", js.undefined)
  }
}
