package typings
package datadogDashMetricsLib.datadogDashMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedMetricsLoggerOptions extends js.Object {
  /**
    * Sets the DataDog API key.
    */
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the DataDog APP key.
    */
  var appKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default tags used for all metric reporting.
    */
  var defaultTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * How often to send metrics to DataDog.
    */
  var flushIntervalSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the hostname reported with each metric.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets a default prefix for all metrics.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

