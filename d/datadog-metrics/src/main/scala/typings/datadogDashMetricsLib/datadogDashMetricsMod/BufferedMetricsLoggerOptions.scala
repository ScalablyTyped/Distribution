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

object BufferedMetricsLoggerOptions {
  @scala.inline
  def apply(
    apiKey: java.lang.String = null,
    appKey: java.lang.String = null,
    defaultTags: js.Array[java.lang.String] = null,
    flushIntervalSeconds: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    prefix: java.lang.String = null
  ): BufferedMetricsLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (appKey != null) __obj.updateDynamic("appKey")(appKey)
    if (defaultTags != null) __obj.updateDynamic("defaultTags")(defaultTags)
    if (flushIntervalSeconds != null) __obj.updateDynamic("flushIntervalSeconds")(flushIntervalSeconds.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[BufferedMetricsLoggerOptions]
  }
}

