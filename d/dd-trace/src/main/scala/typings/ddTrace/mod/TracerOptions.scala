package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.anon.B3
import typings.ddTrace.anon.Debug
import typings.ddTrace.anon.Hostname
import typings.ddTrace.anon.RateLimit
import typings.ddTrace.ddTraceStrings.async_hooks
import typings.ddTrace.ddTraceStrings.async_local_storage
import typings.ddTrace.ddTraceStrings.debug
import typings.ddTrace.ddTraceStrings.error
import typings.ddTrace.ddTraceStrings.noop
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracerOptions extends js.Object {
  
  /**
    * Enable Trace Analytics.
    * @default false
    */
  var analytics: js.UndefOr[Boolean] = js.native
  
  /**
    * Client token for browser tracing. Can be generated in the UI at `Integrations -> APIs`.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * Enable debug logging in the tracer.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Options specific for the Dogstatsd agent.
    */
  var dogstatsd: js.UndefOr[Hostname] = js.native
  
  /**
    * Whether to enable the tracer.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Set an application’s environment e.g. prod, pre-prod, stage.
    */
  var env: js.UndefOr[String] = js.native
  
  /**
    * Experimental features can be enabled all at once by using true or individually using key / value pairs.
    * @default {}
    */
  var experimental: js.UndefOr[Boolean | B3] = js.native
  
  /**
    * Interval in milliseconds at which the tracer will submit traces to the agent.
    * @default 2000
    */
  var flushInterval: js.UndefOr[Double] = js.native
  
  /**
    * The address of the trace agent that the tracer will submit to.
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * Configuration of the ingestion between the agent and the backend.
    */
  var ingestion: js.UndefOr[RateLimit] = js.native
  
  /**
    * Whether to enable trace ID injection in log records to be able to correlate
    * traces with logs.
    * @default false
    */
  var logInjection: js.UndefOr[Boolean] = js.native
  
  /**
    * A string representing the minimum tracer log level to use when debug logging is enabled
    * @default 'debug'
    */
  var logLevel: js.UndefOr[error | debug] = js.native
  
  /**
    * Custom logger to be used by the tracer (if debug = true),
    * should support error(), warn(), info(), and debug() methods
    * see https://datadog.github.io/dd-trace-js/#custom-logging
    */
  var logger: js.UndefOr[Debug] = js.native
  
  /**
    * Custom function for DNS lookups when sending requests to the agent.
    * @default dns.lookup()
    */
  var lookup: js.UndefOr[LookupFunction] = js.native
  
  /**
    * If false, require a parent in order to trace.
    * @default true
    */
  var orphanable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to load all built-in plugins.
    * @default true
    */
  var plugins: js.UndefOr[Boolean] = js.native
  
  /**
    * The port of the trace agent that the tracer will submit to.
    * @default 8126
    */
  var port: js.UndefOr[Double | String] = js.native
  
  /**
    * Protocol version to use for requests to the agent. The version configured must be supported by the agent version installed or all traces will be dropped.
    * @default 0.4
    */
  var protocolVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether to report the hostname of the service host. This is used when the agent is deployed on a different host and cannot determine the hostname automatically.
    * @default false
    */
  var reportHostname: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable runtime metrics.
    * @default false
    */
  var runtimeMetrics: js.UndefOr[Boolean] = js.native
  
  /**
    * Percentage of spans to sample as a float between 0 and 1.
    * @default 1
    */
  var sampleRate: js.UndefOr[Double] = js.native
  
  /**
    * Specifies which scope implementation to use. The default is to use the best
    * implementation for the runtime. Only change this if you know what you are
    * doing.
    */
  var scope: js.UndefOr[async_hooks | async_local_storage | noop] = js.native
  
  /**
    * The service name to be used for this program. If not set, the service name
    * will attempted to be inferred from package.json
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * Whether to enable startup logs.
    * @default true
    */
  var startupLogs: js.UndefOr[Boolean] = js.native
  
  /**
    * Global tags that should be assigned to every span.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Whether to track the scope of async functions. This is needed for async/await to work with non-native promises (thenables). Only disable this if you are sure only native promises are used with async/await, or if you are using Node >=14.5 since the issue has been fixed in that version.
    * @default true
    */
  var trackAsyncScope: js.UndefOr[Boolean] = js.native
  
  /**
    * The url of the trace agent that the tracer will submit to.
    * Takes priority over hostname and port, if set.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The version number of the application. If not set, the version
    * will attempted to be inferred from package.json.
    */
  var version: js.UndefOr[String] = js.native
}
object TracerOptions {
  
  @scala.inline
  def apply(): TracerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracerOptions]
  }
  
  @scala.inline
  implicit class TracerOptionsOps[Self <: TracerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalytics(value: Boolean): Self = this.set("analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDogstatsd(value: Hostname): Self = this.set("dogstatsd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDogstatsd: Self = this.set("dogstatsd", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean | B3): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIngestion(value: RateLimit): Self = this.set("ingestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestion: Self = this.set("ingestion", js.undefined)
    
    @scala.inline
    def setLogInjection(value: Boolean): Self = this.set("logInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogInjection: Self = this.set("logInjection", js.undefined)
    
    @scala.inline
    def setLogLevel(value: error | debug): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Debug): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("lookup", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setOrphanable(value: Boolean): Self = this.set("orphanable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrphanable: Self = this.set("orphanable", js.undefined)
    
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: String): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    
    @scala.inline
    def setReportHostname(value: Boolean): Self = this.set("reportHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportHostname: Self = this.set("reportHostname", js.undefined)
    
    @scala.inline
    def setRuntimeMetrics(value: Boolean): Self = this.set("runtimeMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeMetrics: Self = this.set("runtimeMetrics", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setScope(value: async_hooks | async_local_storage | noop): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setStartupLogs(value: Boolean): Self = this.set("startupLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupLogs: Self = this.set("startupLogs", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[js.Any]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTrackAsyncScope(value: Boolean): Self = this.set("trackAsyncScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackAsyncScope: Self = this.set("trackAsyncScope", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
