package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddClientIDToOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The client ID (also known as audience) to add to the IAM OpenID Connect provider resource.
    */
  var ClientID: clientIDType = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider resource to add the client ID to. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}
object AddClientIDToOpenIDConnectProviderRequest {
  
  @scala.inline
  def apply(ClientID: clientIDType, OpenIDConnectProviderArn: arnType): AddClientIDToOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddClientIDToOpenIDConnectProviderRequest]
  }
  
  @scala.inline
  implicit class AddClientIDToOpenIDConnectProviderRequestMutableBuilder[Self <: AddClientIDToOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientID(value: clientIDType): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
  }
}
