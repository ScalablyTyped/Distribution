package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): FlinkApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfigurationDescription]
  }
  
  @scala.inline
  implicit class FlinkApplicationConfigurationDescriptionOps[Self <: FlinkApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    
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
    def setCheckpointConfigurationDescription(value: CheckpointConfigurationDescription): Self = this.set("CheckpointConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointConfigurationDescription: Self = this.set("CheckpointConfigurationDescription", js.undefined)
    
    @scala.inline
    def setJobPlanDescription(value: JobPlanDescription): Self = this.set("JobPlanDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobPlanDescription: Self = this.set("JobPlanDescription", js.undefined)
    
    @scala.inline
    def setMonitoringConfigurationDescription(value: MonitoringConfigurationDescription): Self = this.set("MonitoringConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringConfigurationDescription: Self = this.set("MonitoringConfigurationDescription", js.undefined)
    
    @scala.inline
    def setParallelismConfigurationDescription(value: ParallelismConfigurationDescription): Self = this.set("ParallelismConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelismConfigurationDescription: Self = this.set("ParallelismConfigurationDescription", js.undefined)
  }
}
