package typings.azureMsalCommon

import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.baseClientMod.BaseClient
import typings.azureMsalCommon.clientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.commonRefreshTokenRequestMod.CommonRefreshTokenRequest
import typings.azureMsalCommon.commonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshTokenClientMod {
  
  @JSImport("@azure/msal-common/dist/client/RefreshTokenClient", "RefreshTokenClient")
  @js.native
  open class RefreshTokenClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
    
    def acquireToken(request: CommonRefreshTokenRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Gets cached refresh token and attaches to request, then calls acquireToken API
      * @param request
      */
    def acquireTokenByRefreshToken(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * makes a network call to acquire tokens by exchanging RefreshToken available in userCache; throws if refresh token is not cached
      * @param request
      */
    /* private */ var acquireTokenWithCachedRefreshToken: Any = js.native
    
    /**
      * Creates query string for the /token request
      * @param request
      */
    /* private */ var createTokenQueryParameters: Any = js.native
    
    /**
      * Helper function to create the token request body
      * @param request
      */
    /* private */ var createTokenRequestBody: Any = js.native
    
    /**
      * Constructs the network message and makes a NW call to the underlying secure token service
      * @param request
      * @param authority
      */
    /* private */ var executeTokenRequest: Any = js.native
  }
}
