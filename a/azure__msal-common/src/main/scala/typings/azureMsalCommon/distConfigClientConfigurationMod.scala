package typings.azureMsalCommon

import typings.azureMsalCommon.anon.RequiredAuthOptions
import typings.azureMsalCommon.anon.RequiredICrypto
import typings.azureMsalCommon.anon.RequiredLoggerOptions
import typings.azureMsalCommon.anon.RequiredSystemOptions
import typings.azureMsalCommon.anon.RequiredTelemetryOptions
import typings.azureMsalCommon.distAccountClientCredentialsMod.ClientCredentials
import typings.azureMsalCommon.distAuthorityAuthorityMod.Authority
import typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance
import typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager
import typings.azureMsalCommon.distCacheInterfaceIcachepluginMod.ICachePlugin
import typings.azureMsalCommon.distCacheInterfaceIserializabletokencacheMod.ISerializableTokenCache
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distLoggerLoggerMod.ILoggerCallback
import typings.azureMsalCommon.distLoggerLoggerMod.LogLevel
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distTelemetryServerServerTelemetryManagerMod.ServerTelemetryManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigClientConfigurationMod {
  
  @JSImport("@azure/msal-common/dist/config/ClientConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/config/ClientConfiguration.SystemOptions> */
  object DEFAULT_SYSTEM_OPTIONS {
    
    @JSImport("@azure/msal-common/dist/config/ClientConfiguration", "DEFAULT_SYSTEM_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-common/dist/config/ClientConfiguration", "DEFAULT_SYSTEM_OPTIONS.preventCorsPreflight")
    @js.native
    def preventCorsPreflight: Boolean = js.native
    inline def preventCorsPreflight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventCorsPreflight")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/config/ClientConfiguration", "DEFAULT_SYSTEM_OPTIONS.proxyUrl")
    @js.native
    def proxyUrl: String = js.native
    inline def proxyUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-common/dist/config/ClientConfiguration", "DEFAULT_SYSTEM_OPTIONS.tokenRenewalOffsetSeconds")
    @js.native
    def tokenRenewalOffsetSeconds: Double = js.native
    inline def tokenRenewalOffsetSeconds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRenewalOffsetSeconds")(x.asInstanceOf[js.Any])
  }
  
  inline def buildClientConfiguration(param0: ClientConfiguration): CommonClientConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClientConfiguration")(param0.asInstanceOf[js.Any]).asInstanceOf[CommonClientConfiguration]
  
  trait ApplicationTelemetry extends StObject {
    
    var appName: String
    
    var appVersion: String
  }
  object ApplicationTelemetry {
    
    inline def apply(appName: String, appVersion: String): ApplicationTelemetry = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationTelemetry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationTelemetry] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthOptions extends StObject {
    
    var authority: Authority
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var clientCapabilities: js.UndefOr[js.Array[String]] = js.undefined
    
    var clientId: String
    
    var skipAuthorityMetadataCache: js.UndefOr[Boolean] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(authority: Authority, clientId: String): AuthOptions = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthority(value: Authority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClientCapabilities(value: js.Array[String]): Self = StObject.set(x, "clientCapabilities", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilitiesUndefined: Self = StObject.set(x, "clientCapabilities", js.undefined)
      
      inline def setClientCapabilitiesVarargs(value: String*): Self = StObject.set(x, "clientCapabilities", js.Array(value*))
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCacheUndefined: Self = StObject.set(x, "skipAuthorityMetadataCache", js.undefined)
    }
  }
  
  trait AzureCloudOptions extends StObject {
    
    var azureCloudInstance: AzureCloudInstance
    
    var tenant: js.UndefOr[String] = js.undefined
  }
  object AzureCloudOptions {
    
    inline def apply(azureCloudInstance: AzureCloudInstance): AzureCloudOptions = {
      val __obj = js.Dynamic.literal(azureCloudInstance = azureCloudInstance.asInstanceOf[js.Any])
      __obj.asInstanceOf[AzureCloudOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AzureCloudOptions] (val x: Self) extends AnyVal {
      
      inline def setAzureCloudInstance(value: AzureCloudInstance): Self = StObject.set(x, "azureCloudInstance", value.asInstanceOf[js.Any])
      
      inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    }
  }
  
  trait ClientConfiguration extends StObject {
    
    var authOptions: AuthOptions
    
    var clientCredentials: js.UndefOr[ClientCredentials] = js.undefined
    
    var cryptoInterface: js.UndefOr[ICrypto] = js.undefined
    
    var libraryInfo: js.UndefOr[LibraryInfo] = js.undefined
    
    var loggerOptions: js.UndefOr[LoggerOptions] = js.undefined
    
    var networkInterface: js.UndefOr[INetworkModule] = js.undefined
    
    var persistencePlugin: js.UndefOr[ICachePlugin | Null] = js.undefined
    
    var serializableCache: js.UndefOr[ISerializableTokenCache | Null] = js.undefined
    
    var serverTelemetryManager: js.UndefOr[ServerTelemetryManager | Null] = js.undefined
    
    var storageInterface: js.UndefOr[CacheManager] = js.undefined
    
    var systemOptions: js.UndefOr[SystemOptions] = js.undefined
    
    var telemetry: js.UndefOr[TelemetryOptions] = js.undefined
  }
  object ClientConfiguration {
    
    inline def apply(authOptions: AuthOptions): ClientConfiguration = {
      val __obj = js.Dynamic.literal(authOptions = authOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAuthOptions(value: AuthOptions): Self = StObject.set(x, "authOptions", value.asInstanceOf[js.Any])
      
      inline def setClientCredentials(value: ClientCredentials): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
      
      inline def setClientCredentialsUndefined: Self = StObject.set(x, "clientCredentials", js.undefined)
      
      inline def setCryptoInterface(value: ICrypto): Self = StObject.set(x, "cryptoInterface", value.asInstanceOf[js.Any])
      
      inline def setCryptoInterfaceUndefined: Self = StObject.set(x, "cryptoInterface", js.undefined)
      
      inline def setLibraryInfo(value: LibraryInfo): Self = StObject.set(x, "libraryInfo", value.asInstanceOf[js.Any])
      
      inline def setLibraryInfoUndefined: Self = StObject.set(x, "libraryInfo", js.undefined)
      
      inline def setLoggerOptions(value: LoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
      
      inline def setLoggerOptionsUndefined: Self = StObject.set(x, "loggerOptions", js.undefined)
      
      inline def setNetworkInterface(value: INetworkModule): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
      
      inline def setPersistencePlugin(value: ICachePlugin): Self = StObject.set(x, "persistencePlugin", value.asInstanceOf[js.Any])
      
      inline def setPersistencePluginNull: Self = StObject.set(x, "persistencePlugin", null)
      
      inline def setPersistencePluginUndefined: Self = StObject.set(x, "persistencePlugin", js.undefined)
      
      inline def setSerializableCache(value: ISerializableTokenCache): Self = StObject.set(x, "serializableCache", value.asInstanceOf[js.Any])
      
      inline def setSerializableCacheNull: Self = StObject.set(x, "serializableCache", null)
      
      inline def setSerializableCacheUndefined: Self = StObject.set(x, "serializableCache", js.undefined)
      
      inline def setServerTelemetryManager(value: ServerTelemetryManager): Self = StObject.set(x, "serverTelemetryManager", value.asInstanceOf[js.Any])
      
      inline def setServerTelemetryManagerNull: Self = StObject.set(x, "serverTelemetryManager", null)
      
      inline def setServerTelemetryManagerUndefined: Self = StObject.set(x, "serverTelemetryManager", js.undefined)
      
      inline def setStorageInterface(value: CacheManager): Self = StObject.set(x, "storageInterface", value.asInstanceOf[js.Any])
      
      inline def setStorageInterfaceUndefined: Self = StObject.set(x, "storageInterface", js.undefined)
      
      inline def setSystemOptions(value: SystemOptions): Self = StObject.set(x, "systemOptions", value.asInstanceOf[js.Any])
      
      inline def setSystemOptionsUndefined: Self = StObject.set(x, "systemOptions", js.undefined)
      
      inline def setTelemetry(value: TelemetryOptions): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    }
  }
  
  trait CommonClientConfiguration extends StObject {
    
    var authOptions: RequiredAuthOptions
    
    var clientCredentials: ClientCredentials
    
    var cryptoInterface: RequiredICrypto
    
    var libraryInfo: LibraryInfo
    
    var loggerOptions: RequiredLoggerOptions
    
    var networkInterface: INetworkModule
    
    var persistencePlugin: ICachePlugin | Null
    
    var serializableCache: ISerializableTokenCache | Null
    
    var serverTelemetryManager: ServerTelemetryManager | Null
    
    var storageInterface: CacheManager
    
    var systemOptions: RequiredSystemOptions
    
    var telemetry: RequiredTelemetryOptions
  }
  object CommonClientConfiguration {
    
    inline def apply(
      authOptions: RequiredAuthOptions,
      clientCredentials: ClientCredentials,
      cryptoInterface: RequiredICrypto,
      libraryInfo: LibraryInfo,
      loggerOptions: RequiredLoggerOptions,
      networkInterface: INetworkModule,
      storageInterface: CacheManager,
      systemOptions: RequiredSystemOptions,
      telemetry: RequiredTelemetryOptions
    ): CommonClientConfiguration = {
      val __obj = js.Dynamic.literal(authOptions = authOptions.asInstanceOf[js.Any], clientCredentials = clientCredentials.asInstanceOf[js.Any], cryptoInterface = cryptoInterface.asInstanceOf[js.Any], libraryInfo = libraryInfo.asInstanceOf[js.Any], loggerOptions = loggerOptions.asInstanceOf[js.Any], networkInterface = networkInterface.asInstanceOf[js.Any], storageInterface = storageInterface.asInstanceOf[js.Any], systemOptions = systemOptions.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], persistencePlugin = null, serializableCache = null, serverTelemetryManager = null)
      __obj.asInstanceOf[CommonClientConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonClientConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAuthOptions(value: RequiredAuthOptions): Self = StObject.set(x, "authOptions", value.asInstanceOf[js.Any])
      
      inline def setClientCredentials(value: ClientCredentials): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
      
      inline def setCryptoInterface(value: RequiredICrypto): Self = StObject.set(x, "cryptoInterface", value.asInstanceOf[js.Any])
      
      inline def setLibraryInfo(value: LibraryInfo): Self = StObject.set(x, "libraryInfo", value.asInstanceOf[js.Any])
      
      inline def setLoggerOptions(value: RequiredLoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterface(value: INetworkModule): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      inline def setPersistencePlugin(value: ICachePlugin): Self = StObject.set(x, "persistencePlugin", value.asInstanceOf[js.Any])
      
      inline def setPersistencePluginNull: Self = StObject.set(x, "persistencePlugin", null)
      
      inline def setSerializableCache(value: ISerializableTokenCache): Self = StObject.set(x, "serializableCache", value.asInstanceOf[js.Any])
      
      inline def setSerializableCacheNull: Self = StObject.set(x, "serializableCache", null)
      
      inline def setServerTelemetryManager(value: ServerTelemetryManager): Self = StObject.set(x, "serverTelemetryManager", value.asInstanceOf[js.Any])
      
      inline def setServerTelemetryManagerNull: Self = StObject.set(x, "serverTelemetryManager", null)
      
      inline def setStorageInterface(value: CacheManager): Self = StObject.set(x, "storageInterface", value.asInstanceOf[js.Any])
      
      inline def setSystemOptions(value: RequiredSystemOptions): Self = StObject.set(x, "systemOptions", value.asInstanceOf[js.Any])
      
      inline def setTelemetry(value: RequiredTelemetryOptions): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    }
  }
  
  trait LibraryInfo extends StObject {
    
    var cpu: String
    
    var os: String
    
    var sku: String
    
    var version: String
  }
  object LibraryInfo {
    
    inline def apply(cpu: String, os: String, sku: String, version: String): LibraryInfo = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibraryInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibraryInfo] (val x: Self) extends AnyVal {
      
      inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoggerOptions extends StObject {
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var loggerCallback: js.UndefOr[ILoggerCallback] = js.undefined
    
    var piiLoggingEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLoggerCallback(value: (/* level */ LogLevel, /* message */ String, /* containsPii */ Boolean) => Unit): Self = StObject.set(x, "loggerCallback", js.Any.fromFunction3(value))
      
      inline def setLoggerCallbackUndefined: Self = StObject.set(x, "loggerCallback", js.undefined)
      
      inline def setPiiLoggingEnabled(value: Boolean): Self = StObject.set(x, "piiLoggingEnabled", value.asInstanceOf[js.Any])
      
      inline def setPiiLoggingEnabledUndefined: Self = StObject.set(x, "piiLoggingEnabled", js.undefined)
    }
  }
  
  trait SystemOptions extends StObject {
    
    var preventCorsPreflight: js.UndefOr[Boolean] = js.undefined
    
    var proxyUrl: js.UndefOr[String] = js.undefined
    
    var tokenRenewalOffsetSeconds: js.UndefOr[Double] = js.undefined
  }
  object SystemOptions {
    
    inline def apply(): SystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SystemOptions] (val x: Self) extends AnyVal {
      
      inline def setPreventCorsPreflight(value: Boolean): Self = StObject.set(x, "preventCorsPreflight", value.asInstanceOf[js.Any])
      
      inline def setPreventCorsPreflightUndefined: Self = StObject.set(x, "preventCorsPreflight", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
      
      inline def setTokenRenewalOffsetSeconds(value: Double): Self = StObject.set(x, "tokenRenewalOffsetSeconds", value.asInstanceOf[js.Any])
      
      inline def setTokenRenewalOffsetSecondsUndefined: Self = StObject.set(x, "tokenRenewalOffsetSeconds", js.undefined)
    }
  }
  
  trait TelemetryOptions extends StObject {
    
    var application: ApplicationTelemetry
  }
  object TelemetryOptions {
    
    inline def apply(application: ApplicationTelemetry): TelemetryOptions = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TelemetryOptions] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: ApplicationTelemetry): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    }
  }
}
