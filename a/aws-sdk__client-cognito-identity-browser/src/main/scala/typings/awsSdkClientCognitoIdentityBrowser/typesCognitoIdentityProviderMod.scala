package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCognitoIdentityProviderMod {
  
  trait CognitoIdentityProvider extends StObject {
    
    /**
      * <p>The client ID for the Amazon Cognito Identity User Pool.</p>
      */
    var ClientId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The provider name for an Amazon Cognito Identity User Pool. For example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.</p>
      */
    var ProviderName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>TRUE if server-side token validation is enabled for the identity provider’s token.</p>
      */
    var ServerSideTokenCheck: js.UndefOr[Boolean] = js.undefined
  }
  object CognitoIdentityProvider {
    
    @scala.inline
    def apply(): CognitoIdentityProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CognitoIdentityProvider]
    }
    
    @scala.inline
    implicit class CognitoIdentityProviderMutableBuilder[Self <: CognitoIdentityProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
      
      @scala.inline
      def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
      
      @scala.inline
      def setServerSideTokenCheck(value: Boolean): Self = StObject.set(x, "ServerSideTokenCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideTokenCheckUndefined: Self = StObject.set(x, "ServerSideTokenCheck", js.undefined)
    }
  }
  
  type UnmarshalledCognitoIdentityProvider = CognitoIdentityProvider
}
