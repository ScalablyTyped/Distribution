package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationData extends StObject {
  
  /**
    * A base64-encoded string that contains authorization data for the specified Amazon ECR registry. When the string is decoded, it is presented in the format user:password for private registry authentication using docker login.
    */
  var authorizationToken: js.UndefOr[Base64] = js.undefined
  
  /**
    * The Unix time in seconds and milliseconds when the authorization token expires. Authorization tokens are valid for 12 hours.
    */
  var expiresAt: js.UndefOr[ExpirationTimestamp] = js.undefined
  
  /**
    * The registry URL to use for this authorization token in a docker login command. The Amazon ECR registry URL format is https://aws_account_id.dkr.ecr.region.amazonaws.com. For example, https://012345678910.dkr.ecr.us-east-1.amazonaws.com.. 
    */
  var proxyEndpoint: js.UndefOr[ProxyEndpoint] = js.undefined
}
object AuthorizationData {
  
  inline def apply(): AuthorizationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationData]
  }
  
  extension [Self <: AuthorizationData](x: Self) {
    
    inline def setAuthorizationToken(value: Base64): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
    
    inline def setExpiresAt(value: ExpirationTimestamp): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setProxyEndpoint(value: ProxyEndpoint): Self = StObject.set(x, "proxyEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProxyEndpointUndefined: Self = StObject.set(x, "proxyEndpoint", js.undefined)
  }
}
