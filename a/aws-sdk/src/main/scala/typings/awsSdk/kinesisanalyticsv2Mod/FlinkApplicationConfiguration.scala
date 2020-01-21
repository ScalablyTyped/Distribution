package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkApplicationConfiguration extends js.Object {
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see  Checkpoints for Fault Tolerance in the Apache Flink Documentation. 
    */
  var CheckpointConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointConfiguration] = js.native
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MonitoringConfiguration] = js.native
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismConfiguration] = js.native
}

object FlinkApplicationConfiguration {
  @scala.inline
  def apply(
    CheckpointConfiguration: CheckpointConfiguration = null,
    MonitoringConfiguration: MonitoringConfiguration = null,
    ParallelismConfiguration: ParallelismConfiguration = null
  ): FlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CheckpointConfiguration != null) __obj.updateDynamic("CheckpointConfiguration")(CheckpointConfiguration.asInstanceOf[js.Any])
    if (MonitoringConfiguration != null) __obj.updateDynamic("MonitoringConfiguration")(MonitoringConfiguration.asInstanceOf[js.Any])
    if (ParallelismConfiguration != null) __obj.updateDynamic("ParallelismConfiguration")(ParallelismConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlinkApplicationConfiguration]
  }
}

