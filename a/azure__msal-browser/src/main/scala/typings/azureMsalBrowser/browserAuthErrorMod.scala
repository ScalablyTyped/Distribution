package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.Code
import typings.azureMsalCommon.mod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserAuthErrorMod {
  
  @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthError")
  @js.native
  open class BrowserAuthError protected () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object BrowserAuthError {
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an error when an authorization code or native account ID is required but not provided
      */
    inline def createAuthCodeOrNativeAccountIdRequiredError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthCodeOrNativeAccountIdRequiredError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error when an authorization code is required but not provided
      */
    inline def createAuthCodeRequiredError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthCodeRequiredError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when handleCodeResponse is called before initiateAuthRequest (InteractionHandler)
      */
    inline def createAuthRequestNotSetError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthRequestNotSetError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when a popup attempts to call an acquireToken API
      * @returns
      */
    inline def createBlockAcquireTokenInPopupsError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockAcquireTokenInPopupsError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when an auth reload is done inside an iframe.
      */
    inline def createBlockReloadInHiddenIframeError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockReloadInHiddenIframeError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the crypto object is unavailable.
      * @param errDetail
      */
    inline def createCryptoNotAvailableError(errDetail: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCryptoNotAvailableError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when indexDB database is not open
      */
    inline def createDatabaseNotOpenError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabaseNotOpenError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error when IndexedDB is unavailable
      */
    inline def createDatabaseUnavailableError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabaseUnavailableError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the hash string value is unexpectedly empty.
      * @param hashValue
      */
    inline def createEmptyHashError(hashValue: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyHashError")(hashValue.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the navigation URI is empty.
      */
    inline def createEmptyNavigationUriError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyNavigationUriError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when window.open returns an empty window object.
      * @param errDetail
      */
    inline def createEmptyWindowCreatedError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyWindowCreatedError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when network client fails to parse network response
      */
    inline def createFailedToParseNetworkResponseError(endpoint: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createFailedToParseNetworkResponseError")(endpoint.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when get request fails due to reasons other than internet connectivity
      */
    inline def createGetRequestFailedError(errorDesc: String, endpoint: String): BrowserAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createGetRequestFailedError")(errorDesc.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the hash string value does not contain known properties
      */
    inline def createHashDoesNotContainKnownPropertiesError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashDoesNotContainKnownPropertiesError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the hash string value is unexpectedly empty.
      */
    inline def createHashDoesNotContainStateError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashDoesNotContainStateError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when an HTTP method hasn't been implemented by the browser class.
      * @param method
      */
    inline def createHttpMethodNotImplementedError(method: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpMethodNotImplementedError")(method.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when an iframe is found to be closed before the timeout is reached.
      */
    inline def createIframeClosedPrematurelyError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createIframeClosedPrematurelyError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when a browser interaction (redirect or popup) is in progress.
      */
    inline def createInteractionInProgressError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInteractionInProgressError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown if cache type is invalid.
      */
    inline def createInvalidCacheTypeError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidCacheTypeError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when monitorIframeFromHash times out for a given iframe.
      */
    inline def createMonitorIframeTimeoutError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMonitorIframeTimeoutError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when monitorPopupFromHash times out for a given popup.
      */
    inline def createMonitorPopupTimeoutError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createMonitorPopupTimeoutError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when the initialize function hasn't been called
      */
    inline def createNativeBrokerCalledBeforeInitialize(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeBrokerCalledBeforeInitialize")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error when native connection has not been established
      * @returns
      */
    inline def createNativeConnectionNotEstablishedError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeConnectionNotEstablishedError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when browser extension is not installed
      */
    inline def createNativeExtensionNotInstalledError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeExtensionNotInstalledError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when Handshake with browser extension times out
      */
    inline def createNativeHandshakeTimeoutError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeHandshakeTimeoutError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when requesting a token directly from the native platform with an unsupported prompt parameter e.g. select_account, login or create
      * These requests must go through eSTS to ensure eSTS is aware of the new account
      */
    inline def createNativePromptParameterNotSupportedError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativePromptParameterNotSupportedError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the account object is not provided in the acquireTokenSilent API.
      */
    inline def createNoAccountError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoAccountError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the authority could not be retrieved from the cache
      */
    inline def createNoCachedAuthorityError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoCachedAuthorityError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when token fetch fails due to no internet
      */
    inline def createNoNetworkConnectivityError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoNetworkConnectivityError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the token request could not be retrieved from the cache
      */
    inline def createNoTokenRequestCacheError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoTokenRequestCacheError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when login and token requests are made from a non-browser environment
      */
    inline def createNonBrowserEnvironmentError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonBrowserEnvironmentError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when PKCE is not implemented.
      * @param errDetail
      */
    inline def createPkceNotGeneratedError(errDetail: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPkceNotGeneratedError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the popup window could not be opened.
      * @param errDetail
      */
    inline def createPopupWindowError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopupWindowError")().asInstanceOf[BrowserAuthError]
    inline def createPopupWindowError(errDetail: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopupWindowError")(errDetail.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when token fetch fails due to reasons other than internet connectivity
      */
    inline def createPostRequestFailedError(errorDesc: String, endpoint: String): BrowserAuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createPostRequestFailedError")(errorDesc.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when navigateWindow is called inside an iframe or brokered applications.
      * @param windowParentCheck
      */
    inline def createRedirectInIframeError(windowParentCheck: Boolean): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectInIframeError")(windowParentCheck.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when the queried cryptographic key is not found in IndexedDB
      */
    inline def createSigningKeyNotFoundInStorageError(keyId: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createSigningKeyNotFoundInStorageError")(keyId.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the logout API is called on any of the silent interaction clients
      */
    inline def createSilentLogoutUnsupportedError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilentLogoutUnsupportedError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when a given prompt value is invalid for silent requests.
      */
    inline def createSilentPromptValueError(givenPrompt: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createSilentPromptValueError")(givenPrompt.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the state value in the hash does not match the interaction type of the API attempting to consume it.
      */
    inline def createStateInteractionTypeMismatchError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStateInteractionTypeMismatchError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error when native token acquisition is not possible
      */
    inline def createUnableToAcquireTokenFromNativePlatformError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToAcquireTokenFromNativePlatformError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Create an error thrown when the necessary information is not available to sideload tokens
      */
    inline def createUnableToLoadTokenError(errorDetail: String): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToLoadTokenError")(errorDetail.asInstanceOf[js.Any]).asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the hash string value is unexpectedly empty.
      */
    inline def createUnableToParseStateError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToParseStateError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the cached token request could not be retrieved from the cache
      */
    inline def createUnableToParseTokenRequestCacheError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnableToParseTokenRequestCacheError")().asInstanceOf[BrowserAuthError]
    
    /**
      * Creates an error thrown when the user closes a popup.
      */
    inline def createUserCancelledError(): BrowserAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserCancelledError")().asInstanceOf[BrowserAuthError]
  }
  
  object BrowserAuthErrorMessage {
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.authCodeOrNativeAccountRequired")
    @js.native
    def authCodeOrNativeAccountRequired: Code = js.native
    inline def authCodeOrNativeAccountRequired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authCodeOrNativeAccountRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.authCodeRequired")
    @js.native
    def authCodeRequired: Code = js.native
    inline def authCodeRequired_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authCodeRequired")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.authRequestNotSet")
    @js.native
    def authRequestNotSet: Code = js.native
    inline def authRequestNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("authRequestNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.blockAcquireTokenInPopupsError")
    @js.native
    def blockAcquireTokenInPopupsError: Code = js.native
    inline def blockAcquireTokenInPopupsError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockAcquireTokenInPopupsError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.blockTokenRequestsInHiddenIframeError")
    @js.native
    def blockTokenRequestsInHiddenIframeError: Code = js.native
    inline def blockTokenRequestsInHiddenIframeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockTokenRequestsInHiddenIframeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.cryptoDoesNotExist")
    @js.native
    def cryptoDoesNotExist: Code = js.native
    inline def cryptoDoesNotExist_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cryptoDoesNotExist")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.databaseNotOpen")
    @js.native
    def databaseNotOpen: Code = js.native
    inline def databaseNotOpen_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("databaseNotOpen")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.databaseUnavailable")
    @js.native
    def databaseUnavailable: Code = js.native
    inline def databaseUnavailable_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("databaseUnavailable")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.emptyNavigateUriError")
    @js.native
    def emptyNavigateUriError: Code = js.native
    inline def emptyNavigateUriError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyNavigateUriError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.emptyWindowError")
    @js.native
    def emptyWindowError: Code = js.native
    inline def emptyWindowError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyWindowError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.failedToParseNetworkResponse")
    @js.native
    def failedToParseNetworkResponse: Code = js.native
    inline def failedToParseNetworkResponse_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("failedToParseNetworkResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.getRequestFailed")
    @js.native
    def getRequestFailed: Code = js.native
    inline def getRequestFailed_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRequestFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.hashDoesNotContainKnownPropertiesError")
    @js.native
    def hashDoesNotContainKnownPropertiesError: Code = js.native
    inline def hashDoesNotContainKnownPropertiesError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashDoesNotContainKnownPropertiesError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.hashDoesNotContainStateError")
    @js.native
    def hashDoesNotContainStateError: Code = js.native
    inline def hashDoesNotContainStateError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashDoesNotContainStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.hashEmptyError")
    @js.native
    def hashEmptyError: Code = js.native
    inline def hashEmptyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hashEmptyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.httpMethodNotImplementedError")
    @js.native
    def httpMethodNotImplementedError: Code = js.native
    inline def httpMethodNotImplementedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpMethodNotImplementedError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.iframeClosedPrematurelyError")
    @js.native
    def iframeClosedPrematurelyError: Code = js.native
    inline def iframeClosedPrematurelyError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iframeClosedPrematurelyError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.interactionInProgress")
    @js.native
    def interactionInProgress: Code = js.native
    inline def interactionInProgress_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interactionInProgress")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.invalidCacheType")
    @js.native
    def invalidCacheType: Code = js.native
    inline def invalidCacheType_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCacheType")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.monitorIframeTimeoutError")
    @js.native
    def monitorIframeTimeoutError: Code = js.native
    inline def monitorIframeTimeoutError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monitorIframeTimeoutError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.monitorPopupTimeoutError")
    @js.native
    def monitorPopupTimeoutError: Code = js.native
    inline def monitorPopupTimeoutError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monitorPopupTimeoutError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.nativeBrokerCalledBeforeInitialize")
    @js.native
    def nativeBrokerCalledBeforeInitialize: Code = js.native
    inline def nativeBrokerCalledBeforeInitialize_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeBrokerCalledBeforeInitialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.nativeConnectionNotEstablished")
    @js.native
    def nativeConnectionNotEstablished: Code = js.native
    inline def nativeConnectionNotEstablished_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeConnectionNotEstablished")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.nativeExtensionNotInstalled")
    @js.native
    def nativeExtensionNotInstalled: Code = js.native
    inline def nativeExtensionNotInstalled_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeExtensionNotInstalled")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.nativeHandshakeTimeout")
    @js.native
    def nativeHandshakeTimeout: Code = js.native
    inline def nativeHandshakeTimeout_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeHandshakeTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.nativePromptNotSupported")
    @js.native
    def nativePromptNotSupported: Code = js.native
    inline def nativePromptNotSupported_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativePromptNotSupported")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.noAccountError")
    @js.native
    def noAccountError: Code = js.native
    inline def noAccountError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noAccountError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.noCachedAuthorityError")
    @js.native
    def noCachedAuthorityError: Code = js.native
    inline def noCachedAuthorityError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noCachedAuthorityError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.noNetworkConnectivity")
    @js.native
    def noNetworkConnectivity: Code = js.native
    inline def noNetworkConnectivity_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noNetworkConnectivity")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.noTokenRequestCacheError")
    @js.native
    def noTokenRequestCacheError: Code = js.native
    inline def noTokenRequestCacheError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noTokenRequestCacheError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.notInBrowserEnvironment")
    @js.native
    def notInBrowserEnvironment: Code = js.native
    inline def notInBrowserEnvironment_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notInBrowserEnvironment")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.pkceNotGenerated")
    @js.native
    def pkceNotGenerated: Code = js.native
    inline def pkceNotGenerated_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkceNotGenerated")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.popupWindowError")
    @js.native
    def popupWindowError: Code = js.native
    inline def popupWindowError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popupWindowError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.postRequestFailed")
    @js.native
    def postRequestFailed: Code = js.native
    inline def postRequestFailed_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postRequestFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.redirectInIframeError")
    @js.native
    def redirectInIframeError: Code = js.native
    inline def redirectInIframeError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redirectInIframeError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.signingKeyNotFoundInStorage")
    @js.native
    def signingKeyNotFoundInStorage: Code = js.native
    inline def signingKeyNotFoundInStorage_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signingKeyNotFoundInStorage")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.silentLogoutUnsupportedError")
    @js.native
    def silentLogoutUnsupportedError: Code = js.native
    inline def silentLogoutUnsupportedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silentLogoutUnsupportedError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.silentPromptValueError")
    @js.native
    def silentPromptValueError: Code = js.native
    inline def silentPromptValueError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silentPromptValueError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.stateInteractionTypeMismatchError")
    @js.native
    def stateInteractionTypeMismatchError: Code = js.native
    inline def stateInteractionTypeMismatchError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateInteractionTypeMismatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.unableToAcquireTokenFromNativePlatform")
    @js.native
    def unableToAcquireTokenFromNativePlatform: Code = js.native
    inline def unableToAcquireTokenFromNativePlatform_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToAcquireTokenFromNativePlatform")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.unableToLoadTokenError")
    @js.native
    def unableToLoadTokenError: Code = js.native
    inline def unableToLoadTokenError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToLoadTokenError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.unableToParseStateError")
    @js.native
    def unableToParseStateError: Code = js.native
    inline def unableToParseStateError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToParseStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.unableToParseTokenRequestCacheError")
    @js.native
    def unableToParseTokenRequestCacheError: Code = js.native
    inline def unableToParseTokenRequestCacheError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unableToParseTokenRequestCacheError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserAuthError", "BrowserAuthErrorMessage.userCancelledError")
    @js.native
    def userCancelledError: Code = js.native
    inline def userCancelledError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userCancelledError")(x.asInstanceOf[js.Any])
  }
}
