package typings.azureMsalBrowser.mod

import typings.azureMsalBrowser.anon.RequiredCacheOptions
import typings.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typings.azureMsalBrowser.distConfigConfigurationMod.CryptoOptions
import typings.azureMsalBrowser.distErrorNativeAuthErrorMod.OSError
import typings.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distRequestCommonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.SubMeasurement
import typings.azureMsalCommon.mod.AuthorizationCodeClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internals {
  
  @JSImport("@azure/msal-browser", "internals.BrowserCacheManager")
  @js.native
  open class BrowserCacheManager protected ()
    extends typings.azureMsalBrowser.distInternalsMod.BrowserCacheManager {
    def this(
      clientId: String,
      cacheConfig: RequiredCacheOptions,
      cryptoImpl: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger
    ) = this()
  }
  
  object BrowserConstants {
    
    @JSImport("@azure/msal-browser", "internals.BrowserConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default popup monitor poll interval in milliseconds
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.DEFAULT_POLL_INTERVAL_MS")
    @js.native
    def DEFAULT_POLL_INTERVAL_MS: Double = js.native
    inline def DEFAULT_POLL_INTERVAL_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_POLL_INTERVAL_MS")(x.asInstanceOf[js.Any])
    
    /**
      * Interaction in progress cache value
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.INTERACTION_IN_PROGRESS_VALUE")
    @js.native
    def INTERACTION_IN_PROGRESS_VALUE: String = js.native
    inline def INTERACTION_IN_PROGRESS_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_IN_PROGRESS_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Invalid grant error code
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.INVALID_GRANT_ERROR")
    @js.native
    def INVALID_GRANT_ERROR: String = js.native
    inline def INVALID_GRANT_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_GRANT_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Msal-browser SKU
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.MSAL_SKU")
    @js.native
    def MSAL_SKU: String = js.native
    inline def MSAL_SKU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSAL_SKU")(x.asInstanceOf[js.Any])
    
    /**
      * Default popup window height
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.POPUP_HEIGHT")
    @js.native
    def POPUP_HEIGHT: Double = js.native
    inline def POPUP_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP_HEIGHT")(x.asInstanceOf[js.Any])
    
    /**
      * Name of the popup window starts with
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.POPUP_NAME_PREFIX")
    @js.native
    def POPUP_NAME_PREFIX: String = js.native
    inline def POPUP_NAME_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP_NAME_PREFIX")(x.asInstanceOf[js.Any])
    
    /**
      * Default popup window width
      */
    @JSImport("@azure/msal-browser", "internals.BrowserConstants.POPUP_WIDTH")
    @js.native
    def POPUP_WIDTH: Double = js.native
    inline def POPUP_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP_WIDTH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-browser", "internals.BrowserPerformanceClient")
  @js.native
  open class BrowserPerformanceClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.BrowserPerformanceClient {
    def this(
      clientId: String,
      authority: String,
      logger: typings.azureMsalCommon.mod.Logger,
      libraryName: String,
      libraryVersion: String,
      applicationTelemetry: ApplicationTelemetry,
      cryptoOptions: CryptoOptions
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.BrowserPerformanceMeasurement")
  @js.native
  open class BrowserPerformanceMeasurement protected ()
    extends typings.azureMsalBrowser.distInternalsMod.BrowserPerformanceMeasurement {
    def this(name: String, correlationId: String) = this()
  }
  /* static members */
  object BrowserPerformanceMeasurement {
    
    @JSImport("@azure/msal-browser", "internals.BrowserPerformanceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Flush browser marks and measurements.
      * @param {string} correlationId
      * @param {SubMeasurement} measurements
      */
    inline def flushMeasurements(correlationId: String, measurements: js.Array[SubMeasurement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushMeasurements")(correlationId.asInstanceOf[js.Any], measurements.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@azure/msal-browser", "internals.BrowserPerformanceMeasurement.makeEndMark")
    @js.native
    def makeEndMark: Any = js.native
    inline def makeEndMark_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeEndMark")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser", "internals.BrowserPerformanceMeasurement.makeMeasureName")
    @js.native
    def makeMeasureName: Any = js.native
    inline def makeMeasureName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeMeasureName")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser", "internals.BrowserPerformanceMeasurement.makeStartMark")
    @js.native
    def makeStartMark: Any = js.native
    inline def makeStartMark_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeStartMark")(x.asInstanceOf[js.Any])
    
    inline def supportsBrowserPerformance(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBrowserPerformance")().asInstanceOf[Boolean]
  }
  
  @JSImport("@azure/msal-browser", "internals.CryptoOps")
  @js.native
  open class CryptoOps protected ()
    extends typings.azureMsalBrowser.distInternalsMod.CryptoOps {
    def this(logger: typings.azureMsalCommon.mod.Logger) = this()
    def this(logger: typings.azureMsalCommon.mod.Logger, performanceClient: IPerformanceClient) = this()
    def this(logger: typings.azureMsalCommon.mod.Logger, performanceClient: Unit, cryptoConfig: CryptoOptions) = this()
    def this(
      logger: typings.azureMsalCommon.mod.Logger,
      performanceClient: IPerformanceClient,
      cryptoConfig: CryptoOptions
    ) = this()
  }
  /* static members */
  object CryptoOps {
    
    @JSImport("@azure/msal-browser", "internals.CryptoOps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-browser", "internals.CryptoOps.EXTRACTABLE")
    @js.native
    def EXTRACTABLE: Any = js.native
    inline def EXTRACTABLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTRACTABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser", "internals.CryptoOps.POP_KEY_USAGES")
    @js.native
    def POP_KEY_USAGES: Any = js.native
    inline def POP_KEY_USAGES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POP_KEY_USAGES")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-browser", "internals.EventHandler")
  @js.native
  open class EventHandler protected ()
    extends typings.azureMsalBrowser.distInternalsMod.EventHandler {
    def this(logger: typings.azureMsalCommon.mod.Logger, browserCrypto: ICrypto) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.NativeAuthError")
  @js.native
  open class NativeAuthError protected ()
    extends typings.azureMsalBrowser.distInternalsMod.NativeAuthError {
    def this(errorCode: String, description: String) = this()
    def this(errorCode: String, description: String, ext: OSError) = this()
  }
  /* static members */
  object NativeAuthError {
    
    @JSImport("@azure/msal-browser", "internals.NativeAuthError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create the appropriate error object based on the WAM status code.
      * @param code
      * @param description
      * @param ext
      * @returns
      */
    inline def createError(code: String, description: String): typings.azureMsalCommon.mod.AuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.mod.AuthError]
    inline def createError(code: String, description: String, ext: OSError): typings.azureMsalCommon.mod.AuthError = (^.asInstanceOf[js.Dynamic].applyDynamic("createError")(code.asInstanceOf[js.Any], description.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.mod.AuthError]
    
    /**
      * Creates a tokens not found error when the internal cache look up fails
      * @returns NativeAuthError: tokensNotFoundInCache
      */
    inline def createTokensNotFoundInCacheError(): typings.azureMsalBrowser.distErrorNativeAuthErrorMod.NativeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createTokensNotFoundInCacheError")().asInstanceOf[typings.azureMsalBrowser.distErrorNativeAuthErrorMod.NativeAuthError]
    
    /**
      * Creates user switch error when the user chooses a different account in the native broker prompt
      * @returns
      */
    inline def createUserSwitchError(): typings.azureMsalBrowser.distErrorNativeAuthErrorMod.NativeAuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserSwitchError")().asInstanceOf[typings.azureMsalBrowser.distErrorNativeAuthErrorMod.NativeAuthError]
  }
  
  @JSImport("@azure/msal-browser", "internals.NativeInteractionClient")
  @js.native
  open class NativeInteractionClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.NativeInteractionClient {
    def this(
      config: BrowserConfiguration,
      browserStorage: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId,
      performanceClient: IPerformanceClient,
      provider: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      accountId: String,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      browserStorage: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId,
      performanceClient: IPerformanceClient,
      provider: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      accountId: String,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.NativeMessageHandler")
  @js.native
  open class NativeMessageHandler protected ()
    extends typings.azureMsalBrowser.distInternalsMod.NativeMessageHandler {
    def this(
      logger: typings.azureMsalCommon.mod.Logger,
      handshakeTimeoutMs: Double,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      logger: typings.azureMsalCommon.mod.Logger,
      handshakeTimeoutMs: Double,
      performanceClient: IPerformanceClient,
      extensionId: String
    ) = this()
  }
  /* static members */
  object NativeMessageHandler {
    
    @JSImport("@azure/msal-browser", "internals.NativeMessageHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an instance of the MessageHandler that has successfully established a connection with an extension
      * @param {Logger} logger
      * @param {number} handshakeTimeoutMs
      * @param {IPerformanceClient} performanceClient
      */
    inline def createProvider(
      logger: typings.azureMsalCommon.mod.Logger,
      handshakeTimeoutMs: Double,
      performanceClient: IPerformanceClient
    ): js.Promise[
        typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProvider")(logger.asInstanceOf[js.Any], handshakeTimeoutMs.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
      ]]
    
    /**
      * Returns boolean indicating whether or not the request should attempt to use native broker
      * @param logger
      * @param config
      * @param nativeExtensionProvider
      * @param authenticationScheme
      */
    inline def isNativeAvailable(config: BrowserConfiguration, logger: typings.azureMsalCommon.mod.Logger): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: typings.azureMsalCommon.mod.Logger,
      nativeExtensionProvider: Unit,
      authenticationScheme: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any], authenticationScheme.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: typings.azureMsalCommon.mod.Logger,
      nativeExtensionProvider: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isNativeAvailable(
      config: BrowserConfiguration,
      logger: typings.azureMsalCommon.mod.Logger,
      nativeExtensionProvider: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      authenticationScheme: typings.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNativeAvailable")(config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], nativeExtensionProvider.asInstanceOf[js.Any], authenticationScheme.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@azure/msal-browser", "internals.PopupClient")
  @js.native
  open class PopupClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.PopupClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.RedirectClient")
  @js.native
  open class RedirectClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.RedirectClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends typings.azureMsalBrowser.distInternalsMod.RedirectHandler {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: typings.azureMsalCommon.mod.Logger,
      browserCrypto: ICrypto,
      performanceClient: IPerformanceClient
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.SilentCacheClient")
  @js.native
  open class SilentCacheClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.SilentCacheClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.SilentIframeClient")
  @js.native
  open class SilentIframeClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.SilentIframeClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: Unit,
      correlationId: String
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      apiId: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.ApiId,
      performanceClient: IPerformanceClient,
      nativeStorageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.SilentRefreshClient")
  @js.native
  open class SilentRefreshClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.SilentRefreshClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@azure/msal-browser", "internals.StandardInteractionClient")
  @js.native
  open class StandardInteractionClient protected ()
    extends typings.azureMsalBrowser.distInternalsMod.StandardInteractionClient {
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler
    ) = this()
    def this(
      config: BrowserConfiguration,
      storageImpl: typings.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager,
      browserCrypto: ICrypto,
      logger: typings.azureMsalCommon.mod.Logger,
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
      logger: typings.azureMsalCommon.mod.Logger,
      eventHandler: typings.azureMsalBrowser.distEventEventHandlerMod.EventHandler,
      navigationClient: INavigationClient,
      performanceClient: IPerformanceClient,
      nativeMessageHandler: typings.azureMsalBrowser.distBrokerNativeBrokerNativeMessageHandlerMod.NativeMessageHandler,
      correlationId: String
    ) = this()
  }
  
  @JSImport("@azure/msal-browser", "internals.TemporaryCacheKeys")
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
    
    /* "request.redirect.context" */ val REDIRECT_CONTEXT: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.REDIRECT_CONTEXT & String = js.native
    
    /* "token.renew.status" */ val RENEW_STATUS: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.RENEW_STATUS & String = js.native
    
    /* "request.params" */ val REQUEST_PARAMS: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.REQUEST_PARAMS & String = js.native
    
    /* "request.state" */ val REQUEST_STATE: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.REQUEST_STATE & String = js.native
    
    /* "scopes" */ val SCOPES: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.SCOPES & String = js.native
    
    /* "session.state" */ val SESSION_STATE: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.SESSION_STATE & String = js.native
    
    /* "urlHash" */ val URL_HASH: typings.azureMsalBrowser.distUtilsBrowserConstantsMod.TemporaryCacheKeys.URL_HASH & String = js.native
  }
}
