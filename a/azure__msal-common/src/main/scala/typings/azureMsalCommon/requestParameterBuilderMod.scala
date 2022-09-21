package typings.azureMsalCommon

import typings.azureMsalCommon.clientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.clientConfigurationMod.LibraryInfo
import typings.azureMsalCommon.clientInfoMod.ClientInfo
import typings.azureMsalCommon.constantsMod.ResponseMode
import typings.azureMsalCommon.msalTypesMod.StringDict
import typings.azureMsalCommon.serverTelemetryManagerMod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestParameterBuilderMod {
  
  @JSImport("@azure/msal-common/dist/request/RequestParameterBuilder", "RequestParameterBuilder")
  @js.native
  open class RequestParameterBuilder () extends StObject {
    
    /**
      * Add client telemetry parameters
      * @param appTelemetry
      */
    def addApplicationTelemetry(appTelemetry: ApplicationTelemetry): Unit = js.native
    
    /**
      * add the `authorization_code` passed by the user to exchange for a token
      * @param code
      */
    def addAuthorizationCode(code: String): Unit = js.native
    
    /**
      * Adds the CCS (Cache Credential Service) query parameter for account object
      * @param loginHint
      */
    def addCcsOid(clientInfo: ClientInfo): Unit = js.native
    
    /**
      * Adds the CCS (Cache Credential Service) query parameter for login_hint
      * @param loginHint
      */
    def addCcsUpn(loginHint: String): Unit = js.native
    
    /**
      * add claims
      * @param claims
      */
    def addClaims(): Unit = js.native
    def addClaims(claims: String): Unit = js.native
    def addClaims(claims: String, clientCapabilities: js.Array[String]): Unit = js.native
    def addClaims(claims: Unit, clientCapabilities: js.Array[String]): Unit = js.native
    
    /**
      * add clientAssertion for confidential client flows
      * @param clientAssertion
      */
    def addClientAssertion(clientAssertion: String): Unit = js.native
    
    /**
      * add clientAssertionType for confidential client flows
      * @param clientAssertionType
      */
    def addClientAssertionType(clientAssertionType: String): Unit = js.native
    
    def addClientCapabilitiesToClaims(): String = js.native
    def addClientCapabilitiesToClaims(claims: String): String = js.native
    def addClientCapabilitiesToClaims(claims: String, clientCapabilities: js.Array[String]): String = js.native
    def addClientCapabilitiesToClaims(claims: Unit, clientCapabilities: js.Array[String]): String = js.native
    
    /**
      * add clientId
      * @param clientId
      */
    def addClientId(clientId: String): Unit = js.native
    
    /**
      * add client info
      *
      */
    def addClientInfo(): Unit = js.native
    
    /**
      * add client_secret
      * @param clientSecret
      */
    def addClientSecret(clientSecret: String): Unit = js.native
    
    /**
      * add code_challenge and code_challenge_method
      * - throw if either of them are not passed
      * @param codeChallenge
      * @param codeChallengeMethod
      */
    def addCodeChallengeParams(codeChallenge: String, codeChallengeMethod: String): Unit = js.native
    
    /**
      * add the `code_verifier` passed by the user to exchange for a token
      * @param codeVerifier
      */
    def addCodeVerifier(codeVerifier: String): Unit = js.native
    
    /**
      * add correlationId
      * @param correlationId
      */
    def addCorrelationId(correlationId: String): Unit = js.native
    
    /**
      * add the `authorization_code` passed by the user to exchange for a token
      * @param code
      */
    def addDeviceCode(code: String): Unit = js.native
    
    /**
      * add domain_hint
      * @param domainHint
      */
    def addDomainHint(domainHint: String): Unit = js.native
    
    /**
      * add extraQueryParams
      * @param eQparams
      */
    def addExtraQueryParameters(eQparams: StringDict): Unit = js.native
    
    /**
      * add grant type
      * @param grantType
      */
    def addGrantType(grantType: String): Unit = js.native
    
    /**
      * add id_token_hint to logout request
      * @param idTokenHint
      */
    def addIdTokenHint(idTokenHint: String): Unit = js.native
    
    /**
      * add library info query params
      * @param libraryInfo
      */
    def addLibraryInfo(libraryInfo: LibraryInfo): Unit = js.native
    
    /**
      * add login_hint
      * @param loginHint
      */
    def addLoginHint(loginHint: String): Unit = js.native
    
    /**
      * Adds logout_hint parameter for "silent" logout which prevent server account picker
      */
    def addLogoutHint(logoutHint: String): Unit = js.native
    
    /**
      * Add flag to indicate STS should attempt to use WAM if available
      */
    def addNativeBroker(): Unit = js.native
    
    /**
      * add nonce
      * @param nonce
      */
    def addNonce(nonce: String): Unit = js.native
    
    /**
      * add OBO assertion for confidential client flows
      * @param clientAssertion
      */
    def addOboAssertion(oboAssertion: String): Unit = js.native
    
    /**
      * adds `password` for Password Grant flow
      * @param password
      */
    def addPassword(password: String): Unit = js.native
    
    /**
      * add pop_jwk to query params
      * @param cnfString
      */
    def addPopToken(cnfString: String): Unit = js.native
    
    /**
      * add post logout redirectUri
      * @param redirectUri
      */
    def addPostLogoutRedirectUri(redirectUri: String): Unit = js.native
    
    /**
      * add prompt
      * @param prompt
      */
    def addPrompt(prompt: String): Unit = js.native
    
    /**
      * add redirect_uri
      * @param redirectUri
      */
    def addRedirectUri(redirectUri: String): Unit = js.native
    
    /**
      * add the `refreshToken` passed by the user
      * @param refreshToken
      */
    def addRefreshToken(refreshToken: String): Unit = js.native
    
    /**
      * add grant type
      * @param grantType
      */
    def addRequestTokenUse(tokenUse: String): Unit = js.native
    
    /**
      * add response_mode. defaults to query.
      * @param responseMode
      */
    def addResponseMode(): Unit = js.native
    def addResponseMode(responseMode: ResponseMode): Unit = js.native
    
    /**
      * add response_type = code
      */
    def addResponseTypeCode(): Unit = js.native
    
    /**
      * add response_type = token id_token
      */
    def addResponseTypeForTokenAndIdToken(): Unit = js.native
    
    /**
      * add scopes. set addOidcScopes to false to prevent default scopes in non-user scenarios
      * @param scopeSet
      * @param addOidcScopes
      */
    def addScopes(scopes: js.Array[String]): Unit = js.native
    def addScopes(scopes: js.Array[String], addOidcScopes: Boolean): Unit = js.native
    
    /**
      * add server telemetry fields
      * @param serverTelemetryManager
      */
    def addServerTelemetry(serverTelemetryManager: ServerTelemetryManager): Unit = js.native
    
    /**
      * add sid
      * @param sid
      */
    def addSid(sid: String): Unit = js.native
    
    /**
      * add SSH JWK and key ID to query params
      */
    def addSshJwk(sshJwkString: String): Unit = js.native
    
    /**
      * add state
      * @param state
      */
    def addState(state: String): Unit = js.native
    
    /**
      * Adds parameter that indicates to the server that throttling is supported
      */
    def addThrottling(): Unit = js.native
    
    /**
      * adds `username` for Password Grant flow
      * @param username
      */
    def addUsername(username: String): Unit = js.native
    
    /**
      * Utility to create a URL from the params map
      */
    def createQueryString(): String = js.native
    
    /* private */ var parameters: Any = js.native
  }
}
