package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typings.azureMsalCommon.distAccountCcsCredentialMod.CcsCredential
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distRequestCommonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.distResponseAuthorizationCodePayloadMod.AuthorizationCodePayload
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.mod.Authority
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionHandlerInteractionHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_handler/InteractionHandler", "InteractionHandler")
  @js.native
  open class InteractionHandler protected () extends StObject {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: Logger,
      performanceClient: IPerformanceClient
    ) = this()
    
    /* protected */ var authCodeRequest: CommonAuthorizationCodeRequest = js.native
    
    /* protected */ var authModule: AuthorizationCodeClient = js.native
    
    /* protected */ var browserStorage: BrowserCacheManager = js.native
    
    /**
      * Looks up ccs creds in the cache
      */
    /* protected */ def checkCcsCredentials(): CcsCredential | Null = js.native
    
    /**
      * Function to handle response parameters from hash.
      * @param locationHash
      */
    def handleCodeResponseFromHash(locationHash: String, state: String, authority: Authority, networkModule: INetworkModule): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Process auth code response from AAD
      * @param authCodeResponse
      * @param state
      * @param authority
      * @param networkModule
      * @returns
      */
    def handleCodeResponseFromServer(
      authCodeResponse: AuthorizationCodePayload,
      state: String,
      authority: Authority,
      networkModule: INetworkModule
    ): js.Promise[AuthenticationResult] = js.native
    def handleCodeResponseFromServer(
      authCodeResponse: AuthorizationCodePayload,
      state: String,
      authority: Authority,
      networkModule: INetworkModule,
      validateNonce: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /* protected */ var performanceClient: IPerformanceClient = js.native
    
    /**
      * Updates authority based on cloudInstanceHostname
      * @param cloudInstanceHostname
      * @param authority
      * @param networkModule
      */
    /* protected */ def updateTokenEndpointAuthority(cloudInstanceHostname: String, authority: Authority, networkModule: INetworkModule): js.Promise[Unit] = js.native
  }
  
  type InteractionParams = js.Object
}
