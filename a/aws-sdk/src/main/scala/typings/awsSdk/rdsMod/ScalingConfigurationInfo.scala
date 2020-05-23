package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingConfigurationInfo extends js.Object {
  /**
    * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. When the value is set to false for an Aurora Serverless DB cluster, the DB cluster automatically resumes.
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.native
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum capacity for the Aurora DB cluster in serverless DB engine mode.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The remaining amount of time, in seconds, before the Aurora DB cluster in serverless mode is paused. A DB cluster can be paused only when it's idle (it has no connections).
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.native
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object ScalingConfigurationInfo {
  @scala.inline
  def apply(
    AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
    MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined,
    TimeoutAction: String = null
  ): ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoPause)) __obj.updateDynamic("AutoPause")(AutoPause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SecondsUntilAutoPause)) __obj.updateDynamic("SecondsUntilAutoPause")(SecondsUntilAutoPause.get.asInstanceOf[js.Any])
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConfigurationInfo]
  }
}

