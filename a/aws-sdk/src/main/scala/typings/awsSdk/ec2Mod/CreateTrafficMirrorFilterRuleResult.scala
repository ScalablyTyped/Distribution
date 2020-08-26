package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorFilterRule] = js.native
}

object CreateTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(): CreateTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleResult]
  }
  @scala.inline
  implicit class CreateTrafficMirrorFilterRuleResultOps[Self <: CreateTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
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
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = this.set("TrafficMirrorFilterRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorFilterRule: Self = this.set("TrafficMirrorFilterRule", js.undefined)
  }
  
}

