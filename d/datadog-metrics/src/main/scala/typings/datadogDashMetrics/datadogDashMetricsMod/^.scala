package typings.datadogDashMetrics.datadogDashMetricsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flush(): Unit = js.native
  def flush(onSuccess: js.Function0[Unit]): Unit = js.native
  def flush(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def gauge(key: String, value: Double): Unit = js.native
  def gauge(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def gauge(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  def histogram(key: String, value: Double): Unit = js.native
  def histogram(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def histogram(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  def increment(key: String): Unit = js.native
  def increment(key: String, value: Double): Unit = js.native
  def increment(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def increment(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  def init(options: BufferedMetricsLoggerOptions): Unit = js.native
}

