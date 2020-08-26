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
  def apply(): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
  @scala.inline
  implicit class EnhancedMonitoringOutputOps[Self <: EnhancedMonitoringOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentShardLevelMetricsVarargs(value: MetricsName*): Self = this.set("CurrentShardLevelMetrics", js.Array(value :_*))
    @scala.inline
    def setCurrentShardLevelMetrics(value: MetricsNameList): Self = this.set("CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentShardLevelMetrics: Self = this.set("CurrentShardLevelMetrics", js.undefined)
    @scala.inline
    def setDesiredShardLevelMetricsVarargs(value: MetricsName*): Self = this.set("DesiredShardLevelMetrics", js.Array(value :_*))
    @scala.inline
    def setDesiredShardLevelMetrics(value: MetricsNameList): Self = this.set("DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredShardLevelMetrics: Self = this.set("DesiredShardLevelMetrics", js.undefined)
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
  
}

