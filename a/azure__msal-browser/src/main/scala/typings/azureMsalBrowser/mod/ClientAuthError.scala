package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "ClientAuthError")
@js.native
open class ClientAuthError protected ()
  extends typings.azureMsalCommon.mod.ClientAuthError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
}
/* static members */
object ClientAuthError {
  
  @JSImport("@azure/msal-browser", "ClientAuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Throws error when attempting to append a null, undefined or empty scope to a set
    * @param givenScope
    */
  inline def createAppendEmptyScopeToSetError(givenScope: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppendEmptyScopeToSetError")(givenScope.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when attempting to append null or empty ScopeSet.
    * @param appendError
    */
  inline def createAppendScopeSetError(appendError: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppendScopeSetError")(appendError.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when max_age was provided in the request, but auth_time is not in the token claims
    * @param missingNonce
    */
  inline def createAuthTimeNotFoundError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthTimeNotFoundError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  inline def createBindingKeyNotRemovedError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBindingKeyNotRemovedError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if ICachePlugin not set on CacheManager.
    */
  inline def createCachePluginError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCachePluginError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when client info object doesn't decode correctly.
    * @param caughtError
    */
  inline def createClientInfoDecodingError(caughtError: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientInfoDecodingError")(caughtError.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown if the client info is empty.
    * @param rawClientInfo
    */
  inline def createClientInfoEmptyError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientInfoEmptyError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if user sets CancellationToken.cancel = true during polling of token endpoint during device code flow
    */
  inline def createDeviceCodeCancelledError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeCancelledError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if device code is expired
    */
  inline def createDeviceCodeExpiredError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeExpiredError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if device code is expired
    */
  inline def createDeviceCodeUnknownError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeviceCodeUnknownError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if ScopeSet is null or undefined.
    * @param givenScopeSet
    */
  inline def createEmptyInputScopeSetError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyInputScopeSetError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the endpoint discovery doesn't complete correctly.
    */
  inline def createEndpointDiscoveryIncompleteError(errDetail: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEndpointDiscoveryIncompleteError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the hash cannot be deserialized.
    * @param hashParamObj
    */
  inline def createHashNotDeserializedError(hashParamObj: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashNotDeserializedError")(hashParamObj.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if client assertion is not valid.
    */
  inline def createInvalidAssertionError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAssertionError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when provided environment is not part of the CloudDiscoveryMetadata object
    */
  inline def createInvalidCacheEnvironmentError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheEnvironmentError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if cache type is invalid.
    */
  inline def createInvalidCacheTypeError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheTypeError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if client assertion is not valid.
    */
  inline def createInvalidCredentialError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCredentialError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the state cannot be parsed.
    * @param invalidState
    */
  inline def createInvalidStateError(invalidState: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidStateError")(invalidState.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  inline def createInvalidStateError(invalidState: String, errorString: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidStateError")(invalidState.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Create an error when kid attribute is missing from a PoP token's cache record
    */
  inline def createKeyIdMissingError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeyIdMissingError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Thrown when logout is attempted for an authority that doesnt have an end_session_endpoint
    */
  inline def createLogoutNotSupportedError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogoutNotSupportedError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when too much time has elapsed since the last end-user authentication
    */
  inline def createMaxAgeTranspiredError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaxAgeTranspiredError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when multiple accounts are in cache for the given params
    */
  inline def createMultipleMatchingAccountsInCacheError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingAccountsInCacheError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when multiple appMetada are in cache for the given clientId.
    */
  inline def createMultipleMatchingAppMetadataInCacheError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingAppMetadataInCacheError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when multiple tokens are in cache.
    */
  inline def createMultipleMatchingTokensInCacheError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultipleMatchingTokensInCacheError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the fetch client throws
    */
  inline def createNetworkError(endpoint: String, errDetail: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createNetworkError")(endpoint.asInstanceOf[js.Any], errDetail.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when account is not found in cache.
    */
  inline def createNoAccountFoundError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountFoundError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when silent requests are made without an account object
    */
  inline def createNoAccountInSilentRequestError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountInSilentRequestError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when the authorization code is missing from the server response
    */
  inline def createNoAuthCodeInServerResponseError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAuthCodeInServerResponseError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if crypto object not found.
    * @param operationName
    */
  inline def createNoCryptoObjectError(operationName: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoCryptoObjectError")(operationName.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Create an error when the client does not have network connectivity
    */
  inline def createNoNetworkConnectivityError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoNetworkConnectivityError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the nonce does not match.
    */
  inline def createNonceMismatchError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceMismatchError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the mnonce is not present
    * @param missingNonce
    */
  inline def createNonceNotFoundError(missingNonce: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceNotFoundError")(missingNonce.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when cache record is null or undefined.
    */
  inline def createNullOrUndefinedCacheRecord(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullOrUndefinedCacheRecord")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if token cannot be retrieved from cache due to refresh being required.
    */
  inline def createRefreshRequiredError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRefreshRequiredError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when attempting to append a null, undefined or empty scope to a set
    * @param givenScope
    */
  inline def createRemoveEmptyScopeFromSetError(givenScope: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveEmptyScopeFromSetError")(givenScope.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when two states do not match.
    */
  inline def createStateMismatchError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateMismatchError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the state is not present
    * @param missingState
    */
  inline def createStateNotFoundError(missingState: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateNotFoundError")(missingState.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  inline def createTokenClaimsRequiredError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenClaimsRequiredError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the id token string is null or empty.
    * @param invalidRawTokenString
    */
  inline def createTokenNullOrEmptyError(invalidRawTokenString: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenNullOrEmptyError")(invalidRawTokenString.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the id token extraction errors out.
    * @param err
    */
  inline def createTokenParsingError(caughtExtractionError: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenParsingError")(caughtExtractionError.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error when no auth code or refresh token is given to ServerTokenRequestParameters.
    */
  inline def createTokenRequestCannotBeMadeError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokenRequestCannotBeMadeError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Creates an error thrown when the openid-configuration endpoint cannot be reached or does not contain the required data
    */
  inline def createUnableToGetOpenidConfigError(errDetail: String): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToGetOpenidConfigError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if unexpected account type.
    */
  inline def createUnexpectedAccountTypeError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedAccountTypeError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if unexpected credential type.
    */
  inline def createUnexpectedCredentialTypeError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedCredentialTypeError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Create an error when the user cancels the flow
    */
  inline def createUserCanceledError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserCanceledError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  
  /**
    * Throws error if the user defined timeout is reached.
    */
  inline def createUserTimeoutReachedError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserTimeoutReachedError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
}
