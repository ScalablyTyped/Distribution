package typings.azureMsalCommon

import typings.azureMsalCommon.anon.Code
import typings.azureMsalCommon.distErrorAuthErrorMod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorClientAuthErrorMod {
  
  @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthError")
  @js.native
  open class ClientAuthError protected () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object ClientAuthError {
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Throws error when attempting to append a null, undefined or empty scope to a set
      * @param givenScope
      */
    inline def createAppendEmptyScopeToSetError(givenScope: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppendEmptyScopeToSetError")(givenScope.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when attempting to append null or empty ScopeSet.
      * @param appendError
      */
    inline def createAppendScopeSetError(appendError: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppendScopeSetError")(appendError.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when max_age was provided in the request, but auth_time is not in the token claims
      * @param missingNonce
      */
    inline def createAuthTimeNotFoundError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthTimeNotFoundError")().asInstanceOf[ClientAuthError]
    
    inline def createBindingKeyNotRemovedError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBindingKeyNotRemovedError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if ICachePlugin not set on CacheManager.
      */
    inline def createCachePluginError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCachePluginError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when client info object doesn't decode correctly.
      * @param caughtError
      */
    inline def createClientInfoDecodingError(caughtError: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientInfoDecodingError")(caughtError.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown if the client info is empty.
      * @param rawClientInfo
      */
    inline def createClientInfoEmptyError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientInfoEmptyError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if user sets CancellationToken.cancel = true during polling of token endpoint during device code flow
      */
    inline def createDeviceCodeCancelledError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeCancelledError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if device code is expired
      */
    inline def createDeviceCodeExpiredError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeExpiredError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if device code is expired
      */
    inline def createDeviceCodeUnknownError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeUnknownError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if ScopeSet is null or undefined.
      * @param givenScopeSet
      */
    inline def createEmptyInputScopeSetError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyInputScopeSetError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the endpoint discovery doesn't complete correctly.
      */
    inline def createEndpointDiscoveryIncompleteError(errDetail: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEndpointDiscoveryIncompleteError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the hash cannot be deserialized.
      * @param hashParamObj
      */
    inline def createHashNotDeserializedError(hashParamObj: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashNotDeserializedError")(hashParamObj.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if client assertion is not valid.
      */
    inline def createInvalidAssertionError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAssertionError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when provided environment is not part of the CloudDiscoveryMetadata object
      */
    inline def createInvalidCacheEnvironmentError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheEnvironmentError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if cache type is invalid.
      */
    inline def createInvalidCacheTypeError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheTypeError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if client assertion is not valid.
      */
    inline def createInvalidCredentialError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCredentialError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the state cannot be parsed.
      * @param invalidState
      */
    inline def createInvalidStateError(invalidState: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidStateError")(invalidState.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    inline def createInvalidStateError(invalidState: String, errorString: String): ClientAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidStateError")(invalidState.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[ClientAuthError]
    
    /**
      * Create an error when kid attribute is missing from a PoP token's cache record
      */
    inline def createKeyIdMissingError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyIdMissingError")().asInstanceOf[ClientAuthError]
    
    /**
      * Thrown when logout is attempted for an authority that doesnt have an end_session_endpoint
      */
    inline def createLogoutNotSupportedError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogoutNotSupportedError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when too much time has elapsed since the last end-user authentication
      */
    inline def createMaxAgeTranspiredError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaxAgeTranspiredError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when multiple accounts are in cache for the given params
      */
    inline def createMultipleMatchingAccountsInCacheError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingAccountsInCacheError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when multiple appMetada are in cache for the given clientId.
      */
    inline def createMultipleMatchingAppMetadataInCacheError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingAppMetadataInCacheError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when multiple tokens are in cache.
      */
    inline def createMultipleMatchingTokensInCacheError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingTokensInCacheError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the fetch client throws
      */
    inline def createNetworkError(endpoint: String, errDetail: String): ClientAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createNetworkError")(endpoint.asInstanceOf[js.Any], errDetail.asInstanceOf[js.Any])).asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when account is not found in cache.
      */
    inline def createNoAccountFoundError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountFoundError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when silent requests are made without an account object
      */
    inline def createNoAccountInSilentRequestError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountInSilentRequestError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when the authorization code is missing from the server response
      */
    inline def createNoAuthCodeInServerResponseError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAuthCodeInServerResponseError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if crypto object not found.
      * @param operationName
      */
    inline def createNoCryptoObjectError(operationName: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoCryptoObjectError")(operationName.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Create an error when the client does not have network connectivity
      */
    inline def createNoNetworkConnectivityError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoNetworkConnectivityError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the nonce does not match.
      */
    inline def createNonceMismatchError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceMismatchError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the mnonce is not present
      * @param missingNonce
      */
    inline def createNonceNotFoundError(missingNonce: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceNotFoundError")(missingNonce.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when cache record is null or undefined.
      */
    inline def createNullOrUndefinedCacheRecord(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullOrUndefinedCacheRecord")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if token cannot be retrieved from cache due to refresh being required.
      */
    inline def createRefreshRequiredError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshRequiredError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when attempting to append a null, undefined or empty scope to a set
      * @param givenScope
      */
    inline def createRemoveEmptyScopeFromSetError(givenScope: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveEmptyScopeFromSetError")(givenScope.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when two states do not match.
      */
    inline def createStateMismatchError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateMismatchError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the state is not present
      * @param missingState
      */
    inline def createStateNotFoundError(missingState: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateNotFoundError")(missingState.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    inline def createTokenClaimsRequiredError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenClaimsRequiredError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the id token string is null or empty.
      * @param invalidRawTokenString
      */
    inline def createTokenNullOrEmptyError(invalidRawTokenString: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenNullOrEmptyError")(invalidRawTokenString.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the id token extraction errors out.
      * @param err
      */
    inline def createTokenParsingError(caughtExtractionError: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenParsingError")(caughtExtractionError.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Throws error when no auth code or refresh token is given to ServerTokenRequestParameters.
      */
    inline def createTokenRequestCannotBeMadeError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenRequestCannotBeMadeError")().asInstanceOf[ClientAuthError]
    
    /**
      * Creates an error thrown when the openid-configuration endpoint cannot be reached or does not contain the required data
      */
    inline def createUnableToGetOpenidConfigError(errDetail: String): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToGetOpenidConfigError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if unexpected account type.
      */
    inline def createUnexpectedAccountTypeError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedAccountTypeError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if unexpected credential type.
      */
    inline def createUnexpectedCredentialTypeError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedCredentialTypeError")().asInstanceOf[ClientAuthError]
    
    /**
      * Create an error when the user cancels the flow
      */
    inline def createUserCanceledError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserCanceledError")().asInstanceOf[ClientAuthError]
    
    /**
      * Throws error if the user defined timeout is reached.
      */
    inline def createUserTimeoutReachedError(): ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserTimeoutReachedError")().asInstanceOf[ClientAuthError]
  }
  
  object ClientAuthErrorMessage {
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.CachePluginError")
    @js.native
    def CachePluginError: Code = js.native
    inline def CachePluginError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CachePluginError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.DeviceCodeExpired")
    @js.native
    def DeviceCodeExpired: Code = js.native
    inline def DeviceCodeExpired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceCodeExpired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.DeviceCodePollingCancelled")
    @js.native
    def DeviceCodePollingCancelled: Code = js.native
    inline def DeviceCodePollingCancelled_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceCodePollingCancelled")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.DeviceCodeUnknownError")
    @js.native
    def DeviceCodeUnknownError: Code = js.native
    inline def DeviceCodeUnknownError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceCodeUnknownError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.NoAccountInSilentRequest")
    @js.native
    def NoAccountInSilentRequest: Code = js.native
    inline def NoAccountInSilentRequest_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoAccountInSilentRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.accessTokenEntityNullError")
    @js.native
    def accessTokenEntityNullError: Code = js.native
    inline def accessTokenEntityNullError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessTokenEntityNullError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.appendEmptyScopeError")
    @js.native
    def appendEmptyScopeError: Code = js.native
    inline def appendEmptyScopeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendEmptyScopeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.appendScopeSetError")
    @js.native
    def appendScopeSetError: Code = js.native
    inline def appendScopeSetError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendScopeSetError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.authTimeNotFoundError")
    @js.native
    def authTimeNotFoundError: Code = js.native
    inline def authTimeNotFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authTimeNotFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.bindingKeyNotRemovedError")
    @js.native
    def bindingKeyNotRemovedError: Code = js.native
    inline def bindingKeyNotRemovedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingKeyNotRemovedError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.blankGuidGenerated")
    @js.native
    def blankGuidGenerated: Code = js.native
    inline def blankGuidGenerated_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blankGuidGenerated")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.clientInfoDecodingError")
    @js.native
    def clientInfoDecodingError: Code = js.native
    inline def clientInfoDecodingError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientInfoDecodingError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.clientInfoEmptyError")
    @js.native
    def clientInfoEmptyError: Code = js.native
    inline def clientInfoEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientInfoEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.emptyInputScopeSetError")
    @js.native
    def emptyInputScopeSetError: Code = js.native
    inline def emptyInputScopeSetError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyInputScopeSetError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.endpointResolutionError")
    @js.native
    def endpointResolutionError: Code = js.native
    inline def endpointResolutionError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endpointResolutionError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.hashNotDeserialized")
    @js.native
    def hashNotDeserialized: Code = js.native
    inline def hashNotDeserialized_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashNotDeserialized")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.invalidAssertion")
    @js.native
    def invalidAssertion: Code = js.native
    inline def invalidAssertion_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAssertion")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.invalidCacheEnvironment")
    @js.native
    def invalidCacheEnvironment: Code = js.native
    inline def invalidCacheEnvironment_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheEnvironment")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.invalidCacheRecord")
    @js.native
    def invalidCacheRecord: Code = js.native
    inline def invalidCacheRecord_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheRecord")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.invalidCacheType")
    @js.native
    def invalidCacheType: Code = js.native
    inline def invalidCacheType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.invalidClientCredential")
    @js.native
    def invalidClientCredential: Code = js.native
    inline def invalidClientCredential_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidClientCredential")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.invalidStateError")
    @js.native
    def invalidStateError: Code = js.native
    inline def invalidStateError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.keyIdMissing")
    @js.native
    def keyIdMissing: Code = js.native
    inline def keyIdMissing_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyIdMissing")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.logoutNotSupported")
    @js.native
    def logoutNotSupported: Code = js.native
    inline def logoutNotSupported_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoutNotSupported")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.maxAgeTranspiredError")
    @js.native
    def maxAgeTranspiredError: Code = js.native
    inline def maxAgeTranspiredError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxAgeTranspiredError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.multipleMatchingAccounts")
    @js.native
    def multipleMatchingAccounts: Code = js.native
    inline def multipleMatchingAccounts_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleMatchingAccounts")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.multipleMatchingAppMetadata")
    @js.native
    def multipleMatchingAppMetadata: Code = js.native
    inline def multipleMatchingAppMetadata_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleMatchingAppMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.multipleMatchingTokens")
    @js.native
    def multipleMatchingTokens: Code = js.native
    inline def multipleMatchingTokens_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleMatchingTokens")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.networkError")
    @js.native
    def networkError: Code = js.native
    inline def networkError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("networkError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.noAccountFound")
    @js.native
    def noAccountFound: Code = js.native
    inline def noAccountFound_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAccountFound")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.noAuthorizationCodeFromServer")
    @js.native
    def noAuthorizationCodeFromServer: Code = js.native
    inline def noAuthorizationCodeFromServer_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAuthorizationCodeFromServer")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.noAzureRegionDetected")
    @js.native
    def noAzureRegionDetected: Code = js.native
    inline def noAzureRegionDetected_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAzureRegionDetected")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.noCryptoObj")
    @js.native
    def noCryptoObj: Code = js.native
    inline def noCryptoObj_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noCryptoObj")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.noNetworkConnectivity")
    @js.native
    def noNetworkConnectivity: Code = js.native
    inline def noNetworkConnectivity_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noNetworkConnectivity")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.noTokensFoundError")
    @js.native
    def noTokensFoundError: Code = js.native
    inline def noTokensFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noTokensFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.nonceMismatchError")
    @js.native
    def nonceMismatchError: Code = js.native
    inline def nonceMismatchError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonceMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.nonceNotFoundError")
    @js.native
    def nonceNotFoundError: Code = js.native
    inline def nonceNotFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonceNotFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.nullOrEmptyToken")
    @js.native
    def nullOrEmptyToken: Code = js.native
    inline def nullOrEmptyToken_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullOrEmptyToken")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.removeEmptyScopeError")
    @js.native
    def removeEmptyScopeError: Code = js.native
    inline def removeEmptyScopeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyScopeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.stateMismatchError")
    @js.native
    def stateMismatchError: Code = js.native
    inline def stateMismatchError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.stateNotFoundError")
    @js.native
    def stateNotFoundError: Code = js.native
    inline def stateNotFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateNotFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.tokenClaimsRequired")
    @js.native
    def tokenClaimsRequired: Code = js.native
    inline def tokenClaimsRequired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenClaimsRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.tokenParsingError")
    @js.native
    def tokenParsingError: Code = js.native
    inline def tokenParsingError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenParsingError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.tokenRefreshRequired")
    @js.native
    def tokenRefreshRequired: Code = js.native
    inline def tokenRefreshRequired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRefreshRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.tokenRequestCannotBeMade")
    @js.native
    def tokenRequestCannotBeMade: Code = js.native
    inline def tokenRequestCannotBeMade_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRequestCannotBeMade")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.unableToGetOpenidConfigError")
    @js.native
    def unableToGetOpenidConfigError: Code = js.native
    inline def unableToGetOpenidConfigError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToGetOpenidConfigError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.unexpectedAccountType")
    @js.native
    def unexpectedAccountType: Code = js.native
    inline def unexpectedAccountType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedAccountType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.unexpectedCredentialType")
    @js.native
    def unexpectedCredentialType: Code = js.native
    inline def unexpectedCredentialType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedCredentialType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.userCanceledError")
    @js.native
    def userCanceledError: Code = js.native
    inline def userCanceledError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userCanceledError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/error/ClientAuthError", "ClientAuthErrorMessage.userTimeoutReached")
    @js.native
    def userTimeoutReached: Code = js.native
    inline def userTimeoutReached_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userTimeoutReached")(x.asInstanceOf[js.Any])
  }
}
