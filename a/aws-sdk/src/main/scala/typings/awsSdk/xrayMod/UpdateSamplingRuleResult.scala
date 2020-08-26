package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSamplingRuleResult extends js.Object {
  /**
    * The updated rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}

object UpdateSamplingRuleResult {
  @scala.inline
  def apply(): UpdateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSamplingRuleResult]
  }
  @scala.inline
  implicit class UpdateSamplingRuleResultOps[Self <: UpdateSamplingRuleResult] (val x: Self) extends AnyVal {
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
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = this.set("SamplingRuleRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRuleRecord: Self = this.set("SamplingRuleRecord", js.undefined)
  }
  
}

