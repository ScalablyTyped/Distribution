package typings.azureMsalNode

import typings.azureMsalCommon.anon.Code
import typings.azureMsalCommon.distCacheInterfaceIcachepluginMod.ICachePlugin
import typings.azureMsalCommon.distCacheInterfaceIserializabletokencacheMod.ISerializableTokenCache
import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalNode.distCacheDistributedIcacheclientMod.ICacheClient
import typings.azureMsalNode.distCacheDistributedIpartitionmanagerMod.IPartitionManager
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.InMemoryCache
import typings.azureMsalNode.distCacheSerializerSerializerTypesMod.JsonCache
import typings.azureMsalNode.distConfigConfigurationMod.Configuration
import typings.azureMsalNode.distConfigConfigurationMod.NodeConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/msal-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-node", "AuthError")
  @js.native
  open class AuthError ()
    extends typings.azureMsalCommon.mod.AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
    def this(errorCode: Unit, errorMessage: String) = this()
    def this(errorCode: String, errorMessage: String, suberror: String) = this()
    def this(errorCode: String, errorMessage: Unit, suberror: String) = this()
    def this(errorCode: Unit, errorMessage: String, suberror: String) = this()
    def this(errorCode: Unit, errorMessage: Unit, suberror: String) = this()
  }
  /* static members */
  object AuthError {
    
    @JSImport("@azure/msal-node", "AuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error for post request failures.
      * @param errDesc
      * @returns
      */
    inline def createPostRequestFailed(errDesc: String): typings.azureMsalCommon.distErrorAuthErrorMod.AuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostRequestFailed")(errDesc.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorAuthErrorMod.AuthError]
    
    /**
      * Creates an error that is thrown when something unexpected happens in the library.
      * @param errDesc
      */
    inline def createUnexpectedError(errDesc: String): typings.azureMsalCommon.distErrorAuthErrorMod.AuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedError")(errDesc.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorAuthErrorMod.AuthError]
  }
  
  object AuthErrorMessage {
    
    @JSImport("@azure/msal-node", "AuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node", "AuthErrorMessage.postRequestFailed")
    @js.native
    def postRequestFailed: Code = js.native
    inline def postRequestFailed_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postRequestFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "AuthErrorMessage.unexpectedError")
    @js.native
    def unexpectedError: Code = js.native
    inline def unexpectedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedError")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-node", "AzureCloudInstance")
  @js.native
  object AzureCloudInstance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double | String): js.UndefOr[
        typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance & (Double | String)
      ] = js.native
    
    /* "https://login.chinacloudapi.cn" */ val AzureChina: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzureChina & (Double | String) = js.native
    
    /* "https://login.microsoftonline.de" */ val AzureGermany: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzureGermany & (Double | String) = js.native
    
    /* "https://login.windows-ppe.net" */ val AzurePpe: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzurePpe & (Double | String) = js.native
    
    /* "https://login.microsoftonline.com" */ val AzurePublic: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzurePublic & (Double | String) = js.native
    
    /* "https://login.microsoftonline.us" */ val AzureUsGovernment: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzureUsGovernment & (Double | String) = js.native
    
    /* 0 */ val None: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.None & (Double | String) = js.native
  }
  
  /* note: abstract class */ @JSImport("@azure/msal-node", "ClientApplication")
  @js.native
  open class ClientApplication protected ()
    extends typings.azureMsalNode.distClientClientApplicationMod.ClientApplication {
    /**
      * Constructor for the ClientApplication
      */
    /* protected */ def this(configuration: Configuration) = this()
  }
  
  @JSImport("@azure/msal-node", "ClientAssertion")
  @js.native
  open class ClientAssertion ()
    extends typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion
  /* static members */
  object ClientAssertion {
    
    @JSImport("@azure/msal-node", "ClientAssertion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initialize the ClientAssertion class from the clientAssertion passed by the user
      * @param assertion - refer https://tools.ietf.org/html/rfc7521
      */
    inline def fromAssertion(assertion: String): typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAssertion")(assertion.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion]
    
    /**
      * Initialize the ClientAssertion class from the certificate passed by the user
      * @param thumbprint - identifier of a certificate
      * @param privateKey - secret key
      * @param publicCertificate - electronic document provided to prove the ownership of the public key
      */
    inline def fromCertificate(thumbprint: String, privateKey: String): typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCertificate")(thumbprint.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion]
    inline def fromCertificate(thumbprint: String, privateKey: String, publicCertificate: String): typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCertificate")(thumbprint.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], publicCertificate.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalNode.distClientClientAssertionMod.ClientAssertion]
    
    /**
      * Extracts the raw certs from a given certificate string and returns them in an array.
      * @param publicCertificate - electronic document provided to prove the ownership of the public key
      */
    inline def parseCertificate(publicCertificate: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(publicCertificate.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("@azure/msal-node", "ClientAuthError")
  @js.native
  open class ClientAuthError protected ()
    extends typings.azureMsalCommon.mod.ClientAuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object ClientAuthError {
    
    @JSImport("@azure/msal-node", "ClientAuthError")
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
      * Throws error if the user defined timeout is reached.
      */
    inline def createUserTimeoutReachedError(): typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserTimeoutReachedError")().asInstanceOf[typings.azureMsalCommon.distErrorClientAuthErrorMod.ClientAuthError]
  }
  
  object ClientAuthErrorMessage {
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.CachePluginError")
    @js.native
    def CachePluginError: Code = js.native
    inline def CachePluginError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CachePluginError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.DeviceCodeExpired")
    @js.native
    def DeviceCodeExpired: Code = js.native
    inline def DeviceCodeExpired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceCodeExpired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.DeviceCodePollingCancelled")
    @js.native
    def DeviceCodePollingCancelled: Code = js.native
    inline def DeviceCodePollingCancelled_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceCodePollingCancelled")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.DeviceCodeUnknownError")
    @js.native
    def DeviceCodeUnknownError: Code = js.native
    inline def DeviceCodeUnknownError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeviceCodeUnknownError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.NoAccountInSilentRequest")
    @js.native
    def NoAccountInSilentRequest: Code = js.native
    inline def NoAccountInSilentRequest_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoAccountInSilentRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.accessTokenEntityNullError")
    @js.native
    def accessTokenEntityNullError: Code = js.native
    inline def accessTokenEntityNullError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessTokenEntityNullError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.appendEmptyScopeError")
    @js.native
    def appendEmptyScopeError: Code = js.native
    inline def appendEmptyScopeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendEmptyScopeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.appendScopeSetError")
    @js.native
    def appendScopeSetError: Code = js.native
    inline def appendScopeSetError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendScopeSetError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.bindingKeyNotRemovedError")
    @js.native
    def bindingKeyNotRemovedError: Code = js.native
    inline def bindingKeyNotRemovedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingKeyNotRemovedError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.blankGuidGenerated")
    @js.native
    def blankGuidGenerated: Code = js.native
    inline def blankGuidGenerated_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blankGuidGenerated")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.clientInfoDecodingError")
    @js.native
    def clientInfoDecodingError: Code = js.native
    inline def clientInfoDecodingError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientInfoDecodingError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.clientInfoEmptyError")
    @js.native
    def clientInfoEmptyError: Code = js.native
    inline def clientInfoEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientInfoEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.emptyInputScopeSetError")
    @js.native
    def emptyInputScopeSetError: Code = js.native
    inline def emptyInputScopeSetError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyInputScopeSetError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.endpointResolutionError")
    @js.native
    def endpointResolutionError: Code = js.native
    inline def endpointResolutionError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endpointResolutionError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.hashNotDeserialized")
    @js.native
    def hashNotDeserialized: Code = js.native
    inline def hashNotDeserialized_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashNotDeserialized")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.invalidAssertion")
    @js.native
    def invalidAssertion: Code = js.native
    inline def invalidAssertion_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAssertion")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.invalidCacheEnvironment")
    @js.native
    def invalidCacheEnvironment: Code = js.native
    inline def invalidCacheEnvironment_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheEnvironment")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.invalidCacheRecord")
    @js.native
    def invalidCacheRecord: Code = js.native
    inline def invalidCacheRecord_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheRecord")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.invalidCacheType")
    @js.native
    def invalidCacheType: Code = js.native
    inline def invalidCacheType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.invalidClientCredential")
    @js.native
    def invalidClientCredential: Code = js.native
    inline def invalidClientCredential_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidClientCredential")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.invalidStateError")
    @js.native
    def invalidStateError: Code = js.native
    inline def invalidStateError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.keyIdMissing")
    @js.native
    def keyIdMissing: Code = js.native
    inline def keyIdMissing_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyIdMissing")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.logoutNotSupported")
    @js.native
    def logoutNotSupported: Code = js.native
    inline def logoutNotSupported_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoutNotSupported")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.multipleMatchingAccounts")
    @js.native
    def multipleMatchingAccounts: Code = js.native
    inline def multipleMatchingAccounts_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleMatchingAccounts")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.multipleMatchingAppMetadata")
    @js.native
    def multipleMatchingAppMetadata: Code = js.native
    inline def multipleMatchingAppMetadata_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleMatchingAppMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.multipleMatchingTokens")
    @js.native
    def multipleMatchingTokens: Code = js.native
    inline def multipleMatchingTokens_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleMatchingTokens")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.networkError")
    @js.native
    def networkError: Code = js.native
    inline def networkError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("networkError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.noAccountFound")
    @js.native
    def noAccountFound: Code = js.native
    inline def noAccountFound_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAccountFound")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.noAuthorizationCodeFromServer")
    @js.native
    def noAuthorizationCodeFromServer: Code = js.native
    inline def noAuthorizationCodeFromServer_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAuthorizationCodeFromServer")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.noAzureRegionDetected")
    @js.native
    def noAzureRegionDetected: Code = js.native
    inline def noAzureRegionDetected_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAzureRegionDetected")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.noCryptoObj")
    @js.native
    def noCryptoObj: Code = js.native
    inline def noCryptoObj_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noCryptoObj")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.noTokensFoundError")
    @js.native
    def noTokensFoundError: Code = js.native
    inline def noTokensFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noTokensFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.nonceMismatchError")
    @js.native
    def nonceMismatchError: Code = js.native
    inline def nonceMismatchError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonceMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.nonceNotFoundError")
    @js.native
    def nonceNotFoundError: Code = js.native
    inline def nonceNotFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonceNotFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.nullOrEmptyToken")
    @js.native
    def nullOrEmptyToken: Code = js.native
    inline def nullOrEmptyToken_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullOrEmptyToken")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.removeEmptyScopeError")
    @js.native
    def removeEmptyScopeError: Code = js.native
    inline def removeEmptyScopeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyScopeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.stateMismatchError")
    @js.native
    def stateMismatchError: Code = js.native
    inline def stateMismatchError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.stateNotFoundError")
    @js.native
    def stateNotFoundError: Code = js.native
    inline def stateNotFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateNotFoundError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.tokenClaimsRequired")
    @js.native
    def tokenClaimsRequired: Code = js.native
    inline def tokenClaimsRequired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenClaimsRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.tokenParsingError")
    @js.native
    def tokenParsingError: Code = js.native
    inline def tokenParsingError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenParsingError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.tokenRefreshRequired")
    @js.native
    def tokenRefreshRequired: Code = js.native
    inline def tokenRefreshRequired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRefreshRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.tokenRequestCannotBeMade")
    @js.native
    def tokenRequestCannotBeMade: Code = js.native
    inline def tokenRequestCannotBeMade_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRequestCannotBeMade")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.unableToGetOpenidConfigError")
    @js.native
    def unableToGetOpenidConfigError: Code = js.native
    inline def unableToGetOpenidConfigError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToGetOpenidConfigError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.unexpectedAccountType")
    @js.native
    def unexpectedAccountType: Code = js.native
    inline def unexpectedAccountType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedAccountType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.unexpectedCredentialType")
    @js.native
    def unexpectedCredentialType: Code = js.native
    inline def unexpectedCredentialType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unexpectedCredentialType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientAuthErrorMessage.userTimeoutReached")
    @js.native
    def userTimeoutReached: Code = js.native
    inline def userTimeoutReached_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userTimeoutReached")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-node", "ClientConfigurationError")
  @js.native
  open class ClientConfigurationError protected ()
    extends typings.azureMsalCommon.mod.ClientConfigurationError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object ClientConfigurationError {
    
    @JSImport("@azure/msal-node", "ClientConfigurationError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error thrown when the claims request could not be successfully parsed
      */
    inline def createClaimsRequestParsingError(claimsRequestParseError: String): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClaimsRequestParsingError")(claimsRequestParseError.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Error thrown when client id scope is not provided as single scope.
      * @param inputScopes
      */
    inline def createClientIdSingleScopeError(inputScopes: js.Array[String]): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientIdSingleScopeError")(inputScopes.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when token request is empty and nothing cached in storage.
      */
    inline def createEmptyLogoutRequestError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyLogoutRequestError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Error thrown when scopes are empty.
      * @param scopesValue
      */
    inline def createEmptyScopesArrayError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyScopesArrayError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when token request is empty and nothing cached in storage.
      */
    inline def createEmptyTokenRequestError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyTokenRequestError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Creates an error thrown if authority uri is given an insecure protocol.
      * @param urlString
      */
    inline def createInsecureAuthorityUriError(urlString: String): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecureAuthorityUriError")(urlString.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when a provided header is invalid in any way
      */
    inline def createInvalidAuthenticationHeaderError(invalidHeaderName: String, details: String): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAuthenticationHeaderError")(invalidHeaderName.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws an error when the user passes invalid cloudDiscoveryMetadata
      */
    inline def createInvalidAuthorityMetadataError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAuthorityMetadataError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when the AzureCloudInstance is set to an invalid value
      */
    inline def createInvalidAzureCloudInstanceError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidAzureCloudInstanceError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Creates error thrown when claims parameter is not a stringified JSON object
      */
    inline def createInvalidClaimsRequestError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidClaimsRequestError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws an error when the user passes invalid cloudDiscoveryMetadata
      */
    inline def createInvalidCloudDiscoveryMetadataError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCloudDiscoveryMetadataError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when an invalid code_challenge_method is passed by the user
      */
    inline def createInvalidCodeChallengeMethodError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCodeChallengeMethodError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when both params: code_challenge and code_challenge_method are not passed together
      */
    inline def createInvalidCodeChallengeParamsError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCodeChallengeParamsError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Error thrown when prompt is not an allowed type.
      * @param promptValue
      */
    inline def createInvalidPromptError(promptValue: String): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidPromptError")(promptValue.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when provided headers don't contain a header that a server nonce can be extracted from
      */
    inline def createMissingNonceAuthenticationHeadersError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingNonceAuthenticationHeadersError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws an error when the authentication scheme is set to SSH but the SSH public key is omitted from the request
      */
    inline def createMissingSshJwkError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingSshJwkError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws an error when the authentication scheme is set to SSH but the SSH public key ID is omitted from the request
      */
    inline def createMissingSshKidError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMissingSshKidError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Creates an error thrown when the post-logout redirect uri is empty (not set by caller)
      */
    inline def createPostLogoutRedirectUriEmptyError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostLogoutRedirectUriEmptyError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Creates an error thrown when the redirect uri is empty (not set by caller)
      */
    inline def createRedirectUriEmptyError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectUriEmptyError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Throws error when provided authority is not a member of the trusted host list
      */
    inline def createUntrustedAuthorityError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUntrustedAuthorityError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Creates an error thrown if URL string is empty or null.
      * @param urlString
      */
    inline def createUrlEmptyError(): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlEmptyError")().asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
    
    /**
      * Creates an error thrown if URL string does not parse into separate segments.
      * @param urlString
      */
    inline def createUrlParseError(urlParseError: String): typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlParseError")(urlParseError.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.distErrorClientConfigurationErrorMod.ClientConfigurationError]
  }
  
  object ClientConfigurationErrorMessage {
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.authorityUriInsecure")
    @js.native
    def authorityUriInsecure: Code = js.native
    inline def authorityUriInsecure_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authorityUriInsecure")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.claimsRequestParsingError")
    @js.native
    def claimsRequestParsingError: Code = js.native
    inline def claimsRequestParsingError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("claimsRequestParsingError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.clientIdSingleScopeError")
    @js.native
    def clientIdSingleScopeError: Code = js.native
    inline def clientIdSingleScopeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientIdSingleScopeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.emptyScopesError")
    @js.native
    def emptyScopesError: Code = js.native
    inline def emptyScopesError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyScopesError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidAuthenticationHeader")
    @js.native
    def invalidAuthenticationHeader: Code = js.native
    inline def invalidAuthenticationHeader_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAuthenticationHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidAuthorityMetadata")
    @js.native
    def invalidAuthorityMetadata: Code = js.native
    inline def invalidAuthorityMetadata_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAuthorityMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidAzureCloudInstance")
    @js.native
    def invalidAzureCloudInstance: Code = js.native
    inline def invalidAzureCloudInstance_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidAzureCloudInstance")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidClaimsRequest")
    @js.native
    def invalidClaimsRequest: Code = js.native
    inline def invalidClaimsRequest_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidClaimsRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidCloudDiscoveryMetadata")
    @js.native
    def invalidCloudDiscoveryMetadata: Code = js.native
    inline def invalidCloudDiscoveryMetadata_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCloudDiscoveryMetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidCodeChallengeMethod")
    @js.native
    def invalidCodeChallengeMethod: Code = js.native
    inline def invalidCodeChallengeMethod_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCodeChallengeMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidCodeChallengeParams")
    @js.native
    def invalidCodeChallengeParams: Code = js.native
    inline def invalidCodeChallengeParams_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCodeChallengeParams")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.invalidPrompt")
    @js.native
    def invalidPrompt: Code = js.native
    inline def invalidPrompt_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidPrompt")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.logoutRequestEmptyError")
    @js.native
    def logoutRequestEmptyError: Code = js.native
    inline def logoutRequestEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoutRequestEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.missingNonceAuthenticationHeader")
    @js.native
    def missingNonceAuthenticationHeader: Code = js.native
    inline def missingNonceAuthenticationHeader_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingNonceAuthenticationHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.missingSshJwk")
    @js.native
    def missingSshJwk: Code = js.native
    inline def missingSshJwk_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingSshJwk")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.missingSshKid")
    @js.native
    def missingSshKid: Code = js.native
    inline def missingSshKid_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingSshKid")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.nonArrayScopesError")
    @js.native
    def nonArrayScopesError: Code = js.native
    inline def nonArrayScopesError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonArrayScopesError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.postLogoutUriNotSet")
    @js.native
    def postLogoutUriNotSet: Code = js.native
    inline def postLogoutUriNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postLogoutUriNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.redirectUriNotSet")
    @js.native
    def redirectUriNotSet: Code = js.native
    inline def redirectUriNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redirectUriNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.tokenRequestEmptyError")
    @js.native
    def tokenRequestEmptyError: Code = js.native
    inline def tokenRequestEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRequestEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.untrustedAuthority")
    @js.native
    def untrustedAuthority: Code = js.native
    inline def untrustedAuthority_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("untrustedAuthority")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.urlEmptyError")
    @js.native
    def urlEmptyError: Code = js.native
    inline def urlEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "ClientConfigurationErrorMessage.urlParseError")
    @js.native
    def urlParseError: Code = js.native
    inline def urlParseError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlParseError")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-node", "ConfidentialClientApplication")
  @js.native
  open class ConfidentialClientApplication protected ()
    extends typings.azureMsalNode.distClientConfidentialClientApplicationMod.ConfidentialClientApplication {
    /**
      * Constructor for the ConfidentialClientApplication
      *
      * Required attributes in the Configuration object are:
      * - clientID: the application ID of your application. You can obtain one by registering your application with our application registration portal
      * - authority: the authority URL for your application.
      * - client credential: Must set either client secret, certificate, or assertion for confidential clients. You can obtain a client secret from the application registration portal.
      *
      * In Azure AD, authority is a URL indicating of the form https://login.microsoftonline.com/\{Enter_the_Tenant_Info_Here\}.
      * If your application supports Accounts in one organizational directory, replace "Enter_the_Tenant_Info_Here" value with the Tenant Id or Tenant name (for example, contoso.microsoft.com).
      * If your application supports Accounts in any organizational directory, replace "Enter_the_Tenant_Info_Here" value with organizations.
      * If your application supports Accounts in any organizational directory and personal Microsoft accounts, replace "Enter_the_Tenant_Info_Here" value with common.
      * To restrict support to Personal Microsoft accounts only, replace "Enter_the_Tenant_Info_Here" value with consumers.
      *
      * In Azure B2C, authority is of the form https://\{instance\}/tfp/\{tenant\}/\{policyName\}/
      * Full B2C functionality will be available in this library in future versions.
      *
      * @param Configuration - configuration object for the MSAL ConfidentialClientApplication instance
      */
    def this(configuration: Configuration) = this()
  }
  
  @JSImport("@azure/msal-node", "CryptoProvider")
  @js.native
  open class CryptoProvider ()
    extends typings.azureMsalNode.distCryptoCryptoProviderMod.CryptoProvider
  
  @JSImport("@azure/msal-node", "DistributedCachePlugin")
  @js.native
  open class DistributedCachePlugin protected ()
    extends typings.azureMsalNode.distCacheDistributedDistributedCachePluginMod.DistributedCachePlugin {
    def this(client: ICacheClient, partitionManager: IPartitionManager) = this()
  }
  
  @JSImport("@azure/msal-node", "InteractionRequiredAuthError")
  @js.native
  open class InteractionRequiredAuthError ()
    extends typings.azureMsalCommon.mod.InteractionRequiredAuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
    def this(errorCode: Unit, errorMessage: String) = this()
    def this(errorCode: String, errorMessage: String, subError: String) = this()
    def this(errorCode: String, errorMessage: Unit, subError: String) = this()
    def this(errorCode: Unit, errorMessage: String, subError: String) = this()
    def this(errorCode: Unit, errorMessage: Unit, subError: String) = this()
  }
  /* static members */
  object InteractionRequiredAuthError {
    
    @JSImport("@azure/msal-node", "InteractionRequiredAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an error thrown when the native broker returns ACCOUNT_UNAVAILABLE status, indicating that the account was removed and interactive sign-in is required
      * @returns
      */
    inline def createNativeAccountUnavailableError(): typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeAccountUnavailableError")().asInstanceOf[typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError]
    
    /**
      * Creates an error thrown when the authorization code required for a token request is null or empty.
      */
    inline def createNoTokensFoundError(): typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoTokensFoundError")().asInstanceOf[typings.azureMsalCommon.distErrorInteractionRequiredAuthErrorMod.InteractionRequiredAuthError]
    
    /**
      * Helper function used to determine if an error thrown by the server requires interaction to resolve
      * @param errorCode
      * @param errorString
      * @param subError
      */
    inline def isInteractionRequiredError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")().asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String, errorString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String, errorString: String, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: String, errorString: Unit, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: Unit, errorString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: Unit, errorString: String, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isInteractionRequiredError(errorCode: Unit, errorString: Unit, subError: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionRequiredError")(errorCode.asInstanceOf[js.Any], errorString.asInstanceOf[js.Any], subError.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object InteractionRequiredAuthErrorMessage {
    
    @JSImport("@azure/msal-node", "InteractionRequiredAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node", "InteractionRequiredAuthErrorMessage.native_account_unavailable")
    @js.native
    def nativeAccountUnavailable: Code = js.native
    
    inline def nativeAccountUnavailable_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("native_account_unavailable")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "InteractionRequiredAuthErrorMessage.noTokensFoundError")
    @js.native
    def noTokensFoundError: Code = js.native
    inline def noTokensFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noTokensFoundError")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-node", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.azureMsalCommon.distLoggerLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val Error: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Error & Double = js.native
    
    /* 2 */ val Info: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Info & Double = js.native
    
    /* 4 */ val Trace: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Trace & Double = js.native
    
    /* 3 */ val Verbose: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Verbose & Double = js.native
    
    /* 1 */ val Warning: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Warning & Double = js.native
  }
  
  @JSImport("@azure/msal-node", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.azureMsalCommon.mod.Logger {
    def this(loggerOptions: LoggerOptions) = this()
    def this(loggerOptions: LoggerOptions, packageName: String) = this()
    def this(loggerOptions: LoggerOptions, packageName: String, packageVersion: String) = this()
    def this(loggerOptions: LoggerOptions, packageName: Unit, packageVersion: String) = this()
  }
  
  @JSImport("@azure/msal-node", "NodeStorage")
  @js.native
  open class NodeStorage protected ()
    extends typings.azureMsalNode.distCacheNodeStorageMod.NodeStorage {
    def this(logger: typings.azureMsalCommon.mod.Logger, clientId: String, cryptoImpl: ICrypto) = this()
  }
  /* static members */
  object NodeStorage {
    
    @JSImport("@azure/msal-node", "NodeStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initialize in memory cache from an exisiting cache vault
      * @param cache - blob formatted cache (JSON)
      */
    inline def generateInMemoryCache(cache: String): InMemoryCache = ^.asInstanceOf[js.Dynamic].applyDynamic("generateInMemoryCache")(cache.asInstanceOf[js.Any]).asInstanceOf[InMemoryCache]
    
    /**
      * retrieves the final JSON
      * @param inMemoryCache - itemised cache read from the JSON
      */
    inline def generateJsonCache(inMemoryCache: InMemoryCache): JsonCache = ^.asInstanceOf[js.Dynamic].applyDynamic("generateJsonCache")(inMemoryCache.asInstanceOf[js.Any]).asInstanceOf[JsonCache]
  }
  
  object PromptValue {
    
    @JSImport("@azure/msal-node", "PromptValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node", "PromptValue.CONSENT")
    @js.native
    def CONSENT: String = js.native
    inline def CONSENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "PromptValue.CREATE")
    @js.native
    def CREATE: String = js.native
    inline def CREATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "PromptValue.LOGIN")
    @js.native
    def LOGIN: String = js.native
    inline def LOGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "PromptValue.NONE")
    @js.native
    def NONE: String = js.native
    inline def NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node", "PromptValue.SELECT_ACCOUNT")
    @js.native
    def SELECT_ACCOUNT: String = js.native
    inline def SELECT_ACCOUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT_ACCOUNT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-node", "ProtocolMode")
  @js.native
  object ProtocolMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode & String] = js.native
    
    /* "AAD" */ val AAD: typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode.AAD & String = js.native
    
    /* "OIDC" */ val OIDC: typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode.OIDC & String = js.native
  }
  
  @JSImport("@azure/msal-node", "PublicClientApplication")
  @js.native
  open class PublicClientApplication protected ()
    extends typings.azureMsalNode.distClientPublicClientApplicationMod.PublicClientApplication {
    /**
      * Important attributes in the Configuration object for auth are:
      * - clientID: the application ID of your application. You can obtain one by registering your application with our Application registration portal.
      * - authority: the authority URL for your application.
      *
      * AAD authorities are of the form https://login.microsoftonline.com/\{Enter_the_Tenant_Info_Here\}.
      * - If your application supports Accounts in one organizational directory, replace "Enter_the_Tenant_Info_Here" value with the Tenant Id or Tenant name (for example, contoso.microsoft.com).
      * - If your application supports Accounts in any organizational directory, replace "Enter_the_Tenant_Info_Here" value with organizations.
      * - If your application supports Accounts in any organizational directory and personal Microsoft accounts, replace "Enter_the_Tenant_Info_Here" value with common.
      * - To restrict support to Personal Microsoft accounts only, replace "Enter_the_Tenant_Info_Here" value with consumers.
      *
      * Azure B2C authorities are of the form https://\{instance\}/\{tenant\}/\{policy\}. Each policy is considered
      * its own authority. You will have to set the all of the knownAuthorities at the time of the client application
      * construction.
      *
      * ADFS authorities are of the form https://\{instance\}/adfs.
      */
    def this(configuration: Configuration) = this()
  }
  
  @JSImport("@azure/msal-node", "ResponseMode")
  @js.native
  object ResponseMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode & String] = js.native
    
    /* "form_post" */ val FORM_POST: typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode.FORM_POST & String = js.native
    
    /* "fragment" */ val FRAGMENT: typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode.FRAGMENT & String = js.native
    
    /* "query" */ val QUERY: typings.azureMsalCommon.distUtilsConstantsMod.ResponseMode.QUERY & String = js.native
  }
  
  @JSImport("@azure/msal-node", "ServerError")
  @js.native
  open class ServerError ()
    extends typings.azureMsalCommon.mod.ServerError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
    def this(errorCode: Unit, errorMessage: String) = this()
    def this(errorCode: String, errorMessage: String, subError: String) = this()
    def this(errorCode: String, errorMessage: Unit, subError: String) = this()
    def this(errorCode: Unit, errorMessage: String, subError: String) = this()
    def this(errorCode: Unit, errorMessage: Unit, subError: String) = this()
  }
  
  @JSImport("@azure/msal-node", "TokenCache")
  @js.native
  open class TokenCache protected ()
    extends typings.azureMsalNode.distCacheTokenCacheMod.TokenCache {
    def this(
      storage: typings.azureMsalNode.distCacheNodeStorageMod.NodeStorage,
      logger: typings.azureMsalCommon.mod.Logger
    ) = this()
    def this(
      storage: typings.azureMsalNode.distCacheNodeStorageMod.NodeStorage,
      logger: typings.azureMsalCommon.mod.Logger,
      cachePlugin: ICachePlugin
    ) = this()
  }
  
  @JSImport("@azure/msal-node", "TokenCacheContext")
  @js.native
  open class TokenCacheContext protected ()
    extends typings.azureMsalCommon.mod.TokenCacheContext {
    def this(tokenCache: ISerializableTokenCache, hasChanged: Boolean) = this()
  }
  
  inline def buildAppConfiguration(param0: Configuration): NodeConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAppConfiguration")(param0.asInstanceOf[js.Any]).asInstanceOf[NodeConfiguration]
  
  @JSImport("@azure/msal-node", "version")
  @js.native
  val version: /* "1.14.0" */ String = js.native
}
