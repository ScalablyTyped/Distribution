package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoIdentityProvider extends StObject {
  
  /**
    * The client ID for the Amazon Cognito user pool.
    */
  var ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.undefined
  
  /**
    * The provider name for an Amazon Cognito user pool. For example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.
    */
  var ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.undefined
  
  /**
    * TRUE if server-side token validation is enabled for the identity provider’s token. Once you set ServerSideTokenCheck to TRUE for an identity pool, that identity pool will check with the integrated user pools to make sure that the user has not been globally signed out or deleted before the identity pool provides an OIDC token or AWS credentials for the user. If the user is signed out or deleted, the identity pool will return a 400 Not Authorized error.
    */
  var ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.undefined
}
object CognitoIdentityProvider {
  
  inline def apply(): CognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoIdentityProvider]
  }
  
  extension [Self <: CognitoIdentityProvider](x: Self) {
    
    inline def setClientId(value: CognitoIdentityProviderClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setProviderName(value: CognitoIdentityProviderName): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    inline def setServerSideTokenCheck(value: CognitoIdentityProviderTokenCheck): Self = StObject.set(x, "ServerSideTokenCheck", value.asInstanceOf[js.Any])
    
    inline def setServerSideTokenCheckUndefined: Self = StObject.set(x, "ServerSideTokenCheck", js.undefined)
  }
}
