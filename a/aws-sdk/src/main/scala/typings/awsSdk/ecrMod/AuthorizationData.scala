package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationData extends StObject {
  
  /**
    * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string is decoded, it is presented in the format user:password for private registry authentication using docker login.
    */
  var authorizationToken: js.UndefOr[Base64] = js.native
  
  /**
    * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
    */
  var expiresAt: js.UndefOr[ExpirationTimestamp] = js.native
  
  /**
    * The registry URL to use for this authorization token in a docker login command. The Amazon ECR registry URL format is https://aws_account_id.dkr.ecr.region.amazonaws.com. For example, https://012345678910.dkr.ecr.us-east-1.amazonaws.com.. 
    */
  var proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.native
}
object AuthorizationData {
  
  @scala.inline
  def apply(): AuthorizationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationData]
  }
  
  @scala.inline
  implicit class AuthorizationDataMutableBuilder[Self <: AuthorizationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationToken(value: Base64): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
    
    @scala.inline
    def setExpiresAt(value: ExpirationTimestamp): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    @scala.inline
    def setProxyEndpoint(value: ProxyEndpoint): Self = StObject.set(x, "proxyEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyEndpointUndefined: Self = StObject.set(x, "proxyEndpoint", js.undefined)
  }
}
