package typings.datadogMetrics.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", "BufferedMetricsLogger")
@js.native
class BufferedMetricsLogger protected () extends js.Object {
  def this(options: BufferedMetricsLoggerOptions) = this()
  /**
    * Calling flush sends any buffered metrics to DataDog. Unless you set flushIntervalSeconds
    * to 0 it won't be necessary to call this function.
    * It can be useful to trigger a manual flush by calling if you want to make sure pending
    * metrics have been sent before you quit the application process, for example.
    */
  def flush(): Unit = js.native
  def flush(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def flush(onSuccess: js.Function0[Unit]): Unit = js.native
  def flush(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Record the current value of a metric. They most recent value in a given flush
    * interval will be recorded. Optionally, specify a set of tags to associate with
    * the metric. This should be used for sum values such as total hard disk space,
    * process uptime, total number of active users, or number of rows in a database table.
    */
  def gauge(key: String, value: Double): Unit = js.native
  def gauge(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def gauge(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def gauge(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  /**
    * Sample a histogram value. Histograms will produce metrics that describe the distribution
    * of the recorded values, namely the minimum, maximum, average, count and the 75th, 85th,
    * 95th and 99th percentiles. Optionally, specify a list of tags to associate with the metric.
    */
  def histogram(key: String, value: Double): Unit = js.native
  def histogram(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def histogram(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def histogram(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  /**
    * Increment the counter by the given value (or 1 by default). Optionally, specify a
    * list of tags to associate with the metric. This is useful for counting things such
    * as incrementing a counter each time a page is requested.
    */
  def increment(key: String): Unit = js.native
  def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
  def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String], timestamp: Double): Unit = js.native
  def increment(key: String, value: Double): Unit = js.native
  def increment(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def increment(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def increment(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
}

