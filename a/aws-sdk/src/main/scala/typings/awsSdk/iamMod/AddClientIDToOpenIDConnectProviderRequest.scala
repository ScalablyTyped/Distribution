package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddClientIDToOpenIDConnectProviderRequest extends js.Object {
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
}

