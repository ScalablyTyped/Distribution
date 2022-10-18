package typings.azureMsalCommon

import typings.azureMsalCommon.distClientBaseClientMod.BaseClient
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distRequestCommonOnBehalfOfRequestMod.CommonOnBehalfOfRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientOnBehalfOfClientMod {
  
  @JSImport("@azure/msal-common/dist/client/OnBehalfOfClient", "OnBehalfOfClient")
  @js.native
  open class OnBehalfOfClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    
    /**
      * Public API to acquire tokens with on behalf of flow
      * @param request
      */
    def acquireToken(request: CommonOnBehalfOfRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * generate a server request in accepable format
      * @param request
      */
    /* private */ var createTokenRequestBody: Any = js.native
    
    /**
      * Make a network call to the server requesting credentials
      * @param request
      * @param authority
      */
    /* private */ var executeTokenRequest: Any = js.native
    
    /**
      * look up cache for tokens
      * Find idtoken in the cache
      * Find accessToken based on user assertion and account info in the cache
      * Please note we are not yet supported OBO tokens refreshed with long lived RT. User will have to send a new assertion if the current access token expires
      * This is to prevent security issues when the assertion changes over time, however, longlived RT helps retaining the session
      * @param request
      */
    /* private */ var getCachedAuthenticationResult: Any = js.native
    
    /**
      * Fetches the cached access token based on incoming assertion
      * @param clientId
      * @param request
      * @param userAssertionHash
      */
    /* private */ var readAccessTokenFromCacheForOBO: Any = js.native
    
    /**
      * read idtoken from cache, this is a specific implementation for OBO as the requirements differ from a generic lookup in the cacheManager
      * Certain use cases of OBO flow do not expect an idToken in the cache/or from the service
      * @param request
      */
    /* private */ var readIdTokenFromCacheForOBO: Any = js.native
    
    /* private */ var scopeSet: Any = js.native
    
    /* private */ var userAssertionHash: Any = js.native
  }
}
