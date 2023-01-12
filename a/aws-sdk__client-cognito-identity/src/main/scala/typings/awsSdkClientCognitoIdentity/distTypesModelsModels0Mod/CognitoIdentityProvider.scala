package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoIdentityProvider extends StObject {
  
  /**
    * <p>The client ID for the Amazon Cognito user pool.</p>
    */
  var ClientId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The provider name for an Amazon Cognito user pool. For example,
    *             <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.</p>
    */
  var ProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>TRUE if server-side token validation is enabled for the identity provider’s
    *          token.</p>
    *          <p>Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity pool, that
    *          identity pool will check with the integrated user pools to make sure that the user has not
    *          been globally signed out or deleted before the identity pool provides an OIDC token or AWS
    *          credentials for the user.</p>
    *          <p>If the user is signed out or deleted, the identity pool will return a 400 Not
    *          Authorized error.</p>
    */
  var ServerSideTokenCheck: js.UndefOr[Boolean] = js.undefined
}
object CognitoIdentityProvider {
  
  inline def apply(): CognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoIdentityProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CognitoIdentityProvider] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    inline def setServerSideTokenCheck(value: Boolean): Self = StObject.set(x, "ServerSideTokenCheck", value.asInstanceOf[js.Any])
    
    inline def setServerSideTokenCheckUndefined: Self = StObject.set(x, "ServerSideTokenCheck", js.undefined)
  }
}
