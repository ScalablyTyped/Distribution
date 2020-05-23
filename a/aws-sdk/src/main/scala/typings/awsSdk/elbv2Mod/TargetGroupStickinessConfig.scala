package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupStickinessConfig extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds] = js.native
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var Enabled: js.UndefOr[TargetGroupStickinessEnabled] = js.native
}

object TargetGroupStickinessConfig {
  @scala.inline
  def apply(
    DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds] = js.undefined,
    Enabled: js.UndefOr[TargetGroupStickinessEnabled] = js.undefined
  ): TargetGroupStickinessConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationSeconds)) __obj.updateDynamic("DurationSeconds")(DurationSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupStickinessConfig]
  }
}

