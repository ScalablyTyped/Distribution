package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedMonitoringOutput extends js.Object {
  /**
    * Represents the current state of the metrics that are in the enhanced state before the operation.
    */
  var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
  /**
    * Represents the list of all the metrics that would be in the enhanced state after the operation.
    */
  var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisMod.StreamName] = js.native
}

object EnhancedMonitoringOutput {
  @scala.inline
  def apply(
    CurrentShardLevelMetrics: MetricsNameList = null,
    DesiredShardLevelMetrics: MetricsNameList = null,
    StreamName: StreamName = null
  ): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    if (CurrentShardLevelMetrics != null) __obj.updateDynamic("CurrentShardLevelMetrics")(CurrentShardLevelMetrics.asInstanceOf[js.Any])
    if (DesiredShardLevelMetrics != null) __obj.updateDynamic("DesiredShardLevelMetrics")(DesiredShardLevelMetrics.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
}

