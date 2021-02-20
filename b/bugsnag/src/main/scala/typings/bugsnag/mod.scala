package typings.bugsnag

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.bugsnag.bugsnagStrings.error
import typings.bugsnag.bugsnagStrings.info
import typings.bugsnag.bugsnagStrings.warning
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bugsnag", JSImport.Namespace)
  @js.native
  val ^ : Bugsnag = js.native
  
  @js.native
  trait Bugsnag extends StObject {
    
    def autoNotify(cb: js.Function0[Unit]): js.Any = js.native
    def autoNotify(options: NotifyOptions, cb: js.Function0[Unit]): js.Any = js.native
    
    def configure(options: ConfigurationOptions): Unit = js.native
    
    def createErrorHandler(apiKey: String): ErrorHandler = js.native
    def createErrorHandler(apiKey: String, options: ConfigurationOptions): ErrorHandler = js.native
    
    def createRequestHandler(apiKey: String): RequestHandler = js.native
    def createRequestHandler(apiKey: String, options: ConfigurationOptions): RequestHandler = js.native
    
    def errorHandler(err: js.Any, req: js.Any, res: js.Any, next: NextFunction): Unit = js.native
    def errorHandler(err: Error, req: js.Any, res: js.Any, next: NextFunction): Unit = js.native
    @JSName("errorHandler")
    var errorHandler_Original: ErrorHandler = js.native
    
    def intercept[T](): js.Function2[/* error */ js.Any, /* repeated */ js.Any, T with Unit] = js.native
    def intercept[T](cb: js.Function1[/* repeated */ js.Any, T]): js.Function2[/* error */ js.Any, /* repeated */ js.Any, T with Unit] = js.native
    
    def koaHandler(err: Error, ctx: js.Any): Unit = js.native
    
    var metaData: StringDictionary[js.Any] = js.native
    
    def notify(error: String): Unit = js.native
    def notify(error: String, cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
    def notify(error: String, options: NotifyOptions): Unit = js.native
    def notify(
      error: String,
      options: NotifyOptions,
      cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
    ): Unit = js.native
    def notify(error: Error): Unit = js.native
    def notify(error: Error, cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]): Unit = js.native
    def notify(error: Error, options: NotifyOptions): Unit = js.native
    def notify(
      error: Error,
      options: NotifyOptions,
      cb: js.Function2[/* error */ Error, /* response */ js.Any, Unit]
    ): Unit = js.native
    
    def onBeforeNotify(cb: js.Function1[/* notification */ js.Any, Boolean | Unit]): Unit = js.native
    def onBeforeNotify(cb: js.Function1[/* notification */ js.Any, Boolean | Unit], error: Error): Unit = js.native
    
    def register(apiKey: String): Bugsnag = js.native
    def register(apiKey: String, options: ConfigurationOptions): Bugsnag = js.native
    
    var requestData: StringDictionary[js.Any] = js.native
    
    def requestHandler(req: js.Any, res: js.Any, next: NextFunction): js.Any = js.native
    @JSName("requestHandler")
    var requestHandler_Original: RequestHandler = js.native
    
    def restifyHandler(req: js.Any, res: js.Any, route: js.Any, err: Error): Unit = js.native
    
    def shouldNotify(): Boolean = js.native
  }
  
  @js.native
  trait ConfigurationOptions extends StObject {
    
    var appType: js.UndefOr[String] = js.native
    
    var appVersion: js.UndefOr[String] = js.native
    
    var autoCaptureSessions: js.UndefOr[Boolean] = js.native
    
    var autoNotify: js.UndefOr[Boolean] = js.native
    
    var autoNotifyUnhandledRejection: js.UndefOr[Boolean] = js.native
    
    var endpoints: js.UndefOr[Endpoints] = js.native
    
    var filters: js.UndefOr[js.Array[String]] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var logLevel: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
    
    var metaData: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var notifyHost: js.UndefOr[String] = js.native
    
    var notifyPath: js.UndefOr[String] = js.native
    
    var notifyPort: js.UndefOr[Double] = js.native
    
    var notifyReleaseStages: js.UndefOr[js.Array[String]] = js.native
    
    var onUncaughtError: js.UndefOr[js.Function1[/* error */ String | Error, Unit]] = js.native
    
    var packageJSON: js.UndefOr[String] = js.native
    
    var projectRoot: js.UndefOr[String] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var releaseStage: js.UndefOr[String] = js.native
    
    var sendCode: js.UndefOr[Boolean] = js.native
    
    var sessionEndpoint: js.UndefOr[String] = js.native
    
    var useSSL: js.UndefOr[Boolean] = js.native
  }
  object ConfigurationOptions {
    
    @scala.inline
    def apply(): ConfigurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    @scala.inline
    implicit class ConfigurationOptionsMutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppType(value: String): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      @scala.inline
      def setAutoCaptureSessions(value: Boolean): Self = StObject.set(x, "autoCaptureSessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCaptureSessionsUndefined: Self = StObject.set(x, "autoCaptureSessions", js.undefined)
      
      @scala.inline
      def setAutoNotify(value: Boolean): Self = StObject.set(x, "autoNotify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoNotifyUndefined: Self = StObject.set(x, "autoNotify", js.undefined)
      
      @scala.inline
      def setAutoNotifyUnhandledRejection(value: Boolean): Self = StObject.set(x, "autoNotifyUnhandledRejection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoNotifyUnhandledRejectionUndefined: Self = StObject.set(x, "autoNotifyUnhandledRejection", js.undefined)
      
      @scala.inline
      def setEndpoints(value: Endpoints): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setMetaData(value: StringDictionary[js.Any]): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
      
      @scala.inline
      def setNotifyHost(value: String): Self = StObject.set(x, "notifyHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyHostUndefined: Self = StObject.set(x, "notifyHost", js.undefined)
      
      @scala.inline
      def setNotifyPath(value: String): Self = StObject.set(x, "notifyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyPathUndefined: Self = StObject.set(x, "notifyPath", js.undefined)
      
      @scala.inline
      def setNotifyPort(value: Double): Self = StObject.set(x, "notifyPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyPortUndefined: Self = StObject.set(x, "notifyPort", js.undefined)
      
      @scala.inline
      def setNotifyReleaseStages(value: js.Array[String]): Self = StObject.set(x, "notifyReleaseStages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyReleaseStagesUndefined: Self = StObject.set(x, "notifyReleaseStages", js.undefined)
      
      @scala.inline
      def setNotifyReleaseStagesVarargs(value: String*): Self = StObject.set(x, "notifyReleaseStages", js.Array(value :_*))
      
      @scala.inline
      def setOnUncaughtError(value: /* error */ String | Error => Unit): Self = StObject.set(x, "onUncaughtError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUncaughtErrorUndefined: Self = StObject.set(x, "onUncaughtError", js.undefined)
      
      @scala.inline
      def setPackageJSON(value: String): Self = StObject.set(x, "packageJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageJSONUndefined: Self = StObject.set(x, "packageJSON", js.undefined)
      
      @scala.inline
      def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setReleaseStage(value: String): Self = StObject.set(x, "releaseStage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseStageUndefined: Self = StObject.set(x, "releaseStage", js.undefined)
      
      @scala.inline
      def setSendCode(value: Boolean): Self = StObject.set(x, "sendCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendCodeUndefined: Self = StObject.set(x, "sendCode", js.undefined)
      
      @scala.inline
      def setSessionEndpoint(value: String): Self = StObject.set(x, "sessionEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionEndpointUndefined: Self = StObject.set(x, "sessionEndpoint", js.undefined)
      
      @scala.inline
      def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSSLUndefined: Self = StObject.set(x, "useSSL", js.undefined)
    }
  }
  
  @js.native
  trait Endpoints extends StObject {
    
    @JSName("notify")
    var notify_FEndpoints: String = js.native
    
    var sessions: js.UndefOr[String] = js.native
  }
  object Endpoints {
    
    @scala.inline
    def apply(notify_ : String): Endpoints = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoints]
    }
    
    @scala.inline
    implicit class EndpointsMutableBuilder[Self <: Endpoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotify_(value: String): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessions(value: String): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    }
  }
  
  type ErrorHandler = js.Function4[
    /* err */ Error | js.Any, 
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ NextFunction, 
    Unit
  ]
  
  @js.native
  trait Logger extends StObject {
    
    def debug(): Unit = js.native
    
    def error(): Unit = js.native
    
    def info(): Unit = js.native
    
    def warn(): Unit = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(debug: () => Unit, error: () => Unit, info: () => Unit, warn: () => Unit): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), info = js.Any.fromFunction0(info), warn = js.Any.fromFunction0(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: () => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: () => Unit): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInfo(value: () => Unit): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWarn(value: () => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction0(value))
    }
  }
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait NotifyOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[String] = js.native
    
    var errorName: js.UndefOr[String] = js.native
    
    var groupingHash: js.UndefOr[String] = js.native
    
    var req: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var severity: js.UndefOr[error | warning | info] = js.native
    
    var user: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var userId: js.UndefOr[String | Double] = js.native
  }
  object NotifyOptions {
    
    @scala.inline
    def apply(): NotifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyOptions]
    }
    
    @scala.inline
    implicit class NotifyOptionsMutableBuilder[Self <: NotifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setErrorName(value: String): Self = StObject.set(x, "errorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNameUndefined: Self = StObject.set(x, "errorName", js.undefined)
      
      @scala.inline
      def setGroupingHash(value: String): Self = StObject.set(x, "groupingHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingHashUndefined: Self = StObject.set(x, "groupingHash", js.undefined)
      
      @scala.inline
      def setReq(value: StringDictionary[js.Any]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      @scala.inline
      def setSeverity(value: error | warning | info): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setUser(value: StringDictionary[js.Any]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type RequestHandler = js.Function3[/* req */ js.Any, /* res */ js.Any, /* next */ NextFunction, js.Any]
  
  type _To = Bugsnag
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bugsnag = ^
}
