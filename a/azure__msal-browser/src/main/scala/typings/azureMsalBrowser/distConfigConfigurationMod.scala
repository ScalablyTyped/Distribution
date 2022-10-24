package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.RequiredBrowserAuthOption
import typings.azureMsalBrowser.anon.RequiredBrowserSystemOpti
import typings.azureMsalBrowser.anon.RequiredBrowserTelemetryO
import typings.azureMsalBrowser.anon.RequiredCacheOptions
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation
import typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode
import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import typings.azureMsalCommon.distConfigClientConfigurationMod.SystemOptions
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigConfigurationMod {
  
  @JSImport("@azure/msal-browser/dist/config/Configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-browser/dist/config/Configuration", "DEFAULT_IFRAME_TIMEOUT_MS")
  @js.native
  val DEFAULT_IFRAME_TIMEOUT_MS: /* 6000 */ Double = js.native
  
  @JSImport("@azure/msal-browser/dist/config/Configuration", "DEFAULT_NATIVE_BROKER_HANDSHAKE_TIMEOUT_MS")
  @js.native
  val DEFAULT_NATIVE_BROKER_HANDSHAKE_TIMEOUT_MS: /* 2000 */ Double = js.native
  
  @JSImport("@azure/msal-browser/dist/config/Configuration", "DEFAULT_POPUP_TIMEOUT_MS")
  @js.native
  val DEFAULT_POPUP_TIMEOUT_MS: /* 60000 */ Double = js.native
  
  @JSImport("@azure/msal-browser/dist/config/Configuration", "DEFAULT_REDIRECT_TIMEOUT_MS")
  @js.native
  val DEFAULT_REDIRECT_TIMEOUT_MS: /* 30000 */ Double = js.native
  
  inline def buildConfiguration(param0: Configuration, isBrowserEnvironment: Boolean): BrowserConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConfiguration")(param0.asInstanceOf[js.Any], isBrowserEnvironment.asInstanceOf[js.Any])).asInstanceOf[BrowserConfiguration]
  
  trait BrowserAuthOptions extends StObject {
    
    /**
      * You can configure a specific authority, defaults to " " or "https://login.microsoftonline.com/common"
      */
    var authority: js.UndefOr[String] = js.undefined
    
    /**
      * A string containing the .well-known/openid-configuration endpoint response
      */
    var authorityMetadata: js.UndefOr[String] = js.undefined
    
    /**
      * Enum that represents the Azure Cloud to use.
      */
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    /**
      * Array of capabilities which will be added to the claims.access_token.xms_cc request property on every network request.
      */
    var clientCapabilities: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Client ID of your app registered with our Application registration portal : https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview in Microsoft Identity Platform
      */
    var clientId: String
    
    /**
      * A string containing the cloud discovery response. Used in AAD scenarios.
      */
    var cloudDiscoveryMetadata: js.UndefOr[String] = js.undefined
    
    /**
      * An array of URIs that are known to be valid. Used in B2C scenarios.
      */
    var knownAuthorities: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Boolean indicating whether to navigate to the original request URL after the auth server navigates to the redirect URL.
      */
    var navigateToLoginRequestUrl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The redirect URI where the window navigates after a successful logout.
      */
    var postLogoutRedirectUri: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Enum that represents the protocol that msal follows. Used for configuring proper endpoints.
      */
    var protocolMode: js.UndefOr[ProtocolMode] = js.undefined
    
    /**
      * The redirect URI where authentication responses can be received by your application. It must exactly match one of the redirect URIs registered in the Azure portal.
      */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /**
      * Flag of whether to use the local metadata cache
      */
    var skipAuthorityMetadataCache: js.UndefOr[Boolean] = js.undefined
  }
  object BrowserAuthOptions {
    
    inline def apply(clientId: String): BrowserAuthOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserAuthOptions]
    }
    
    extension [Self <: BrowserAuthOptions](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityMetadata(value: String): Self = StObject.set(x, "authorityMetadata", value.asInstanceOf[js.Any])
      
      inline def setAuthorityMetadataUndefined: Self = StObject.set(x, "authorityMetadata", js.undefined)
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClientCapabilities(value: js.Array[String]): Self = StObject.set(x, "clientCapabilities", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilitiesUndefined: Self = StObject.set(x, "clientCapabilities", js.undefined)
      
      inline def setClientCapabilitiesVarargs(value: String*): Self = StObject.set(x, "clientCapabilities", js.Array(value*))
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCloudDiscoveryMetadata(value: String): Self = StObject.set(x, "cloudDiscoveryMetadata", value.asInstanceOf[js.Any])
      
      inline def setCloudDiscoveryMetadataUndefined: Self = StObject.set(x, "cloudDiscoveryMetadata", js.undefined)
      
      inline def setKnownAuthorities(value: js.Array[String]): Self = StObject.set(x, "knownAuthorities", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthoritiesUndefined: Self = StObject.set(x, "knownAuthorities", js.undefined)
      
      inline def setKnownAuthoritiesVarargs(value: String*): Self = StObject.set(x, "knownAuthorities", js.Array(value*))
      
      inline def setNavigateToLoginRequestUrl(value: Boolean): Self = StObject.set(x, "navigateToLoginRequestUrl", value.asInstanceOf[js.Any])
      
      inline def setNavigateToLoginRequestUrlUndefined: Self = StObject.set(x, "navigateToLoginRequestUrl", js.undefined)
      
      inline def setPostLogoutRedirectUri(value: String): Self = StObject.set(x, "postLogoutRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setPostLogoutRedirectUriNull: Self = StObject.set(x, "postLogoutRedirectUri", null)
      
      inline def setPostLogoutRedirectUriUndefined: Self = StObject.set(x, "postLogoutRedirectUri", js.undefined)
      
      inline def setProtocolMode(value: ProtocolMode): Self = StObject.set(x, "protocolMode", value.asInstanceOf[js.Any])
      
      inline def setProtocolModeUndefined: Self = StObject.set(x, "protocolMode", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCacheUndefined: Self = StObject.set(x, "skipAuthorityMetadataCache", js.undefined)
    }
  }
  
  trait BrowserConfiguration extends StObject {
    
    var auth: RequiredBrowserAuthOption
    
    var cache: RequiredCacheOptions
    
    var system: RequiredBrowserSystemOpti
    
    var telemetry: RequiredBrowserTelemetryO
  }
  object BrowserConfiguration {
    
    inline def apply(
      auth: RequiredBrowserAuthOption,
      cache: RequiredCacheOptions,
      system: RequiredBrowserSystemOpti,
      telemetry: RequiredBrowserTelemetryO
    ): BrowserConfiguration = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserConfiguration]
    }
    
    extension [Self <: BrowserConfiguration](x: Self) {
      
      inline def setAuth(value: RequiredBrowserAuthOption): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setCache(value: RequiredCacheOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: RequiredBrowserSystemOpti): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setTelemetry(value: RequiredBrowserTelemetryO): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrowserSystemOptions
    extends StObject
       with SystemOptions {
    
    /**
      * Flag to enable native broker support (e.g. acquiring tokens from WAM on Windows)
      */
    var allowNativeBroker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag to enable redirect opertaions when the app is rendered in an iframe (to support scenarios such as embedded B2C login).
      */
    var allowRedirectInIframe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets whether popups are opened asynchronously. By default, this flag is set to false. When set to false, blank popups are opened before anything else happens. When set to true, popups are opened when making the network request.
      */
    var asyncPopups: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the timeout for waiting for a response hash in an iframe. Will take precedence over loadFrameTimeout if both are set.
      */
    var iframeHashTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the timeout for waiting for a response hash in an iframe or popup
      */
    var loadFrameTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Used to initialize the Logger object (See ClientConfiguration.ts)
      */
    var loggerOptions: js.UndefOr[LoggerOptions] = js.undefined
    
    /**
      * Sets the timeout for waiting for the native broker handshake to resolve
      */
    var nativeBrokerHandshakeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum time the library should wait for a frame to load
      */
    var navigateFrameWait: js.UndefOr[Double] = js.undefined
    
    /**
      * Override the methods used to navigate to other webpages. Particularly useful if you are using a client-side router
      */
    var navigationClient: js.UndefOr[INavigationClient] = js.undefined
    
    /**
      * Network interface implementation
      */
    var networkClient: js.UndefOr[INetworkModule] = js.undefined
    
    /**
      * Time to wait for redirection to occur before resolving promise
      */
    var redirectNavigationTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the timeout for waiting for a response hash in a popup. Will take precedence over loadFrameTimeout if both are set.
      */
    var windowHashTimeout: js.UndefOr[Double] = js.undefined
  }
  object BrowserSystemOptions {
    
    inline def apply(): BrowserSystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserSystemOptions]
    }
    
    extension [Self <: BrowserSystemOptions](x: Self) {
      
      inline def setAllowNativeBroker(value: Boolean): Self = StObject.set(x, "allowNativeBroker", value.asInstanceOf[js.Any])
      
      inline def setAllowNativeBrokerUndefined: Self = StObject.set(x, "allowNativeBroker", js.undefined)
      
      inline def setAllowRedirectInIframe(value: Boolean): Self = StObject.set(x, "allowRedirectInIframe", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectInIframeUndefined: Self = StObject.set(x, "allowRedirectInIframe", js.undefined)
      
      inline def setAsyncPopups(value: Boolean): Self = StObject.set(x, "asyncPopups", value.asInstanceOf[js.Any])
      
      inline def setAsyncPopupsUndefined: Self = StObject.set(x, "asyncPopups", js.undefined)
      
      inline def setIframeHashTimeout(value: Double): Self = StObject.set(x, "iframeHashTimeout", value.asInstanceOf[js.Any])
      
      inline def setIframeHashTimeoutUndefined: Self = StObject.set(x, "iframeHashTimeout", js.undefined)
      
      inline def setLoadFrameTimeout(value: Double): Self = StObject.set(x, "loadFrameTimeout", value.asInstanceOf[js.Any])
      
      inline def setLoadFrameTimeoutUndefined: Self = StObject.set(x, "loadFrameTimeout", js.undefined)
      
      inline def setLoggerOptions(value: LoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
      
      inline def setLoggerOptionsUndefined: Self = StObject.set(x, "loggerOptions", js.undefined)
      
      inline def setNativeBrokerHandshakeTimeout(value: Double): Self = StObject.set(x, "nativeBrokerHandshakeTimeout", value.asInstanceOf[js.Any])
      
      inline def setNativeBrokerHandshakeTimeoutUndefined: Self = StObject.set(x, "nativeBrokerHandshakeTimeout", js.undefined)
      
      inline def setNavigateFrameWait(value: Double): Self = StObject.set(x, "navigateFrameWait", value.asInstanceOf[js.Any])
      
      inline def setNavigateFrameWaitUndefined: Self = StObject.set(x, "navigateFrameWait", js.undefined)
      
      inline def setNavigationClient(value: INavigationClient): Self = StObject.set(x, "navigationClient", value.asInstanceOf[js.Any])
      
      inline def setNavigationClientUndefined: Self = StObject.set(x, "navigationClient", js.undefined)
      
      inline def setNetworkClient(value: INetworkModule): Self = StObject.set(x, "networkClient", value.asInstanceOf[js.Any])
      
      inline def setNetworkClientUndefined: Self = StObject.set(x, "networkClient", js.undefined)
      
      inline def setRedirectNavigationTimeout(value: Double): Self = StObject.set(x, "redirectNavigationTimeout", value.asInstanceOf[js.Any])
      
      inline def setRedirectNavigationTimeoutUndefined: Self = StObject.set(x, "redirectNavigationTimeout", js.undefined)
      
      inline def setWindowHashTimeout(value: Double): Self = StObject.set(x, "windowHashTimeout", value.asInstanceOf[js.Any])
      
      inline def setWindowHashTimeoutUndefined: Self = StObject.set(x, "windowHashTimeout", js.undefined)
    }
  }
  
  trait BrowserTelemetryOptions extends StObject {
    
    /**
      * Telemetry information sent on request
      * - appName: Unique string name of an application
      * - appVersion: Version of the application using MSAL
      */
    var application: js.UndefOr[ApplicationTelemetry] = js.undefined
  }
  object BrowserTelemetryOptions {
    
    inline def apply(): BrowserTelemetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserTelemetryOptions]
    }
    
    extension [Self <: BrowserTelemetryOptions](x: Self) {
      
      inline def setApplication(value: ApplicationTelemetry): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    }
  }
  
  trait CacheOptions extends StObject {
    
    /**
      * Used to specify the cacheLocation user wants to set. Valid values are "localStorage" and "sessionStorage"
      */
    var cacheLocation: js.UndefOr[BrowserCacheLocation | String] = js.undefined
    
    /**
      * If set, MSAL sets the "Secure" flag on cookies so they can only be sent over HTTPS. By default this flag is set to false.
      */
    var secureCookies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, MSAL stores the auth request state required for validation of the auth flows in the browser cookies. By default this flag is set to false.
      */
    var storeAuthStateInCookie: js.UndefOr[Boolean] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    extension [Self <: CacheOptions](x: Self) {
      
      inline def setCacheLocation(value: BrowserCacheLocation | String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
      
      inline def setSecureCookies(value: Boolean): Self = StObject.set(x, "secureCookies", value.asInstanceOf[js.Any])
      
      inline def setSecureCookiesUndefined: Self = StObject.set(x, "secureCookies", js.undefined)
      
      inline def setStoreAuthStateInCookie(value: Boolean): Self = StObject.set(x, "storeAuthStateInCookie", value.asInstanceOf[js.Any])
      
      inline def setStoreAuthStateInCookieUndefined: Self = StObject.set(x, "storeAuthStateInCookie", js.undefined)
    }
  }
  
  trait Configuration extends StObject {
    
    /**
      * This is where you configure auth elements like clientID, authority used for authenticating against the Microsoft Identity Platform
      */
    var auth: BrowserAuthOptions
    
    /**
      * This is where you configure cache location and whether to store cache in cookies
      */
    var cache: js.UndefOr[CacheOptions] = js.undefined
    
    /**
      * This is where you can configure the network client, logger, token renewal offset
      */
    var system: js.UndefOr[BrowserSystemOptions] = js.undefined
    
    /**
      * This is where you can configure telemetry data and options
      */
    var telemetry: js.UndefOr[BrowserTelemetryOptions] = js.undefined
  }
  object Configuration {
    
    inline def apply(auth: BrowserAuthOptions): Configuration = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setAuth(value: BrowserAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setCache(value: CacheOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setSystem(value: BrowserSystemOptions): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      inline def setTelemetry(value: BrowserTelemetryOptions): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    }
  }
}
