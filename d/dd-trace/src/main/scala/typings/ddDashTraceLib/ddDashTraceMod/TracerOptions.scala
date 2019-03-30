package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracerOptions extends js.Object {
  /**
    * Enable Trace Analytics.
    * @default false
    */
  var analytics: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable debug logging in the tracer.
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to enable the tracer.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set an application’s environment e.g. prod, pre-prod, stage.
    */
  var env: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Experimental features can be enabled all at once by using true or individually using key / value pairs.
    * @default {}
    */
  var experimental: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  /**
    * The address of the trace agent that the tracer will submit to.
    * @default 'localhost'
    */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable trace ID injection in log records to be able to correlate
    * traces with logs.
    * @default false
    */
  var logInjection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom logger to be used by the tracer (if debug = true),
    * should support debug() and error() methods
    * see https://datadog.github.io/dd-trace-js/#custom-logging
    */
  var logger: js.UndefOr[ddDashTraceLib.Anon_Debug] = js.undefined
  /**
    * Whether to load all built-in plugins.
    * @default true
    */
  var plugins: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The port of the trace agent that the tracer will submit to.
    * @default 8126
    */
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Percentage of spans to sample as a float between 0 and 1.
    * @default 1
    */
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * The service name to be used for this program. If not set, the service name
    * will attempted to be inferred from package.json
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Global tags that should be assigned to every span.
    */
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The url of the trace agent that the tracer will submit to.
    * Takes priority over hostname and port, if set.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TracerOptions {
  @scala.inline
  def apply(
    analytics: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    env: java.lang.String = null,
    experimental: js.Object | scala.Boolean = null,
    hostname: java.lang.String = null,
    logInjection: js.UndefOr[scala.Boolean] = js.undefined,
    logger: ddDashTraceLib.Anon_Debug = null,
    plugins: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Double | java.lang.String = null,
    sampleRate: scala.Int | scala.Double = null,
    service: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    url: java.lang.String = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (env != null) __obj.updateDynamic("env")(env)
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(logInjection)) __obj.updateDynamic("logInjection")(logInjection)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TracerOptions]
  }
}

