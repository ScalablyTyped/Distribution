package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the interval in milliseconds between checkpoint operations.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval vaue of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.native
  /**
    * Describes updates to whether checkpointing is enabled for an application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.native
  /**
    * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics. You must set this property to CUSTOM in order to set the CheckpointingEnabled, CheckpointInterval, or MinPauseBetweenCheckpoints parameters.   If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  /**
    * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.native
}

object CheckpointConfigurationUpdate {
  @scala.inline
  def apply(
    CheckpointIntervalUpdate: Int | Double = null,
    CheckpointingEnabledUpdate: js.UndefOr[Boolean] = js.undefined,
    ConfigurationTypeUpdate: ConfigurationType = null,
    MinPauseBetweenCheckpointsUpdate: Int | Double = null
  ): CheckpointConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (CheckpointIntervalUpdate != null) __obj.updateDynamic("CheckpointIntervalUpdate")(CheckpointIntervalUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(CheckpointingEnabledUpdate)) __obj.updateDynamic("CheckpointingEnabledUpdate")(CheckpointingEnabledUpdate.asInstanceOf[js.Any])
    if (ConfigurationTypeUpdate != null) __obj.updateDynamic("ConfigurationTypeUpdate")(ConfigurationTypeUpdate.asInstanceOf[js.Any])
    if (MinPauseBetweenCheckpointsUpdate != null) __obj.updateDynamic("MinPauseBetweenCheckpointsUpdate")(MinPauseBetweenCheckpointsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfigurationUpdate]
  }
}

