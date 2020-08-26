package typings.datadogMetrics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", "histogram")
@js.native
object histogram extends js.Object {
  def apply(key: String, value: Double): Unit = js.native
  def apply(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def apply(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def apply(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
}

