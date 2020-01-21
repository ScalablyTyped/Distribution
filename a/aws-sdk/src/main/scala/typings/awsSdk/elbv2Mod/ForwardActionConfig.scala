package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardActionConfig extends js.Object {
  /**
    * The target group stickiness for the rule.
    */
  var TargetGroupStickinessConfig: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupStickinessConfig] = js.native
  /**
    * One or more target groups. For Network Load Balancers, you can specify a single target group.
    */
  var TargetGroups: js.UndefOr[TargetGroupList] = js.native
}

object ForwardActionConfig {
  @scala.inline
  def apply(
    TargetGroupStickinessConfig: TargetGroupStickinessConfig = null,
    TargetGroups: TargetGroupList = null
  ): ForwardActionConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetGroupStickinessConfig != null) __obj.updateDynamic("TargetGroupStickinessConfig")(TargetGroupStickinessConfig.asInstanceOf[js.Any])
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardActionConfig]
  }
}

