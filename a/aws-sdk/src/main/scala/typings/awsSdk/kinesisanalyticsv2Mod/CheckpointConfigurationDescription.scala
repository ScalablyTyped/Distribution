package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfigurationDescription extends js.Object {
  /**
    * Describes the interval in milliseconds between checkpoint operations.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointInterval: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointInterval] = js.native
  /**
    * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.   If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationType: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.   If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpoints: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MinPauseBetweenCheckpoints] = js.native
}

object CheckpointConfigurationDescription {
  @scala.inline
  def apply(): CheckpointConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckpointConfigurationDescription]
  }
  @scala.inline
  implicit class CheckpointConfigurationDescriptionOps[Self <: CheckpointConfigurationDescription] (val x: Self) extends AnyVal {
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
    def setCheckpointInterval(value: CheckpointInterval): Self = this.set("CheckpointInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckpointInterval: Self = this.set("CheckpointInterval", js.undefined)
    @scala.inline
    def setCheckpointingEnabled(value: BooleanObject): Self = this.set("CheckpointingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckpointingEnabled: Self = this.set("CheckpointingEnabled", js.undefined)
    @scala.inline
    def setConfigurationType(value: ConfigurationType): Self = this.set("ConfigurationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationType: Self = this.set("ConfigurationType", js.undefined)
    @scala.inline
    def setMinPauseBetweenCheckpoints(value: MinPauseBetweenCheckpoints): Self = this.set("MinPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPauseBetweenCheckpoints: Self = this.set("MinPauseBetweenCheckpoints", js.undefined)
  }
  
}

