package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Modifies a Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorFilterRule] = js.native
}

object ModifyTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(): ModifyTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleResult]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterRuleResultOps[Self <: ModifyTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
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
    def setTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = this.set("TrafficMirrorFilterRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorFilterRule: Self = this.set("TrafficMirrorFilterRule", js.undefined)
  }
  
}

