package typings.azureMsalBrowser

import typings.azureMsalBrowser.distConfigConfigurationMod.CryptoOptions
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.BrowserCacheLocation
import typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode
import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var desc: String
  }
  object Code {
    
    inline def apply(code: String, desc: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeString extends StObject {
    
    var code: String
  }
  object CodeString {
    
    inline def apply(code: String): CodeString = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeString] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Crypto & {initPrng (entropy : std.Uint8Array | std.Array<number>): void} */
  @js.native
  trait CryptoinitPrngentropyUint extends StObject {
    
    /* standard dom */
    def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T = js.native
    
    def initPrng(entropy: js.Array[Double]): Unit = js.native
    def initPrng(entropy: js.typedarray.Uint8Array): Unit = js.native
    
    /** Available only in secure contexts. */
    /* standard dom */
    def randomUUID(): /* template literal string: ${string}-${string}-${string}-${string}-${string} */ String = js.native
    
    /** Available only in secure contexts. */
    /* standard dom */
    val subtle: SubtleCrypto = js.native
  }
  
  /* Inlined std.Partial<@azure/msal-common.@azure/msal-common.BaseAuthRequest> */
  trait PartialBaseAuthRequest extends StObject {
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var requestedClaimsHash: js.UndefOr[String] = js.undefined
    
    var resourceRequestMethod: js.UndefOr[String] = js.undefined
    
    var resourceRequestUri: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
    
    var tokenQueryParameters: js.UndefOr[StringDict] = js.undefined
  }
  object PartialBaseAuthRequest {
    
    inline def apply(): PartialBaseAuthRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBaseAuthRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialBaseAuthRequest] (val x: Self) extends AnyVal {
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setRequestedClaimsHash(value: String): Self = StObject.set(x, "requestedClaimsHash", value.asInstanceOf[js.Any])
      
      inline def setRequestedClaimsHashUndefined: Self = StObject.set(x, "requestedClaimsHash", js.undefined)
      
      inline def setResourceRequestMethod(value: String): Self = StObject.set(x, "resourceRequestMethod", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestMethodUndefined: Self = StObject.set(x, "resourceRequestMethod", js.undefined)
      
      inline def setResourceRequestUri(value: String): Self = StObject.set(x, "resourceRequestUri", value.asInstanceOf[js.Any])
      
      inline def setResourceRequestUriUndefined: Self = StObject.set(x, "resourceRequestUri", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
      
      inline def setTokenQueryParameters(value: StringDict): Self = StObject.set(x, "tokenQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setTokenQueryParametersUndefined: Self = StObject.set(x, "tokenQueryParameters", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<@azure/msal-common.@azure/msal-common.AccountInfo, 'idTokenClaims' | 'name'>> */
  trait PartialOmitAccountInfoidT extends StObject {
    
    var environment: js.UndefOr[String] = js.undefined
    
    var homeAccountId: js.UndefOr[String] = js.undefined
    
    var idToken: js.UndefOr[String] = js.undefined
    
    var localAccountId: js.UndefOr[String] = js.undefined
    
    var nativeAccountId: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object PartialOmitAccountInfoidT {
    
    inline def apply(): PartialOmitAccountInfoidT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitAccountInfoidT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOmitAccountInfoidT] (val x: Self) extends AnyVal {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setHomeAccountId(value: String): Self = StObject.set(x, "homeAccountId", value.asInstanceOf[js.Any])
      
      inline def setHomeAccountIdUndefined: Self = StObject.set(x, "homeAccountId", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setLocalAccountId(value: String): Self = StObject.set(x, "localAccountId", value.asInstanceOf[js.Any])
      
      inline def setLocalAccountIdUndefined: Self = StObject.set(x, "localAccountId", js.undefined)
      
      inline def setNativeAccountId(value: String): Self = StObject.set(x, "nativeAccountId", value.asInstanceOf[js.Any])
      
      inline def setNativeAccountIdUndefined: Self = StObject.set(x, "nativeAccountId", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  /* Inlined std.Required<@azure/msal-browser.@azure/msal-browser/dist/config/Configuration.BrowserAuthOptions> */
  trait RequiredBrowserAuthOption extends StObject {
    
    var authority: String
    
    var authorityMetadata: String
    
    var azureCloudOptions: AzureCloudOptions
    
    var clientCapabilities: js.Array[String]
    
    var clientId: String
    
    var cloudDiscoveryMetadata: String
    
    var knownAuthorities: js.Array[String]
    
    var navigateToLoginRequestUrl: Boolean
    
    var postLogoutRedirectUri: String
    
    var protocolMode: ProtocolMode
    
    var redirectUri: String
    
    var skipAuthorityMetadataCache: Boolean
  }
  object RequiredBrowserAuthOption {
    
    inline def apply(
      authority: String,
      authorityMetadata: String,
      azureCloudOptions: AzureCloudOptions,
      clientCapabilities: js.Array[String],
      clientId: String,
      cloudDiscoveryMetadata: String,
      knownAuthorities: js.Array[String],
      navigateToLoginRequestUrl: Boolean,
      postLogoutRedirectUri: String,
      protocolMode: ProtocolMode,
      redirectUri: String,
      skipAuthorityMetadataCache: Boolean
    ): RequiredBrowserAuthOption = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], authorityMetadata = authorityMetadata.asInstanceOf[js.Any], azureCloudOptions = azureCloudOptions.asInstanceOf[js.Any], clientCapabilities = clientCapabilities.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], cloudDiscoveryMetadata = cloudDiscoveryMetadata.asInstanceOf[js.Any], knownAuthorities = knownAuthorities.asInstanceOf[js.Any], navigateToLoginRequestUrl = navigateToLoginRequestUrl.asInstanceOf[js.Any], postLogoutRedirectUri = postLogoutRedirectUri.asInstanceOf[js.Any], protocolMode = protocolMode.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], skipAuthorityMetadataCache = skipAuthorityMetadataCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredBrowserAuthOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredBrowserAuthOption] (val x: Self) extends AnyVal {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityMetadata(value: String): Self = StObject.set(x, "authorityMetadata", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilities(value: js.Array[String]): Self = StObject.set(x, "clientCapabilities", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilitiesVarargs(value: String*): Self = StObject.set(x, "clientCapabilities", js.Array(value*))
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCloudDiscoveryMetadata(value: String): Self = StObject.set(x, "cloudDiscoveryMetadata", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthorities(value: js.Array[String]): Self = StObject.set(x, "knownAuthorities", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthoritiesVarargs(value: String*): Self = StObject.set(x, "knownAuthorities", js.Array(value*))
      
      inline def setNavigateToLoginRequestUrl(value: Boolean): Self = StObject.set(x, "navigateToLoginRequestUrl", value.asInstanceOf[js.Any])
      
      inline def setPostLogoutRedirectUri(value: String): Self = StObject.set(x, "postLogoutRedirectUri", value.asInstanceOf[js.Any])
      
      inline def setProtocolMode(value: ProtocolMode): Self = StObject.set(x, "protocolMode", value.asInstanceOf[js.Any])
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@azure/msal-browser.@azure/msal-browser/dist/config/Configuration.BrowserSystemOptions> */
  trait RequiredBrowserSystemOpti extends StObject {
    
    var allowNativeBroker: Boolean
    
    var allowRedirectInIframe: Boolean
    
    var asyncPopups: Boolean
    
    var cryptoOptions: CryptoOptions
    
    var iframeHashTimeout: Double
    
    var loadFrameTimeout: Double
    
    var loggerOptions: LoggerOptions
    
    var nativeBrokerHandshakeTimeout: Double
    
    var navigateFrameWait: Double
    
    var navigationClient: INavigationClient
    
    var networkClient: INetworkModule
    
    var pollIntervalMilliseconds: Double
    
    var preventCorsPreflight: Boolean
    
    var redirectNavigationTimeout: Double
    
    var tokenRenewalOffsetSeconds: Double
    
    var windowHashTimeout: Double
  }
  object RequiredBrowserSystemOpti {
    
    inline def apply(
      allowNativeBroker: Boolean,
      allowRedirectInIframe: Boolean,
      asyncPopups: Boolean,
      cryptoOptions: CryptoOptions,
      iframeHashTimeout: Double,
      loadFrameTimeout: Double,
      loggerOptions: LoggerOptions,
      nativeBrokerHandshakeTimeout: Double,
      navigateFrameWait: Double,
      navigationClient: INavigationClient,
      networkClient: INetworkModule,
      pollIntervalMilliseconds: Double,
      preventCorsPreflight: Boolean,
      redirectNavigationTimeout: Double,
      tokenRenewalOffsetSeconds: Double,
      windowHashTimeout: Double
    ): RequiredBrowserSystemOpti = {
      val __obj = js.Dynamic.literal(allowNativeBroker = allowNativeBroker.asInstanceOf[js.Any], allowRedirectInIframe = allowRedirectInIframe.asInstanceOf[js.Any], asyncPopups = asyncPopups.asInstanceOf[js.Any], cryptoOptions = cryptoOptions.asInstanceOf[js.Any], iframeHashTimeout = iframeHashTimeout.asInstanceOf[js.Any], loadFrameTimeout = loadFrameTimeout.asInstanceOf[js.Any], loggerOptions = loggerOptions.asInstanceOf[js.Any], nativeBrokerHandshakeTimeout = nativeBrokerHandshakeTimeout.asInstanceOf[js.Any], navigateFrameWait = navigateFrameWait.asInstanceOf[js.Any], navigationClient = navigationClient.asInstanceOf[js.Any], networkClient = networkClient.asInstanceOf[js.Any], pollIntervalMilliseconds = pollIntervalMilliseconds.asInstanceOf[js.Any], preventCorsPreflight = preventCorsPreflight.asInstanceOf[js.Any], redirectNavigationTimeout = redirectNavigationTimeout.asInstanceOf[js.Any], tokenRenewalOffsetSeconds = tokenRenewalOffsetSeconds.asInstanceOf[js.Any], windowHashTimeout = windowHashTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredBrowserSystemOpti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredBrowserSystemOpti] (val x: Self) extends AnyVal {
      
      inline def setAllowNativeBroker(value: Boolean): Self = StObject.set(x, "allowNativeBroker", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectInIframe(value: Boolean): Self = StObject.set(x, "allowRedirectInIframe", value.asInstanceOf[js.Any])
      
      inline def setAsyncPopups(value: Boolean): Self = StObject.set(x, "asyncPopups", value.asInstanceOf[js.Any])
      
      inline def setCryptoOptions(value: CryptoOptions): Self = StObject.set(x, "cryptoOptions", value.asInstanceOf[js.Any])
      
      inline def setIframeHashTimeout(value: Double): Self = StObject.set(x, "iframeHashTimeout", value.asInstanceOf[js.Any])
      
      inline def setLoadFrameTimeout(value: Double): Self = StObject.set(x, "loadFrameTimeout", value.asInstanceOf[js.Any])
      
      inline def setLoggerOptions(value: LoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
      
      inline def setNativeBrokerHandshakeTimeout(value: Double): Self = StObject.set(x, "nativeBrokerHandshakeTimeout", value.asInstanceOf[js.Any])
      
      inline def setNavigateFrameWait(value: Double): Self = StObject.set(x, "navigateFrameWait", value.asInstanceOf[js.Any])
      
      inline def setNavigationClient(value: INavigationClient): Self = StObject.set(x, "navigationClient", value.asInstanceOf[js.Any])
      
      inline def setNetworkClient(value: INetworkModule): Self = StObject.set(x, "networkClient", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalMilliseconds(value: Double): Self = StObject.set(x, "pollIntervalMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setPreventCorsPreflight(value: Boolean): Self = StObject.set(x, "preventCorsPreflight", value.asInstanceOf[js.Any])
      
      inline def setRedirectNavigationTimeout(value: Double): Self = StObject.set(x, "redirectNavigationTimeout", value.asInstanceOf[js.Any])
      
      inline def setTokenRenewalOffsetSeconds(value: Double): Self = StObject.set(x, "tokenRenewalOffsetSeconds", value.asInstanceOf[js.Any])
      
      inline def setWindowHashTimeout(value: Double): Self = StObject.set(x, "windowHashTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@azure/msal-browser.@azure/msal-browser/dist/config/Configuration.BrowserTelemetryOptions> */
  trait RequiredBrowserTelemetryO extends StObject {
    
    var application: ApplicationTelemetry
  }
  object RequiredBrowserTelemetryO {
    
    inline def apply(application: ApplicationTelemetry): RequiredBrowserTelemetryO = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredBrowserTelemetryO]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredBrowserTelemetryO] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: ApplicationTelemetry): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@azure/msal-browser.@azure/msal-browser/dist/config/Configuration.CacheOptions> */
  trait RequiredCacheOptions extends StObject {
    
    var cacheLocation: BrowserCacheLocation | String
    
    var cacheMigrationEnabled: Boolean
    
    var secureCookies: Boolean
    
    var storeAuthStateInCookie: Boolean
    
    var temporaryCacheLocation: BrowserCacheLocation | String
  }
  object RequiredCacheOptions {
    
    inline def apply(
      cacheLocation: BrowserCacheLocation | String,
      cacheMigrationEnabled: Boolean,
      secureCookies: Boolean,
      storeAuthStateInCookie: Boolean,
      temporaryCacheLocation: BrowserCacheLocation | String
    ): RequiredCacheOptions = {
      val __obj = js.Dynamic.literal(cacheLocation = cacheLocation.asInstanceOf[js.Any], cacheMigrationEnabled = cacheMigrationEnabled.asInstanceOf[js.Any], secureCookies = secureCookies.asInstanceOf[js.Any], storeAuthStateInCookie = storeAuthStateInCookie.asInstanceOf[js.Any], temporaryCacheLocation = temporaryCacheLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheLocation(value: BrowserCacheLocation | String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      inline def setCacheMigrationEnabled(value: Boolean): Self = StObject.set(x, "cacheMigrationEnabled", value.asInstanceOf[js.Any])
      
      inline def setSecureCookies(value: Boolean): Self = StObject.set(x, "secureCookies", value.asInstanceOf[js.Any])
      
      inline def setStoreAuthStateInCookie(value: Boolean): Self = StObject.set(x, "storeAuthStateInCookie", value.asInstanceOf[js.Any])
      
      inline def setTemporaryCacheLocation(value: BrowserCacheLocation | String): Self = StObject.set(x, "temporaryCacheLocation", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<std.Pick<@azure/msal-browser.@azure/msal-browser/dist/config/Configuration.BrowserSystemOptions, 'navigateFrameWait' | 'pollIntervalMilliseconds'>> */
  trait RequiredPickBrowserSystem extends StObject {
    
    var navigateFrameWait: Double
    
    var pollIntervalMilliseconds: Double
  }
  object RequiredPickBrowserSystem {
    
    inline def apply(navigateFrameWait: Double, pollIntervalMilliseconds: Double): RequiredPickBrowserSystem = {
      val __obj = js.Dynamic.literal(navigateFrameWait = navigateFrameWait.asInstanceOf[js.Any], pollIntervalMilliseconds = pollIntervalMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredPickBrowserSystem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredPickBrowserSystem] (val x: Self) extends AnyVal {
      
      inline def setNavigateFrameWait(value: Double): Self = StObject.set(x, "navigateFrameWait", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalMilliseconds(value: Double): Self = StObject.set(x, "pollIntervalMilliseconds", value.asInstanceOf[js.Any])
    }
  }
}
