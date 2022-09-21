package typings.azureMsalCommon

import typings.azureMsalCommon.appTokenProviderMod.IAppTokenProvider
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.baseClientMod.BaseClient
import typings.azureMsalCommon.clientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.commonClientCredentialRequestMod.CommonClientCredentialRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientCredentialClientMod {
  
  @JSImport("@azure/msal-common/dist/client/ClientCredentialClient", "ClientCredentialClient")
  @js.native
  open class ClientCredentialClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    def this(configuration: ClientConfiguration, appTokenProvider: IAppTokenProvider) = this()
    
    /**
      * Public API to acquire a token with ClientCredential Flow for Confidential clients
      * @param request
      */
    def acquireToken(request: CommonClientCredentialRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /* private */ val appTokenProvider: Any = js.native
    
    /**
      * generate the request to the server in the acceptable format
      * @param request
      */
    /* private */ var createTokenRequestBody: Any = js.native
    
    /**
      * Makes a network call to request the token from the service
      * @param request
      * @param authority
      */
    /* private */ var executeTokenRequest: Any = js.native
    
    /**
      * looks up cache if the tokens are cached already
      */
    /* private */ var getCachedAuthenticationResult: Any = js.native
    
    /**
      * Reads access token from the cache
      * TODO: Move this call to cacheManager instead
      */
    /* private */ var readAccessTokenFromCache: Any = js.native
    
    /* private */ var scopeSet: Any = js.native
  }
}
