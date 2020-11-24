package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckpointConfiguration extends js.Object {
  
  /**
    * Describes the interval in milliseconds between checkpoint operations.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointInterval: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointInterval] = js.native
  
  /**
    * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. You must set this property to CUSTOM in order to set the CheckpointingEnabled, CheckpointInterval, or MinPauseBetweenCheckpoints parameters.  If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationType: typings.awsSdk.kinesisanalyticsv2Mod.ConfigurationType = js.native
  
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start. If a checkpoint operation takes longer than the CheckpointInterval, the application otherwise performs continual checkpoint operations. For more information, see  Tuning Checkpointing in the Apache Flink Documentation.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.native
}
object CheckpointConfiguration {
  
  @scala.inline
  def apply(ConfigurationType: ConfigurationType): CheckpointConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfiguration]
  }
  
  @scala.inline
  implicit class CheckpointConfigurationOps[Self <: CheckpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfigurationType(value: ConfigurationType): Self = this.set("ConfigurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointInterval(value: CheckpointInterval): Self = this.set("CheckpointInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointInterval: Self = this.set("CheckpointInterval", js.undefined)
    
    @scala.inline
    def setCheckpointingEnabled(value: BooleanObject): Self = this.set("CheckpointingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointingEnabled: Self = this.set("CheckpointingEnabled", js.undefined)
    
    @scala.inline
    def setMinPauseBetweenCheckpoints(value: MinPauseBetweenCheckpoints): Self = this.set("MinPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPauseBetweenCheckpoints: Self = this.set("MinPauseBetweenCheckpoints", js.undefined)
  }
}
