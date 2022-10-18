package typings.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "BrowserConfigurationAuthError")
@js.native
open class BrowserConfigurationAuthError protected ()
  extends typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
}
/* static members */
object BrowserConfigurationAuthError {
  
  @JSImport("@azure/msal-browser", "BrowserConfigurationAuthError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInMemoryRedirectUnavailableError(): typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemoryRedirectUnavailableError")().asInstanceOf[typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError]
  
  /**
    * Creates an error thrown when the post-logout redirect uri is empty (not set by caller)
    */
  inline def createPostLogoutRedirectUriEmptyError(): typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostLogoutRedirectUriEmptyError")().asInstanceOf[typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError]
  
  /**
    * Creates error thrown when redirect callbacks are not set before calling loginRedirect() or acquireTokenRedirect().
    */
  inline def createRedirectCallbacksNotSetError(): typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectCallbacksNotSetError")().asInstanceOf[typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError]
  
  /**
    * Creates an error thrown when the redirect uri is empty (not set by caller)
    */
  inline def createRedirectUriEmptyError(): typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectUriEmptyError")().asInstanceOf[typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError]
  
  /**
    * Creates error thrown when given storage location is not supported.
    * @param givenStorageLocation
    */
  inline def createStorageNotSupportedError(givenStorageLocation: String): typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStorageNotSupportedError")(givenStorageLocation.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError]
  
  /**
    * Creates error thrown when the stub instance of PublicClientApplication is called.
    */
  inline def createStubPcaInstanceCalledError(): typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createStubPcaInstanceCalledError")().asInstanceOf[typings.azureMsalBrowser.distErrorBrowserConfigurationAuthErrorMod.BrowserConfigurationAuthError]
}
