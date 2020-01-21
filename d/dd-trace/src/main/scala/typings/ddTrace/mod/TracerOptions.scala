package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.AnonAgentexporter
import typings.ddTrace.AnonDebug
import typings.ddTrace.AnonPort
import typings.ddTrace.ddTraceStrings.async_hooks
import typings.ddTrace.ddTraceStrings.noop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracerOptions extends js.Object {
  /**
    * Enable Trace Analytics.
    * @default false
    */
  var analytics: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable debug logging in the tracer.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Options specific for the Dogstatsd agent.
    */
  var dogstatsd: js.UndefOr[AnonPort] = js.undefined
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
  var experimental: js.UndefOr[Boolean | AnonAgentexporter] = js.undefined
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
    * Whether to enable trace ID injection in log records to be able to correlate
    * traces with logs.
    * @default false
    */
  var logInjection: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom logger to be used by the tracer (if debug = true),
    * should support debug() and error() methods
    * see https://datadog.github.io/dd-trace-js/#custom-logging
    */
  var logger: js.UndefOr[AnonDebug] = js.undefined
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
  var scope: js.UndefOr[async_hooks | noop] = js.undefined
  /**
    * The service name to be used for this program. If not set, the service name
    * will attempted to be inferred from package.json
    */
  var service: js.UndefOr[String] = js.undefined
  /**
    * Global tags that should be assigned to every span.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The url of the trace agent that the tracer will submit to.
    * Takes priority over hostname and port, if set.
    */
  var url: js.UndefOr[String] = js.undefined
}

object TracerOptions {
  @scala.inline
  def apply(
    analytics: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    dogstatsd: AnonPort = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    experimental: Boolean | AnonAgentexporter = null,
    flushInterval: Int | Double = null,
    hostname: String = null,
    logInjection: js.UndefOr[Boolean] = js.undefined,
    logger: AnonDebug = null,
    plugins: js.UndefOr[Boolean] = js.undefined,
    port: Double | String = null,
    reportHostname: js.UndefOr[Boolean] = js.undefined,
    runtimeMetrics: js.UndefOr[Boolean] = js.undefined,
    sampleRate: Int | Double = null,
    scope: async_hooks | noop = null,
    service: String = null,
    tags: StringDictionary[js.Any] = null,
    url: String = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (dogstatsd != null) __obj.updateDynamic("dogstatsd")(dogstatsd.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(logInjection)) __obj.updateDynamic("logInjection")(logInjection.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reportHostname)) __obj.updateDynamic("reportHostname")(reportHostname.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeMetrics)) __obj.updateDynamic("runtimeMetrics")(runtimeMetrics.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracerOptions]
  }
}

