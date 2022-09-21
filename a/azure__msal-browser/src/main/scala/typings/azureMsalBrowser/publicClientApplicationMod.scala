package typings.azureMsalBrowser

import typings.azureMsalBrowser.authorizationCodeRequestMod.AuthorizationCodeRequest
import typings.azureMsalBrowser.browserConstantsMod.WrapperSKU
import typings.azureMsalBrowser.clientApplicationMod.ClientApplication
import typings.azureMsalBrowser.configurationMod.BrowserConfiguration
import typings.azureMsalBrowser.configurationMod.Configuration
import typings.azureMsalBrowser.endSessionPopupRequestMod.EndSessionPopupRequest
import typings.azureMsalBrowser.endSessionRequestMod.EndSessionRequest
import typings.azureMsalBrowser.inavigationclientMod.INavigationClient
import typings.azureMsalBrowser.ipublicclientapplicationMod.IPublicClientApplication
import typings.azureMsalBrowser.itokencacheMod.ITokenCache
import typings.azureMsalBrowser.popupRequestMod.PopupRequest
import typings.azureMsalBrowser.redirectRequestMod.RedirectRequest
import typings.azureMsalBrowser.silentRequestMod.SilentRequest
import typings.azureMsalBrowser.ssoSilentRequestMod.SsoSilentRequest
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.iperformanceclientMod.PerformanceCallbackFunction
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicClientApplicationMod {
  
  @JSImport("@azure/msal-browser/dist/app/PublicClientApplication", "PublicClientApplication")
  @js.native
  open class PublicClientApplication protected ()
    extends ClientApplication
       with IPublicClientApplication {
    /**
      * @constructor
      * Constructor for the PublicClientApplication used to instantiate the PublicClientApplication object
      *
      * Important attributes in the Configuration object for auth are:
      * - clientID: the application ID of your application. You can obtain one by registering your application with our Application registration portal : https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview
      * - authority: the authority URL for your application.
      * - redirect_uri: the uri of your application registered in the portal.
      *
      * In Azure AD, authority is a URL indicating the Azure active directory that MSAL uses to obtain tokens.
      * It is of the form https://login.microsoftonline.com/{Enter_the_Tenant_Info_Here}
      * If your application supports Accounts in one organizational directory, replace "Enter_the_Tenant_Info_Here" value with the Tenant Id or Tenant name (for example, contoso.microsoft.com).
      * If your application supports Accounts in any organizational directory, replace "Enter_the_Tenant_Info_Here" value with organizations.
      * If your application supports Accounts in any organizational directory and personal Microsoft accounts, replace "Enter_the_Tenant_Info_Here" value with common.
      * To restrict support to Personal Microsoft accounts only, replace "Enter_the_Tenant_Info_Here" value with consumers.
      *
      * In Azure B2C, authority is of the form https://{instance}/tfp/{tenant}/{policyName}/
      * Full B2C functionality will be available in this library in future versions.
      *
      * @param configuration object for the MSAL PublicClientApplication instance
      */
    def this(configuration: Configuration) = this()
    
    /**
      * This function redeems an authorization code (passed as code) from the eSTS token endpoint.
      * This authorization code should be acquired server-side using a confidential client to acquire a spa_code.
      * This API is not indended for normal authorization code acquisition and redemption.
      *
      * Redemption of this authorization code will not require PKCE, as it was acquired by a confidential client.
      *
      * @param request {@link AuthorizationCodeRequest}
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    /* InferMemberOverrides */
    override def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Use when you want to obtain an access_token for your API via opening a popup window in the user's browser
      *
      * @param request
      *
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    /* InferMemberOverrides */
    override def acquireTokenPopup(request: PopupRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Use when you want to obtain an access_token for your API by redirecting the user's browser window to the authorization endpoint. This function redirects
      * the page, so any code that follows this function will not execute.
      *
      * IMPORTANT: It is NOT recommended to have code that is dependent on the resolution of the Promise. This function will navigate away from the current
      * browser window. It currently returns a Promise in order to reflect the asynchronous nature of the code running in this function.
      *
      * @param request
      */
    /* InferMemberOverrides */
    override def acquireTokenRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    /**
      * Silently acquire an access token for a given set of scopes. Will use cached token if available, otherwise will attempt to acquire a new token from the network via refresh token.
      * @param {@link (SilentRequest:type)}
      * @param {@link (AccountInfo:type)}
      * @returns {Promise.<AuthenticationResult>} - a promise that is fulfilled when this function has completed, or rejected if an error was raised. Returns the {@link AuthResponse}
      */
    /* protected */ def acquireTokenSilentAsync(request: SilentRequest, account: AccountInfo): js.Promise[AuthenticationResult] = js.native
    
    /* private */ var activeSilentTokenRequests: Any = js.native
    
    /**
      * Registers a callback to receive performance events.
      *
      * @param {PerformanceCallbackFunction} callback
      * @returns {string}
      */
    /* InferMemberOverrides */
    override def addPerformanceCallback(callback: PerformanceCallbackFunction): String = js.native
    
    /**
      * Removes event listener that emits an event when a user account is added or removed from localstorage in a different browser tab or window
      */
    /* InferMemberOverrides */
    override def disableAccountStorageEvents(): Unit = js.native
    
    /**
      * Adds event listener that emits an event when a user account is added or removed from localstorage in a different browser tab or window
      */
    /* InferMemberOverrides */
    override def enableAccountStorageEvents(): Unit = js.native
    
    /**
      * Returns the signed in account matching homeAccountId.
      * (the account object is created at the time of successful login)
      * or null when no matching account is found
      * @param homeAccountId
      * @returns The account object stored in MSAL
      */
    /* InferMemberOverrides */
    override def getAccountByHomeId(homeAccountId: String): AccountInfo | Null = js.native
    
    /**
      * Returns the signed in account matching localAccountId.
      * (the account object is created at the time of successful login)
      * or null when no matching account is found
      * @param localAccountId
      * @returns The account object stored in MSAL
      */
    /* InferMemberOverrides */
    override def getAccountByLocalId(localAccountId: String): AccountInfo | Null = js.native
    
    /**
      * Returns the signed in account matching username.
      * (the account object is created at the time of successful login)
      * or null when no matching account is found.
      * This API is provided for convenience but getAccountById should be used for best reliability
      * @param userName
      * @returns The account object stored in MSAL
      */
    /* InferMemberOverrides */
    override def getAccountByUsername(userName: String): AccountInfo | Null = js.native
    
    /**
      * Gets the currently active account
      */
    /* InferMemberOverrides */
    override def getActiveAccount(): AccountInfo | Null = js.native
    
    /**
      * Returns all accounts that MSAL currently has data for.
      * (the account object is created at the time of successful login)
      * or empty array when no accounts are found
      * @returns Array of account objects in cache
      */
    /* InferMemberOverrides */
    override def getAllAccounts(): js.Array[AccountInfo] = js.native
    
    /**
      * Returns the configuration object
      */
    /* InferMemberOverrides */
    override def getConfiguration(): BrowserConfiguration = js.native
    
    /**
      * Returns the logger instance
      */
    /* InferMemberOverrides */
    override def getLogger(): Logger = js.native
    
    /**
      * Gets the token cache for the application.
      */
    /* InferMemberOverrides */
    override def getTokenCache(): ITokenCache = js.native
    
    /**
      * Event handler function which allows users to fire events after the PublicClientApplication object
      * has loaded during redirect flows. This should be invoked on all page loads involved in redirect
      * auth flows.
      * @param hash Hash to process. Defaults to the current value of window.location.hash. Only needs to be provided explicitly if the response to be handled is not contained in the current value.
      * @returns Token response or null. If the return value is null, then no auth redirect was detected.
      */
    /* InferMemberOverrides */
    override def handleRedirectPromise(): js.Promise[AuthenticationResult | Null] = js.native
    /* InferMemberOverrides */
    override def handleRedirectPromise(hash: String): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Initializer function to perform async startup tasks such as connecting to WAM extension
      */
    /* InferMemberOverrides */
    override def initialize(): js.Promise[Unit] = js.native
    
    /**
      * Called by wrapper libraries (Angular & React) to set SKU and Version passed down to telemetry, logger, etc.
      * @param sku
      * @param version
      */
    /* InferMemberOverrides */
    override def initializeWrapperLibrary(sku: WrapperSKU, version: String): Unit = js.native
    
    /**
      * Deprecated logout function. Use logoutRedirect or logoutPopup instead
      * @param logoutRequest
      * @deprecated
      */
    /* InferMemberOverrides */
    override def logout(): js.Promise[Unit] = js.native
    /* InferMemberOverrides */
    override def logout(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    /**
      * Clears local cache for the current user then opens a popup window prompting the user to sign-out of the server
      * @param logoutRequest
      */
    /* InferMemberOverrides */
    override def logoutPopup(): js.Promise[Unit] = js.native
    /* InferMemberOverrides */
    override def logoutPopup(logoutRequest: EndSessionPopupRequest): js.Promise[Unit] = js.native
    
    /**
      * Use to log out the current user, and redirect the user to the postLogoutRedirectUri.
      * Default behaviour is to redirect the user to `window.location.href`.
      * @param logoutRequest
      */
    /* InferMemberOverrides */
    override def logoutRedirect(): js.Promise[Unit] = js.native
    /* InferMemberOverrides */
    override def logoutRedirect(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    /**
      * Removes callback with provided id from callback array
      * @param callbackId
      */
    /* InferMemberOverrides */
    override def removeEventCallback(callbackId: String): Unit = js.native
    
    /**
      * Removes a callback registered with addPerformanceCallback.
      *
      * @param {string} callbackId
      * @returns {boolean}
      */
    /* InferMemberOverrides */
    override def removePerformanceCallback(callbackId: String): Boolean = js.native
    
    /**
      * Sets the account to use as the active account. If no account is passed to the acquireToken APIs, then MSAL will use this active account.
      * @param account
      */
    /* InferMemberOverrides */
    override def setActiveAccount(): Unit = js.native
    /* InferMemberOverrides */
    override def setActiveAccount(account: AccountInfo): Unit = js.native
    
    /**
      * Replaces the default logger set in configurations with new Logger with new configurations
      * @param logger Logger instance
      */
    /* InferMemberOverrides */
    override def setLogger(logger: Logger): Unit = js.native
    
    /**
      * Sets navigation client
      * @param navigationClient
      */
    /* InferMemberOverrides */
    override def setNavigationClient(navigationClient: INavigationClient): Unit = js.native
    
    /**
      * This function uses a hidden iframe to fetch an authorization code from the eSTS. There are cases where this may not work:
      * - Any browser using a form of Intelligent Tracking Prevention
      * - If there is not an established session with the service
      *
      * In these cases, the request must be done inside a popup or full frame redirect.
      *
      * For the cases where interaction is required, you cannot send a request with prompt=none.
      *
      * If your refresh token has expired, you can use this function to fetch a new set of tokens silently as long as
      * you session on the server still exists.
      * @param request {@link SsoSilentRequest}
      *
      * @returns A promise that is fulfilled when this function has completed, or rejected if an error was raised.
      */
    /* InferMemberOverrides */
    override def ssoSilent(request: SsoSilentRequest): js.Promise[AuthenticationResult] = js.native
  }
}
