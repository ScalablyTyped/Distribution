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
  def apply(): ForwardActionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardActionConfig]
  }
  @scala.inline
  implicit class ForwardActionConfigOps[Self <: ForwardActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetGroupStickinessConfig(value: TargetGroupStickinessConfig): Self = this.set("TargetGroupStickinessConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupStickinessConfig: Self = this.set("TargetGroupStickinessConfig", js.undefined)
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroupTuple*): Self = this.set("TargetGroups", js.Array(value :_*))
    @scala.inline
    def setTargetGroups(value: TargetGroupList): Self = this.set("TargetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroups: Self = this.set("TargetGroups", js.undefined)
  }
  
}

