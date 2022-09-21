package typings.azureMsalCommon

import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.authorizationCodePayloadMod.AuthorizationCodePayload
import typings.azureMsalCommon.baseClientMod.BaseClient
import typings.azureMsalCommon.clientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.commonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.commonAuthorizationUrlRequestMod.CommonAuthorizationUrlRequest
import typings.azureMsalCommon.commonEndSessionRequestMod.CommonEndSessionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizationCodeClientMod {
  
  @JSImport("@azure/msal-common/dist/client/AuthorizationCodeClient", "AuthorizationCodeClient")
  @js.native
  open class AuthorizationCodeClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    
    /**
      * API to acquire a token in exchange of 'authorization_code` acquired by the user in the first leg of the
      * authorization_code_grant
      * @param request
      */
    def acquireToken(request: CommonAuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    def acquireToken(request: CommonAuthorizationCodeRequest, authCodePayload: AuthorizationCodePayload): js.Promise[AuthenticationResult] = js.native
    
    /**
      * This API validates the `AuthorizationCodeUrlRequest` and creates a URL
      * @param request
      */
    /* private */ var createAuthCodeUrlQueryString: Any = js.native
    
    /**
      * This API validates the `EndSessionRequest` and creates a URL
      * @param request
      */
    /* private */ var createLogoutUrlQueryString: Any = js.native
    
    /**
      * Creates query string for the /token request
      * @param request
      */
    /* private */ var createTokenQueryParameters: Any = js.native
    
    /**
      * Generates a map for all the params to be sent to the service
      * @param request
      */
    /* private */ var createTokenRequestBody: Any = js.native
    
    /**
      * Executes POST request to token endpoint
      * @param authority
      * @param request
      */
    /* private */ var executeTokenRequest: Any = js.native
    
    /**
      * Helper to get sid from account. Returns null if idTokenClaims are not present or sid is not present.
      * @param account
      */
    /* private */ var extractAccountSid: Any = js.native
    
    /* private */ var extractLoginHint: Any = js.native
    
    /**
      * Creates the URL of the authorization request letting the user input credentials and consent to the
      * application. The URL target the /authorize endpoint of the authority configured in the
      * application object.
      *
      * Once the user inputs their credentials and consents, the authority will send a response to the redirect URI
      * sent in the request and should contain an authorization code, which can then be used to acquire tokens via
      * acquireToken(AuthorizationCodeRequest)
      * @param request
      */
    def getAuthCodeUrl(request: CommonAuthorizationUrlRequest): js.Promise[String] = js.native
    
    /**
      * Used to log out the current user, and redirect the user to the postLogoutRedirectUri.
      * Default behaviour is to redirect the user to `window.location.href`.
      * @param authorityUri
      */
    def getLogoutUri(logoutRequest: CommonEndSessionRequest): String = js.native
    
    /**
      * Handles the hash fragment response from public client code request. Returns a code response used by
      * the client to exchange for a token in acquireToken.
      * @param hashFragment
      */
    def handleFragmentResponse(hashFragment: String, cachedState: String): AuthorizationCodePayload = js.native
    
    /* protected */ var includeRedirectUri: Boolean = js.native
  }
}
