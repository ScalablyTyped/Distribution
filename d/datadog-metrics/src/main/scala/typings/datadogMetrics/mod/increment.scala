package typings.datadogMetrics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", "increment")
@js.native
object increment extends js.Object {
  def apply(key: String): Unit = js.native
  def apply(key: String, value: js.UndefOr[scala.Nothing], tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def apply(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
  def apply(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String], timestamp: Double): Unit = js.native
  def apply(key: String, value: Double): Unit = js.native
  def apply(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def apply(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  def apply(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
}

