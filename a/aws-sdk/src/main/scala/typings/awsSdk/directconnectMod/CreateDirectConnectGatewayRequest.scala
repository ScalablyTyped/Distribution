package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectConnectGatewayRequest extends StObject {
  
  /**
    * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294. The default is 64512.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: DirectConnectGatewayName = js.native
}
object CreateDirectConnectGatewayRequest {
  
  @scala.inline
  def apply(directConnectGatewayName: DirectConnectGatewayName): CreateDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayName = directConnectGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayRequest]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayRequestMutableBuilder[Self <: CreateDirectConnectGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmazonSideAsn(value: LongAsn): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayName(value: DirectConnectGatewayName): Self = StObject.set(x, "directConnectGatewayName", value.asInstanceOf[js.Any])
  }
}
