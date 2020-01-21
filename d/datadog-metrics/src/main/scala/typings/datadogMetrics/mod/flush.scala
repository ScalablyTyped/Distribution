package typings.datadogMetrics.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-metrics", "flush")
@js.native
object flush extends js.Object {
  def apply(): Unit = js.native
  def apply(onSuccess: js.Function0[Unit]): Unit = js.native
  def apply(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

