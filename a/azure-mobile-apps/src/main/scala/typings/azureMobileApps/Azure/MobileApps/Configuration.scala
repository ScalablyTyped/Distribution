package typings.azureMobileApps.Azure.MobileApps

import typings.azureMobileApps.Azure.MobileApps.Configuration.Cors
import typings.azureMobileApps.Azure.MobileApps.Configuration.Logging
import typings.azureMobileApps.Azure.MobileApps.Configuration.Notifications
import typings.azureMobileApps.anon.Encrypt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// configuration
trait Configuration extends StObject {
  
  var apiRootPath: js.UndefOr[String] = js.undefined
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var auth: js.UndefOr[typings.azureMobileApps.Azure.MobileApps.Configuration.Auth] = js.undefined
  
  var authStubRoute: js.UndefOr[String] = js.undefined
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var configFile: js.UndefOr[String] = js.undefined
  
  var cors: js.UndefOr[Cors] = js.undefined
  
  var data: js.UndefOr[typings.azureMobileApps.Azure.MobileApps.Configuration.Data] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var homePage: js.UndefOr[Boolean] = js.undefined
  
  var logging: js.UndefOr[Logging] = js.undefined
  
  var maxTop: js.UndefOr[Double] = js.undefined
  
  var notificationRootPath: js.UndefOr[String] = js.undefined
  
  var notifications: js.UndefOr[Notifications] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var promiseConstructor: js.UndefOr[
    js.Function2[
      /* resolve */ js.Function1[/* result */ js.Any, Unit], 
      /* reject */ js.Function1[/* error */ js.Any, Unit], 
      Thenable[js.Any]
    ]
  ] = js.undefined
  
  var swagger: js.UndefOr[Boolean] = js.undefined
  
  var swaggerPath: js.UndefOr[String] = js.undefined
  
  var tableRootPath: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var webhook: js.UndefOr[Webhook] = js.undefined
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  trait Auth extends StObject {
    
    var secret: String
    
    var validateTokens: js.UndefOr[Boolean] = js.undefined
  }
  object Auth {
    
    @scala.inline
    def apply(secret: String): typings.azureMobileApps.Azure.MobileApps.Configuration.Auth = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMobileApps.Azure.MobileApps.Configuration.Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: typings.azureMobileApps.Azure.MobileApps.Configuration.Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTokens(value: Boolean): Self = StObject.set(x, "validateTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTokensUndefined: Self = StObject.set(x, "validateTokens", js.undefined)
    }
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiRootPath(value: String): Self = StObject.set(x, "apiRootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRootPathUndefined: Self = StObject.set(x, "apiRootPath", js.undefined)
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setAuth(value: typings.azureMobileApps.Azure.MobileApps.Configuration.Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthStubRoute(value: String): Self = StObject.set(x, "authStubRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthStubRouteUndefined: Self = StObject.set(x, "authStubRoute", js.undefined)
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    @scala.inline
    def setCors(value: Cors): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setData(value: typings.azureMobileApps.Azure.MobileApps.Configuration.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setHomePage(value: Boolean): Self = StObject.set(x, "homePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageUndefined: Self = StObject.set(x, "homePage", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMaxTop(value: Double): Self = StObject.set(x, "maxTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTopUndefined: Self = StObject.set(x, "maxTop", js.undefined)
    
    @scala.inline
    def setNotificationRootPath(value: String): Self = StObject.set(x, "notificationRootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationRootPathUndefined: Self = StObject.set(x, "notificationRootPath", js.undefined)
    
    @scala.inline
    def setNotifications(value: Notifications): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPromiseConstructor(
      value: (/* resolve */ js.Function1[/* result */ js.Any, Unit], /* reject */ js.Function1[/* error */ js.Any, Unit]) => Thenable[js.Any]
    ): Self = StObject.set(x, "promiseConstructor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPromiseConstructorUndefined: Self = StObject.set(x, "promiseConstructor", js.undefined)
    
    @scala.inline
    def setSwagger(value: Boolean): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwaggerPath(value: String): Self = StObject.set(x, "swaggerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwaggerPathUndefined: Self = StObject.set(x, "swaggerPath", js.undefined)
    
    @scala.inline
    def setSwaggerUndefined: Self = StObject.set(x, "swagger", js.undefined)
    
    @scala.inline
    def setTableRootPath(value: String): Self = StObject.set(x, "tableRootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRootPathUndefined: Self = StObject.set(x, "tableRootPath", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
  
  trait Cors extends StObject {
    
    var exposeHeaders: String
    
    var hostnames: js.Array[String]
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object Cors {
    
    @scala.inline
    def apply(exposeHeaders: String, hostnames: js.Array[String]): Cors = {
      val __obj = js.Dynamic.literal(exposeHeaders = exposeHeaders.asInstanceOf[js.Any], hostnames = hostnames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cors]
    }
    
    @scala.inline
    implicit class CorsMutableBuilder[Self <: Cors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExposeHeaders(value: String): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnames(value: js.Array[String]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnamesVarargs(value: String*): Self = StObject.set(x, "hostnames", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  // it would be nice to have the config for various providers in separate interfaces,
  // but this is the simplest solution to support variations of the current setup
  trait Data extends StObject {
    
    var connectionTimeout: js.UndefOr[String] = js.undefined
    
    var database: js.UndefOr[String] = js.undefined
    
    var dynamicSchema: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Encrypt] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var provider: String
    
    var schema: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(provider: String): typings.azureMobileApps.Azure.MobileApps.Configuration.Data = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMobileApps.Azure.MobileApps.Configuration.Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: typings.azureMobileApps.Azure.MobileApps.Configuration.Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: String): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setDynamicSchema(value: Boolean): Self = StObject.set(x, "dynamicSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicSchemaUndefined: Self = StObject.set(x, "dynamicSchema", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setOptions(value: Encrypt): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Logging extends StObject {
    
    var level: js.UndefOr[String] = js.undefined
    
    var transports: js.UndefOr[js.Array[LoggingTransport]] = js.undefined
  }
  object Logging {
    
    @scala.inline
    def apply(): Logging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logging]
    }
    
    @scala.inline
    implicit class LoggingMutableBuilder[Self <: Logging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setTransports(value: js.Array[LoggingTransport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      @scala.inline
      def setTransportsVarargs(value: LoggingTransport*): Self = StObject.set(x, "transports", js.Array(value :_*))
    }
  }
  
  trait LoggingTransport extends StObject
  
  trait Notifications extends StObject {
    
    var connectionString: js.UndefOr[String] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var hubName: String
    
    var sharedAccessKeyName: js.UndefOr[String] = js.undefined
    
    var sharedAccessKeyValue: js.UndefOr[String] = js.undefined
  }
  object Notifications {
    
    @scala.inline
    def apply(hubName: String): Notifications = {
      val __obj = js.Dynamic.literal(hubName = hubName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notifications]
    }
    
    @scala.inline
    implicit class NotificationsMutableBuilder[Self <: Notifications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setHubName(value: String): Self = StObject.set(x, "hubName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedAccessKeyName(value: String): Self = StObject.set(x, "sharedAccessKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedAccessKeyNameUndefined: Self = StObject.set(x, "sharedAccessKeyName", js.undefined)
      
      @scala.inline
      def setSharedAccessKeyValue(value: String): Self = StObject.set(x, "sharedAccessKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedAccessKeyValueUndefined: Self = StObject.set(x, "sharedAccessKeyValue", js.undefined)
    }
  }
}
