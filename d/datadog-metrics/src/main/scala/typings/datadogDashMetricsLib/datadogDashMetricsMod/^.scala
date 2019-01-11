package typings
package datadogDashMetricsLib.datadogDashMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flush(): scala.Unit = js.native
  def flush(onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def flush(onSuccess: js.Function0[scala.Unit], onError: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def gauge(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def gauge(key: java.lang.String, value: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def gauge(
    key: java.lang.String,
    value: scala.Double,
    tags: js.Array[java.lang.String],
    timestamp: scala.Double
  ): scala.Unit = js.native
  def histogram(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def histogram(key: java.lang.String, value: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def histogram(
    key: java.lang.String,
    value: scala.Double,
    tags: js.Array[java.lang.String],
    timestamp: scala.Double
  ): scala.Unit = js.native
  def increment(key: java.lang.String): scala.Unit = js.native
  def increment(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def increment(key: java.lang.String, value: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def increment(
    key: java.lang.String,
    value: scala.Double,
    tags: js.Array[java.lang.String],
    timestamp: scala.Double
  ): scala.Unit = js.native
  def init(options: datadogDashMetricsLib.datadogDashMetricsMod.BufferedMetricsLoggerOptions): scala.Unit = js.native
}

