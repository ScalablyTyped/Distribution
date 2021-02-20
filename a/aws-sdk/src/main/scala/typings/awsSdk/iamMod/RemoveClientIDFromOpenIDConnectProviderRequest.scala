package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveClientIDFromOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about client IDs, see CreateOpenIDConnectProvider.
    */
  var ClientID: clientIDType = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}
object RemoveClientIDFromOpenIDConnectProviderRequest {
  
  @scala.inline
  def apply(ClientID: clientIDType, OpenIDConnectProviderArn: arnType): RemoveClientIDFromOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveClientIDFromOpenIDConnectProviderRequest]
  }
  
  @scala.inline
  implicit class RemoveClientIDFromOpenIDConnectProviderRequestMutableBuilder[Self <: RemoveClientIDFromOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientID(value: clientIDType): Self = StObject.set(x, "ClientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
  }
}
