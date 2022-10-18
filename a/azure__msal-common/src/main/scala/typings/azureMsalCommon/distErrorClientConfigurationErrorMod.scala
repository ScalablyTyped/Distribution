package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Code
import typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorClientConfigurationErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationError")
  @js.native
  open class ClientConfigurationError protected () extends ClientAuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object ClientConfigurationError {
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error thrown when the claims request could not be successfully parsed
      */
    inline def createClaimsRequestParsingError(claimsRequestParseError: String): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClaimsRequestParsingError")(claimsRequestParseError.asInstanceOf[js.Any]).asInstanceOf[ClientConfigurationError]
    
    /**
      * Error thrown when client id scope is not provided as single scope.
      * @param inputScopes
      */
    inline def createClientIdSingleScopeError(inputScopes: js.Array[String]): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientIdSingleScopeError")(inputScopes.asInstanceOf[js.Any]).asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when token request is empty and nothing cached in storage.
      */
    inline def createEmptyLogoutRequestError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyLogoutRequestError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Error thrown when scopes are empty.
      * @param scopesValue
      */
    inline def createEmptyScopesArrayError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyScopesArrayError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when token request is empty and nothing cached in storage.
      */
    inline def createEmptyTokenRequestError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyTokenRequestError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Creates an error thrown if authority uri is given an insecure protocol.
      * @param urlString
      */
    inline def createInsecureAuthorityUriError(urlString: String): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecureAuthorityUriError")(urlString.asInstanceOf[js.Any]).asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when a provided header is invalid in any way
      */
    inline def createInvalidAuthenticationHeaderError(invalidHeaderName: String, details: String): ClientConfigurationError = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAuthenticationHeaderError")(invalidHeaderName.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws an error when the user passes invalid cloudDiscoveryMetadata
      */
    inline def createInvalidAuthorityMetadataError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAuthorityMetadataError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when the AzureCloudInstance is set to an invalid value
      */
    inline def createInvalidAzureCloudInstanceError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAzureCloudInstanceError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Creates error thrown when claims parameter is not a stringified JSON object
      */
    inline def createInvalidClaimsRequestError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidClaimsRequestError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws an error when the user passes invalid cloudDiscoveryMetadata
      */
    inline def createInvalidCloudDiscoveryMetadataError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCloudDiscoveryMetadataError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when an invalid code_challenge_method is passed by the user
      */
    inline def createInvalidCodeChallengeMethodError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCodeChallengeMethodError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when both params: code_challenge and code_challenge_method are not passed together
      */
    inline def createInvalidCodeChallengeParamsError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCodeChallengeParamsError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Error thrown when prompt is not an allowed type.
      * @param promptValue
      */
    inline def createInvalidPromptError(promptValue: String): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidPromptError")(promptValue.asInstanceOf[js.Any]).asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when provided headers don't contain a header that a server nonce can be extracted from
      */
    inline def createMissingNonceAuthenticationHeadersError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingNonceAuthenticationHeadersError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws an error when the authentication scheme is set to SSH but the SSH public key is omitted from the request
      */
    inline def createMissingSshJwkError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingSshJwkError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws an error when the authentication scheme is set to SSH but the SSH public key ID is omitted from the request
      */
    inline def createMissingSshKidError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingSshKidError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Creates an error thrown when the post-logout redirect uri is empty (not set by caller)
      */
    inline def createPostLogoutRedirectUriEmptyError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostLogoutRedirectUriEmptyError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Creates an error thrown when the redirect uri is empty (not set by caller)
      */
    inline def createRedirectUriEmptyError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectUriEmptyError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Throws error when provided authority is not a member of the trusted host list
      */
    inline def createUntrustedAuthorityError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUntrustedAuthorityError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Creates an error thrown if URL string is empty or null.
      * @param urlString
      */
    inline def createUrlEmptyError(): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlEmptyError")().asInstanceOf[ClientConfigurationError]
    
    /**
      * Creates an error thrown if URL string does not parse into separate segments.
      * @param urlString
      */
    inline def createUrlParseError(urlParseError: String): ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlParseError")(urlParseError.asInstanceOf[js.Any]).asInstanceOf[ClientConfigurationError]
  }
  
  object ClientConfigurationErrorMessage {
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.authorityUriInsecure")
    @js.native
    def authorityUriInsecure: Code = js.native
    inline def authorityUriInsecure_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authorityUriInsecure")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.claimsRequestParsingError")
    @js.native
    def claimsRequestParsingError: Code = js.native
    inline def claimsRequestParsingError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("claimsRequestParsingError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.clientIdSingleScopeError")
    @js.native
    def clientIdSingleScopeError: Code = js.native
    inline def clientIdSingleScopeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIdSingleScopeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.emptyScopesError")
    @js.native
    def emptyScopesError: Code = js.native
    inline def emptyScopesError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyScopesError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidAuthenticationHeader")
    @js.native
    def invalidAuthenticationHeader: Code = js.native
    inline def invalidAuthenticationHeader_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAuthenticationHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidAuthorityMetadata")
    @js.native
    def invalidAuthorityMetadata: Code = js.native
    inline def invalidAuthorityMetadata_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAuthorityMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidAzureCloudInstance")
    @js.native
    def invalidAzureCloudInstance: Code = js.native
    inline def invalidAzureCloudInstance_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAzureCloudInstance")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidClaimsRequest")
    @js.native
    def invalidClaimsRequest: Code = js.native
    inline def invalidClaimsRequest_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidClaimsRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidCloudDiscoveryMetadata")
    @js.native
    def invalidCloudDiscoveryMetadata: Code = js.native
    inline def invalidCloudDiscoveryMetadata_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCloudDiscoveryMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidCodeChallengeMethod")
    @js.native
    def invalidCodeChallengeMethod: Code = js.native
    inline def invalidCodeChallengeMethod_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCodeChallengeMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidCodeChallengeParams")
    @js.native
    def invalidCodeChallengeParams: Code = js.native
    inline def invalidCodeChallengeParams_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCodeChallengeParams")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.invalidPrompt")
    @js.native
    def invalidPrompt: Code = js.native
    inline def invalidPrompt_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidPrompt")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.logoutRequestEmptyError")
    @js.native
    def logoutRequestEmptyError: Code = js.native
    inline def logoutRequestEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoutRequestEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.missingNonceAuthenticationHeader")
    @js.native
    def missingNonceAuthenticationHeader: Code = js.native
    inline def missingNonceAuthenticationHeader_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingNonceAuthenticationHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.missingSshJwk")
    @js.native
    def missingSshJwk: Code = js.native
    inline def missingSshJwk_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingSshJwk")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.missingSshKid")
    @js.native
    def missingSshKid: Code = js.native
    inline def missingSshKid_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingSshKid")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.nonArrayScopesError")
    @js.native
    def nonArrayScopesError: Code = js.native
    inline def nonArrayScopesError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonArrayScopesError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.postLogoutUriNotSet")
    @js.native
    def postLogoutUriNotSet: Code = js.native
    inline def postLogoutUriNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postLogoutUriNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.redirectUriNotSet")
    @js.native
    def redirectUriNotSet: Code = js.native
    inline def redirectUriNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redirectUriNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.tokenRequestEmptyError")
    @js.native
    def tokenRequestEmptyError: Code = js.native
    inline def tokenRequestEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRequestEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.untrustedAuthority")
    @js.native
    def untrustedAuthority: Code = js.native
    inline def untrustedAuthority_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("untrustedAuthority")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.urlEmptyError")
    @js.native
    def urlEmptyError: Code = js.native
    inline def urlEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientConfigurationError", "ClientConfigurationErrorMessage.urlParseError")
    @js.native
    def urlParseError: Code = js.native
    inline def urlParseError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlParseError")(x.asInstanceOf[js.Any])
  }
}
