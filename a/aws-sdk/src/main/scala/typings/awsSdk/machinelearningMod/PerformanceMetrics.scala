package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceMetrics extends js.Object {
  var Properties: js.UndefOr[PerformanceMetricsProperties] = js.native
}

object PerformanceMetrics {
  @scala.inline
  def apply(Properties: PerformanceMetricsProperties = null): PerformanceMetrics = {
    val __obj = js.Dynamic.literal()
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceMetrics]
  }
}

