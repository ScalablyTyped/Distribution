package typings.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDeviceAuthorizationRequest extends js.Object {
  
  /**
    * The unique identifier string for the client that is registered with AWS SSO. This value should come from the persisted result of the RegisterClient API operation.
    */
  var clientId: ClientId = js.native
  
  /**
    * A secret string that is generated for the client. This value should come from the persisted result of the RegisterClient API operation.
    */
  var clientSecret: ClientSecret = js.native
  
  /**
    * The URL for the AWS SSO user portal. For more information, see Using the User Portal in the AWS Single Sign-On User Guide.
    */
  var startUrl: URI = js.native
}
object StartDeviceAuthorizationRequest {
  
  @scala.inline
  def apply(clientId: ClientId, clientSecret: ClientSecret, startUrl: URI): StartDeviceAuthorizationRequest = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeviceAuthorizationRequest]
  }
  
  @scala.inline
  implicit class StartDeviceAuthorizationRequestOps[Self <: StartDeviceAuthorizationRequest] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: ClientSecret): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUrl(value: URI): Self = this.set("startUrl", value.asInstanceOf[js.Any])
  }
}
