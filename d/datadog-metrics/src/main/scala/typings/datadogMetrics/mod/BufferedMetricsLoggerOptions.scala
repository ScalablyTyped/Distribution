package typings.datadogMetrics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedMetricsLoggerOptions extends js.Object {
  /**
    * Sets the DataDog API key.
    */
  var apiKey: js.UndefOr[String] = js.undefined
  /**
    * Sets the DataDog APP key.
    */
  var appKey: js.UndefOr[String] = js.undefined
  /**
    * Default tags used for all metric reporting.
    */
  var defaultTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * How often to send metrics to DataDog.
    */
  var flushIntervalSeconds: js.UndefOr[Double] = js.undefined
  /**
    * Sets the hostname reported with each metric.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Sets a default prefix for all metrics.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object BufferedMetricsLoggerOptions {
  @scala.inline
  def apply(
    apiKey: String = null,
    appKey: String = null,
    defaultTags: js.Array[String] = null,
    flushIntervalSeconds: js.UndefOr[Double] = js.undefined,
    host: String = null,
    prefix: String = null
  ): BufferedMetricsLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (appKey != null) __obj.updateDynamic("appKey")(appKey.asInstanceOf[js.Any])
    if (defaultTags != null) __obj.updateDynamic("defaultTags")(defaultTags.asInstanceOf[js.Any])
    if (!js.isUndefined(flushIntervalSeconds)) __obj.updateDynamic("flushIntervalSeconds")(flushIntervalSeconds.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferedMetricsLoggerOptions]
  }
}

