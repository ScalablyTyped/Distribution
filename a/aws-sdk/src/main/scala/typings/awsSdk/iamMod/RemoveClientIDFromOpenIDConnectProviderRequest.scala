package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
  
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
  implicit class RemoveClientIDFromOpenIDConnectProviderRequestOps[Self <: RemoveClientIDFromOpenIDConnectProviderRequest] (val x: Self) extends AnyVal {
    
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
