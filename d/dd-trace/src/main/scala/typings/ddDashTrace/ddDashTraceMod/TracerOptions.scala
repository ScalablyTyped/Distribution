package typings.ddDashTrace.ddDashTraceMod

import org.scalablytyped.runtime.StringDictionary
import typings.ddDashTrace.Anon_B3
import typings.ddDashTrace.Anon_Debug
import typings.ddDashTrace.Anon_Port
import typings.ddDashTrace.ddDashTraceStrings.`async-listener`
import typings.ddDashTrace.ddDashTraceStrings.async_hooks
import typings.ddDashTrace.ddDashTraceStrings.noop
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
  var dogstatsd: js.UndefOr[Anon_Port] = js.undefined
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
  var experimental: js.UndefOr[Boolean | Anon_B3] = js.undefined
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
  var logger: js.UndefOr[Anon_Debug] = js.undefined
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
  var scope: js.UndefOr[async_hooks | `async-listener` | noop] = js.undefined
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
    dogstatsd: Anon_Port = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    experimental: Boolean | Anon_B3 = null,
    hostname: String = null,
    logInjection: js.UndefOr[Boolean] = js.undefined,
    logger: Anon_Debug = null,
    plugins: js.UndefOr[Boolean] = js.undefined,
    port: Double | String = null,
    runtimeMetrics: js.UndefOr[Boolean] = js.undefined,
    sampleRate: Int | Double = null,
    scope: async_hooks | `async-listener` | noop = null,
    service: String = null,
    tags: StringDictionary[js.Any] = null,
    url: String = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dogstatsd != null) __obj.updateDynamic("dogstatsd")(dogstatsd)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (env != null) __obj.updateDynamic("env")(env)
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(logInjection)) __obj.updateDynamic("logInjection")(logInjection)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeMetrics)) __obj.updateDynamic("runtimeMetrics")(runtimeMetrics)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TracerOptions]
  }
}

