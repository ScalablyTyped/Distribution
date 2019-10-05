package typings.datadogDashMetrics.datadogDashMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", "gauge")
@js.native
object gauge extends js.Object {
  def apply(key: String, value: Double): Unit = js.native
  def apply(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def apply(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
}

