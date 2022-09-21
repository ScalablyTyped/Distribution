package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.Code
import typings.azureMsalCommon.mod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserConfigurationAuthErrorMod {
  
  @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthError")
  @js.native
  open class BrowserConfigurationAuthError protected () extends AuthError {
    def this(errorCode: String) = this()
    def this(errorCode: String, errorMessage: String) = this()
  }
  /* static members */
  object BrowserConfigurationAuthError {
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInMemoryRedirectUnavailableError(): BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemoryRedirectUnavailableError")().asInstanceOf[BrowserConfigurationAuthError]
    
    /**
      * Creates an error thrown when the post-logout redirect uri is empty (not set by caller)
      */
    inline def createPostLogoutRedirectUriEmptyError(): BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostLogoutRedirectUriEmptyError")().asInstanceOf[BrowserConfigurationAuthError]
    
    /**
      * Creates error thrown when redirect callbacks are not set before calling loginRedirect() or acquireTokenRedirect().
      */
    inline def createRedirectCallbacksNotSetError(): BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectCallbacksNotSetError")().asInstanceOf[BrowserConfigurationAuthError]
    
    /**
      * Creates an error thrown when the redirect uri is empty (not set by caller)
      */
    inline def createRedirectUriEmptyError(): BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectUriEmptyError")().asInstanceOf[BrowserConfigurationAuthError]
    
    /**
      * Creates error thrown when given storage location is not supported.
      * @param givenStorageLocation
      */
    inline def createStorageNotSupportedError(givenStorageLocation: String): BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStorageNotSupportedError")(givenStorageLocation.asInstanceOf[js.Any]).asInstanceOf[BrowserConfigurationAuthError]
    
    /**
      * Creates error thrown when the stub instance of PublicClientApplication is called.
      */
    inline def createStubPcaInstanceCalledError(): BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStubPcaInstanceCalledError")().asInstanceOf[BrowserConfigurationAuthError]
  }
  
  object BrowserConfigurationAuthErrorMessage {
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.inMemRedirectUnavailable")
    @js.native
    def inMemRedirectUnavailable: Code = js.native
    inline def inMemRedirectUnavailable_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inMemRedirectUnavailable")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.invalidCallbackObject")
    @js.native
    def invalidCallbackObject: Code = js.native
    inline def invalidCallbackObject_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidCallbackObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.noRedirectCallbacksSet")
    @js.native
    def noRedirectCallbacksSet: Code = js.native
    inline def noRedirectCallbacksSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noRedirectCallbacksSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.postLogoutUriNotSet")
    @js.native
    def postLogoutUriNotSet: Code = js.native
    inline def postLogoutUriNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postLogoutUriNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.redirectUriNotSet")
    @js.native
    def redirectUriNotSet: Code = js.native
    inline def redirectUriNotSet_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redirectUriNotSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.storageNotSupportedError")
    @js.native
    def storageNotSupportedError: Code = js.native
    inline def storageNotSupportedError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageNotSupportedError")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/error/BrowserConfigurationAuthError", "BrowserConfigurationAuthErrorMessage.stubPcaInstanceCalled")
    @js.native
    def stubPcaInstanceCalled: Code = js.native
    inline def stubPcaInstanceCalled_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stubPcaInstanceCalled")(x.asInstanceOf[js.Any])
  }
}
