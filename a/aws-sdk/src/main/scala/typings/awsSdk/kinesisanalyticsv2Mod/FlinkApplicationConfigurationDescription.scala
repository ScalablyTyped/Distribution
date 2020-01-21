package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlinkApplicationConfigurationDescription extends js.Object {
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointConfigurationDescription] = js.native
  /**
    * The job plan for an application. For more information about the job plan, see Jobs and Scheduling in the Apache Flink Documentation. To retrieve the job plan for the application, use the DescribeApplicationRequest$IncludeAdditionalDetails parameter of the DescribeApplication operation.
    */
  var JobPlanDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.JobPlanDescription] = js.native
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MonitoringConfigurationDescription] = js.native
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismConfigurationDescription] = js.native
}

object FlinkApplicationConfigurationDescription {
  @scala.inline
  def apply(
    CheckpointConfigurationDescription: CheckpointConfigurationDescription = null,
    JobPlanDescription: JobPlanDescription = null,
    MonitoringConfigurationDescription: MonitoringConfigurationDescription = null,
    ParallelismConfigurationDescription: ParallelismConfigurationDescription = null
  ): FlinkApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (CheckpointConfigurationDescription != null) __obj.updateDynamic("CheckpointConfigurationDescription")(CheckpointConfigurationDescription.asInstanceOf[js.Any])
    if (JobPlanDescription != null) __obj.updateDynamic("JobPlanDescription")(JobPlanDescription.asInstanceOf[js.Any])
    if (MonitoringConfigurationDescription != null) __obj.updateDynamic("MonitoringConfigurationDescription")(MonitoringConfigurationDescription.asInstanceOf[js.Any])
    if (ParallelismConfigurationDescription != null) __obj.updateDynamic("ParallelismConfigurationDescription")(ParallelismConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlinkApplicationConfigurationDescription]
  }
}

