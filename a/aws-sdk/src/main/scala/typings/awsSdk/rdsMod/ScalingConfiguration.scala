package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingConfiguration extends js.Object {
  /**
    * A value that indicates whether to allow or disallow automatic pause for an Aurora DB cluster in serverless DB engine mode. A DB cluster can be paused only when it's idle (it has no connections).  If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it.  
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.native
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode. For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256. For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384. The maximum capacity must be greater than or equal to the minimum capacity.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The minimum capacity for an Aurora DB cluster in serverless DB engine mode. For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256. For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384. The minimum capacity must be less than or equal to the maximum capacity.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The time, in seconds, before an Aurora DB cluster in serverless mode is paused.
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.native
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange sets the capacity to the specified value as soon as possible.  RollbackCapacityChange, the default, ignores the capacity change if a scaling point isn't found in the timeout period.  If you specify ForceApplyCapacityChange, connections that prevent Aurora Serverless from finding a scaling point might be dropped.  For more information, see  Autoscaling for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object ScalingConfiguration {
  @scala.inline
  def apply(
    AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
    MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined,
    TimeoutAction: String = null
  ): ScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoPause)) __obj.updateDynamic("AutoPause")(AutoPause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SecondsUntilAutoPause)) __obj.updateDynamic("SecondsUntilAutoPause")(SecondsUntilAutoPause.get.asInstanceOf[js.Any])
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConfiguration]
  }
}

