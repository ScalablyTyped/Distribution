package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorFilterRuleResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorFilterRuleResult {
  @scala.inline
  def apply(): DeleteTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRuleResult]
  }
  @scala.inline
  implicit class DeleteTrafficMirrorFilterRuleResultOps[Self <: DeleteTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
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
    def setTrafficMirrorFilterRuleId(value: String): Self = this.set("TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorFilterRuleId: Self = this.set("TrafficMirrorFilterRuleId", js.undefined)
  }
  
}

