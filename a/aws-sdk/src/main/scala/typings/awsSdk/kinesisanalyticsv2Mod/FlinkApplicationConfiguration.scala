package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): FlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfiguration]
  }
  
  @scala.inline
  implicit class FlinkApplicationConfigurationOps[Self <: FlinkApplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCheckpointConfiguration(value: CheckpointConfiguration): Self = this.set("CheckpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointConfiguration: Self = this.set("CheckpointConfiguration", js.undefined)
    
    @scala.inline
    def setMonitoringConfiguration(value: MonitoringConfiguration): Self = this.set("MonitoringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringConfiguration: Self = this.set("MonitoringConfiguration", js.undefined)
    
    @scala.inline
    def setParallelismConfiguration(value: ParallelismConfiguration): Self = this.set("ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelismConfiguration: Self = this.set("ParallelismConfiguration", js.undefined)
  }
}
