package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserCacheManagerMod.BrowserCacheManager
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.authorizationCodePayloadMod.AuthorizationCodePayload
import typings.azureMsalCommon.ccsCredentialMod.CcsCredential
import typings.azureMsalCommon.commonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.inetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.mod.Authority
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_handler/InteractionHandler", "InteractionHandler")
  @js.native
  open class InteractionHandler protected () extends StObject {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: Logger
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
