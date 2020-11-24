package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlinkApplicationConfigurationUpdate extends js.Object {
  
  /**
    * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointConfigurationUpdate] = js.native
  
  /**
    * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MonitoringConfigurationUpdate] = js.native
  
  /**
    * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismConfigurationUpdate] = js.native
}
object FlinkApplicationConfigurationUpdate {
  
  @scala.inline
  def apply(): FlinkApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfigurationUpdate]
  }
  
  @scala.inline
  implicit class FlinkApplicationConfigurationUpdateOps[Self <: FlinkApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    
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
    def setCheckpointConfigurationUpdate(value: CheckpointConfigurationUpdate): Self = this.set("CheckpointConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointConfigurationUpdate: Self = this.set("CheckpointConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setMonitoringConfigurationUpdate(value: MonitoringConfigurationUpdate): Self = this.set("MonitoringConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringConfigurationUpdate: Self = this.set("MonitoringConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setParallelismConfigurationUpdate(value: ParallelismConfigurationUpdate): Self = this.set("ParallelismConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelismConfigurationUpdate: Self = this.set("ParallelismConfigurationUpdate", js.undefined)
  }
}
