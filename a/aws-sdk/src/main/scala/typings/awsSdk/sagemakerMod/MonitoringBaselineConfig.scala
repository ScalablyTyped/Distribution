package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringBaselineConfig extends js.Object {
  /**
    * The baseline constraint file in Amazon S3 that the current monitoring job should validated against.
    */
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.native
  /**
    * The baseline statistics file in Amazon S3 that the current monitoring job should be validated against.
    */
  var StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.native
}

object MonitoringBaselineConfig {
  @scala.inline
  def apply(
    ConstraintsResource: MonitoringConstraintsResource = null,
    StatisticsResource: MonitoringStatisticsResource = null
  ): MonitoringBaselineConfig = {
    val __obj = js.Dynamic.literal()
    if (ConstraintsResource != null) __obj.updateDynamic("ConstraintsResource")(ConstraintsResource.asInstanceOf[js.Any])
    if (StatisticsResource != null) __obj.updateDynamic("StatisticsResource")(StatisticsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringBaselineConfig]
  }
}

