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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracerOptions extends StObject {
  
  /**
    * Enable Trace Analytics.
    * @default false
    */
  var analytics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client token for browser tracing. Can be generated in the UI at `Integrations -> APIs`.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Enable debug logging in the tracer.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options specific for the Dogstatsd agent.
    */
  var dogstatsd: js.UndefOr[Hostname] = js.undefined
  
  /**
    * Whether to enable the tracer.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set an application’s environment e.g. prod, pre-prod, stage.
    */
  var env: js.UndefOr[String] = js.undefined
  
  /**
    * Experimental features can be enabled all at once by using true or individually using key / value pairs.
    * @default {}
    */
  var experimental: js.UndefOr[Boolean | B3] = js.undefined
  
  /**
    * Interval in milliseconds at which the tracer will submit traces to the agent.
    * @default 2000
    */
  var flushInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The address of the trace agent that the tracer will submit to.
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration of the ingestion between the agent and the backend.
    */
  var ingestion: js.UndefOr[RateLimit] = js.undefined
  
  /**
    * Whether to enable trace ID injection in log records to be able to correlate
    * traces with logs.
    * @default false
    */
  var logInjection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string representing the minimum tracer log level to use when debug logging is enabled
    * @default 'debug'
    */
  var logLevel: js.UndefOr[error | debug] = js.undefined
  
  /**
    * Custom logger to be used by the tracer (if debug = true),
    * should support error(), warn(), info(), and debug() methods
    * see https://datadog.github.io/dd-trace-js/#custom-logging
    */
  var logger: js.UndefOr[Debug] = js.undefined
  
  /**
    * Custom function for DNS lookups when sending requests to the agent.
    * @default dns.lookup()
    */
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  
  /**
    * If false, require a parent in order to trace.
    * @default true
    */
  var orphanable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to load all built-in plugins.
    * @default true
    */
  var plugins: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The port of the trace agent that the tracer will submit to.
    * @default 8126
    */
  var port: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Protocol version to use for requests to the agent. The version configured must be supported by the agent version installed or all traces will be dropped.
    * @default 0.4
    */
  var protocolVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to report the hostname of the service host. This is used when the agent is deployed on a different host and cannot determine the hostname automatically.
    * @default false
    */
  var reportHostname: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to enable runtime metrics.
    * @default false
    */
  var runtimeMetrics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Percentage of spans to sample as a float between 0 and 1.
    * @default 1
    */
  var sampleRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies which scope implementation to use. The default is to use the best
    * implementation for the runtime. Only change this if you know what you are
    * doing.
    */
  var scope: js.UndefOr[async_hooks | async_local_storage | noop] = js.undefined
  
  /**
    * The service name to be used for this program. If not set, the service name
    * will attempted to be inferred from package.json
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to enable startup logs.
    * @default true
    */
  var startupLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Global tags that should be assigned to every span.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Whether to track the scope of async functions. This is needed for async/await to work with non-native promises (thenables). Only disable this if you are sure only native promises are used with async/await, or if you are using Node >=14.5 since the issue has been fixed in that version.
    * @default true
    */
  var trackAsyncScope: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The url of the trace agent that the tracer will submit to.
    * Takes priority over hostname and port, if set.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the application. If not set, the version
    * will attempted to be inferred from package.json.
    */
  var version: js.UndefOr[String] = js.undefined
}
object TracerOptions {
  
  inline def apply(): TracerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracerOptions]
  }
  
  extension [Self <: TracerOptions](x: Self) {
    
    inline def setAnalytics(value: Boolean): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDogstatsd(value: Hostname): Self = StObject.set(x, "dogstatsd", value.asInstanceOf[js.Any])
    
    inline def setDogstatsdUndefined: Self = StObject.set(x, "dogstatsd", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExperimental(value: Boolean | B3): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIngestion(value: RateLimit): Self = StObject.set(x, "ingestion", value.asInstanceOf[js.Any])
    
    inline def setIngestionUndefined: Self = StObject.set(x, "ingestion", js.undefined)
    
    inline def setLogInjection(value: Boolean): Self = StObject.set(x, "logInjection", value.asInstanceOf[js.Any])
    
    inline def setLogInjectionUndefined: Self = StObject.set(x, "logInjection", js.undefined)
    
    inline def setLogLevel(value: error | debug): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setOrphanable(value: Boolean): Self = StObject.set(x, "orphanable", value.asInstanceOf[js.Any])
    
    inline def setOrphanableUndefined: Self = StObject.set(x, "orphanable", js.undefined)
    
    inline def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    inline def setReportHostname(value: Boolean): Self = StObject.set(x, "reportHostname", value.asInstanceOf[js.Any])
    
    inline def setReportHostnameUndefined: Self = StObject.set(x, "reportHostname", js.undefined)
    
    inline def setRuntimeMetrics(value: Boolean): Self = StObject.set(x, "runtimeMetrics", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMetricsUndefined: Self = StObject.set(x, "runtimeMetrics", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setScope(value: async_hooks | async_local_storage | noop): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setStartupLogs(value: Boolean): Self = StObject.set(x, "startupLogs", value.asInstanceOf[js.Any])
    
    inline def setStartupLogsUndefined: Self = StObject.set(x, "startupLogs", js.undefined)
    
    inline def setTags(value: StringDictionary[js.Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTrackAsyncScope(value: Boolean): Self = StObject.set(x, "trackAsyncScope", value.asInstanceOf[js.Any])
    
    inline def setTrackAsyncScopeUndefined: Self = StObject.set(x, "trackAsyncScope", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
