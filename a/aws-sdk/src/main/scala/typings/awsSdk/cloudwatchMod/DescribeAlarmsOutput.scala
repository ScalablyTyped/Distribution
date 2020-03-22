package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsOutput extends js.Object {
  /**
    * The information about any composite alarms returned by the operation.
    */
  var CompositeAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.CompositeAlarms] = js.native
  /**
    * The information about any metric alarms returned by the operation.
    */
  var MetricAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricAlarms] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAlarmsOutput {
  @scala.inline
  def apply(
    CompositeAlarms: CompositeAlarms = null,
    MetricAlarms: MetricAlarms = null,
    NextToken: NextToken = null
  ): DescribeAlarmsOutput = {
    val __obj = js.Dynamic.literal()
    if (CompositeAlarms != null) __obj.updateDynamic("CompositeAlarms")(CompositeAlarms.asInstanceOf[js.Any])
    if (MetricAlarms != null) __obj.updateDynamic("MetricAlarms")(MetricAlarms.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsOutput]
  }
}

