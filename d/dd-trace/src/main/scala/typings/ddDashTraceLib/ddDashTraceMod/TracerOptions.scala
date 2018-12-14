package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TracerOptions extends js.Object {
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
       * Experimental features can be enabled all at once by using true or individually using key / value pairs.
       * @default {}
       */
  var experimental: js.UndefOr[ExperimentalOptions | scala.Boolean] = js.undefined
  /**
       * Interval in milliseconds at which the tracer will submit traces to the agent.
       * @default 2000
       */
  var flushInterval: js.UndefOr[scala.Double] = js.undefined
  /**
       * The address of the trace agent that the tracer will submit to.
       * @default 'localhost'
       */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Custom logger to be used by the tracer (if debug = true),
       * should support debug() and error() methods
       * see https://datadog.github.io/dd-trace-js/#custom-logging__anchor
       */
  var logger: js.UndefOr[ddDashTraceLib.Anon_Error] = js.undefined
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
       * The service name to be used for this program.
       */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Global tags that should be assigned to every span.
       */
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

