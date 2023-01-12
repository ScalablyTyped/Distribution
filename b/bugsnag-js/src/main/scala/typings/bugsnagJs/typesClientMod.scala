package typings.bugsnagJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.bugsnagJs.anon.Name
import typings.bugsnagJs.anon.TypeofReport
import typings.bugsnagJs.bugsnagJsStrings.error
import typings.bugsnagJs.bugsnagJsStrings.info
import typings.bugsnagJs.bugsnagJsStrings.warning
import typings.bugsnagJs.typesCommonMod.BeforeSend
import typings.bugsnagJs.typesCommonMod.BeforeSession
import typings.bugsnagJs.typesCommonMod.IConfig
import typings.bugsnagJs.typesCommonMod.IFinalConfig
import typings.bugsnagJs.typesReportMod.IHandledState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  @JSImport("bugsnag-js/types/client", JSImport.Default)
  @js.native
  open class default () extends Client
  
  @JSImport("bugsnag-js/types/client", "Client")
  @js.native
  open class Client () extends StObject {
    
    var BugsnagBreadcrumb: Instantiable4[
        /* name */ String, 
        /* metaData */ js.UndefOr[js.Object], 
        /* type */ js.UndefOr[String], 
        /* timestamp */ js.UndefOr[String], 
        typings.bugsnagJs.typesBreadcrumbMod.default
      ] = js.native
    
    var BugsnagReport: (Instantiable4[
        /* errorClass */ String, 
        /* errorMessage */ String, 
        /* stacktrace */ js.UndefOr[js.Array[Any]], 
        /* handledState */ js.UndefOr[IHandledState], 
        typings.bugsnagJs.typesReportMod.default
      ]) & TypeofReport = js.native
    
    var BugsnagSession: Instantiable0[typings.bugsnagJs.typesSessionMod.default] = js.native
    
    var app: js.Object = js.native
    
    var beforeSession: js.Array[BeforeSession] = js.native
    
    var config: IFinalConfig = js.native
    
    def configure(opts: IConfig): Client = js.native
    
    var context: String | Unit = js.native
    
    var device: js.Object = js.native
    
    def leaveBreadcrumb(name: String): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Any): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Any, `type`: String): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Any, `type`: String, timestamp: String): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Any, `type`: Unit, timestamp: String): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Unit, `type`: String): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Unit, `type`: String, timestamp: String): Client = js.native
    def leaveBreadcrumb(name: String, metaData: Unit, `type`: Unit, timestamp: String): Client = js.native
    
    def logger(logger: ILogger): Client = js.native
    
    var metaData: js.Object = js.native
    
    def notify(error: NotifiableError): Boolean = js.native
    def notify(error: NotifiableError, opts: INotifyOpts): Boolean = js.native
    
    def sessionDelegate(sessionDelegate: ISessionDelegate): Client = js.native
    
    def startSession(): Client = js.native
    
    def transport(transport: ITransport): Client = js.native
    
    def use(plugin: IPlugin): Any = js.native
    
    var user: js.Object = js.native
  }
  
  trait IConfigSchemaEntry extends StObject {
    
    def defaultValue(): Any
    
    var message: String
    
    def validate(`val`: Any): Boolean
  }
  object IConfigSchemaEntry {
    
    inline def apply(defaultValue: () => Any, message: String, validate: Any => Boolean): IConfigSchemaEntry = {
      val __obj = js.Dynamic.literal(defaultValue = js.Any.fromFunction0(defaultValue), message = message.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[IConfigSchemaEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfigSchemaEntry] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: () => Any): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Any => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  trait ILogger extends StObject {
    
    def debug(args: Any*): Unit
    
    def error(args: Any*): Unit
    
    def info(args: Any*): Unit
    
    def warn(args: Any*): Unit
  }
  object ILogger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): ILogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[ILogger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait INotifyOpts extends StObject {
    
    var beforeSend: js.UndefOr[BeforeSend] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var device: js.UndefOr[js.Object] = js.undefined
    
    var metaData: js.UndefOr[js.Object] = js.undefined
    
    var request: js.UndefOr[js.Object] = js.undefined
    
    var severity: js.UndefOr[info | warning | error] = js.undefined
    
    var user: js.UndefOr[js.Object] = js.undefined
  }
  object INotifyOpts {
    
    inline def apply(): INotifyOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INotifyOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INotifyOpts] (val x: Self) extends AnyVal {
      
      inline def setBeforeSend(value: /* report */ typings.bugsnagJs.typesReportMod.default => Boolean | Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
      
      inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDevice(value: js.Object): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setMetaData(value: js.Object): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
      
      inline def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
      
      inline def setRequest(value: js.Object): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSeverity(value: info | warning | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait IPlugin extends StObject {
    
    var configSchema: js.UndefOr[StringDictionary[IConfigSchemaEntry]] = js.undefined
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def init(client: Client): Any
  }
  object IPlugin {
    
    inline def apply(init: Client => Any): IPlugin = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[IPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlugin] (val x: Self) extends AnyVal {
      
      inline def setConfigSchema(value: StringDictionary[IConfigSchemaEntry]): Self = StObject.set(x, "configSchema", value.asInstanceOf[js.Any])
      
      inline def setConfigSchemaUndefined: Self = StObject.set(x, "configSchema", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setInit(value: Client => Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  trait IReportPayload extends StObject {
    
    var apiKey: String
    
    var events: js.Array[typings.bugsnagJs.typesReportMod.default]
    
    var notifier: Name
  }
  object IReportPayload {
    
    inline def apply(apiKey: String, events: js.Array[typings.bugsnagJs.typesReportMod.default], notifier: Name): IReportPayload = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReportPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IReportPayload] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Array[typings.bugsnagJs.typesReportMod.default]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: typings.bugsnagJs.typesReportMod.default*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setNotifier(value: Name): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISession extends StObject {
    
    var id: String
    
    var startedAt: String
    
    var user: js.UndefOr[js.Object] = js.undefined
  }
  object ISession {
    
    inline def apply(id: String, startedAt: String): ISession = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISession] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
      
      inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait ISessionDelegate extends StObject {
    
    def startSession(client: Client): Client
  }
  object ISessionDelegate {
    
    inline def apply(startSession: Client => Client): ISessionDelegate = {
      val __obj = js.Dynamic.literal(startSession = js.Any.fromFunction1(startSession))
      __obj.asInstanceOf[ISessionDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISessionDelegate] (val x: Self) extends AnyVal {
      
      inline def setStartSession(value: Client => Client): Self = StObject.set(x, "startSession", js.Any.fromFunction1(value))
    }
  }
  
  trait ISessionPayload extends StObject {
    
    var app: js.UndefOr[js.Object] = js.undefined
    
    var device: js.UndefOr[js.Object] = js.undefined
    
    var notifier: Name
    
    var sessions: js.Array[ISession]
    
    var user: js.UndefOr[js.Object] = js.undefined
  }
  object ISessionPayload {
    
    inline def apply(notifier: Name, sessions: js.Array[ISession]): ISessionPayload = {
      val __obj = js.Dynamic.literal(notifier = notifier.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISessionPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISessionPayload] (val x: Self) extends AnyVal {
      
      inline def setApp(value: js.Object): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setDevice(value: js.Object): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setNotifier(value: Name): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
      
      inline def setSessions(value: js.Array[ISession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
      
      inline def setSessionsVarargs(value: ISession*): Self = StObject.set(x, "sessions", js.Array(value*))
      
      inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait ITransport extends StObject {
    
    var name: String = js.native
    
    def sendReport(logger: ILogger, config: Any, report: IReportPayload): Unit = js.native
    def sendReport(
      logger: ILogger,
      config: Any,
      report: IReportPayload,
      cb: js.Function2[/* e */ js.Error | Null, /* resText */ String, Unit]
    ): Unit = js.native
    
    def sendSession(logger: ILogger, config: Any, report: ISessionPayload): Unit = js.native
    def sendSession(
      logger: ILogger,
      config: Any,
      report: ISessionPayload,
      cb: js.Function2[/* e */ js.Error | Null, /* resText */ String, Unit]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Error
    - typings.bugsnagJs.anon.ErrorClass
    - typings.bugsnagJs.anon.Message
    - scala.Any
  */
  type NotifiableError = _NotifiableError | js.Error | Any
  
  trait _NotifiableError extends StObject
  object _NotifiableError {
    
    inline def ErrorClass(errorClass: String, errorMessage: String): typings.bugsnagJs.anon.ErrorClass = {
      val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bugsnagJs.anon.ErrorClass]
    }
    
    inline def Message(message: String, name: String): typings.bugsnagJs.anon.Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bugsnagJs.anon.Message]
    }
  }
}
