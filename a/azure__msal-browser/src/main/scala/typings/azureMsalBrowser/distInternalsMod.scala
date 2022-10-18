package typings.azureMsalBrowser

import typings.azureMsalBrowser.anon.RequiredCacheOptions
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distRequestCommonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import typings.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalsMod {
  
  @JSImport("@azure/msal-browser/dist/internals", "BrowserCacheManager")
  @js.native
  open class BrowserCacheManager protected ()
    extends typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager {
    def this(clientId: String, cacheConfig: RequiredCacheOptions, cryptoImpl: ICrypto, logger: Logger) = this()
  }
  
  object BrowserConstants {
    
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Interaction in progress cache value
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.INTERACTION_IN_PROGRESS_VALUE")
    @js.native
    def INTERACTION_IN_PROGRESS_VALUE: String = js.native
    inline def INTERACTION_IN_PROGRESS_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_IN_PROGRESS_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Invalid grant error code
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.INVALID_GRANT_ERROR")
    @js.native
    def INVALID_GRANT_ERROR: String = js.native
    inline def INVALID_GRANT_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_GRANT_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Msal-browser SKU
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.MSAL_SKU")
    @js.native
    def MSAL_SKU: String = js.native
    inline def MSAL_SKU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSAL_SKU")(x.asInstanceOf[js.Any])
    
    /**
      * Default popup monitor poll interval in milliseconds
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.POLL_INTERVAL_MS")
    @js.native
    def POLL_INTERVAL_MS: Double = js.native
    inline def POLL_INTERVAL_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POLL_INTERVAL_MS")(x.asInstanceOf[js.Any])
    
    /**
      * Default popup window height
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.POPUP_HEIGHT")
    @js.native
    def POPUP_HEIGHT: Double = js.native
    inline def POPUP_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP_HEIGHT")(x.asInstanceOf[js.Any])
    
    /**
      * Name of the popup window starts with
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.POPUP_NAME_PREFIX")
    @js.native
    def POPUP_NAME_PREFIX: String = js.native
    inline def POPUP_NAME_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP_NAME_PREFIX")(x.asInstanceOf[js.Any])
    
    /**
      * Default popup window width
      */
    @JSImport("@azure/msal-browser/dist/internals", "BrowserConstants.POPUP_WIDTH")
    @js.native
    def POPUP_WIDTH: Double = js.native
    inline def POPUP_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP_WIDTH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "EventHandler")
  @js.native
  open class EventHandler protected ()
    extends typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler {
    def this(logger: Logger, browserCrypto: ICrypto) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "NativeMessageHandler")
  @js.native
  open class NativeMessageHandler protected ()
    extends typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler {
    def this(logger: Logger, handshakeTimeoutMs: Double) = this()
    def this(logger: Logger, handshakeTimeoutMs: Double, extensionId: String) = this()
  }
  /* static members */
  object NativeMessageHandler {
    
    @JSImport("@azure/msal-browser/dist/internals", "NativeMessageHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an instance of the MessageHandler that has successfully established a connection with an extension
      * @param logger
      * @param handshakeTimeoutMs
      */
    inline def createProvider(logger: Logger, handshakeTimeoutMs: Double): js.Promise[
        typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProvider")(logger.asInstanceOf[js.Any], handshakeTimeoutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
      ]]
    
    /**
      * Returns boolean indicating whether or not the request should attempt to use native broker
      * @param logger
      * @param config
      * @param nativeExtensionProvider
      * @param authenticationScheme
      */
    inline def isNativeAvailable(config: BrowserConfiguration, logger: Logger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: Logger,
      nativeExtensionProvider: Unit,
      authenticationScheme: AuthenticationScheme
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any], authenticationScheme.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: Logger,
      nativeExtensionProvider: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: Logger,
      nativeExtensionProvider: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      authenticationScheme: AuthenticationScheme
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any], authenticationScheme.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "PopupClient")
  @js.native
  open class PopupClient protected ()
    extends typings.azureMsalBrowser.distInteractionClientPopupClientMod.PopupClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "RedirectClient")
  @js.native
  open class RedirectClient protected ()
    extends typings.azureMsalBrowser.distInteractionClientRedirectClientMod.RedirectClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends typings.azureMsalBrowser.distInteractionHandlerRedirectHandlerMod.RedirectHandler {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: Logger,
      browserCrypto: ICrypto
    ) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "SilentCacheClient")
  @js.native
  open class SilentCacheClient protected ()
    extends typings.azureMsalBrowser.distInteractionClientSilentCacheClientMod.SilentCacheClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "SilentIframeClient")
  @js.native
  open class SilentIframeClient protected ()
    extends typings.azureMsalBrowser.distInteractionClientSilentIframeClientMod.SilentIframeClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "SilentRefreshClient")
  @js.native
  open class SilentRefreshClient protected ()
    extends typings.azureMsalBrowser.distInteractionClientSilentRefreshClientMod.SilentRefreshClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@azure/msal-browser/dist/internals", "StandardInteractionClient")
  @js.native
  open class StandardInteractionClient protected ()
    extends typings.azureMsalBrowser.distInteractionClientStandardInteractionClientMod.StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser/dist/internals", "TemporaryCacheKeys")
  @js.native
  object TemporaryCacheKeys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys & String
      ] = js.native
    
    /* "acquireToken.account" */ val ACQUIRE_TOKEN_ACCOUNT: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.ACQUIRE_TOKEN_ACCOUNT & String = js.native
    
    /* "authority" */ val AUTHORITY: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.AUTHORITY & String = js.native
    
    /* "ccs.credential" */ val CCS_CREDENTIAL: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.CCS_CREDENTIAL & String = js.native
    
    /* "request.correlationId" */ val CORRELATION_ID: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.CORRELATION_ID & String = js.native
    
    /* "interaction.status" */ val INTERACTION_STATUS_KEY: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.INTERACTION_STATUS_KEY & String = js.native
    
    /* "request.native" */ val NATIVE_REQUEST: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.NATIVE_REQUEST & String = js.native
    
    /* "nonce.id_token" */ val NONCE_IDTOKEN: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.NONCE_IDTOKEN & String = js.native
    
    /* "request.origin" */ val ORIGIN_URI: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.ORIGIN_URI & String = js.native
    
    /* "token.renew.status" */ val RENEW_STATUS: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.RENEW_STATUS & String = js.native
    
    /* "request.params" */ val REQUEST_PARAMS: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.REQUEST_PARAMS & String = js.native
    
    /* "request.state" */ val REQUEST_STATE: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.REQUEST_STATE & String = js.native
    
    /* "scopes" */ val SCOPES: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.SCOPES & String = js.native
    
    /* "session.state" */ val SESSION_STATE: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.SESSION_STATE & String = js.native
    
    /* "urlHash" */ val URL_HASH: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.URL_HASH & String = js.native
  }
}
