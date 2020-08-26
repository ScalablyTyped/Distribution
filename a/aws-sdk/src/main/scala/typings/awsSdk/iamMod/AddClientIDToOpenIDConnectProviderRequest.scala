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
  @scala.inline
  implicit class AddClientIDToOpenIDConnectProviderRequestOps[Self <: AddClientIDToOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientID(value: clientIDType): Self = this.set("ClientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenIDConnectProviderArn(value: arnType): Self = this.set("OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
  }
  
}

